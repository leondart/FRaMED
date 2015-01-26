package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.geometry.GeometryFactory;
import org.framed.orm.geometry.Point;
import org.framed.orm.geometry.Rectangle;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;

/**
 * The ORMRelationshipFactory creates an {@link Relation} from type relationship.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationshipFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    Relation relation = OrmFactory.eINSTANCE.createRelation();
    relation.setName("<..>");
    relation.setConnectionAnchor(createRelationshipShapeChild());
    relation.setType(Type.RELATIONSHIP);
    return relation;
  }

  @Override
  public Object getObjectType() {
    return Type.RELATIONSHIP;
  }
  
  private Shape createRelationshipShapeChild(){
    Shape shape = OrmFactory.eINSTANCE.createShape();
    shape.setContainer(null);
    shape.setType(Type.RELATIONSHIP_SHAPE_CHILD);
    shape.setName("");
    shape.setModel(null);
    shape.setFirstSegment(null);
    shape.setSecondSegment(null);
    shape.setDescription(null);
    
    Rectangle rec = GeometryFactory.eINSTANCE.createRectangle();

    Point bottomRight = GeometryFactory.eINSTANCE.createPoint();
    Point topLeft = GeometryFactory.eINSTANCE.createPoint();

    bottomRight.setX(1);
    bottomRight.setY(0);
    topLeft.setX(0);
    topLeft.setY(1);

    rec.setBottomRight(bottomRight);
    rec.setTopLeft(topLeft);
    
    shape.setBoundaries(rec);
    
    return shape;
  }
}
