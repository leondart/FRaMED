package org.framed.orm.ui.editPart.connectionkinds;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.jface.viewers.TextCellEditor;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Relation;
import org.framed.orm.ui.editPart.ORMNamedElementEditPart;
import org.framed.orm.ui.editPart.shape.ORMSuperShapeEditPart;
import org.framed.orm.ui.editPolicy.ORMNamedElementDirectEditPolicy;
import org.framed.orm.ui.editor.ORMCellEditorLocator;
import org.framed.orm.ui.editor.ORMDirectEditManager;
import org.framed.orm.ui.figure.shapes.ORMConnectionMultiplePolyline;

/**
 * This {@link EditPart} is the controller for {@link Relation}s from type relationship.
 * 
 * @author Kay Bierzynski (initial development, implemented Relationship Implication, last changes
 *         due to new model)
 * @author Lars Schuetze (refactoring)
 * @author David Gollasch (changes due to a new model)
 * @author Duc Dung Dam (added constraint label)
 **/
public class ORMRelationshipEditPart extends ORMRelationEditPart {

  private Label nameLabel = new Label();
  private Label constraintLabel = new Label();

  /**
   * This method returns a {@link ConnectionEndpointLocator} for this {@link Relation} from type
   * relationship.
   * 
   * @return locator org.eclipse.draw2d.ConnectionEndpointLocator
   * */
  private Locator getConnectionLocator(final PolylineConnection connection, final boolean isEnd) {
    final ConnectionEndpointLocator locator = new ConnectionEndpointLocator(connection, isEnd);
    locator.setVDistance(-1);
    locator.setUDistance(1);
    return locator;
  }

  /** {@inheritDoc} */
  @Override
  protected List<NamedElement> getModelChildren() {
    List<NamedElement> children = new ArrayList<>(2);
    children.add(getRelationship().getTargetLabel());
    children.add(getRelationship().getSourceLabel());
    if (getRelationship().getConnectionAnchor() != null) {
      children.add(getRelationship().getConnectionAnchor());
    }
    return children;
  }

  /**
   * A getter for the model element {@link Relation} from type relationship.
   * 
   * @return ({@link Relationship}) getModel()
   * */
  public Relation getRelationship() {
    return (Relation) getModel();
  }

  @Override
  protected void createEditPolicies() {
    super.createEditPolicies();
    // edit policy for handling requests of editing the named element name
    installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ORMNamedElementDirectEditPolicy());
  }

  /**
   * A getter for the relationship figure.
   * 
   * @return ({@link PolylineConnection}) getFigure()
   * */
  protected PolylineConnection getRelationFigure() {
    return (PolylineConnection) getFigure();
  }

  /**
   * {@inheritDoc} In case the figures of targetLabel and sourceLabel which are {@link NamedElement}
   * s.
   */
  @Override
  protected void addChildVisual(final EditPart childEditPart, final int index) {
    if (childEditPart instanceof ORMNamedElementEditPart) {
      ORMNamedElementEditPart labelEditPart = (ORMNamedElementEditPart) childEditPart;
      if (labelEditPart.getModel().equals(getRelationship().getSourceLabel())) {
        getRelationFigure().getLayoutManager().setConstraint(labelEditPart.getFigure(),
            getConnectionLocator(getRelationFigure(), false));
      } else {
        getRelationFigure().getLayoutManager().setConstraint(labelEditPart.getFigure(),
            getConnectionLocator(getRelationFigure(), true));
      }
    }

    if (childEditPart instanceof ORMSuperShapeEditPart) {
      ConnectionLocator loc = new ConnectionLocator(getRelationFigure(), ConnectionLocator.MIDDLE);
      getRelationFigure().getLayoutManager().setConstraint(
          ((ORMSuperShapeEditPart) childEditPart).getFigure(), loc);
    }
    super.addChildVisual(childEditPart, index);
  }

  /**
   * {@inheritDoc} In case the relation is from type relationship than the text of the name label is
   * refreshed here.
   */
  @Override
  protected void refreshVisuals() {
    super.refreshVisuals();
    List<Relation> constraints = new ArrayList<>();
    constraints.addAll(getRelationship().getReferencedRelation());
    ORMConnectionMultiplePolyline conn = (ORMConnectionMultiplePolyline) getConnectionFigure();
    
    String strConstraints = "";
    if(constraints.size() == 0){
    	conn.setHasConstraint(false);
    }else{
    	conn.setHasConstraint(true);
    	for(int i=0; i<constraints.size(); i++){
    		if(i==constraints.size()-1){
    			strConstraints += constraints.get(i).getName();
    		}else{
    			strConstraints += constraints.get(i).getName()+", ";
    		}
    	}
    }
    
    conn.repaint();
    
    nameLabel.setText(getRelationship().getName());
    constraintLabel.setText(strConstraints);
   
  }

  /** {@inheritDoc} */
  @Override
  public void performRequest(final Request req) {
    // handle requests for direct editing the named element name
    if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
      performDirectEditing();
    }
  }

  /**
   * This method initializes and starts the {@link ORMDirectEditManager} for direct editing the
   * attribute name.
   */
  private void performDirectEditing() {
    final ORMDirectEditManager manager =
        new ORMDirectEditManager(this, TextCellEditor.class, new ORMCellEditorLocator(nameLabel),
            nameLabel);
    manager.show(); // refresh view
  }
  
  /**
   * A getter for name {@link Label} of this relationship.
   * 
   * @return nameLabel
   * */
  public Label getNameLabel() {
    return nameLabel;
  }
  
  /**
   * A getter for constraint {@link Label} of this relationship.
   * 
   * @return constraintLabel
   * */
  public Label getConstraintLabel() {
    return constraintLabel;
  }

}
