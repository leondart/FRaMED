/**
 * 
 */
package org.framed.orm.ui.command.connectionkinds;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.RelationLabel;

/**
 * @author Lars Schuetze
 * 
 */
public class ORMRelationLabelRenameCommand extends Command {

  private RelationLabel relationLabel;
  private String newLabel;
  private String oldLabel;

  public ORMRelationLabelRenameCommand() {
    super.setLabel("ORMRelationLabelRenameCommand");
  }

  @Override
  public boolean canExecute() {
    return relationLabel != null && newLabel != null;
  }

  @Override
  public void execute() {
    redo();
  }

  @Override
  public void redo() {
    oldLabel = relationLabel.getLabel();
    relationLabel.setLabel(newLabel);
  }

  @Override
  public void undo() {
    relationLabel.setLabel(oldLabel);
  }

  public void setNewLabel(String label) {
    this.newLabel = label;
  }

  public void setRelationLabel(RelationLabel relationLabel) {
    this.relationLabel = relationLabel;
  }
}
