package org.framed.orm.ui.command;

import java.util.ArrayList;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.ui.editor.ORMGraphicalEditor.EditorType;
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

    IEditorPart[] editorlist = page.getEditors();
    ArrayList<IEditorPart> editors = new ArrayList<IEditorPart>();

    // get all editor instances with specific input
    for (IEditorPart part : editorlist) {

      if (part.getEditorInput().equals(input)) {
        editors.add(part);
      }

    }

    if (editors.size() > 1 && !isNewWindowCommand) {
      for (IEditorPart part : editors) {
        if (!part.equals(editorPart)) {
          ORMMultiPageEditor multiPart = (ORMMultiPageEditor) part;
          multiPart.setContents(editpart.getViewer().getContents().getModel());

          if (editpart.getViewer().getContents().getModel() instanceof CompartmentDiagram
              || editpart.getViewer().getContents().getModel() instanceof Grouping)
            multiPart.getEditorBeh().setEditorType(EditorType.COMPARTMENT);
          else
            multiPart.getEditorBeh().setEditorType(EditorType.ROLES);

        }
      }
    } else {

      try {
        // open new editor instance with old content edipart model
        ORMMultiPageEditor newPart =
            (ORMMultiPageEditor) page.openEditor(input, "ORMEditor.editorID", false,
                IWorkbenchPage.MATCH_NONE);

        if (isNewWindowCommand) {
          newPart.setContents(newContent);

          if (editpart.getViewer().getContents().getModel() instanceof CompartmentDiagram
              || editpart.getViewer().getContents().getModel() instanceof Grouping)
            newPart.getEditorBeh().setEditorType(EditorType.COMPARTMENT);
          else
            newPart.getEditorBeh().setEditorType(EditorType.ROLES);

        } else {
          newPart.setContents(editpart.getViewer().getContents().getModel());

          if (newContent instanceof CompartmentDiagram || newContent instanceof Grouping)
            newPart.getEditorBeh().setEditorType(EditorType.COMPARTMENT);
          else
            newPart.getEditorBeh().setEditorType(EditorType.ROLES);

          // set focus on the editor instance with new content
          page.activate(editorPart);

        }



      } catch (PartInitException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
    }

    if (!isNewWindowCommand) {
      editorPart.setContents(newContent);
      if (newContent instanceof CompartmentDiagram || newContent instanceof Grouping)
        editorPart.getEditorBeh().setEditorType(EditorType.COMPARTMENT);
      else
        editorPart.getEditorBeh().setEditorType(EditorType.ROLES);
    } else {
      editorPart.setContents(editpart.getViewer().getContents().getModel());
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

}
