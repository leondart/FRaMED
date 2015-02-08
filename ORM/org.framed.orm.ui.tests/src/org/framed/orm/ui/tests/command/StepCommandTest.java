package org.framed.orm.ui.tests.command;

import static org.junit.Assert.*;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.framed.orm.ui.command.StepCommand;
import org.framed.orm.ui.editor.ORMMultiPageEditor;
import org.junit.Test;

public class StepCommandTest {

  @Test
  public void testCanExecute() {
	  StepCommand obj = new StepCommand();
	  obj.setEditPart(new AbstractGraphicalEditPart() {
		
		@Override
		protected void createEditPolicies() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		protected IFigure createFigure() {
			// TODO Auto-generated method stub
			return null;
		}
	});
	  obj.setEditorPart(new ORMMultiPageEditor());
	  obj.setNewContent(new ORMMultiPageEditor());
	  assertTrue(obj.canExecute());
  }

  @Test
  public void testExecute() {
	  StepCommand obj = new StepCommand();
	  obj.setEditPart(new AbstractGraphicalEditPart() {
		
		@Override
		protected void createEditPolicies() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		protected IFigure createFigure() {
			// TODO Auto-generated method stub
			return null;
		}
	});
	  obj.setEditorPart(new ORMMultiPageEditor());
	  obj.setNewContent(new ORMMultiPageEditor());
	  obj.execute();
	  assertTrue(true);
  }

}
