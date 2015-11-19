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
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;
import org.framed.orm.model.provider.OrmItemProviderAdapterFactory;

/**
 * A dialog class for creating a dialog, which let the user choose the {@link Relation}s from type
 * total, cyclic, acyclic, reflexive and irreflexive for a {@link Relation} from type relationship.
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
   * A list, which contains all the {@link Relation}s from type total, cyclic, acyclic, reflexive and irreflexive a
   * relationship already has.
   */
  private List<Relation> constraints;
  /**
   * A list, which contains all the {@link Relation}s from type total, cyclic, acyclic, reflexive and irreflexive the
   * user didn't choose in the dialog.
   */
  private final List<Relation> chosenDeleteConstraints;
  /**
   * A list, which contains all the {@link Relation}s from type total, cyclic, acyclic, reflexive and irreflexive the
   * user did choose in the dialog.
   */
  private final List<Relation> chosenCreateConstraints;

  /** The viewer for listing the relationshipconstraints. */
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

    // A list, which contains all the relationshipconstraints a user can choose.
    List<Relation> viewerContent = new ArrayList<Relation>();
    viewerContent.addAll(constraints);
    if (viewerContent.size() < 3) {
      addMissingConstraints(viewerContent);
    }

    // initialize chosenDeleteConstraints with all relations from type total, cyclic, acyclic, reflexive and irreflexive
    // so that we just need to remove the choosen constraints later to get the constraints
    // which should be deleted
    chosenDeleteConstraints.addAll(viewerContent);

    // setup the table viewer, which lists the relations from type total, cyclic, acyclic, reflexive and irreflexive
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

    // check all the relations from type total, cyclic, acyclic, reflexive and irreflexive, which the relation from type
    // relationship already has, so that the user know which constratints the relationship
    // already has
    for (Relation constraint : viewerContent) {
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
   * Add to the viewerContent the {@link Relation}s from type total, cyclic, acyclic, reflexive and irreflexive, which
   * the relationship not have, because the user should be able to choose between all of the
   * constraints.
   * 
   * @param viewerContent java.util.List<Relation>
   **/
  private void addMissingConstraints(final List<Relation> viewerContent) {
    // test if relationship constraints are in the list, if not add the missing
    // constraint to the list
	  
      for (Type constraintType : Type.getRelationshipConstraints()){
    	  boolean isInList = false;
    	  for (Relation constraint : constraints) {
    		  isInList = constraint.getType().equals(constraintType);
    		  if(isInList){
    	          break;
    	        }
    	  }
    	  
    	  Relation relation = OrmFactory.eINSTANCE.createRelation();
    	  if (!isInList) {
    		  relation.setType(constraintType);
    		  relation.setName(constraintType.getName());
    		  viewerContent.add(relation);
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
      chosenCreateConstraints.add((Relation) object);
    }

    // remove constraints the user didn't choose from chosenDeleteConstraints list, which contains at
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
   * @param constraints java.util.List<Relation>
   * */
  public void setConstraints(final List<Relation> constraints) {
    this.constraints = constraints;
  }

  /**
   * Getter of chosenCreateConstraints.
   * 
   * @return chosenCreateConstraints java.util.List<Relation>
   * */
  public List<Relation> getChosenCreateConstraints() {
    return chosenCreateConstraints;
  }

  /**
   * Getter of chosenDeleteConstraints.
   * 
   * @return chosenDeleteConstraints java.util.List<RelationshipConstraint>
   * */
  public List<Relation> getChosenDeleteConstraints() {
    return chosenDeleteConstraints;
  }

}
