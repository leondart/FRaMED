package org.framed.orm.ui.command.configurations;

import org.eclipse.gef.commands.Command;
import org.framed.orm.ui.editor.FeatureModelConfigurationEditor;
import org.eclipse.swt.widgets.TreeItem;


/**
 * Through this command features in the configurationEditor are selected/deselected.
 * 
 * @author Christian Deussen
 * */
public class FeatureModelConfigurationEditorChangeCommand extends Command {

  private FeatureModelConfigurationEditor editor;
  
  private boolean select;
  private TreeItem item;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public FeatureModelConfigurationEditorChangeCommand() {
    super.setLabel("Configuration Change");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void execute() {	  
	 editor.setSelection(item, select);
  }

  /**
   * {@inheritDoc} This command is undone through reverting the Selection,
   * 
   */
  @Override
  public void undo() {	  
	editor.setSelection(item, !select);
  }

  public void setEditor(FeatureModelConfigurationEditor editor)
  {
	  this.editor = editor;
  }
  
  public void setItem(TreeItem item)
  {
	  this.item = item;
  }
  
  public void setSelect(boolean select)
  {
	  this.select = select;
  }
}
