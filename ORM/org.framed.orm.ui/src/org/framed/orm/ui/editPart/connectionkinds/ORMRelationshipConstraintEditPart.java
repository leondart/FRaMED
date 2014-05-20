package org.framed.orm.ui.editPart.connectionkinds;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MidpointLocator;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;


public class ORMRelationshipConstraintEditPart extends ORMRelationEditPart {

  private Label lab = new Label();
  private String textInitial;
  
  public Label getLabel() {
    return lab;
  }

  public IFigure creatRelationshipConstraint(String text) {

    lab.setText(text);
    textInitial = text;
    PolylineConnection conn = new PolylineConnection();
    conn.setAntialias(SWT.ON);
    conn.setLineDash(new float[] {5.0f, 5.0f});
    conn.setLineStyle(SWT.LINE_CUSTOM);;
    conn.setConnectionRouter(new BendpointConnectionRouter());

    // add label to the connection
    // TODO: change calculation/refresh so that label is always in the mid of the connection
    MidpointLocator midL = new MidpointLocator(conn, 0);
    midL.setGap(5);
    midL.setRelativePosition(PositionConstants.SOUTH);
    // this is needed, because when the label would be just added the label can be seen in the
    // compartmentdiagram
    if (getRoot().getContents() instanceof ORMCompartmentEditPart) {
      conn.add(lab, midL);
    }
    return conn;
  }
  
  /***/
  @Override
  public void refreshVisuals() {
    super.refreshVisuals();
    Relationship rlship = ((RelationshipConstraint) getModel()).getRelation();
    if (getTarget() != null && getSource() != null && rlship != null) {
   
      List<RelationshipConstraint> relCList = new ArrayList<RelationshipConstraint>();
   
      relCList.addAll(rlship.getRlshipConstraints());

      if (relCList.size() != 0) {

        ORMRelationshipConstraintEditPart rep =
            (ORMRelationshipConstraintEditPart) getViewer().getEditPartRegistry().get(relCList.get(0));

        if (!rep.equals(this) && !rep.getLabel().getText().contains(lab.getText()) ) {
          String oldText = rep.getLabel().getText();
          rep.getLabel().setText( lab.getText()+  " , " + oldText );
          
          getConnectionFigure().setVisible(false);
        }
        if(rep.equals(this)){
          lab.setText(textInitial);
          getConnectionFigure().setVisible(true);
        }
      
      }
    }
  }
}

