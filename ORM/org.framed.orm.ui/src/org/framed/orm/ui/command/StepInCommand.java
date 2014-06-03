package org.framed.orm.ui.command;



import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.ui.editor.ORMMultiPageEditor;
import org.framed.orm.ui.editor.ORMGraphicalEditor.EditorType;

/**
 * @author Kay Bierzynski
 * */
public class StepInCommand extends StepCommand {

  

  public StepInCommand() {
    super.setLabel("StepIn");
  }

  @Override
  public void execute() {
    super.execute();
//    System.out.println("Execute stepin");
    // set the two editors on same level
    final ORMMultiPageEditor ormMultiPageEditor = (ORMMultiPageEditor) editorPart.getParentEditor();
    ormMultiPageEditor.setContents(editpart.getModel());
    
    if(editpart.getModel() instanceof CompartmentDiagram || editpart.getModel() instanceof Grouping)
      ormMultiPageEditor.getEditorBeh().setEditorType(EditorType.COMPARTMENT);
    else
      ormMultiPageEditor.getEditorBeh().setEditorType(EditorType.ROLES);
    
  }


}
