package org.framed.orm.ui.tests.factory;

import static org.junit.Assert.*;

import org.framed.orm.ui.factory.ORMRoleTypeFactory;
import org.junit.Test;

public class ORMRoleTypeFactoryTest {

  @Test
  public void testGetNewObject() {
    ORMRoleTypeFactory obj = new ORMRoleTypeFactory();
    assertNotNull(obj.getNewObject());
  }

  @Test
  public void testGetObjectType() {
    ORMRoleTypeFactory obj = new ORMRoleTypeFactory();
    assertNotNull(obj.getObjectType());
  }

}
