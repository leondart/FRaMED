package org.framed.orm.ui.editPart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.jface.viewers.TextCellEditor;
import org.framed.orm.model.Methode;
import org.framed.orm.model.Node;
import org.framed.orm.ui.editPart.types.ORMTypeEditPart;
import org.framed.orm.ui.editPolicy.ORMDragEditPartsTracker;
import org.framed.orm.ui.editPolicy.ORMMethodComponentEditPolicy;
import org.framed.orm.ui.editPolicy.ORMMethodDirectEditPolicy;
import org.framed.orm.ui.editor.ORMNodeCellEditorLocator;
import org.framed.orm.ui.editor.ORMNodeDirectEditManager;

/**
 * @author Kay Bierzynski
 * */
public class ORMMethodEditPart extends AbstractGraphicalEditPart {

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.eclipse.gef.editparts.AbstractGraphicalEditPart#getDragTracker(org.eclipse.gef.Request)
   */
  @Override
  public DragTracker getDragTracker(Request request) {
    return new ORMDragEditPartsTracker(this);
  }

  private final ORMMethodAdapter adapter;
  private ORMTypeEditPart parentEditPart;

  public ORMMethodEditPart() {
    super();
    adapter = new ORMMethodAdapter();
  }

  @Override
  protected IFigure createFigure() {
    ORMLabelFigure label = null;

    if(!(parentEditPart.getModel() instanceof ORMTypeEditPart))
      label = new ORMLabelFigure(this,parentEditPart.getNode());
    else
      label = new ORMLabelFigure(this,(ORMTypeEditPart)parentEditPart.getModel());

    return label;
  }

  @Override
  protected void createEditPolicies() {
    installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ORMMethodDirectEditPolicy());
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new ORMMethodComponentEditPolicy());
  }

  @Override
  public void performRequest(Request req) {

    if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
      performDirectEditing();
    }
  }

  private void performDirectEditing() {
    TextFlow textFlow = ((ORMLabelFigure) getFigure()).getTextFlow();
    ORMNodeDirectEditManager manager =
        new ORMNodeDirectEditManager(this, TextCellEditor.class, new ORMNodeCellEditorLocator(
            textFlow), textFlow);
    manager.show(); // refresh view
  }

  @Override
  protected void refreshVisuals() {
    final ORMLabelFigure figure = (ORMLabelFigure) getFigure();
    final Method model = (Method) getModel();


    figure.setText(model.getName());

    figure.setToolTip(new Label(model.getName()));
  }

  @Override
  public void activate() {
    if (!isActive()) {
      ((Method) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  @Override
  public void deactivate() {
    if (isActive()) {
      ((Method) getModel()).eAdapters().remove(adapter);
    }

    super.deactivate();
  }

  public class ORMMethodAdapter implements Adapter {

    // Adapter interface
    @Override
    public void notifyChanged(Notification notification) {
      refreshVisuals();
    }

    @Override
    public Notifier getTarget() {
      return (Method) getModel();
    }

    @Override
    public void setTarget(Notifier newTarget) {
      // Do nothing.
    }

    @Override
    public boolean isAdapterForType(Object type) {
      return type.getClass().equals(Method.class);
    }
  }

  public void setParentEditPart(ORMTypeEditPart pEditPart) {
    parentEditPart = pEditPart;
  }


}
