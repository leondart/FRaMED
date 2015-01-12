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
import org.framed.orm.ui.editPart.shape.ORMCompartmentEditPart;

/**
 * This {@link EditPart} is the super/parent {@link EditPart} respectively super/parent controller
 * of all {@link RelationshipConstraint}s and is required as all {@link RelationshipConstraint}s of
 * a {@link Relationship} need to be unified in a single figure. Furthermore, in case the user
 * deletes/adds a {@link RelationshipConstraint}, the figure has to be updated.
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
   * A string, which contains the initial text of a {@link RelationshipConstraint} without unifying
   * it with other {@link RelationshipConstraint}s.
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

  public void setTextInitial(String initial) {
    textInitial = initial;
  }



  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} calls
   * {@link ORMRelationEditPart#refreshVisuals()}, "unifies the {@link RelationshipConstraint}
   * figures" of a single {@link Relationship}" and sets the visibility of the
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
          // if branch for the relationconstraints that not are first created relationconstraint
          if (!rep.equals(this) && !rep.getLabel().getText().contains(textInitial)) {
            String oldText = rep.getLabel().getText();
            rep.getLabel().setText(textInitial + " , " + oldText);

            getConnectionFigure().setVisible(false);

          }
          // if branch for the first created relationconstraint
          if (rep.equals(this) && !rep.getLabel().getText().contains(textInitial)) {
            label.setText(textInitial);
            getConnectionFigure().setVisible(true);
          }
        }
      }
    }
  }
}
