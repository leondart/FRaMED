package org.framed.orm.ui.tests.factory;

import static org.junit.Assert.*;

import org.framed.orm.ui.factory.ORMRoleGroupFactory;
import org.junit.Test;

public class ORMRoleGroupFactoryTest {

  @Test
  public void testGetNewObject() {
    ORMRoleGroupFactory obj = new ORMRoleGroupFactory();
    assertNotNull(obj.getNewObject());
  }

  @Test
  public void testGetObjectType() {
    ORMRoleGroupFactory obj = new ORMRoleGroupFactory();
    assertNotNull(obj.getObjectType());
  }

}
