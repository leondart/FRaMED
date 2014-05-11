package org.framed.orm.ui.command;


import org.framed.orm.model.Compartment;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.ui.editor.ORMMultiPageEditor;
import org.framed.orm.ui.editor.ORMGraphicalEditor.EditorType;


/**
 * @author Kay Bierzynski
 * */
public class StepOutCommand extends StepCommand {

  public StepOutCommand() {
    super.setLabel("StepOut");
  }



  @Override
  public void execute() {

    super.execute();


    // (related to older version) cannot use editpart.getViewer().getRootEditPart().setContents(oldParentEditPart);
    // because editpart would not have a parent and without a parent it cannot be registered in
    // viewer
    // --> solution: parent editpart and its children editparts will be initialized again
    final ORMMultiPageEditor ormMultiPageEditor = (ORMMultiPageEditor) editorPart.getParentEditor();
    
    if (editpart.getModel() instanceof Compartment) {
      final Compartment compartment = (Compartment) editpart.getModel();
      
      editorPart.setEditorType(EditorType.COMPARTMENT);
      
      if (compartment.getParentRolemodel() != null) {
        Compartment ct = compartment.getParentRolemodel().getCompartment();
        Grouping group = compartment.getParentRolemodel().getParentGroup();
        // set the two editors on the same level
        if (ct != null) {
          ormMultiPageEditor.setContents(ct);
        } else {
          ormMultiPageEditor.setContents(group);
        }
      } else {
        CompartmentDiagram cd = compartment.getCompartmentDiagram();
        // set tabs on the same level
        ormMultiPageEditor.setContents(cd);
      }
    } else {
      if (((Grouping) editpart.getModel()).getParentRolemodel() != null) {
        Grouping group = ((Grouping) editpart.getModel()).getParentRolemodel().getParentGroup();
        // set tabs on the same level
        ormMultiPageEditor.setContents(group);
        editorPart.setEditorType(EditorType.ROLES);
      } else {
        CompartmentDiagram cd = ((Grouping) editpart.getModel()).getCompartmentDiagram();
        // set tabs on the same level
        ormMultiPageEditor.setContents(cd);
        editorPart.setEditorType(EditorType.COMPARTMENT);
      }
    }
  }

 



}
