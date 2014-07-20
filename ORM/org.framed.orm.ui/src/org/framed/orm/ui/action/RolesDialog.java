package org.framed.orm.ui.action;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.Node;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleType;
import org.framed.orm.model.provider.OrmItemProviderAdapterFactory;

/**
 * A dialog class for creating a dialog, which let the user choose the {@link RoleType}s and the
 * {@link RoleGroup}s he wants to add or to remove from a {@link Fulfillment}. With this the user
 * decides, which {@link RoleType}s and {@link RoleGroup}s the source of the {@link Fulfillment}
 * fulfills.
 * 
 * @author Kay Bierzynski (initial development)
 * @author Lars Schuetze (use EMF adapters)
 * 
 */
public class RolesDialog extends Dialog {

  /** Variable for the dialog height. */
  private final static int SIZING_SELECTION_WIDGET_HEIGHT = 250;
  /** Variable for the dialog width. */
  private final static int SIZING_SELECTION_WIDGET_WIDTH = 300;

  /**
   * A list, which containts all the {@link RoleType}s and the {@link RoleGroup}s of the target of
   * the {@link Fulfillment}.
   */
  private List<AbstractRole> roles;
  /**
   * This list contains names of the {@link RoleType}s and the {@link RoleGroup}s, which the user
   * has choosen.
   */
  private List<String> fulfilledRoles;
  /**
   * The viewer for listing the {@link RoleType}s and the {@link RoleGroup}s.
   * 
   * */
  private CheckboxTableViewer viewer;

  /**
   * Constructor of RolesDialog.
   * 
   * @param {@link Shell} shell
   * */
  protected RolesDialog(final Shell shell) {
    super(shell);
    fulfilledRoles = new ArrayList<>();
    roles = new ArrayList<>();
  }

  /** {@inheritDoc} */
  @Override
  protected void configureShell(Shell newShell) {
    super.configureShell(newShell);
    newShell.setText("Choose roles");
    newShell.setSize(SIZING_SELECTION_WIDGET_WIDTH, SIZING_SELECTION_WIDGET_HEIGHT);
  }

  /** {@inheritDoc} */
  @Override
  protected Control createDialogArea(Composite parent) {
    // the composite of the dialog as a variable to make the adding of the components to it easier
    Composite composite = (Composite) super.createDialogArea(parent);

    // setup the table viewer, which lists the role types and the role groups
    // a user can choose
    viewer = CheckboxTableViewer.newCheckList(composite, SWT.CHECK);
    viewer.getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    AdapterFactoryLabelProvider labelProvider =
        new AdapterFactoryLabelProvider(new OrmItemProviderAdapterFactory());
    AdapterFactoryContentProvider contentProvider =
        new AdapterFactoryContentProvider(new OrmItemProviderAdapterFactory());

    viewer.setLabelProvider(labelProvider);
    viewer.setContentProvider(contentProvider);
    viewer.setInput(new ItemProvider(new OrmItemProviderAdapterFactory(), roles));

    // check all the role types and the role groups, which already fulfilled thorugh the fulfillment
    for (AbstractRole role : roles) {
      if (fulfilledRoles.contains(((Node) role).getName())) {
        viewer.setChecked(role, true);
      }
    }

    addSelectionButtons(composite);
    return composite;
  }

  /**
   * Add the selection and deselection buttons to the dialog.
   * 
   * @param composite org.eclipse.swt.widgets.Composite
   */
  private void addSelectionButtons(Composite composite) {

    initializeDialogUnits(composite);

    Composite buttonComposite = new Composite(composite, SWT.NONE);

    // setup the button layout
    GridLayout layout = new GridLayout();
    layout.numColumns = 0;
    layout.marginWidth = 0;
    layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
    buttonComposite.setLayout(layout);
    buttonComposite.setLayoutData(new GridData(SWT.END, SWT.TOP, true, false));


    Button selectButton =
        createButton(buttonComposite, IDialogConstants.SELECT_ALL_ID, "Select All", false);

    // set the functionallity of the select all button
    selectButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent event) {
        viewer.setAllChecked(true);
      }
    });

    Button deselectButton =
        createButton(buttonComposite, IDialogConstants.DESELECT_ALL_ID, "Deselect All", false);

    // set the functionallity of the deselect all button
    deselectButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent event) {
        viewer.setAllChecked(false);
      }
    });
  }

  /**
   * {@inheritDoc}
   *  Before the dialog is closed the  fulfilledRoles list is cleared and
   *  refilled with the names of the choosen {@link RoleType}s and the choosen {@link RoleGroup}s.
   */
  @Override
  protected void okPressed() {
    fulfilledRoles.clear();

    // after clearing the list add the names of the choosen role types and the choosen role groups
    for (Object object : viewer.getCheckedElements()) {
      fulfilledRoles.add(((Node) object).getName());
    }

    setReturnCode(OK);
    close();
  }

  /**
   * Setter for the roles list.
   * 
   * @param  roles java.util.List<AbstractRole>
   * */
  public void setRoles(List<AbstractRole> roles) {
    this.roles = roles;
  }

  /**
   * Setter for the fulfilledRoles list.
   * 
   * @param fulfilledRoles java.util.List<String>
   * */
  public void setFulfilledRoles(List<String> fulfilledRoles) {
    this.fulfilledRoles = fulfilledRoles;
  }

  /**
   * Getter for the fulfilledRoles list.
   * 
   * @return fulfilledRoles java.util.List<String>
   * */
  public List<String> getFulfilledRoles() {
    return fulfilledRoles;
  }
}
