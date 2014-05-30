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
import org.framed.orm.model.Node;
import org.framed.orm.model.provider.OrmItemProviderAdapterFactory;

/**
 * @author Kay Bierzynski (initial development)
 * @author Lars Schuetze (use EMF adapters)
 * 
 */
public class RolesDialog extends Dialog {

  private final static int SIZING_SELECTION_WIDGET_HEIGHT = 250;
  private final static int SIZING_SELECTION_WIDGET_WIDTH = 300;

  private List<AbstractRole> roles;
  private List<String> fulfilledRoles;
  private CheckboxTableViewer viewer;

  protected RolesDialog(Shell shell) {
    super(shell);
    fulfilledRoles = new ArrayList<>();
    roles = new ArrayList<>();
  }

  @Override
  protected void configureShell(Shell newShell) {
    super.configureShell(newShell);
    newShell.setText("Choose roles");
    newShell.setSize(SIZING_SELECTION_WIDGET_WIDTH, SIZING_SELECTION_WIDGET_HEIGHT);
  }

  @Override
  protected Control createDialogArea(Composite parent) {
    Composite composite = (Composite) super.createDialogArea(parent);

    viewer = CheckboxTableViewer.newCheckList(composite, SWT.CHECK);
    viewer.getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    AdapterFactoryLabelProvider labelProvider =
        new AdapterFactoryLabelProvider(new OrmItemProviderAdapterFactory());
    AdapterFactoryContentProvider contentProvider =
        new AdapterFactoryContentProvider(new OrmItemProviderAdapterFactory());

    viewer.setLabelProvider(labelProvider);
    viewer.setContentProvider(contentProvider);
    viewer.setInput(new ItemProvider(new OrmItemProviderAdapterFactory(), roles));

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
    GridLayout layout = new GridLayout();
    layout.numColumns = 0;
    layout.marginWidth = 0;
    layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
    buttonComposite.setLayout(layout);
    buttonComposite.setLayoutData(new GridData(SWT.END, SWT.TOP, true, false));


    Button selectButton =
        createButton(buttonComposite, IDialogConstants.SELECT_ALL_ID, "Select All", false);

    selectButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent event) {
        viewer.setAllChecked(true);
      }
    });

    Button deselectButton =
        createButton(buttonComposite, IDialogConstants.DESELECT_ALL_ID, "Deselect All", false);

    deselectButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent event) {
        viewer.setAllChecked(false);
      }
    });
  }

  @Override
  protected void okPressed() {
    fulfilledRoles.clear();

    for (Object object : viewer.getCheckedElements()) {
      fulfilledRoles.add(((Node) object).getName());
    }
    setReturnCode(OK);
    close();
  }

  public void setRoles(List<AbstractRole> roles) {
    this.roles = roles;
  }

  public void setFulfilledRoles(List<String> fulfilledRoles) {
    this.fulfilledRoles = fulfilledRoles;
  }

  public List<String> getFulfilledRoles() {
    return fulfilledRoles;
  }
}
