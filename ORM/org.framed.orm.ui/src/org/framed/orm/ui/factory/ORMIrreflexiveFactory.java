package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;

/**
 * The ORMIrreflexiveFactory creates an {@link Relation} from type irreflexive.
 * 
 * @author Kay Bierzynski
 * */
public class ORMIrreflexiveFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    Relation relation = OrmFactory.eINSTANCE.createRelation();
    relation.setName("irreflexive");
    relation.setType(Type.IRREFLEXIVE);
    return relation;
  }

  @Override
  public Object getObjectType() {
    return Type.IRREFLEXIVE;
  }
}
