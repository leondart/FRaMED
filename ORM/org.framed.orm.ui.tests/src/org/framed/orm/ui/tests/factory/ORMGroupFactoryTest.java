package org.framed.orm.ui.tests.factory;

import static org.junit.Assert.*;

import org.framed.orm.ui.factory.ORMGroupFactory;
import org.junit.Test;

public class ORMGroupFactoryTest {

  @Test
  public void testGetNewObject() {
    ORMGroupFactory obj = new ORMGroupFactory();
    assertNotNull(obj.getNewObject());
  }

  @Test
  public void testGetObjectType() {
    ORMGroupFactory obj = new ORMGroupFactory();
    assertNotNull(obj.getObjectType());
  }

}
