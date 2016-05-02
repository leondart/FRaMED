package org.framed.orm.ui.action;

import java.util.ArrayList;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.connectionkinds.CallRelationshipConstraintsActionCommand;
import org.framed.orm.ui.command.connectionkinds.ORMRelationshipConstraintCreateCommand;
import org.framed.orm.ui.command.connectionkinds.ORMRelationshipConstraintDeleteCommand;

/**
 * This action is for adding/removing {@link Relation}s from type total, cyclic, acyclic, reflexive and irreflexive
 * to/from a {@link Relation} from type realtionship through a {@link ConstraintsDialog}.
 * 
 * @author Kay Bierzynski
 * */
public class RelationshipConstraintsAction extends SelectionAction {

  /** String which contains the id of this action. */
  public static final String RLSHIP_CONSTRAINTS_ID = "RelationshipConstraints";
  /**
   * The editpart of the {@link Relation} from type relationship to which the {@link Relation}s from
   * type total, cyclic, acyclic, reflexive and irreflexive are added or of a
   * relationshipconstraint(Total,Cyclic, Acyclic, Reflexive, Irreflexive)( when the run method is called through the
   * delete button(red X in the actionbar) through which we can get the relationship.
   */
  private EditPart editPart;


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
   * Set method for setting the editpart of the {@link Relation} from type relationship. This method
   * is nessecary, because the run method of this action isn't only activated through the
   * contextmenu. The run method is called as well when a {@link Relation}s from type total, cyclic, acyclic, reflexive
   * or irreflexive is selected and the user is clicking on the delete button (red X in the
   * actionbar) and when called liked this no element is selected from which we can get the
   * editpart.
   * 
   * @param editpart EditPart
   * */
  public void setEditPart(final EditPart editPart) {
    this.editPart = editPart;
  }

  /**
   * {@inheritDoc} This action is enabled when the selected element is a {@link Relation} from type
   * relationship.
   * 
   * */
  @Override
  protected boolean calculateEnabled() {

    if (getSelectedObjects().isEmpty() || getSelectedObjects().size() > 1) {
      return false;
    }

    for (Object selectedObject : getSelectedObjects()) {
      if (selectedObject instanceof EditPart) {
        if (((EditPart) selectedObject).getModel() instanceof Relation) {
          Relation rel = (Relation) ((EditPart) selectedObject).getModel();
          return rel.getType().equals(Type.RELATIONSHIP);
        }
      }
    }
    return false;
  }


  /**
   * In this method first the {@link ConstraintsDialog} is prepared and started. After the user has
   * closed the {@link ConstraintsDialog} through the cancel button this method is finished as well.
   * When the user has closed the {@link ConstraintsDialog} through the ok button the chosen
   * {@link Relation}s from type total, cyclic, acyclic, reflexive and irreflexive are added to the {@link Relation}
   * from type relationship one after the another and all relationshipconstraints , which where not
   * Chosen and belonged at the beginning to the relationship, are removed one after another from
   * the relationship.
   * 
   * */
  @Override
  public void run() {
    // get the style for the shell of the constraints dialog, which should be the same as the shell
    // sytle of the active workbench
    int style = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getStyle();
    Shell shell = new Shell((style & SWT.MIRRORED) != 0 ? SWT.RIGHT_TO_LEFT : SWT.NONE);

    // get the editpart from the the selected object, when this action is activated though the
    // contextmenu
    if (editPart == null) {
      editPart = (EditPart) getSelectedObjects().get(0);
    }

    // get the model of the relationship to which we want to add constraints
    // how we get the model depends on which thing has called the run method
    Relation rlship;

    if (((Relation) editPart.getModel()).getType().equals(Type.RELATIONSHIP)) {
      rlship = (Relation) editPart.getModel();
    } else {
      rlship = ((Relation) editPart.getModel()).getReferencedRelation().get(0);
    }

    // put all RelationshipConstraints in a list
    ArrayList<Relation> constraints = new ArrayList<Relation>();
    constraints.addAll(rlship.getReferencedRelation());

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
    // remove all constratints, which where not choosen and belonged at the beginning to the
    // relationship, through creating and executing for every constraint a deletion command
    else if (returnCode == Window.OK) {
      CompoundCommand compoundCommand = new CompoundCommand();

      for (Relation relation : dialog.getChosenCreateConstraints()) {
        if (!constraints.contains(relation)) {
          ORMRelationshipConstraintCreateCommand command = new  ORMRelationshipConstraintCreateCommand();

          command.setRelation(relation);
          command.setRelationContainer(rlship.getContainer());
          command.setSource((Shape) rlship.getSource());
          command.setTarget((Shape) rlship.getTarget());
          command.setSourceLabel(null);
          command.setTargetLabel(null);
          ArrayList<Relation> refrencedRelation = new ArrayList<Relation>();
          refrencedRelation.add(rlship);
          command.setRefrencedRelations(refrencedRelation);
          

          compoundCommand.add(command);
        }
      }

      for (Relation relation : dialog.getChosenDeleteConstraints()) {
        if (constraints.contains(relation)) {
          ORMRelationshipConstraintDeleteCommand command =
              new ORMRelationshipConstraintDeleteCommand();
          command.setRelation(relation);
          command.setEPViewer(editPart.getViewer());
          compoundCommand.add(command);
        }
      }

      getCommandStack().execute(compoundCommand);

      // after every run of the action the editPart must be reset, because actions are not
      // initialized new every time when you call them
      editPart = null;
    }
  }

  /**
   * Method for undoing the action. This method is called when the call of the run method through
   * the {@link CallRelationshipConstraintsActionCommand}/delete button(red X in the actionbar)
   * should be undone.
   * */
  public void actionUndo() {
    getCommandStack().undo();
  }

  /**
   * Method for redoing the action. This method is called when the call of the run method through
   * the {@link CallRelationshipConstraintsActionCommand}/delete button(red X in the actionbar)
   * should be redone.
   * */
  public void actionRedo() {
    getCommandStack().redo();
  }
}
