package org.framed.orm.ui.figure.shapes;


import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.framed.orm.model.Shape;


/**
 * This is the parent figure for all {@link Shape}s figures from type ComaprtmentType, NatrualType,
 * RoleType, RoleGroup, Group and DataType.
 * 
 * @author Kay Bierzynski
 * */
public class ORMShapeFigure extends Figure {

  /** This {@link Label} is the figure for the {@link Shape} name. */
  private final Label label;

  /** This boolean variable predicates if the expandable part of a figure is expanded or collapsed.*/
  private boolean expandState;
  /**
   * The {@link ConnectionAnchor} of this figure, which is necessary for connecting {@link Relation}
   * s to the figure.
   */
  private ConnectionAnchor connectionAnchor;

  /**
   * The constructor of this class, where the name figure ({@link Label} is initialized.
   * */
  public ORMShapeFigure() {
    super();
    label = new Label();
    expandState = true;
  }

  /**
   * A getter for the label, which is the figure for the {@link Shape} name.
   * 
   * @return label {@link Label}
   * */
  public Label getLabel() {
    return label;
  }

  /** {@inheritDoc} */
  @Override
  protected boolean useLocalCoordinates() {
    return true;
  }

  /**
   * A getter for the expand flage of this figure.
   * 
   * @return booleanf
   * */
  public boolean isExpanded(){
    return expandState;
  }
  
  /**
   * A setter for the expand flage of this figure. 
   * */
  public void setExpandState(boolean state){
    this.expandState = state;
  }
  
  /**
   * A getter for the {@link ConnectionAnchor} of this figure
   * 
   * @reutrn connectionAnchor {@link ConnectionAnchor}
   * */
  public ConnectionAnchor getConnectionAnchor() {
    if (connectionAnchor == null) {
      connectionAnchor = new ChopboxAnchor(this);
    }
    return connectionAnchor;
  }
}
