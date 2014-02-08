package orm.editor;

import org.eclipse.gef.internal.GEFMessages;
import org.eclipse.gef.ui.actions.ActionBarContributor;
import org.eclipse.gef.ui.actions.DeleteRetargetAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.RedoRetargetAction;
import org.eclipse.gef.ui.actions.UndoRetargetAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.RetargetAction;
import org.eclipse.ui.part.MultiPageEditorPart;

/**
 * @author KAy Bierzynski
 * */
public class ORMGraphicalEditorActionBarContributor extends
		ActionBarContributor {

	 @Override
	  protected void buildActions() {
	    addRetargetAction(new UndoRetargetAction());
	    addRetargetAction(new RedoRetargetAction());
	    addRetargetAction(new DeleteRetargetAction());
	    addRetargetAction(new RetargetAction(GEFActionConstants.TOGGLE_GRID_VISIBILITY, GEFMessages.ToggleGrid_Label, IAction.AS_CHECK_BOX));  
	    addRetargetAction(new RetargetAction(GEFActionConstants.TOGGLE_SNAP_TO_GEOMETRY, GEFMessages.ToggleSnapToGeometry_Label, IAction.AS_CHECK_BOX));
	    
	 }
	 
	 // is called from the ORMMultiPageEditor pageChange when user switch between editors
	 @Override
	public void setActiveEditor(IEditorPart editor) {
		super.setActiveEditor(editor);
	 // creats actionbar for active editor with actionregistry/graphicalViewer/CommandStack from the active editor
		getActionBars().updateActionBars();
	}
	  @Override
	  public void contributeToToolBar(IToolBarManager toolBarManager) {
	    super.contributeToToolBar(toolBarManager);
	    toolBarManager.add(getAction(ActionFactory.UNDO.getId()));
	    toolBarManager.add(getAction(ActionFactory.REDO.getId()));
	    toolBarManager.add(getAction(ActionFactory.DELETE.getId()));
	    toolBarManager.add(getAction(GEFActionConstants.TOGGLE_GRID_VISIBILITY));
	    toolBarManager.add(getAction(GEFActionConstants.TOGGLE_SNAP_TO_GEOMETRY));
	  }

	@Override
	protected void declareGlobalActionKeys() {
		// TODO Auto-generated method stub

	}
	
	
}
