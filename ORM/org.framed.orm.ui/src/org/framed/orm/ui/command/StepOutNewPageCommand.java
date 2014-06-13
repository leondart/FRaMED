package org.framed.orm.ui.command;

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.editor.ORMMultiPageEditor;
import org.framed.orm.ui.editor.ORMGraphicalEditor.EditorType;

/**
 * @author Kay Bierzynski
 * */
public class StepOutNewPageCommand extends Command {

  private AbstractGraphicalEditPart editpart;

  public StepOutNewPageCommand() {
    super.setLabel("StepOutNewPage");
  }

  @Override
  public void execute() {

    ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) editpart.getViewer().getEditDomain())
            .getEditorPart();
    IWorkbenchPage page = null;

    // open new eclipse window
    try {
      page = editorPart.getSite().getWorkbenchWindow().openPage(editorPart.getSite());
    } catch (WorkbenchException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    IEditorInput input = editorPart.getEditorInput();


    try {
      // open new editor instance with old content edipart model
      ORMMultiPageEditor newPart =
          (ORMMultiPageEditor) page.openEditor(input, "ORMEditor.editorID", false,
              IWorkbenchPage.MATCH_NONE);
      newPart.getEditorBeh().getOwnViewer()
          .setContents(editpart.getViewer().getContents().getModel());
      newPart.getEditorData().getOwnViewer()
          .setContents(editpart.getViewer().getContents().getModel());

      if (editpart.getViewer().getContents().getModel() instanceof CompartmentDiagram
          || editpart.getViewer().getContents().getModel() instanceof Grouping)
        newPart.getEditorBeh().setEditorType(EditorType.COMPARTMENT);
      else
        newPart.getEditorBeh().setEditorType(EditorType.ROLES);

      // set focus on the editor instance with new content
      page.activate(editorPart.getParentEditor());
    } catch (PartInitException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }

    // cannot use editpar.getViewer().getRootEditPart().setContents(oldParentEditPart);
    // because editpart would not have a parent and without a parent it cannot be registered in
    // viewer
    // --> solution: parent editpart and its children editparts will be initialisied agian
    if (editpart.getModel() instanceof Compartment) {
      final Compartment compartment = (Compartment) editpart.getModel();
      if (compartment.getContainer() instanceof Rolemodel) {
        Compartment ct = ((Rolemodel)compartment.getContainer()).getCompartment();
        Grouping group = ((Rolemodel)compartment.getContainer()).getParentGroup();
        // set the two editors on the same level
        if (ct != null) {
          ((ORMMultiPageEditor) editorPart.getParentEditor()).getEditorBeh().getOwnViewer()
              .setContents(ct);
          ((ORMMultiPageEditor) editorPart.getParentEditor()).getEditorData().getOwnViewer()
              .setContents(ct);
        } else {
          ((ORMMultiPageEditor) editorPart.getParentEditor()).getEditorBeh().getOwnViewer()
              .setContents(group);
          ((ORMMultiPageEditor) editorPart.getParentEditor()).getEditorData().getOwnViewer()
              .setContents(group);
        }
      } else {
        CompartmentDiagram cd = (CompartmentDiagram)compartment.getContainer();

        // set the row editors on the same level
        ((ORMMultiPageEditor) editorPart.getParentEditor()).getEditorBeh().getOwnViewer()
            .setContents(cd);
        ((ORMMultiPageEditor) editorPart.getParentEditor()).getEditorData().getOwnViewer()
            .setContents(cd);
      }

      ((ORMMultiPageEditor) editorPart.getParentEditor()).getEditorBeh().setEditorType(
          EditorType.COMPARTMENT);

    } else {
      final Grouping grouping = (Grouping) editpart.getModel();
      if (grouping.getContainer() instanceof  Rolemodel) {
        Grouping group = ((Rolemodel)grouping.getRolemodel()).getParentGroup();

        // set the row editors on the same level
        ((ORMMultiPageEditor) editorPart.getParentEditor()).getEditorBeh().getOwnViewer()
            .setContents(group);
        ((ORMMultiPageEditor) editorPart.getParentEditor()).getEditorData().getOwnViewer()
            .setContents(group);
      } else {
        CompartmentDiagram cd = (CompartmentDiagram) grouping.getContainer();

        // set the row editors on the same level
        ((ORMMultiPageEditor) editorPart.getParentEditor()).getEditorBeh().getOwnViewer()
            .setContents(cd);
        ((ORMMultiPageEditor) editorPart.getParentEditor()).getEditorData().getOwnViewer()
            .setContents(cd);
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
   * This command can for now not be undone.
   */
  @Override
  public boolean canUndo() {
    return false;
  }

  public void setEditPart(AbstractGraphicalEditPart editpart) {
    this.editpart = editpart;

  }

}
