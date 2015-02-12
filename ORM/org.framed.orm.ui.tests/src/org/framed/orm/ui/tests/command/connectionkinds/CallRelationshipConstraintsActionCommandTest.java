package org.framed.orm.ui.tests.command.connectionkinds;

import static org.junit.Assert.*;

import java.util.List;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartListener;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.framed.orm.ui.command.connectionkinds.CallRelationshipConstraintsActionCommand;
import org.junit.Test;

public class CallRelationshipConstraintsActionCommandTest {

  @Test
  public void testCanExecute() {
	  CallRelationshipConstraintsActionCommand obj = new CallRelationshipConstraintsActionCommand();
	  obj.setEditPart(new EditPart() {
		
		@Override
		public Object getAdapter(Class arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean understandsRequest(Request request) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void showTargetFeedback(Request request) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void showSourceFeedback(Request request) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setSelected(int value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setParent(EditPart parent) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setModel(Object model) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setFocus(boolean hasFocus) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeNotify() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeEditPolicy(Object role) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeEditPartListener(EditPartListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void refresh() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void performRequest(Request request) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean isSelectable() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean isActive() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void installEditPolicy(Object role, EditPolicy editPolicy) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean hasFocus() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public EditPartViewer getViewer() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPart getTargetEditPart(Request request) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int getSelected() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public RootEditPart getRoot() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPart getParent() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Object getModel() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPolicy getEditPolicy(Object key) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public DragTracker getDragTracker(Request request) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Command getCommand(Request request) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List getChildren() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void eraseTargetFeedback(Request request) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void eraseSourceFeedback(Request request) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deactivate() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addNotify() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addEditPartListener(EditPartListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void activate() {
			// TODO Auto-generated method stub
			
		}
	});
	  
	  assertTrue(obj.canExecute());
  }

}
