package org.framed.orm.ui.command;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.ui.action.StepInAction;
import org.framed.orm.ui.action.StepInNewPageAction;
import org.framed.orm.ui.action.StepInNewTabAction;
import org.framed.orm.ui.action.StepOutAction;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;
import org.framed.orm.ui.editor.ORMMultiPageEditor;

/**
 * This command realize the step in/out, which is initialized by the {@link StepInAction}, the
 * {@link StepInNewPageAction}, the {@link StepInNewTabAction} or the {@link StepOutAction}, through
 * changing the content of the viewer of the {@link ORMMultiPageEditor} instance, which owns the
 * {@link Compartment} or the {@link Grouping} the user wants to step in/out.
 * 
 * @author Kay Bierzynski
 * 
 */
public class StepCommand extends Command {

  /**
   * The {@link ORMCompartmentEditPart} or the {@link ORMGroupingEditPart} of the
   * {@link Compartment} or the {@link Grouping} the user wants to step in/out.
   */
  private AbstractGraphicalEditPart editpart;
  /**
   * The {@link ORMMultiPageEditor} instance, which owns the {@link Compartment} or the
   * {@link Grouping} you want to step in/out and whose viewer content this command changes.
   */
  private ORMMultiPageEditor editorPart;
  /**
   * This object variable represents a {@link Compartment} or a {@link Grouping} model element, when
   * you want to step in, and represents a {@link Compartment}, the {@link CompartmentDiagram} or a
   * {@link Grouping} model element, when you want to step out. All in all holds this variable the
   * new content for the viewer of the active {@link ORMMultiPageEditor} instance.
   */
  private Object newContent;
  /**
   * A flag that indicates that the user wants to step in a new window. This variable is true when
   * this command is called/requested by {@link StepInNewPageAction}.
   */
  private boolean isNewWindowCommand;
  /**
   * A flag that indicates that the user wants to step in a new tab. This variable is true when this
   * command is called/requested by {@link StepInNewTabAction}.
   */
  private boolean isNewTabCommand;

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameters editpart, editorPart and newContent is set.
   */
  @Override
  public boolean canExecute() {

    return editpart != null && editorPart != null && newContent != null;
  }

  /**
   * {@inheritDoc} The first thing that is done in this method is that a new editor page is opened
   * when this command is called/requested by {@link StepInNewPageAction} or that the method gets
   * the active editor page in any other case. After that a new {@link ORMMultiPageEditor} instance
   * is created, the initial viewer content of the new {@link ORMMultiPageEditor} instance is
   * replaced with the newContent, a custom title based on the newContent which is shown in the tab
   * is created for the new editor instance and the editortype of the childeditors is updated to
   * adjust what is accessible in the editor pallet. All this is done in the case that this command
   * was called/requested by the {@link StepInNewPageAction} or the {@link StepInNewTabAction} the
   * initial viewer content. In any other case all thing which where listed for a new
   * {@link ORMMultiPageEditor} instance are done for the active {@link ORMMultiPageEditor}
   * instance.
   * 
   */
  @Override
  public void execute() {

    // the page, which in the user wants to open a new tab or step into as a complete new page
    IWorkbenchPage page = null;

    if (isNewWindowCommand) {

      // try to open a new editor page
      try {
        page = editorPart.getSite().getWorkbenchWindow().openPage(editorPart.getSite());
      } catch (WorkbenchException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

    } else {
      // get the active editor page
      page = editorPart.getSite().getWorkbenchWindow().getActivePage();
    }

    if (isNewWindowCommand || isNewTabCommand) {
      try {
        // try to open a new ORMMultiPageEditor instance
        ORMMultiPageEditor newPart =
            (ORMMultiPageEditor) page.openEditor(editorPart.getEditorInput(), "ORMEditor.editorID",
                false, IWorkbenchPage.MATCH_NONE);

        // try to change the viewer content of the new instance
        newPart.setContents(newContent);
        // try to create a new title for the new instance based on the newContent
        newPart.createCustomTitleForEditor(newContent);
        // try to update the editor type of the childeditors of the new instance
        newPart.getBehaviorEditor().updateEditorType();

      } catch (PartInitException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
    } else {
      // change the content of the viewer of the active ORMMultiPageEditor instance
      editorPart.setContents(newContent);
      // create a new title for the active instance based on the newContent
      editorPart.createCustomTitleForEditor(newContent);
      // update the editor type of the childeditors of the active instance
      editorPart.getBehaviorEditor().updateEditorType();
    }
  }

  /**
   * Method, which determines if the the command can be undone or not.
   * 
   * @return false this command can never be undone, because the change of the viewer should always
   *         happen through step actions also through context menu or shortcut
   */
  @Override
  public boolean canUndo() {
    return false;
  }

  /**
   * Setter for the editpart, whose model is the new viewer content.
   * 
   * @param editpart org.eclipse.gef.editparts.AbstractGraphicalEditPart
   * */
  public void setEditPart(final AbstractGraphicalEditPart editpart) {
    this.editpart = editpart;
  }

  /**
   * Setter for the editorpart (active ORMMultiPageEditor instance).
   * 
   * @param editorPart org.framed.orm.ui.editor.ORMMultiPageEditor
   */
  public void setEditorPart(final ORMMultiPageEditor editorPart) {
    this.editorPart = editorPart;
  }

  /**
   * Setter for the new viewer content.
   * 
   * @param content java.lang.Object
   */
  public void setNewContent(final Object content) {
    this.newContent = content;
  }

  /**
   * Setter for the flage, which indicates if this command is called/requested by
   * {@link StepInNewPageAction} or not.
   * 
   * @param isNewWindowCommand boolean
   */
  public void setIsNewWindowCommand(final boolean isNewWindowCommand) {
    this.isNewWindowCommand = isNewWindowCommand;
  }

  /**
   * Setter for the flage, which indicates if this command is called/requested by
   * {@link StepInNewTabAction} or not.
   * 
   * @param isNewTabCommand boolean
   */
  public void setIsNewTabCommand(final boolean isNewTabCommand) {
    this.isNewTabCommand = isNewTabCommand;
  }

}
