package org.framed.orm.ui.editPolicy;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Segment;
import org.framed.orm.model.Shape;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.shapes.ORMShapeChangeBoundariesCommand;
import org.framed.orm.ui.command.shapes.ORMShapeCreateCommand;
import org.framed.orm.ui.figure.ORMModelFigure;

/**
 * This {@link XYLayoutEditPolicy} handels request for creation and boundarie changes of all kinds
 * {@link Shapes}s in a {@link Model} and returns and creates the nessecary commands for the
 * creation and boundarie change.
 * 
 * @author Kay Bierzynski
 * */
public class ORMModelXYLayoutPolicy extends ORMAbstractXYLayoutPolicy {


  /**
   * {@inheritDoc} Constraints means here boundaries.
   * 
   * @return {@link ORMShapeChangeBoundariesCommand}
   * */
  @Override
  protected Command createChangeConstraintCommand(final EditPart child, final Object newBoundarie) {

    final ORMShapeChangeBoundariesCommand command = new ORMShapeChangeBoundariesCommand();
    command.setShape((Shape) child.getModel());
    command.setNewBoundaries(createModelReactangle((Rectangle) newBoundarie));

    return command;
  }

  /**
   * {@inheritDoc} Specifically the create commands for all kinds of {@link Shape}s.
   * */
  @Override
  protected Command getCreateCommand(final CreateRequest request) {
    Command retVal = null;
    Shape parentShape = null;

    if (getHost().getParent().getModel() instanceof Shape) {
      parentShape = (Shape) getHost().getParent().getModel();
    }

    // when the parent of the model is a compartmenttype or a rolegroup only roletype and rolegroup
    // instances can be added
    if (parentShape != null) {
      if (parentShape.getType().equals(Type.COMPARTMENT_TYPE)
          || parentShape.getType().equals(Type.ROLE_GROUP)) {
        if (request.getNewObjectType().equals(Type.ROLE_GROUP)) {
          retVal = setUpCreateCommand(request, null, null, createDescription(), createChildModel());
        }

        if (request.getNewObjectType().equals(Type.ROLE_TYPE)) {
          retVal =
              setUpCreateCommand(request, createSegment(), createSegment(), createDescription(),
                  null);
        }
      }
    }

    // when the parent of the model is a group or the model is the root model than only naturaltype,
    // compartmenttype and group
    // instances can be added to the model
    if (parentShape == null || parentShape.getType().equals(Type.GROUP)) {
      if (request.getNewObjectType().equals(Type.NATURAL_TYPE)) {
        retVal = setUpCreateCommand(request, createSegment(), createSegment(), null, null);
      }

      if (request.getNewObjectType().equals(Type.COMPARTMENT_TYPE)) {
        retVal =
            setUpCreateCommand(request, createSegment(), createSegment(), null, createChildModel());
      }

      if (request.getNewObjectType().equals(Type.GROUP)) {
        retVal = setUpCreateCommand(request, null, null, null, createChildModel());
      }
    }
    return retVal;
  }

  // TODO: an den neusten Stand anpassen
  /**
   * {@inheritDoc} In this case the backround color changes to blue when the user is about to
   * execute a possible command.
   */
  @Override
  protected void showLayoutTargetFeedback(final Request request) {
    if (request.getType() == RequestConstants.REQ_CREATE) {
      if (((CreateRequest) request).getNewObjectType().equals(Type.ROLE_TYPE)
          || ((CreateRequest) request).getNewObjectType().equals(Type.COMPARTMENT_TYPE)
          || ((CreateRequest) request).getNewObjectType().equals(Type.NATURAL_TYPE)
          || ((CreateRequest) request).getNewObjectType().equals(Type.ROLE_GROUP)) {

        final ORMModelFigure figure = (ORMModelFigure) getHostFigure();
        figure.setBackgroundColor(ColorConstants.lightBlue);
        figure.setOpaque(true);
      }
    }
  }

  /** {@inheritDoc} */
  @Override
  protected void eraseLayoutTargetFeedback(final Request request) {
    final ORMModelFigure figure = (ORMModelFigure) getHostFigure();
    figure.setBackgroundColor(ColorConstants.white);
    figure.setOpaque(false);
  }



  private NamedElement createDescription() {
    ModelElement element = OrmFactory.eINSTANCE.createModelElement();
    element.setContainer(null);
    element.setName("");
    element.setType(null);

    return element;
  }

  private Segment createSegment() {
    return OrmFactory.eINSTANCE.createSegment();
  }

  private Model createChildModel() {
    return OrmFactory.eINSTANCE.createModel();
  }

  private ORMShapeCreateCommand setUpCreateCommand(final CreateRequest request,
      Segment attributeSegment, Segment operationSegment, NamedElement description, Model childmodel) {

    ORMShapeCreateCommand command = new ORMShapeCreateCommand();
    Rectangle boundaries = (Rectangle) getConstraintFor(request);

    command.setShape((Shape) request.getNewObject());
    command.setBoundaries(createModelReactangle(new Rectangle(boundaries.getLocation(),
        ORMAbstractXYLayoutPolicy.dynamicDimensions(request.getNewObjectType()))));
    command.setContainer((Model) getHost().getModel());

    command.setAttributeSegment(attributeSegment);
    command.setOperationSegment(operationSegment);
    command.setChildmodel(childmodel);
    command.setDescription(description);

    return command;
  }
}
