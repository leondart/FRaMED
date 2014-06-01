/**
 * 
 */
package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.framed.orm.model.RelationLabel;
import org.framed.orm.ui.command.connectionkinds.ORMRelationLabelRenameCommand;
import org.framed.orm.ui.figure.LabelFigure;

/**
 * @author Lars Schuetze
 * 
 */
public class ORMRelationLabelEditPolicy extends DirectEditPolicy {

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.eclipse.gef.editpolicies.DirectEditPolicy#getDirectEditCommand(org.eclipse.gef.requests
   * .DirectEditRequest)
   */
  @Override
  protected Command getDirectEditCommand(DirectEditRequest request) {
    ORMRelationLabelRenameCommand command = new ORMRelationLabelRenameCommand();
    command.setRelationLabel((RelationLabel) getHost().getModel());
    command.setNewLabel((String) request.getCellEditor().getValue());

    return command;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.eclipse.gef.editpolicies.DirectEditPolicy#showCurrentEditValue(org.eclipse.gef.requests
   * .DirectEditRequest)
   */
  @Override
  protected void showCurrentEditValue(DirectEditRequest request) {
    String value = (String) request.getCellEditor().getValue();
    ((LabelFigure) getHostFigure()).setText(value);
  }

}
