package org.framed.orm.ui.editPolicy;

import org.eclipse.draw2d.Label;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.framed.orm.model.NamedElement;
import org.framed.orm.ui.command.ORMNamedElementRenameCommand;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipEditPart;
import org.framed.orm.ui.figure.shapes.ORMShapeFigure;

/**
 * This {@link DirectEditPolicy} shows DirectEdit feedback and creates the Command to perform a
 * "direct edit" of a {@link NamedElement} name. Direct Edit is when the User is editing a property
 * of an EditPart directly (as opposed to in the Properties View) in the Viewer using a
 * org.eclipse.jface.viewers.CellEditor. This EditPolicy is typically installed using
 * org.eclipse.gef.EditPolicy.DIRECT_EDIT_ROLE.
 * 
 * @author Kay Bierzynski
 * */
public class ORMNamedElementDirectEditPolicy extends DirectEditPolicy {

  /**
   * {@inheritDoc} In this specific EditPolicy the command, which is returned, is for renaming of a
   * {@link NamedElement}.
   * 
   * @return command org.framed.orm.ui.command.ORMNamedElementRenameCommand
   * */
  @Override
  protected Command getDirectEditCommand(final DirectEditRequest request) {

    ORMNamedElementRenameCommand command = new ORMNamedElementRenameCommand();
    command.setNamedElement((NamedElement) getHost().getModel());
    if (getHost().getParent() instanceof ORMRelationshipEditPart) {
      String newName = (String) request.getCellEditor().getValue();
      if(preProcessLabelText(newName)){
        command.setNewName(newName);
      } else{
        command.setNewName(null);
      }
    } else {
      command.setNewName((String) request.getCellEditor().getValue());
    }
    return command;
  }

  /** {@inheritDoc} */
  @Override
  protected void showCurrentEditValue(final DirectEditRequest request) {
    String value = (String) request.getCellEditor().getValue();
    if (getHostFigure() instanceof ORMShapeFigure) {
      ((ORMShapeFigure) getHostFigure()).getLabel().setText(value);
    } else {
      ((Label) getHostFigure()).setText(value);
    }
  }

  /**
   * Parse the raw cardinality strings typed in by the user.
   * 
   * @param newLabel
   * @return
   */
  private boolean preProcessLabelText(String newLabel) {
    int lower = -1, upper = -1;
    String[] split = newLabel.split("[\\s.-]+"); // split the new label by dots, - or whitespaces
    if (split.length == 1 && "*".equals(newLabel)) { // no split was possible and newlabel equals
                                                     // "*"
      lower = upper = -1; // set lower and upper = -1
    } else if (split.length == 2) { // split was ok, user may have set cardinalities
      try {
        upper = "*".equals(split[1]) ? -1 : Integer.parseInt(split[1]); // if 2nd card == '*' ->
                                                                        // upper = -1, else parse
                                                                        // the int of split[1]
        lower = Integer.parseInt(split[0]); // parse the lower bound
      } catch (NumberFormatException e) {
        return false; // user typed in a strange number or no number at all -> keep the old values
      }
    } else { // user typed in something strange -> keep the old values
      return false;
    }
    return true;
  }


}
