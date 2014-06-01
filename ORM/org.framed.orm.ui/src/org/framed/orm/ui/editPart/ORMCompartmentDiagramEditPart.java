package org.framed.orm.ui.editPart;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.swt.SWT;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.ui.editPolicy.ORMCompartmentDiagramXYLayoutPolicy;

/**
 * @author Kay Bierzynski
 * */
public class ORMCompartmentDiagramEditPart extends AbstractGraphicalEditPart {


  private final ORMContextDiagramAdapter adapter;

  public ORMCompartmentDiagramEditPart() {
    super();
    adapter = new ORMContextDiagramAdapter();
  }


  // TODO: test which layer kind is better
  @Override
  protected IFigure createFigure() {
    // FreeformLayer layer = new FreeformLayer();
    ConnectionLayer layer = new ConnectionLayer();
    layer.setLayoutManager(new XYLayout());
    layer.setBorder(new LineBorder(1));
    layer.setAntialias(SWT.ON);
    return layer;
  }

  @Override
  protected void createEditPolicies() {
    installEditPolicy(EditPolicy.LAYOUT_ROLE, new ORMCompartmentDiagramXYLayoutPolicy());
    installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
  }


  @Override
  protected List getModelChildren() {
    List contexts = new ArrayList();
    CompartmentDiagram cd = (CompartmentDiagram) getModel();
    contexts.addAll(cd.getCompartments());
    contexts.addAll(cd.getGroups());
    contexts.addAll(cd.getPlayers());
    return contexts;
  }



  @Override
  public void activate() {
    if (!isActive()) {
      ((CompartmentDiagram) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  @Override
  public void deactivate() {
    if (isActive()) {
      ((CompartmentDiagram) getModel()).eAdapters().remove(adapter);
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

  public class ORMContextDiagramAdapter implements Adapter {

    @Override
    public void notifyChanged(Notification notification) {
      refreshChildren();
    }

    @Override
    public Notifier getTarget() {
      return (CompartmentDiagram) getModel();
    }

    @Override
    public void setTarget(Notifier newTarget) {
      // Do nothing.
    }

    @Override
    public boolean isAdapterForType(Object type) {
      return type.getClass().equals(CompartmentDiagram.class);
    }
  }
}
