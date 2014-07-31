package org.framed.orm.ui.figure;


import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.framed.orm.model.Attribute;
import org.framed.orm.model.Node;
import org.framed.orm.model.Type;

/**
 * This is the parent figure for all {@link Type} figures.
 * 
 * @author Kay Bierzynski
 * */
public abstract class ORMTypeFigure extends Figure {
  /**
   * The {@link PartFigure}( attribute list figure) to which child figures of {@link Attribute}s are
   * added.
   */
  private final PartFigure attributeFigure;
  /**
   * The {@link PartFigure}( method list figure) to which child figures of {@link Method}s are
   * added.
   */
  private final PartFigure methodFigure;
  /** This {@link Label} is the figure for the {@link Type} name. */
  private final Label label;
  /**
   * The {@link ConnectionAnchor} of this figure, which is necessary for connecting {@link Relation}
   * s to the figure.
   */
  private ConnectionAnchor connectionAnchor;

  /**
   * The constructor of this class, where the name figure ({@link Label}, the attribute list figure
   * ({@link PartFigure}) and the method list figure ({@link PartFigure}) are initialized.
   * */
  public ORMTypeFigure(final Node parent) {
    label = new Label();
    attributeFigure = new PartFigure();
    methodFigure = new PartFigure();
  }

  /**
   * A getter for the label, which is the figure for the {@link Type} name.
   * 
   * @return label {@link Label}
   * */
  public Label getLabel() {
    return label;
  }

  /**
   * A getter for the attribute list figure of this figure.
   * 
   * @return attributeFigure {@link PartFigure}
   * */
  public PartFigure getAttributeFigure() {
    return attributeFigure;
  }

  /** {@inheritDoc} */
  @Override
  protected boolean useLocalCoordinates() {
    return true;
  }

  /**
   * A getter for the method list figure of this figure.
   * 
   * @return methodFigure {@link PartFigure}
   * */
  public PartFigure getMethodeFigure() {
    return methodFigure;
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
