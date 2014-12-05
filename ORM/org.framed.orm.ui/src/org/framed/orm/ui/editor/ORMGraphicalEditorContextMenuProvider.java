package org.framed.orm.ui.editor;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.actions.ActionFactory;
import org.framed.orm.ui.action.FulfillRolesAction;
import org.framed.orm.ui.action.RelationshipConstraintsAction;
import org.framed.orm.ui.action.StepInAction;
import org.framed.orm.ui.action.StepOutAction;
import org.framed.orm.ui.action.StepInNewPageAction;
import org.framed.orm.ui.action.StepInNewTabAction;

/**
 * This {@link ContextMenuProvider} provides the context menu for the {@link ORMGraphicalEditor}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMGraphicalEditorContextMenuProvider extends ContextMenuProvider {

  /**
   * The {@link ActionRegistry} of the {@link ORMGraphicalEditor}, which is needed to add actions to
   * the contextmenu.
   */
  private ActionRegistry actionRegistry;

  /**
   * The constructor of this class. The class is initialized through calling
   * {@link ContextMenuProvider#ContextMenuProvider(EditPartViewer)} and sets the
   * {@link ActionRegistry}.
   * */
  public ORMGraphicalEditorContextMenuProvider(final EditPartViewer viewer,
      final ActionRegistry actionRegistry) {
    super(viewer);
    setActionRegistry(actionRegistry);
  }

  /** {@inheritDoc} */
  @Override
  public void buildContextMenu(final IMenuManager menu) {
    GEFActionConstants.addStandardActionGroups(menu);

    IAction action;

    action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
    menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
    action = getActionRegistry().getAction(ActionFactory.REDO.getId());
    menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
    action = getActionRegistry().getAction(StepInAction.STEP_IN_ID);
    menu.appendToGroup(GEFActionConstants.GROUP_VIEW, action);
    action = getActionRegistry().getAction(StepInNewTabAction.STEP_IN_NEW_TAB_ID);
    menu.appendToGroup(GEFActionConstants.GROUP_VIEW, action);
    action = getActionRegistry().getAction(StepInNewPageAction.STEP_IN_NEW_PAGE_ID);
    menu.appendToGroup(GEFActionConstants.GROUP_VIEW, action);
    action = getActionRegistry().getAction(StepOutAction.STEP_OUT_ID);
    menu.appendToGroup(GEFActionConstants.GROUP_VIEW, action);
    action = getActionRegistry().getAction(FulfillRolesAction.FULFILL_ROLES_ID);
    menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
    action = getActionRegistry().getAction(RelationshipConstraintsAction.RLSHIP_CONSTRAINTS_ID);
    menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
  }

  /**
   * A getter for the action registry.
   * 
   * @return actionRegistry {@link ActionRegistry}
   * */
  private ActionRegistry getActionRegistry() {
    return actionRegistry;
  }

  /**
   * A setter for the action registry.
   * */
  private void setActionRegistry(final ActionRegistry actionRegistry) {
    this.actionRegistry = actionRegistry;
  }

}
