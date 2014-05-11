package org.framed.orm.ui.action;

import java.util.List;

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.ui.actions.SaveAction;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;
import org.framed.orm.ui.editPart.ORMCompartmentEditPart;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.editor.ORMGraphicalEditor.EditorType;

/**
 * @author Kay Bierzynski
 * */
//TODO: rename Class to STepIn
public class GoDownTreeAction extends SelectionAction {

	public static final String GO_DOWN_TREE_ID = "GoDownTree";
	public static final String  GO_DOWN_TREE_REQUEST = "GoDownTree";

	private Request request;

   /**
    * Create a new instance of the class.
    * @param part
    */
   public GoDownTreeAction(IWorkbenchPart part) {
       super(part);
       setId( GO_DOWN_TREE_ID);
       setText("Step in");
       request = new Request(GO_DOWN_TREE_REQUEST);
   }

   /**
    * Execute the commands that perform the {@link GoDownTreeAction#GO_DOWN_TREE_REQUEST GO_DOWN_TREE_REQUEST}.
    *
    * It is assumed that this method is executed directly after
    * {@link GoDownTreeAction#calculateEnabled() calculateEnabled()}
    */
   @Override
   public void run() {
	   ORMGraphicalEditor editorPart = null;
       // selected objects must be compartment or grouping editpart because the action is enabled.
       @SuppressWarnings("unchecked") List<AbstractGraphicalEditPart> editParts = getSelectedObjects();
       CompoundCommand compoundCommand = new CompoundCommand();
       for(AbstractGraphicalEditPart editPart : editParts) {
           compoundCommand.add(editPart.getCommand(request));
           if(editorPart==null) 
           {
             editorPart = (ORMGraphicalEditor) ((DefaultEditDomain)editPart.getViewer().getEditDomain()).getEditorPart();
             editorPart.setEditorType(EditorType.COMPARTMENT);          //because we go down to the compartments level
           }
       }
       SaveAction save = new SaveAction(editorPart);
       execute(compoundCommand);
       save.run();
       editorPart.getOwnViewer().getSelectionManager().deselectAll();
   }

   /**
    * {@inheritDoc}
    * <p>The action is enabled if all the selected entities on the
    * editor are {@link ORMCompartmentEditPart} or  {@link ORMGroupingEditPart} instances</p>
    */
   @Override
   protected boolean calculateEnabled() {
	   if(getSelectedObjects().isEmpty()) {
           return false;
       }
       for(Object selectedObject : getSelectedObjects()) {
    	   if(selectedObject instanceof ORMCompartmentEditPart) {
    		   ORMCompartmentEditPart test = (ORMCompartmentEditPart) selectedObject;
    		   if(test.equals(test.getViewer().getRootEditPart().getContents()))
               return false;
           }
    	   if(selectedObject instanceof ORMGroupingEditPart) {
    		   ORMGroupingEditPart test = (ORMGroupingEditPart) selectedObject;
    		   if(test.equals(test.getViewer().getRootEditPart().getContents()))
               return false;
           }
           if(!(selectedObject instanceof ORMCompartmentEditPart) && !(selectedObject instanceof ORMGroupingEditPart)) {
               return false;
           }
       }
       return true;
      }

}
