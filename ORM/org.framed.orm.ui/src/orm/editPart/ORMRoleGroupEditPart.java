package orm.editPart;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.jface.viewers.TextCellEditor;

import orm.editPart.types.ORMRoleTypeEditPart;
import orm.editPolicy.ORMNodeDirectEditPolicy;
import orm.editPolicy.ORMRoleGroupComponentEditPolicy;
import orm.editPolicy.ORMRoleGroupXYLayoutEditPolicy;
import orm.editPolicy.ORMNodeGraphicalNodeEditPolicy;
import orm.editor.ORMNodeCellEditorLocator;
import orm.editor.ORMNodeDirectEditManager;
import orm.figure.ORMRoleGroupFigure;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RoleGroup;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupEditPart extends AbstractGraphicalEditPart  implements NodeEditPart{

	private ORMRoleGroupAdapter adapter;
	
	public ORMRoleGroupEditPart() {
	    super();
	    adapter = new ORMRoleGroupAdapter();
	    
	  }
	
	@Override
	protected IFigure createFigure() {
		ORMRoleGroupFigure fig = new ORMRoleGroupFigure();
		return fig;
	}
	
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ORMNodeDirectEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new ORMRoleGroupXYLayoutEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ORMRoleGroupComponentEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ORMNodeGraphicalNodeEditPolicy());
		installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
	}
	
	
	@Override public void performRequest(Request req) {
		 
	    if(req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
	      performDirectEditing();
	    }
	  }
	
	private void performDirectEditing() {
		 TextFlow textFlow = ((ORMRoleGroupFigure) getFigure()).getLabel();
		 ORMNodeDirectEditManager manager = new ORMNodeDirectEditManager(this, TextCellEditor.class, new ORMNodeCellEditorLocator(textFlow), textFlow);
	    manager.show(); // refresh view
	  } 
	// add child roltypes and rolegroups
	 @Override
	 protected void addChildVisual(EditPart childEditPart, int index) {
          IFigure contentPane = ((ORMRoleGroupFigure) getFigure()).getBasicRec();
          if(childEditPart instanceof ORMRoleTypeEditPart)   contentPane.add(((ORMRoleTypeEditPart)childEditPart).getFigure());
          if(childEditPart instanceof ORMRoleGroupEditPart)  contentPane.add(((ORMRoleGroupEditPart)childEditPart).getFigure());
		 }
	// remove child roltypes and rolegroups
	 @Override
	 protected void removeChildVisual(EditPart childEditPart) {
		 IFigure contentPane = ((ORMRoleGroupFigure) getFigure()).getBasicRec();
		 if(childEditPart instanceof ORMRoleTypeEditPart)   contentPane.remove(((ORMRoleTypeEditPart)childEditPart).getFigure());
         if(childEditPart instanceof ORMRoleGroupEditPart)  contentPane.remove(((ORMRoleGroupEditPart)childEditPart).getFigure());
		 
		 }
	 
	 @Override
	    protected List<Relation> getModelSourceConnections() {
		 	RoleGroup model = (RoleGroup)getModel();
	    	return model.getOutgoingLinks();
	    }

	 @Override
	    protected List<Relation> getModelTargetConnections() {
	    	RoleGroup model = (RoleGroup)getModel();
	    	return model.getIncomingLinks();
	    }
	 
	 @Override protected List getModelChildren() {
			List children = new ArrayList();
			
			RoleGroup roleGroup = (RoleGroup) getModel();
			children.addAll(roleGroup.getItems());
					
			return children;
		}
	
	@Override protected void refreshVisuals() {
		final ORMRoleGroupFigure figure = (ORMRoleGroupFigure) getFigure();
	    final RoleGroup model = (RoleGroup) getModel();
	    final GraphicalEditPart parent = (GraphicalEditPart) getParent();	    
	    
	    figure.getLabel().setText(model.getName());
	    parent.setLayoutConstraint(this, figure, model.getConstraints());
	   
	  }
	
	 @Override
	    public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
	    	return ((ORMRoleGroupFigure)getFigure()).getConnectionAnchor();
	    }

	    @Override
	    public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
	    	return ((ORMRoleGroupFigure)getFigure()).getConnectionAnchor();
	    }

	    @Override
	    public ConnectionAnchor getSourceConnectionAnchor(Request request) {
	    	return ((ORMRoleGroupFigure)getFigure()).getConnectionAnchor();
	    }

	    @Override
	    public ConnectionAnchor getTargetConnectionAnchor(Request request) {
	    	return ((ORMRoleGroupFigure)getFigure()).getConnectionAnchor();
	    }
	
	@Override public void activate() {
	    if(!isActive()) {
	      ((RoleGroup)getModel()).eAdapters().add(adapter);
	    }
	    super.activate();
	  }
	 
	  @Override public void deactivate() {
	    if(isActive()) {
	      ((RoleGroup)getModel()).eAdapters().remove(adapter);
	    }
	 
	    super.deactivate();
	  }
	  
	  
	  /**
	   * Currently the class only adapts to create a {@link SnapToHelper}
	   * when the editor is in snapping mode (either to grid or to shapes).
	   */
	  @Override public Object getAdapter(Class key) {
	      if (key == SnapToHelper.class) {
	           List<SnapToHelper> helpers = new ArrayList<SnapToHelper>();
	           if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED))) {
	               helpers.add(new SnapToGeometry(this));
	           }
	           if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGrid.PROPERTY_GRID_ENABLED))) {
	               helpers.add(new SnapToGrid(this));
	           }
	           if(helpers.size()==0) {
	               return null;
	           } else {
	               return new CompoundSnapToHelper(helpers.toArray(new SnapToHelper[0]));
	           }
	       }
	       return super.getAdapter(key);
	  }	
	  
	  public class ORMRoleGroupAdapter implements Adapter {
	 
	    // Adapter interface
	    @Override public void notifyChanged(Notification notification) {
	      refreshChildren();
	      refreshVisuals();
	      // for synchronsation with role list of the parent Compartement in above layer of the tree
	      if(getParent().getParent() instanceof ORMCompartmentEditPart) ((ORMCompartmentEditPart)getParent().getParent()).refreshVisuals();
	      refreshSourceConnections();
	      refreshTargetConnections();
	    }
	 
	    @Override public Notifier getTarget() {
	      return (RoleGroup)getModel();
	    }
	 
	    @Override public void setTarget(Notifier newTarget) {
	      // Do nothing.
	    }
	 
	    @Override public boolean isAdapterForType(Object type) {
	      return type.equals(RoleGroup.class);
	    }
	  } 
}
