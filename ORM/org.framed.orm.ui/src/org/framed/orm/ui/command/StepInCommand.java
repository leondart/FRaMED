package org.framed.orm.ui.command;



import org.framed.orm.ui.editor.ORMMultiPageEditor;

/**
 * @author Kay Bierzynski
 * */
public class StepInCommand extends StepCommand {

  

  public StepInCommand() {
    super.setLabel("StepIn");
  }

  @Override
  public void execute() {

    
    // set the two editors on same level
    final ORMMultiPageEditor ormMultiPageEditor = (ORMMultiPageEditor) editorPart.getParentEditor();
    ormMultiPageEditor.setContents(editpart.getModel());
  }


}
