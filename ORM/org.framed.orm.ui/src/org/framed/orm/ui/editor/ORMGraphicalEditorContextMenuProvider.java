package org.framed.orm.ui.editor;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.actions.ActionFactory;
import org.framed.orm.ui.action.GoDownTreeAction;
import org.framed.orm.ui.action.GoUpTreeAction;
import org.framed.orm.ui.action.StepInNewPageAction;
import org.framed.orm.ui.action.StepOutNewPageAction;

/**
 * @author Kay Bierzynski
 * */
public class ORMGraphicalEditorContextMenuProvider extends ContextMenuProvider {
	
	private ActionRegistry actionRegistry;
	
	public ORMGraphicalEditorContextMenuProvider(EditPartViewer viewer, final ActionRegistry actionRegistry) {
        super(viewer);
        setActionRegistry(actionRegistry);
    }
 
    @Override
    public void buildContextMenu(IMenuManager menu) {
        GEFActionConstants.addStandardActionGroups(menu);
 
        IAction action;
 
        action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
        menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
        action = getActionRegistry().getAction(ActionFactory.REDO.getId());
        menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
        action = getActionRegistry().getAction(GoDownTreeAction.GO_DOWN_TREE_ID);
        menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
        action = getActionRegistry().getAction(GoUpTreeAction.GO_UP_TREE_ID);
        menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
        action = getActionRegistry().getAction(StepInNewPageAction.STEP_IN_NEW_PAGE_ID);
        menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
        action = getActionRegistry().getAction(StepOutNewPageAction.STEP_OUT_NEW_PAGE_ID);
        menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
    }
 
    private ActionRegistry getActionRegistry() {
        return actionRegistry;
    }
 
    private void setActionRegistry(final ActionRegistry actionRegistry) {
        this.actionRegistry = actionRegistry;
    }

}
