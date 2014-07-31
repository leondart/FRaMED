package org.framed.orm.ui.editor;

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

/**
 * This is the {@link ActionBarContributor} for the {@link ORMMultiPageEditor}/
 * {@link ORMGraphicalEditor}, which adds {@link UndoRetargetAction}, {@link RedoRetargetAction},
 * {@link DeleteRetargetAction}, gridaction and snapaction to the workbench actionbar.
 * 
 * @author Kay Bierzynski
 * @author Lars Schuetze
 * */
public class ORMGraphicalEditorActionBarContributor extends ActionBarContributor {

  /** String vraible, which hold the text for the grid action. */
  private static final String TOGGLE_GRID_LABEL = "Show Grid";
  /** String vraible, which hold the text for the snap action. */
  private static final String TOGGLE_SNAP_TO_GERMETRY_LABEL = "Snap to Geometry";

  /** {@inheritDoc} */
  @Override
  protected void buildActions() {
    addRetargetAction(new UndoRetargetAction());
    addRetargetAction(new RedoRetargetAction());
    addRetargetAction(new DeleteRetargetAction());

    // add grid icon to grid action
    final RetargetAction gridAction =
        new RetargetAction(GEFActionConstants.TOGGLE_GRID_VISIBILITY, "", IAction.AS_CHECK_BOX);
    gridAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/grid.png"));
    gridAction.setToolTipText(TOGGLE_GRID_LABEL);
    addRetargetAction(gridAction);

    final RetargetAction snapAction =
        new RetargetAction(GEFActionConstants.TOGGLE_SNAP_TO_GEOMETRY, "", IAction.AS_CHECK_BOX);
    snapAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/grid-snap.png"));
    snapAction.setToolTipText(TOGGLE_SNAP_TO_GERMETRY_LABEL);

    addRetargetAction(snapAction);

  }

  // is called from the ORMMultiPageEditor pageChange when user switch between editors
  /**
   * Sets the active editor for the contributor and updates the workbench actionbar.
   * 
   * This method is called from the {@link ORMMultiPageEditor#pageChange(int)} when user switch
   * between behaviour editor and data editor.
   * */
  @Override
  public void setActiveEditor(final IEditorPart editor) {
    super.setActiveEditor(editor);
    // creats actionbar for active editor with actionregistry/graphicalViewer/CommandStack from the
    // active editor
    getActionBars().updateActionBars();
  }

  /**
   * Contributes to the given tool bar(workbench actionbar) the actions.
   * */
  @Override
  public void contributeToToolBar(final IToolBarManager toolBarManager) {
    super.contributeToToolBar(toolBarManager);
    toolBarManager.add(getAction(ActionFactory.UNDO.getId()));
    toolBarManager.add(getAction(ActionFactory.REDO.getId()));
    toolBarManager.add(getAction(ActionFactory.DELETE.getId()));
    toolBarManager.add(getAction(GEFActionConstants.TOGGLE_GRID_VISIBILITY));
    toolBarManager.add(getAction(GEFActionConstants.TOGGLE_SNAP_TO_GEOMETRY));
  }

  /** {@inheritDoc} Does nothin at the moment. */
  @Override
  protected void declareGlobalActionKeys() {
    // TODO Auto-generated method stub
  }


}
