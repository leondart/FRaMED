package org.framed.orm.ui.action;

import java.util.ArrayList;
import java.util.LinkedList;
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
import org.framed.orm.model.Acyclic;
import org.framed.orm.model.Irreflexive;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.model.Total;
import org.framed.orm.model.provider.OrmItemProviderAdapterFactory;

/**
 * A dialog class for creating a dialog, which let the user choose the
 * {@link RelationshipConstraint}s for a {@link Relationship}.
 * 
 * @author Kay Bierzynski (intial development)
 * @author Lars Schuetze
 * 
 */
public class ConstraintsDialog extends Dialog {


  /** Variable for the dialog height. */
  private final static int SIZING_SELECTION_WIDGET_HEIGHT = 250;
  /** Variable for the dialog width. */
  private final static int SIZING_SELECTION_WIDGET_WIDTH = 300;
  /**
   * A list, which contains all the {@link RelationshipConstraint}s a {@link Relationship} already
   * has.
   */
  private List<RelationshipConstraint> constraints;
  /**
   * A list, which contains all the {@link RelationshipConstraint}s the user didn't choose in the
   * dialog.
   */
  private final List<RelationshipConstraint> chosenDeleteConstraints;
  /**
   * A list, which contains all the {@link RelationshipConstraint}s the user did choose in the
   * dialog.
   */
  private final List<RelationshipConstraint> chosenCreateConstraints;
  /** The viewer for listing the {@link RelationshipConstraint}s. */
  private CheckboxTableViewer viewer;

  /**
   * Constructor of ConstraintsDialog.
   * 
   * @param {@link Shell} shell
   * */
  protected ConstraintsDialog(final Shell shell) {
    super(shell);
    chosenDeleteConstraints = new LinkedList<>();
    chosenCreateConstraints = new LinkedList<>();
  }

  /** {@inheritDoc} */
  @Override
  protected void configureShell(final Shell newShell) {
    super.configureShell(newShell);
    newShell.setText("Choose constraints");
    newShell.setSize(SIZING_SELECTION_WIDGET_WIDTH, SIZING_SELECTION_WIDGET_HEIGHT);
  }

  /** {@inheritDoc} */
  @Override
  protected Control createDialogArea(final Composite parent) {
    // the composite of the dialog as a variable to make the adding of the components to it easier
    Composite composite = (Composite) super.createDialogArea(parent);

    // A list, which contains all the {@link RelationshipConstraint}s a user can choose.
    List<RelationshipConstraint> viewerContent = new ArrayList<RelationshipConstraint>();
    viewerContent.addAll(constraints);
    if (viewerContent.size() < 3) {
      addMissingConstraints(viewerContent);
    }

    // initialize chosenDeleteConstraints with all {@link RelationshipConstraint}s so
    // that we just need to remove the choosen constraints later to get the constraints
    // which should be deleted
    chosenDeleteConstraints.addAll(viewerContent);

    // setup the table viewer, which lists the {@link RelationshipConstraint}s
    // a user can choose
    viewer = CheckboxTableViewer.newCheckList(composite, SWT.CHECK);
    viewer.getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    AdapterFactoryLabelProvider labelProvider =
        new AdapterFactoryLabelProvider(new OrmItemProviderAdapterFactory());
    AdapterFactoryContentProvider contentProvider =
        new AdapterFactoryContentProvider(new OrmItemProviderAdapterFactory());

    viewer.setLabelProvider(labelProvider);
    viewer.setContentProvider(contentProvider);
    viewer.setInput(new ItemProvider(new OrmItemProviderAdapterFactory(), viewerContent));

    // check all the {@link RelationshipConstraint}s, which the {@link Relationship} already has,
    // so that the user know which constratints the {@link Relationship} already has
    for (RelationshipConstraint constraint : viewerContent) {
      if (constraints.contains(constraint)) {
        viewer.setChecked(constraint, true);
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
  private void addSelectionButtons(final Composite composite) {

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
   * Add to the viewerContent the {@link RelationshipConstraint}s, which the relationship not have,
   * because the user should be able to choose between all of the constraints.
   * 
   * @param viewerContent java.util.List<RelationshipConstraint>
   **/
  public void addMissingConstraints(final List<RelationshipConstraint> viewerContent) {
    // first test if the irreflexive constraint is in the list, when not add the irreflexive
    // constraint to the list
    // after that test if the total constraint is in the list, when not add the total constraint to
    // the list
    // at the end test if the acyclic constraint is in the list, when not add the acyclic constraint
    // to the list
    for (int i = 0; i < 3; i++) {

      boolean isInList = false;
      for (RelationshipConstraint constraint : constraints) {
        if (i == 0) {
          if (constraint instanceof Irreflexive) {
            isInList = true;
          }
        }
        if (i == 1) {
          if (constraint instanceof Total) {
            isInList = true;
          }
        }
        if (i == 2) {
          if (constraint instanceof Acyclic) {
            isInList = true;
          }
        }

      }

      if (!isInList) {
        if (i == 0) {
          viewerContent.add(OrmFactory.eINSTANCE.createIrreflexive());
        }
        if (i == 1) {
          viewerContent.add(OrmFactory.eINSTANCE.createTotal());
        }
        if (i == 2) {
          viewerContent.add(OrmFactory.eINSTANCE.createAcyclic());
        }

      }
    }

  }

  /**
   * {@inheritDoc} Before closing the dialog all choosen constraints are added to the
   * chosenCreateConstraints list and the constraints the user didn't choose are removed from
   * chosenDeleteConstraints list, which contains at this moment all the constrains.
   * */
  @Override
  protected void okPressed() {

    // add all choosen constraints to the chosenCreateConstraints list
    for (Object object : viewer.getCheckedElements()) {
      chosenCreateConstraints.add((RelationshipConstraint) object);
    }

    // remove constraints the use didn't choose from chosenDeleteConstraints list, which contains at
    // this moment
    // all the constraints
    chosenDeleteConstraints.removeAll(chosenCreateConstraints);

    // close the dialog
    setReturnCode(OK);
    close();
  }

  /**
   * Setter for constraints.
   * 
   * @param constraints java.util.List<RelationshipConstraint>
   * */
  public void setConstraints(final List<RelationshipConstraint> constraints) {
    this.constraints = constraints;
  }

  /**
   * Getter of chosenCreateConstraints.
   * 
   * @return chosenCreateConstraints java.util.List<RelationshipConstraint>
   * */
  public List<RelationshipConstraint> getChosenCreateConstraints() {
    return chosenCreateConstraints;
  }

  /**
   * Getter of chosenDeleteConstraints.
   * 
   * @return chosenDeleteConstraints java.util.List<RelationshipConstraint>
   * */
  public List<RelationshipConstraint> getChosenDeleteConstraints() {
    return chosenDeleteConstraints;
  }

}
