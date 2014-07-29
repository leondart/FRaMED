package org.framed.orm.ui.editPart.connectionkinds;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MidpointLocator;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;

/**
 * This {@link EditPart} is the super/parent {@link EditPart} also super/parent controller of all
 * {@link RelationshipConstraint}s and is needed, because all {@link RelationshipConstraint}s of a
 * {@link Relationship} need to be unified in a single figure and when the user deletes/adds a
 * {@link RelationshipConstraint} than the figure mus be updated.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationshipConstraintEditPart extends ORMRelationEditPart {

  /**
   * A {@link Label}, which contains all the {@link RelationshipConstraint}s names of a single
   * {@link Relationship}.
   */
  private Label label = new Label();
  /**
   * A string, which contains the intital text of a {@link RelationshipConstraint} without unfiy it
   * with other {@link RelationshipConstraint}s.
   */
  private String textInitial;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent.
   */
  public ORMRelationshipConstraintEditPart() {
    super();
  }

  /**
   * A getter for the label.
   * 
   * @return label org.eclipse.draw2d.Label
   * */
  public Label getLabel() {
    return label;
  }

  /**
   * This method creates and returns the {@link RelationshipConstraint} figure, which differs from
   * {@link RelationshipConstraint} to {@link RelationshipConstraint} only in the text of the
   * {@link Label}. A {@link RelationshipConstraint} figure is dashed line with a {@link Label}.
   * 
   * @return conn org.eclipse.draw2d.PolylineConnection
   * */
  public IFigure creatRelationshipConstraint(final String text) {

    label.setText(text);
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
    // this is needed, because when the label would be just added the label text could be seen in
    // the
    // compartmentdiagram
    if (getRoot().getContents() instanceof ORMCompartmentEditPart) {
      conn.add(label, midL);
    }
    return conn;
  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} calls
   * {@link ORMRelationEditPart#refreshVisuals()}, "unifies the {@link RelationshipConstraint}
   * figures" of a single {@link Relationship}" and sets the visibilitie of the
   * {@link RelationshipConstraint} figure. The unifying of the {@link RelationshipConstraint}
   * figures is done through combining the text/name of all the {@link RelationshipConstraint}s in
   * the {@link Label} of the {@link RelationshipConstraint} figure of the first
   * {@link RelationshipConstraint}, which was created for the relationship, and through setting the
   * visibilities of the other {@link RelationshipConstraint} figures on false.
   * 
   */
  @Override
  public void refreshVisuals() {
    super.refreshVisuals();

    Relationship relationship = ((RelationshipConstraint) getModel()).getRelation();
    if (getTarget() != null && getSource() != null && relationship != null) {

      List<RelationshipConstraint> relCList = new ArrayList<RelationshipConstraint>();

      relCList.addAll(relationship.getRlshipConstraints());

      if (relCList.size() != 0) {

        // get the edit part, which controls the first relationconstraint that was created for the
        // relationship
        ORMRelationshipConstraintEditPart rep =
            (ORMRelationshipConstraintEditPart) getViewer().getEditPartRegistry().get(
                relCList.get(0));

        if (rep != null) {
          //if branch for the relationconstraints that not are first created relationconstraint
          if (!rep.equals(this) && !rep.getLabel().getText().contains(textInitial)) {
            String oldText = rep.getLabel().getText();
            rep.getLabel().setText(textInitial + " , " + oldText);

            getConnectionFigure().setVisible(false);

          }
        //if branch for the first created relationconstraint
          if (rep.equals(this) && !rep.getLabel().getText().contains(textInitial)) {
            label.setText(textInitial);
            getConnectionFigure().setVisible(true);
          }
        }
      }
    }
  }
}
