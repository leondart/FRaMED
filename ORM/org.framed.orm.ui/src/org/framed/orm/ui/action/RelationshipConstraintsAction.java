package org.framed.orm.ui.action;

import java.util.ArrayList;

import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.ui.command.connectionkinds.ORMRelationshipConstraintDeleteCommand;
import org.framed.orm.ui.command.connectionkinds.ORMRelationshipConstraintCreateCommand;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipConstraintEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipEditPart;


/**
 * This action is for adding {@link RelationshipConstraint}s to a {@link Relationship} through a
 * {@link ConstraintsDialog}.
 * 
 * @author Kay Bierzynski
 * */
public class RelationshipConstraintsAction extends SelectionAction {

  /** String which contains the id of this action. */
  public static final String RLSHIP_CONSTRAINTS_ID = "RelationshipConstraints";
  /**
   * The editpart of the {@link Relationship} to which the {@link RelationshipConstraint}s are added
   * or of a {@link RelationshipConstraint}( when the run method is called through the delete
   * button(red X in the actionbar) through which we can get the {@link Relationship}.
   */
  private ORMRelationEditPart editPart;


  /**
   * Constructor of RelationshipConstraintsAction, where the id of the action and the text, which is
   * shown for example in the context menu, is set .
   * 
   * @param part org.eclipse.ui.IWorkbenchPart
   * */
  public RelationshipConstraintsAction(final IWorkbenchPart part) {
    super(part);
    setId(RLSHIP_CONSTRAINTS_ID);
    setText("RelationshipConstraints...");
  }

  /**
   * Set method for setting the {@link ORMRelationEditPart} editpart. This method is nessecary,
   * because the run method of this action isn't only activated through the contextmenu. The run
   * method is called as well when a {@link RelationshipConstraint} is selected and the user is
   * clicking on the delete button (red X in the actionbar) and when called liked this no element is
   * selected from which we can get the editpart.
   * 
   * @param editpart ORMRelationshipConstraintEditPart
   * */
  public void setEditPart(final ORMRelationshipConstraintEditPart editPart) {
    this.editPart = editPart;
  }

  /**
   * {@inheritDoc} This action is enabled when the selected element is a {@link Relationship}.
   * 
   * */
  @Override
  protected boolean calculateEnabled() {

    if (getSelectedObjects().isEmpty() || getSelectedObjects().size() > 1) {
      return false;
    }

    for (Object selectedObject : getSelectedObjects()) {
      if (selectedObject instanceof ORMRelationshipEditPart) {
        return true;
      }
    }
    return false;
  }


  /**
   * In this method first the {@link ConstraintsDialog} is prepared and started. After the user has
   * closed the {@link ConstraintsDialog} through the cancel button this method is finished as well.
   * When the user has closed the {@link ConstraintsDialog} through the ok button the choosen
   * {@link RelationshipConstraint}s are added to the {@link Relationship} one after the another and
   * all {@link RelationshipConstraint}s , which where not choosen and belonged at the beginning to
   * the {@link Relationship}, are removed one after another from the {@link Relationship}.
   * 
   * */
  @Override
  public void run() {
    // get the style for the shell of the constraints dialog, which should be the same as the shell
    // sytle
    // of the active workbench
    int style = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getStyle();
    Shell shell = new Shell((style & SWT.MIRRORED) != 0 ? SWT.RIGHT_TO_LEFT : SWT.NONE);

    // get the editpart from the the selected object, when this action is activated though the
    // contextmenu
    if (editPart == null) {
      editPart = (ORMRelationEditPart) getSelectedObjects().get(0);
    }

    // get the model of the relationship to which we want to add constraints
    // how we get the model depends on which thing has called thze run method
    Relationship rlship;

    if (editPart instanceof ORMRelationshipEditPart) {
      rlship = (Relationship) editPart.getModel();
    } else {
      rlship = ((RelationshipConstraint) editPart.getModel()).getRelation();
    }

    // put all RelationshipConstraints in a list
    ArrayList<RelationshipConstraint> constraints = new ArrayList<RelationshipConstraint>();
    constraints.addAll(rlship.getRlshipConstraints());

    // create and setup the constraints dialog
    ConstraintsDialog dialog = new ConstraintsDialog(shell);
    dialog.setConstraints(constraints);

    // open the constraints dialog
    int returnCode = dialog.open();

    // end the action, when the constraints dialog is closed through cancel button
    if (returnCode == Window.CANCEL) {
      editPart = null;
      return;
    }


    // add all chosen constraints to the relationship through creating and executing for every
    // constraint a creation command
    // remove all constratints, which where not choosen and belonged at the beginning to the {@link
    // Relationship}, through creating and executing for every constraint a deletion command
    else if (returnCode == Window.OK) {
      CompoundCommand compoundCommand = new CompoundCommand();

      for (RelationshipConstraint rc : dialog.getChosenCreateConstraints()) {
        if (!constraints.contains(rc)) {
          ORMRelationshipConstraintCreateCommand command =
              new ORMRelationshipConstraintCreateCommand();

          command.setRelation(rc);
          command.setRelationship(rlship);
          command.setRelationContainer(rlship.getRelationContainer());
          command.setSourceNode(rlship.getSource());
          command.setTargetNode(rlship.getTarget());

          compoundCommand.add(command);
        }
      }

      for (RelationshipConstraint rc : dialog.getChosenDeleteConstraints()) {
        if (constraints.contains(rc)) {
          ORMRelationshipConstraintDeleteCommand command =
              new ORMRelationshipConstraintDeleteCommand();
          command.setRelationshipConstraint(rc);
          command.setEPViewer(editPart.getViewer());
          compoundCommand.add(command);
        }
      }

      getCommandStack().execute(compoundCommand);

      // after every run of the action the editPart must be reset, because actions are not
      // initialized new every time when you call tham
      editPart = null;
    }
  }

  /**
   * Method for undoing the action. This method is called when the call of the run method through
   * the delete button should be undone.
   * */
  public void actionUndo() {
    getCommandStack().undo();
  }

  /**
   * Method for redoing the action. This method is called when the call of the run method through
   * the delete button should be redone.
   * */
  public void actionRedo() {
    getCommandStack().redo();
  }
}
