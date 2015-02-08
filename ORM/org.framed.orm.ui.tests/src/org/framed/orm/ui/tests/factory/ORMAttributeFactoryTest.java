package org.framed.orm.ui.tests.factory;

import static org.junit.Assert.*;

import org.framed.orm.ui.factory.ORMAttributeFactory;
import org.junit.Test;

public class ORMAttributeFactoryTest {

  @Test
  public void testGetNewObject() {
	  ORMAttributeFactory obj = new ORMAttributeFactory();
	  assertNotNull(obj.getNewObject());
  }

  @Test
  public void testGetObjectType() {
	  ORMAttributeFactory obj = new ORMAttributeFactory();
	  assertNotNull(obj.getObjectType());
  }

}
