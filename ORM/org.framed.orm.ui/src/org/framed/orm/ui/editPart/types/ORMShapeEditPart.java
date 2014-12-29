package org.framed.orm.ui.editPart.types;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.ui.internal.handlers.WizardHandler.New;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.editPart.types.ORMSuperShapeEditPart.ORMShapeAdapter;
import org.framed.orm.ui.editPolicy.ORMNamedElementDirectEditPolicy;
import org.framed.orm.ui.editPolicy.ORMShapeComponentEditPolicy;
import org.framed.orm.ui.editor.ORMCellEditorLocator;
import org.framed.orm.ui.editor.ORMDirectEditManager;
import org.framed.orm.ui.figure.ORMFigureFactory;
import org.framed.orm.ui.figure.ORMShapeFigure;

/**
 * 
 * @author Bálint Gyapjas
 * @author Kay Bierzynski
 *
 */
public class ORMShapeEditPart extends AbstractGraphicalEditPart {

  private final ORMShapeAdapter adapter;

  public ORMShapeEditPart() {
    super();
    adapter = new ORMShapeAdapter();
  }

  @Override
  protected IFigure createFigure() {
    return ORMFigureFactory.createFigure(this);
  }


  @Override
  protected void createEditPolicies() {
    // TODO Auto-generated method stub
    installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ORMNamedElementDirectEditPolicy());
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new ORMShapeComponentEditPolicy(this));
  }
  
  /** {@inheritDoc} */
  @Override
  public void performRequest(Request req) {

    if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
      performDirectEditing();
    }
  }

  
  /**
   * This method initializes and starts the {@link ORMDirectEditManager} for direct editing the
   * type name.
   */
  private void performDirectEditing() {
    Label label = ((ORMShapeFigure) getFigure()).getLabel();
    ORMDirectEditManager manager =
        new ORMDirectEditManager(this, TextCellEditor.class,
            new ORMCellEditorLocator(label), label);
    manager.show(); // refresh view
  }

  public Rectangle getConstraints() {
    Shape model = (Shape) getModel();
    org.framed.orm.geometry.Rectangle boundries = model.getBoundaries();

    Point topLeft = new Point(boundries.getTopLeft().getX(), boundries.getTopLeft().getX()), bottomRight =
        new Point(boundries.getBottomRight().getX(), boundries.getBottomRight().getY());

    return new org.eclipse.draw2d.geometry.Rectangle(topLeft, bottomRight);
  }

  @Override
  protected void addChildVisual(final EditPart childEditPart, final int index) {

  }

  @Override
  public void refreshVisuals() {
    final ORMShapeFigure figure = (ORMShapeFigure) getFigure();
    final Shape model = (Shape) getModel();
    final GraphicalEditPart parent = (GraphicalEditPart) getParent();

    figure.getLabel().setText(model.getName());
    figure.getLabel().setToolTip(new Label(model.getName()));
    Point upperLeft =
        new Point(model.getBoundaries().getTopLeft().getX(), model.getBoundaries().getTopLeft()
            .getY());
    Point bottomRight =
        new Point(model.getBoundaries().getBottomRight().getX(), model.getBoundaries()
            .getBottomRight().getY());
    parent.setLayoutConstraint(this, figure, new Rectangle(upperLeft, bottomRight));
  }

  /** {@inheritDoc} */
  @Override
  public void activate() {
    if (!isActive()) {
      ((Shape) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  /** {@inheritDoc} */
  @Override
  public void deactivate() {
    if (isActive()) {
      ((Shape) getModel()).eAdapters().remove(adapter);
    }

    super.deactivate();
  }

  public class ORMShapeAdapter implements Adapter {

    /** {@inheritDoc} */
    @Override
    public void notifyChanged(final Notification notification) {


      refreshVisuals();

    }

    /** {@inheritDoc} */
    @Override
    public Notifier getTarget() {
      return (Shape) getModel();
    }

    /** {@inheritDoc} */
    @Override
    public void setTarget(final Notifier newTarget) {
      // Do nothing.
    }

    /** {@inheritDoc} */
    @Override
    public boolean isAdapterForType(final Object shape) {
      return shape.equals(Shape.class);
    }
  }

}
