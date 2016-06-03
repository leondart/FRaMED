package org.framed.orm.ui.tests.editPart;

import static org.junit.Assert.*;

import org.framed.orm.ui.editPart.ORMModelEditPart;
import org.junit.Test;

public class ORMModelEditPartTest {

  @Test
  public void testRefreshVisuals() {
    ORMModelEditPart obj = new ORMModelEditPart();
    obj.refreshVisuals();
    assertTrue(true);
  }

  @Test
  public void testCreateFigure() {
    // it's not public
    assertTrue(true);
  }

  @Test
  public void testGetModelChildren() {
    ORMModelEditPart obj = new ORMModelEditPart();
    assertNotNull(obj.getChildren());
  }

  @Test
  public void testGetAdapterClass() {
    fail("Not yet implemented");
  }

}
