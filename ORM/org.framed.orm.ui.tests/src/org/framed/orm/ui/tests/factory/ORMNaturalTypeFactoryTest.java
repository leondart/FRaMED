package org.framed.orm.ui.tests.factory;

import static org.junit.Assert.*;

import org.framed.orm.ui.factory.ORMNaturalTypeFactory;
import org.junit.Test;

public class ORMNaturalTypeFactoryTest {

  @Test
  public void testGetNewObject() {
	  ORMNaturalTypeFactory obj = new ORMNaturalTypeFactory();
	  assertNotNull(obj.getNewObject());
  }

  @Test
  public void testGetObjectType() {
	  ORMNaturalTypeFactory obj = new ORMNaturalTypeFactory();
	  assertNotNull(obj.getObjectType());
  }

}
