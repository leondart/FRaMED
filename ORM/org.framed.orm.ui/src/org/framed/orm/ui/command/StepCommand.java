package org.framed.orm.ui.command;

import java.util.ArrayList;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.editor.ORMMultiPageEditor;
import org.framed.orm.ui.editor.ORMGraphicalEditor.EditorType;

public class StepCommand extends Command {

  protected AbstractGraphicalEditPart editpart;
  protected ORMGraphicalEditor editorPart;

  @Override
  public boolean canExecute() {

    return editpart != null && editorPart != null;
  }

  @Override
  public void execute() {

    IWorkbenchPage activePage = editorPart.getSite().getWorkbenchWindow().getActivePage();
    
    IEditorInput input = editorPart.getEditorInput();
    
    IEditorPart[] editorlist = activePage.getEditors();
    ArrayList<IEditorPart> editors = new ArrayList<IEditorPart>();

    // get all editor instances with specific input
    for (IEditorPart part : editorlist) {

      if (part.getEditorInput().equals(input)) {
        editors.add(part);
      }

    }

//    System.out.println("Editor.size: "+editors.size());
    
    if (editors.size() > 1) {
      for (IEditorPart part : editors) {
        if (!part.equals(editorPart.getParentEditor())) {
          ORMMultiPageEditor multiPart = (ORMMultiPageEditor) part;
          multiPart.setContents(editpart.getViewer().getContents().getModel());
          if(editpart.getViewer().getContents().getModel() instanceof CompartmentDiagram || editpart.getViewer().getContents().getModel() instanceof Grouping)
            multiPart.getEditorBeh().setEditorType(EditorType.COMPARTMENT);
          else
            multiPart.getEditorBeh().setEditorType(EditorType.ROLES);
        }
      }
    } else {
      try {
        // open new editor instance with old content edipart model
        ORMMultiPageEditor newPart =
            (ORMMultiPageEditor) activePage.openEditor(input, "ORMEditor.editorID", false,
                IWorkbenchPage.MATCH_NONE);

        if(editpart.getViewer().getContents().getModel() instanceof CompartmentDiagram || editpart.getViewer().getContents().getModel() instanceof Grouping)
          newPart.getEditorBeh().setEditorType(EditorType.COMPARTMENT);
        else
          newPart.getEditorBeh().setEditorType(EditorType.ROLES);    
//        editorPart.setEditorType(EditorType.ROLES);

        newPart.setContents(editpart.getViewer().getContents().getModel());
        // set focus on the editor instance with new content
        activePage.activate(editorPart.getParentEditor());
      } catch (PartInitException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
    }
  }

  @Override
  public void undo() {

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
  
  public void setEditorPart(ORMGraphicalEditor editorPart) {
    this.editorPart = editorPart;
  }

}
