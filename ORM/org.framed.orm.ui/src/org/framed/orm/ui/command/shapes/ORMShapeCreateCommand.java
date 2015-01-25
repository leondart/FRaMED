package org.framed.orm.ui.command.shapes;

import org.eclipse.gef.commands.Command;
import org.framed.orm.geometry.Rectangle;
import org.framed.orm.model.Model;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Segment;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;

/**
 * Through this command all {@link Shape}s can be created(invoked into the model tree).
 * 
 * @author Kay Bierzynski
 * */
public class ORMShapeCreateCommand extends Command {

  /** The {@link Model} to which the {@link Shape} should be added. */
  private Model parent;

  /**
   * The {@link Segme+nt} of the {@link Shape} to which the attriubtes({@link NamedElement}s) are
   * added. When the shape cannot contain attributes this segment is null.
   */
  private Segment attributeSegment;

  /**
   * The {@link Segment} of the {@link Shape} to which the operations({@link NamedElement}s) are
   * added. When the shape cannot contain operations this segment is null.
   */
  private Segment operationSegment;

  /**
   * The child {@link Model} of the {@link Shape}. When the shape shouldn't have child model than
   * this model is null.
   */
  private Model childmodel;

  /**
   * The description of the {@link Shape} in form of a {@link NamedElement}. When the shape
   * shouldn't have a description than this namedelement should be null.
   * */
  private NamedElement description;

  /**
   * The {@link Shape} to be created. The type of the {@link Shape} is given by a factory.
   */
  protected Shape shape;
  /**
   * A {@link Rectangle}, which represents the boundaries of the {@link Shape}. The boundaries
   * describes the width and heigth of the {@link Shape} in the viewer.
   */
  private Rectangle boundarie;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMShapeCreateCommand() {
    super.setLabel("ORMShapeCreate");
  }


  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter boundaries, node and parent are set.
   */
  @Override
  public boolean canExecute() {
    if (shape == null || boundarie == null || parent == null) {
      return false;
    }

    int val = shape.getType().getValue();

    switch (val) {
      case Type.COMPARTMENT_TYPE_VALUE:
        return attributeSegment != null && operationSegment != null && childmodel != null
            && description == null;
      case Type.GROUP_VALUE:
        return attributeSegment == null && operationSegment == null && childmodel != null
            && description == null;
      case Type.ROLE_GROUP_VALUE:
        return attributeSegment == null && operationSegment == null && childmodel != null
            && description != null;
      case Type.NATURAL_TYPE_VALUE:
        return attributeSegment != null && operationSegment != null && childmodel == null
            && description == null;
      case Type.DATA_TYPE_VALUE:
        return attributeSegment != null && operationSegment != null && childmodel == null
            && description == null;
      case Type.ROLE_TYPE_VALUE:
        return attributeSegment != null && operationSegment != null && childmodel == null
            && description != null;
    }

    return false;
  }

  /**
   * {@inheritDoc} In this method the {@link Shape} is created/ invoked into the model tree through
   * setting it's refrences and variables.
   */
  @Override
  public void execute() {
    shape.setName("<...>");
    shape.setBoundaries(boundarie);
    shape.setContainer(parent);
    shape.setFirstSegment(attributeSegment);
    shape.setSecondSegment(operationSegment);
    shape.setModel(childmodel);
    shape.setDescription(description);
  }

  /**
   * {@inheritDoc} This command is undone through setting all the variables of the {@link Shape},
   * which where set in this command, on null.
   * 
   */
  @Override
  public void undo() {

    shape.setBoundaries(null);
    shape.setContainer(null);
    shape.setFirstSegment(null);
    shape.setSecondSegment(null);
    shape.setModel(null);
    shape.setDescription(null);
  }

  /**
   * Setter for the boundarie of the {@link Shape}, which is to be created.
   * 
   * @param boundaries org.framed.orm.geometry.Rectangle
   * */
  public void setBoundaries(final Rectangle boundaries) {
    this.boundarie = boundaries;
  }

  /**
   * Setter for the {@link Shape}, which is created/invoked in this command.
   * 
   * @param shape org.framed.orm.model.Shape
   * */
  public void setShape(final Shape shape) {
    this.shape = shape;
  }

  /**
   * Setter for the attibute {@link Segment} of the {@link Shape}, which is to be created.
   * 
   * @param attributeSegment org.framed.orm.model.Segment
   * */
  public void setAttributeSegment(final Segment attributeSegment) {
    this.attributeSegment = attributeSegment;
  }


  /**
   * Setter for the operation {@link Segment} of the {@link Shape}, which is to be created.
   * 
   * @param operationSegment org.framed.orm.model.Segment
   * */
  public void setOperationSegment(final Segment operationSegment) {
    this.operationSegment = operationSegment;
  }


  /**
   * Setter for the child {@link Model} of the {@link Shape}, which is to be created.
   * 
   * @param childmodel org.framed.orm.model.Model
   * */
  public void setChildmodel(final Model childmodel) {
    this.childmodel = childmodel;
  }


  /**
   * Setter for the description( a {@link NamedElement}) of the {@link Shape}, which is to be
   * created.
   * 
   * @param description org.framed.orm.model.NamedElement
   * */
  public void setDescription(final NamedElement description) {
    this.description = description;
  }


  /**
   * Setter for the {@link Model} to which the {@link Shape} should be added.
   * 
   * @param parent org.framed.orm.model.Model
   * */
  public void setContainer(final Model parent) {
    this.parent = parent;
  }
}
