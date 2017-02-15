package org.framed.orm.ui.editPart;


import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Segment;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPart.connectionkinds.ORMFulfillmentEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipConstraintEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipEditPart;
import org.framed.orm.ui.editPart.shape.ORMCompartmentEditPart;
import org.framed.orm.ui.editPart.shape.ORMSegmentEditPart;
import org.framed.orm.ui.editPart.shape.ORMShapeWithSegmentEditPart;
import org.framed.orm.ui.editPart.shape.ORMShapeWithoutSegmentEditPart;
import org.framed.orm.ui.editPart.shape.ORMSuperShapeEditPart;
import org.framed.orm.ui.editPolicy.EditPolicyHandler;



/**
 * A factory for creating new {@link EditPart}s. {@link EditPartViewer}s can be configured with an
 * EditPartFactory. Whenever an EditPart in that viewer needs to create another EditPart, it can use
 * the Viewer's factory. The factory is also used by the viewer whenever
 * {@link EditPartViewer#setContents(Object)} is called.(Comment taken from {@link EditPartFactory}.
 *
 * @author Kay Bierzynski
 * */
public class ORMEditPartFactory implements EditPartFactory {

	private EditPolicyHandler ep;

	public ORMEditPartFactory(EditPolicyHandler ep)
	{
		this.ep = ep;
	}

  /** {@inheritDoc} */
  @Override
  public EditPart createEditPart(final EditPart context, final Object model) {
    EditPart part = null;

    if (model instanceof Model) {
      part = new ORMModelEditPart<>(this.ep);
    }

    else if (model instanceof Relation) {
      Relation relation = (Relation) model;
      if (relation.getType().equals(Type.FULFILLMENT)) {
        part = new ORMFulfillmentEditPart();
      } else if (relation.getType().equals(Type.RELATIONSHIP)) {
        part = new ORMRelationshipEditPart();
      } else if (relation.getType().equals(Type.TOTAL) || relation.getType().equals(Type.CYCLIC)
          || relation.getType().equals(Type.IRREFLEXIVE) || relation.getType().equals(Type.ACYCLIC)
          || relation.getType().equals(Type.REFLEXIVE)) {
        part = new ORMRelationshipConstraintEditPart();
      } else {
        part = new ORMRelationEditPart();
      }
    }

    else if (model instanceof Shape) {
      Shape shape = (Shape) model;
      if (shape.getType().equals(Type.COMPARTMENT_TYPE)) {
        part = new ORMCompartmentEditPart();
      } else if (shape.getType().equals(Type.GROUP) || shape.getType().equals(Type.ROLE_GROUP)) {
        part = new ORMShapeWithoutSegmentEditPart();
      } else if (shape.getType().equals(Type.RELATIONSHIP_SHAPE_CHILD)) {
        part = new ORMSuperShapeEditPart();
      } else {
        part = new ORMShapeWithSegmentEditPart();
      }
    }

    else if (model instanceof Segment) {
      part = new ORMSegmentEditPart(ep);
    }

    else if (!(model instanceof ModelElement) && model instanceof NamedElement) {
      part = new ORMNamedElementEditPart();
    }

    if (part != null) {
      part.setModel(model);
    }

    return part;
  }
}
