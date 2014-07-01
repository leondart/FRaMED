package org.framed.orm.ui.command;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.internal.WorkbenchPartReference;
import org.eclipse.ui.part.WorkbenchPart;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.editor.ORMMultiPageEditor;

/**
 * 
 * @author Kay Bierzynski
 * 
 */
public class StepCommand extends Command {

  private AbstractGraphicalEditPart editpart;
  private ORMMultiPageEditor editorPart;
  private Object newContent;
  private boolean isNewWindowCommand;
  private boolean isNewTabCommand;

  @Override
  public boolean canExecute() {

    return editpart != null && editorPart != null && newContent != null;
  }

  @Override
  public void execute() {

    IWorkbenchPage page = null;

    if (isNewWindowCommand) {

      try {
        page = editorPart.getSite().getWorkbenchWindow().openPage(editorPart.getSite());
      } catch (WorkbenchException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

    } else {
      page = editorPart.getSite().getWorkbenchWindow().getActivePage();
    }

    IEditorInput input = editorPart.getEditorInput();


    if (isNewWindowCommand || isNewTabCommand) {
      try {
        // open new editor instance with old content edipart model
        ORMMultiPageEditor newPart =
            (ORMMultiPageEditor) page.openEditor(input, "ORMEditor.editorID", false,
                IWorkbenchPage.MATCH_NONE);


        newPart.setContents(newContent);
        newPart.createCustomTitleForEditor(newContent);


        newPart.getEditorBeh().updateEditorType();

      } catch (PartInitException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
    } else {
      editorPart.setContents(newContent);
      editorPart.createCustomTitleForEditor(newContent);
      editorPart.setFocus();
      editorPart.getBehaviorEditor().setFocus();
      editorPart.setActiveEditor(editorPart);
//      editorPart.getSite().getWorkbenchWindow().
//      editorPart.getBehaviorEditor().getOwnViewer().getContents().deactivate();
//      editorPart.getBehaviorEditor().getOwnViewer().getContents().activate();
//      editorPart.getBehaviorEditor().getOwnViewer().getContents().setFocus(true);
//      editorPart.getBehaviorEditor().getOwnViewer().getContents().setSelected(0);
          //      System.out.println(editorPart.getSelectedPage());
//      editorPart.getSite().getWorkbenchWindow().setActivePage((IWorkbenchPage) ((ORMGraphicalEditor)editorPart.getSelectedPage()).getSite().getPage());
//      System.out.println("Focus set");
//      editpart.setSelected(1);
//      editpart.setFocus(true);
//      editpart.setSelected(0);
      editorPart.getEditorBeh().updateEditorType();
    }
  }

  /**
   * This command can for now not be undone.
   */
  @Override
  public boolean canUndo() {
    return false;
  }

  public void setEditPart(AbstractGraphicalEditPart editpart) {
//    System.out.println("EditPart: " + editpart);
    this.editpart = editpart;
  }

  public void setEditorPart(ORMMultiPageEditor editorPart) {
    this.editorPart = editorPart;
  }

  public void setNewContent(Object content) {
    this.newContent = content;
  }

  public void setIsNewWindowCommand(boolean isNewWindowCommand) {
    this.isNewWindowCommand = isNewWindowCommand;
  }

  public void setIsNewTabCommand(boolean isNewTabCommand){
    this.isNewTabCommand = isNewTabCommand;
  }
  
}
