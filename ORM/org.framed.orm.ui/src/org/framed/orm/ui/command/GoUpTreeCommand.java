package org.framed.orm.ui.command;

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.editor.ORMMultiPageEditor;


/**
 * @author Kay Bierzynski
 * */
public class GoUpTreeCommand extends Command {

  public GoUpTreeCommand() {
    super.setLabel("GoUpTree");
  }

  private AbstractGraphicalEditPart editpart;

  @Override
  public void execute() {

    ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) editpart.getViewer().getEditDomain())
            .getEditorPart();
    IWorkbenchPage activePage = editorPart.getSite().getWorkbenchWindow().getActivePage();
    IEditorInput input = editorPart.getEditorInput();
    IEditorPart[] editorlist = activePage.getEditors();

    // close all old editor instances
    for (IEditorPart part : editorlist) {

      if (!(part.equals(editorPart.getParentEditor())) && part.getEditorInput().equals(input)) {
        activePage.closeEditor(part, true);
      }
    }

    try {
      // open new editor instance with old content edipart model
      ORMMultiPageEditor newPart =
          (ORMMultiPageEditor) activePage.openEditor(input, "ORMEditor.editorID", false,
              IWorkbenchPage.MATCH_NONE);
      // set Content of the two editors with same content
      newPart.setContents(editpart.getViewer().getContents().getModel());
      // set focus on the editor instance with new content
      activePage.activate(editorPart.getParentEditor());
    } catch (PartInitException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }

    // cannot use editpart.getViewer().getRootEditPart().setContents(oldParentEditPart);
    // because editpart would not have a parent and without a parent it cannot be registered in
    // viewer
    // --> solution: parent editpart and its children editparts will be initialisied agian
    final ORMMultiPageEditor ormMultiPageEditor = (ORMMultiPageEditor) editorPart.getParentEditor();
    if (editpart.getModel() instanceof Compartment) {
      final Compartment compartment = (Compartment) editpart.getModel();
      if (compartment.getParentRolemodel() != null) {
        Compartment ct = compartment.getParentRolemodel().getCt();
        Grouping group = compartment.getParentRolemodel().getParentGroup();
        // set the two editors on the same level
        if (ct != null) {
          ormMultiPageEditor.setContents(ct);
        } else {
          ormMultiPageEditor.setContents(group);
        }
      } else {
        CompartmentDiagram cd = compartment.getCd();
        // set tabs on the same level
        ormMultiPageEditor.setContents(cd);
      }
    } else {
      if (((Grouping) editpart.getModel()).getParentRolemodel() != null) {
        Grouping group = ((Grouping) editpart.getModel()).getParentRolemodel().getParentGroup();
        // editpart.getViewer().setContents(ct);
        // set tabs on the same level
        ormMultiPageEditor.setContents(group);
      } else {
        CompartmentDiagram cd = ((Grouping) editpart.getModel()).getCd();
        // editpart.getViewer().setContents(cd);
        // set tabs on the same level
        ormMultiPageEditor.setContents(cd);
      }
    }
  }

  @Override
  public boolean canExecute() {

    return editpart != null;
  }

  @Override
  public void undo() {

  }

  /**
   * This command can for now not be undone. undo throws many bad errors
   */
  @Override
  public boolean canUndo() {
    return false;
  }

  public void setEditPart(AbstractGraphicalEditPart editpart) {
    this.editpart = editpart;
  }

}
