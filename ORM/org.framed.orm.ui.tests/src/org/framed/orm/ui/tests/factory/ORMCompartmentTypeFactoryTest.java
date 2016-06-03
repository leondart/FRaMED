package org.framed.orm.ui.tests.factory;

import static org.junit.Assert.*;

import org.framed.orm.ui.factory.ORMCompartmentTypeFactory;
import org.junit.Test;

public class ORMCompartmentTypeFactoryTest {

  @Test
  public void testGetNewObject() {
    ORMCompartmentTypeFactory obj = new ORMCompartmentTypeFactory();
    assertNotNull(obj.getNewObject());
  }

  @Test
  public void testGetObjectType() {
    ORMCompartmentTypeFactory obj = new ORMCompartmentTypeFactory();
    assertNotNull(obj.getObjectType());
  }

}
