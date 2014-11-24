package org.framed.orm.ui.tool;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.tools.CreationTool;
import org.eclipse.swt.widgets.Display;
import org.framed.orm.model.NamedElement;

/**
 * This {@link CreationTool} enables direct editing of a {@link NamedElement}s name after the creating of
 * the {@link NamedElement}.
 * 
 * @author Kay Bierzynski
 * */
public class CreationAndDirectEditTool extends CreationTool {

  /**
   * After the creation of a {@link NamedElement} through a pallet entry this method is called. This method
   * send a {@link DirectEditRequest} to the edit part of the just created {@link NamedElement}. Through the
   * request can the user edit the name of the NamedElement direct after the creation of the NamedElement.
   * 
   * */
  @Override
  protected void performCreation(final int button) {
    super.performCreation(button);

    final EditPartViewer viewer = getCurrentViewer();
    final Object model = getCreateRequest().getNewObject();
    if (model == null || viewer == null) {
      return;
    }

    final Object o = getCurrentViewer().getEditPartRegistry().get(model);
    if (o instanceof EditPart) {
      Display.getCurrent().asyncExec(new Runnable() {

        @Override
        public void run() {
          final EditPart part = (EditPart) o;
          final Request request = new DirectEditRequest();
          part.performRequest(request);
        }
      });
    }
  }

}
