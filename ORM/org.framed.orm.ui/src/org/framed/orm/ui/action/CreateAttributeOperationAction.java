package org.framed.orm.ui.action;

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;
import org.framed.orm.model.Segment;
import org.framed.orm.model.Shape;
import org.framed.orm.ui.editPart.shape.ORMSegmentEditPart;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.factory.ORMAttributeFactory;
import org.framed.orm.ui.factory.ORMOperationFactory;

/**
 * A action for creating a operations and attributess. This action is nessecary to create methods
 * and atributtes through a shortcut.
 * 
 * @author Kay Bierzynski
 * 
 */
public class CreateAttributeOperationAction extends SelectionAction {

  /** String which contains the id of this action. */
  public static final String CREATE_A_M_ID = "CreateAttributeMethod";
  /**
   * Editpart of the {@link Segment} to which the attribute or operation should be added.
   */
  private AbstractGraphicalEditPart editPart;

  /**
   * Constructor of CreateActionMethodAction, where the id of the action and the text, which is
   * shown for example in the context menu, is set .
   * 
   * @param part org.eclipse.ui.IWorkbenchPart
   * */
  public CreateAttributeOperationAction(final IWorkbenchPart part) {
    super(part);
    setId(CREATE_A_M_ID);
    setText("CreateAttributeMethod");
  }

  /**
   * This method creates and send the creation request for a attribute, when the user selected a
   * attribute, or a operation, when the user selected a operation, to the editpart to which the
   * attribute or operation should be added. The editpart to which the attribute or operation is
   * added is the parenteditpart of the selected attribute or opeartion.
   * 
   * */
  @Override
  public void run() {
    // get the editorpart to get the selection manager and with the selection manager you can
    // deselect the selected element after the creation of the attribute or the method
    ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) editPart.getViewer().getEditDomain())
            .getEditorPart();


    CreateRequest request = new CreateRequest();

    // decide and setup the creation request for attribute or opeartion
    Segment segment = (Segment) editPart.getModel();
    Shape shape = (Shape) editPart.getParent().getModel();
    if (shape.getFirstSegment().equals(segment)) {
      request.setFactory(new ORMAttributeFactory());
    }
    if (shape.getSecondSegment().equals(segment)) {
      request.setFactory(new ORMOperationFactory());
    }

    // send the creation request to the editpart
    execute(editPart.getCommand(request));

    // get the editpart of the newly created attribute or method for starting the initial edit of
    // the name of the element
    final Object o = editorPart.getOwnViewer().getEditPartRegistry().get(request.getNewObject());

    if (o instanceof EditPart) {
      EditPart part = (EditPart) o;
      Request directrequest = new DirectEditRequest();
      // start initial edit of the name of the attribute or the method
      part.performRequest(directrequest);
    };

    // deselect the selected element for case that the user forget to deselect the element
    // when not deselected the shortcut behaviour and the contextmenu behaviour can confuse the user
    editorPart.getOwnViewer().getSelectionManager().deselectAll();
  }

  /**
   * {@inheritDoc} This action is enabled when the selected element is the child of
   * {@link ORMSegmentEditPart} also a attribute or a operation.
   * */
  @Override
  protected boolean calculateEnabled() {
    if (getSelectedObjects().isEmpty() || getSelectedObjects().size() > 1) {
      return false;
    }


    if (((EditPart) getSelectedObjects().get(0)).getParent() instanceof ORMSegmentEditPart) {
      editPart =
          (AbstractGraphicalEditPart) ((AbstractGraphicalEditPart) getSelectedObjects().get(0))
              .getParent();
      return true;
    }
    return false;
  }

}
