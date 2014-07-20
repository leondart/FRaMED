package org.framed.orm.ui.action;

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;
import org.framed.orm.model.Attribute;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Method;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.RoleType;
import org.framed.orm.ui.editPart.ORMAttributeEditPart;
import org.framed.orm.ui.editPart.ORMMethodEditPart;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.factory.ORMAttributeFactory;
import org.framed.orm.ui.factory.ORMMethodFactory;

/**
 * A action for creating {@link Method}s and {@link Attribute}s. This action is nessecary to create
 * methods and atributtes through a shortcut.
 * 
 * @author Kay Bierzynski
 * 
 */
public class CreateActionMethodAction extends SelectionAction {

  /** String which contains the id of this action. */
  public static final String CREATE_A_M_ID = "CreateAttributeMethod";
  /**
   * Editpart of the {@link NaturalType}, {@link RoleType} or {@link Compartment} to which the
   * attribute or method is added.
   */
  private AbstractGraphicalEditPart editPart;

  /**
   * Constructor of CreateActionMethodAction, where the id of the action and the text, which is
   * shown for example in the context menu, is set .
   * 
   * @param part org.eclipse.ui.IWorkbenchPart
   * */
  public CreateActionMethodAction(final IWorkbenchPart part) {
    super(part);
    setId(CREATE_A_M_ID);
    setText("CreateAttributeMethod");
  }

  /**
   * This method creates and send the creation request for a {@link Attribute}, when the user
   * selected a {@link Attribute}, or a {@link Method}, when the user selected a {@link Method}, to
   * the editpart to which the {@link Attribute} or {@link Method} should be added. The editpart to
   * which the {@link Attribute} or {@link Method} is added is the parenteditpart of the selected
   * {@link Attribute} or {@link Method}.
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

    // decide and setup the creation request for attribute or method
    if (getSelectedObjects().get(0) instanceof ORMAttributeEditPart) {
      request.setFactory(new ORMAttributeFactory());
    } else {
      request.setFactory(new ORMMethodFactory());
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
   * {@inheritDoc} This action is enabled when the selected element is a {@link Attribute} or a
   * {@link Method}.
   * */
  @Override
  protected boolean calculateEnabled() {
    if (getSelectedObjects().isEmpty() || getSelectedObjects().size() > 1) {
      return false;
    }


    if (getSelectedObjects().get(0) instanceof ORMAttributeEditPart
        || getSelectedObjects().get(0) instanceof ORMMethodEditPart) {
      editPart =
          (AbstractGraphicalEditPart) ((AbstractGraphicalEditPart) getSelectedObjects().get(0))
              .getParent();
      return true;
    }
    return false;
  }

}
