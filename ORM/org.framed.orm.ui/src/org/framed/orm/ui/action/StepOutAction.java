package org.framed.orm.ui.action;

import java.util.List;

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.ui.actions.SaveAction;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.editor.ORMGraphicalEditor.EditorType;

/**
 * @author Kay BIerzynski
 * */
//TODO: rename this class to StepOut
public class StepOutAction extends SelectionAction {


	public static final String STEP_OUT_ID = "StepOut";
	public static final String  STEP_OUT_REQUEST = "StepOut";
	private Request request;

	/**
	 * Create a new instance of the class.
	 * @param part
	 */
	public StepOutAction(IWorkbenchPart part) {
		super(part);
		setId( STEP_OUT_ID);
		setText("Step out");
		request = new Request(STEP_OUT_REQUEST);
	}

	/**
	 * Execute the commands that perform the {@link StepOutAction#STEP_OUT_REQUEST GO_UP_TREE_REQUEST}.
	 *
	 * It is assumed that this method is executed directly after
	 * {@link StepOutAction#calculateEnabled() calculateEnabled()}
	 */
	@Override
	public void run() {
		 ORMGraphicalEditor editorPart = null;
		// selected objects must be compartment or grouping editpart because the action is enabled.
		@SuppressWarnings("unchecked") List<AbstractGraphicalEditPart> editParts = getSelectedObjects();
		CompoundCommand compoundCommand = new CompoundCommand();
		for(AbstractGraphicalEditPart editPart : editParts) {
			compoundCommand.add(editPart.getCommand(request));
			if(editorPart==null){
			  editorPart = (ORMGraphicalEditor) ((DefaultEditDomain)editPart.getViewer().getEditDomain()).getEditorPart();
			  editorPart.setEditorType(EditorType.ROLES);        //because we go up to the roles level
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

     for(Object selectedObject : getSelectedObjects()) {
  
  	   	if(selectedObject instanceof ORMCompartmentEditPart) {
  	   		if(((ORMCompartmentEditPart) selectedObject).equals(((ORMCompartmentEditPart) selectedObject).getViewer().getRootEditPart().getContents()))
  	   			return true;
  	   	}
  	   	if(selectedObject instanceof ORMGroupingEditPart) {
  	   		if(((ORMGroupingEditPart) selectedObject).equals(((ORMGroupingEditPart) selectedObject).getViewer().getRootEditPart().getContents()))
  	   			return true;
  	   		}
     	}
     return false;
    }

}
