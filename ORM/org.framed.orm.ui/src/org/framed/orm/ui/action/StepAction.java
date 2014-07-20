package org.framed.orm.ui.action;

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.ui.actions.SaveAction;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Grouping;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;
import org.framed.orm.ui.editor.ORMGraphicalEditor;

/**
 * This action is the super action for the different stepactions, which all have almost the same
 * code for the method calculateEnabled() and the method run(). But all these actions need their own
 * class, because the id and the text which is set in the constructor is by all actions different.
 * 
 * @author Kay Bierzynski
 * */
public class StepAction extends SelectionAction {

  /** String which contains the id of this action. */
  public static final String STEP_ID = "Step";
  /** String which contains the type of the request, which is connected to this action. */
  public static final String STEP_REQUEST = "Step";

  /** Variable for the request which is send to the editpart for executing the stepin/out. */
  private Request request;
  /** The editpart of the {@link Compartment} or the {@link Grouping} in/out which we want to step. */
  private AbstractGraphicalEditPart editPart;

  /**
   * Constructor of this action, where the id of the action and the text, which is shown for example
   * in the context menu, is set and the special request connected to this action is created .
   * 
   * @param part org.eclipse.ui.IWorkbenchPart
   */
  public StepAction(final IWorkbenchPart part) {
    super(part);
    setId(STEP_ID);
    setText("Step");
    request = new Request(STEP_REQUEST);
  }

  /**
   * 
   * Execute the command that performs the StepIn or the StepOut.
   * 
   * It is assumed that this method is executed directly after {@link Step#calculateEnabled()
   * calculateEnabled()}
   */
  @Override
  public void run() {
    // get the editorpart to get the selection manager and with the selection manager you can
    // deselect the selected element after the creation of the attribute or the method
    ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) editPart.getViewer().getEditDomain())
            .getEditorPart();

    SaveAction save = new SaveAction(editorPart);
    // send the request to the editpart for execution.
    execute(editPart.getCommand(request));
    save.run();

    // deselect the selected element for case that the user forget to deselect the element
    // when not deselected the shortcut behaviour and the contextmenu behaviour can confuse the user
    editorPart.getOwnViewer().getSelectionManager().deselectAll();
  }

  /**
   * {@inheritDoc}
   * <p>
   * The action is enabled if the selected entity on the editor is a {@link ORMCompartmentEditPart}
   * or a {@link ORMGroupingEditPart} instance and the method testEnabled() returns true.
   * </p>
   */
  @Override
  protected boolean calculateEnabled() {
    if (getSelectedObjects().isEmpty() || getSelectedObjects().size() > 1) {
      return false;
    } else if (getSelectedObjects().get(0) instanceof ORMCompartmentEditPart
        || getSelectedObjects().get(0) instanceof ORMGroupingEditPart) {
      editPart = (AbstractGraphicalEditPart) getSelectedObjects().get(0);
      return testEnabled(getId());
    }
    return false;
  }

  /**
   * A method where in case of step out it is tested if the selected editpart equals the editpart,
   * which is strechted out over the background of the view and in case of step in it is tested if
   * the selected editpart unequals the editpart, which is strechted out over the background of the
   * view.
   * 
   * @param id java.lang.String
   * @return true in case of step out if the selected editpart equals the editpart, which is
   *         strechted out over the background of the view or in case of step in if the selected
   *         editpart unequals the editpart, which is strechted out over the background of the view
   * */
  public boolean testEnabled(final String id) {
    if (id.equals(StepOutAction.STEP_OUT_ID)) {
      return editPart.equals(editPart.getViewer().getRootEditPart().getContents());
    } else {
      return !editPart.equals(editPart.getViewer().getRootEditPart().getContents());
    }
  }

  /**
   * A setter for the request. This method exits so that the child classes can overide the request
   * of this class with their own special type request.
   * 
   * @param request org.eclipse.gef.Request
   * */
  public void setRequest(final Request request) {
    this.request = request;
  }

}
