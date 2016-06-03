package org.framed.orm.ui.tests.factory;

import static org.junit.Assert.*;

import org.framed.orm.ui.factory.ORMOperationFactory;
import org.junit.Test;

public class ORMOperationFactoryTest {

  @Test
  public void testGetNewObject() {
    ORMOperationFactory obj = new ORMOperationFactory();
    assertNotNull(obj.getNewObject());
  }

  @Test
  public void testGetObjectType() {
    ORMOperationFactory obj = new ORMOperationFactory();
    assertNotNull(obj.getObjectType());
  }

}
