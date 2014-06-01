package org.framed.orm.ui.editPart;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;
import org.framed.orm.ui.editPolicy.ORMContainerEditPolicy;
import org.framed.orm.ui.editPolicy.ORMRolemodelXYLayoutPolicy;
import org.framed.orm.ui.figure.ORMCompartmentV2Figure;
import org.framed.orm.ui.figure.ORMRolemodelFigure;

/**
 * @author Kay Bierzynski
 * */
public class ORMRolemodelEditPart extends AbstractGraphicalEditPart {

  private final ORMRolemodelAdapter adapter;


  public ORMRolemodelEditPart() {
    super();
    adapter = new ORMRolemodelAdapter();

  }

  /*
   * The Rolemodel shouldn´t be selectable, becauce of that we need to override the isSelectable
   * function.
   */
  @Override
  public boolean isSelectable() {
    return false;
  }

  @Override
  protected IFigure createFigure() {
    final GraphicalEditPart parent = (GraphicalEditPart) getParent();


    ORMRolemodelFigure figure = new ORMRolemodelFigure();
    if (parent.getModel() instanceof Compartment) {
      final Type model = (Type) parent.getModel();
      // change border of the figure depending on expandStateChange of the parent compartment
      if (((ORMCompartmentEditPart) getParent()).getFigure() instanceof ORMCompartmentV2Figure) {
        if (model.isIsExpand()) {
          figure.setBorder(new PartFigureBorderExpand());
        }
        if (!(model.isIsExpand())) {
          figure.setBorder(new PartFigureBorderNotExpand());
        }
      }
    }
    // set border of th figure,when the parent is a grouping
    else
      figure.setBorder(new PartFigureBorderNotExpand());
    return figure;
  }

  @Override
  public IFigure getContentPane() {
    return getFigure();
  }

  @Override
  protected void createEditPolicies() {
    installEditPolicy(EditPolicy.LAYOUT_ROLE, new ORMRolemodelXYLayoutPolicy());
    installEditPolicy(EditPolicy.CONTAINER_ROLE, new ORMContainerEditPolicy());
    installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
  }

  @Override
  protected List getModelChildren() {
    List children = new ArrayList();
    Rolemodel rm = (Rolemodel) getModel();
    children.addAll(rm.getSubcontexts());
    children.addAll(rm.getPlayers());
    children.addAll(rm.getParticipants());
    children.addAll(rm.getGroups());
    return children;
  }

  @Override
  public void refreshVisuals() {
    final Figure figure = (Figure) getFigure();
    final GraphicalEditPart parent = (GraphicalEditPart) getParent();
    if (parent.getModel() instanceof Compartment) {
      final Type model = (Type) parent.getModel();

      if (((ORMCompartmentEditPart) getParent()).getFigure() instanceof ORMCompartmentV2Figure) {
        if (model.isIsExpand()) {
          figure.setBorder(new PartFigureBorderExpand());
        }
        if (!(model.isIsExpand())) {
          figure.setBorder(new PartFigureBorderNotExpand());
        }
      }
    }
  }

  // draws border on top side and left side
  public class PartFigureBorderExpand extends AbstractBorder {
    @Override
    public Insets getInsets(IFigure figure) {
      return new Insets(1, 0, 0, 0);
    }

    @Override
    public void paint(IFigure figure, Graphics graphics, Insets insets) {
      graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(), tempRect.getTopRight());
      graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(), tempRect.getBottomLeft());
    }
  }
  // draws border on top side
  public class PartFigureBorderNotExpand extends AbstractBorder {
    @Override
    public Insets getInsets(IFigure figure) {
      return new Insets(1, 0, 0, 0);
    }

    @Override
    public void paint(IFigure figure, Graphics graphics, Insets insets) {
      graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(), tempRect.getTopRight());

    }
  }


  @Override
  public void activate() {
    if (!isActive()) {
      ((Rolemodel) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  @Override
  public void deactivate() {
    if (isActive()) {
      ((Rolemodel) getModel()).eAdapters().remove(adapter);
    }

    super.deactivate();
  }

  /**
   * Currently the class only adapts to create a {@link SnapToHelper} when the editor is in snapping
   * mode (either to grid or to shapes).
   */
  @Override
  public Object getAdapter(Class key) {
    if (key == SnapToHelper.class) {
      List<SnapToHelper> helpers = new ArrayList<SnapToHelper>();
      if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED))) {
        helpers.add(new SnapToGeometry(this));
      }
      if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGrid.PROPERTY_GRID_ENABLED))) {
        helpers.add(new SnapToGrid(this));
      }
      if (helpers.size() == 0) {
        return null;
      } else {
        return new CompoundSnapToHelper(helpers.toArray(new SnapToHelper[0]));
      }
    }
    return super.getAdapter(key);
  }

  public class ORMRolemodelAdapter implements Adapter {

    // Adapter interface
    @Override
    public void notifyChanged(Notification notification) {
      refreshChildren();
      refreshVisuals();

    }

    @Override
    public Notifier getTarget() {
      return (Rolemodel) getModel();
    }

    @Override
    public void setTarget(Notifier newTarget) {
      // Do nothing.
    }

    @Override
    public boolean isAdapterForType(Object type) {
      return type.getClass().equals(Rolemodel.class);
    }
  }
}
