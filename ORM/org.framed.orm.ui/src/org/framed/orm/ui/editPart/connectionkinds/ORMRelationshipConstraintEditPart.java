package org.framed.orm.ui.editPart.connectionkinds;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Label;
import org.eclipse.gef.EditPart;
import org.framed.orm.model.Relation;

/**
 * This {@link EditPart} is the super/parent {@link EditPart} respectively super/parent controller
 * of all {@link Relation}s from type cyclic, total, acyclic, reflexive and irreflexive (aka relationshipConstraint) and
 * is required as all relationshipConstraints of a {@link Relation} from type relationship need to
 * be unified in a single figure. Furthermore, in case the user deletes/adds a
 * relationshipConstraint, the figure has to be updated.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationshipConstraintEditPart extends ORMRelationEditPart {

  /**
   * A {@link Label}, which contains all the {@link Relation}s names of the relations from type
   * cyclic, total, acyclic, reflexive and irreflexive of a single {@link Relation} from type relationship.
   */
  private Label label = new Label();
  /**
   * A string, which contains the initial text of a {@link Relation} from cyclic, total, acyclic, reflexive or
   * irreflexive without unifying it with other relationshipConstraints.
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
   * A setter for the initial text of a {@link Relation} from cyclic, total, acyclic, reflexive or irreflexive without
   * unifying it with other relationshipConstraints.
   * 
   * @param initial {@link String}
   * */
  public void setTextInitial(String initial) {
    textInitial = initial;
  }



  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} calls
   * {@link ORMRelationEditPart#refreshVisuals()}, "unifies the {@link Relation}s from type cyclic,
   * total, acyclic, reflexive and irreflexive(aka relationshipConstraint) figures" of a single {@link Relation} from
   * type relationship" and sets the visibility of the relationshipConstraint figure. The unifying
   * of the relationshipConstraint figures is done through combining the text/name of all the
   * relationshipConstraints in the {@link Label} of the relationshipConstraint figure of the first
   * relationshipConstraint, which was created for the relationship, and through setting the
   * visibilities of the other relationshipConstraint figures on false.
   * 
   */
  @Override
  public void refreshVisuals() {
	  getConnectionFigure().setVisible(false);
//    super.refreshVisuals();
//
//
//    if (getTarget() != null && getSource() != null
//        && ((Relation) getModel()).getReferencedRelation().size() > 0) {
//      Relation relationship = ((Relation) getModel()).getReferencedRelation().get(0);
//      List<Relation> relCList = new ArrayList<Relation>();
//
//      relCList.addAll(relationship.getReferencedRelation());
//
//      if (relCList.size() != 0) {
//
//        // get the edit part, which controls the first relationconstraint that was created for the
//        // relationship
//        ORMRelationshipConstraintEditPart rep =
//            (ORMRelationshipConstraintEditPart) getViewer().getEditPartRegistry().get(
//                relCList.get(0));
//
//        if (rep != null) {
//          // the connection figure visibility must be settet here, because the refreshvisual from
//          // ORMRelationEditPart sets the figure visibility as well this is a problem insofar that
//          // only the first created relationshipconstraint should be visible
//          if (!rep.equals(this)) {
//            getConnectionFigure().setVisible(false);
//          } else {
//            getConnectionFigure().setVisible(true);
//          }
//
//          // if branch for the relationconstraints that not are first created relationconstraint
//          if (!rep.equals(this) && !rep.getLabel().getText().contains(textInitial)) {
//            String oldText = rep.getLabel().getText();
//            rep.getLabel().setText(textInitial + " , " + oldText);
//          }
//          // if branch for the first created relationconstraint
//          if (rep.equals(this) && !rep.getLabel().getText().contains(textInitial)) {
//            label.setText(textInitial);
//          }
//        }
//      }
//    }
  }
}
