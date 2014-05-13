/**
 * 
 */
package org.framed.orm.ui.editPolicy;

import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Node;
import org.framed.orm.model.RelationContainer;
import org.framed.orm.ui.command.ORMAddCommand;

/**
 * @author Lars Schuetze
 * 
 */
public abstract class ORMAbstractXYLayoutPolicy extends XYLayoutEditPolicy {

  @Override
  protected Command createAddCommand(ChangeBoundsRequest request, EditPart child, Object constraint) {
    CompoundCommand result = new CompoundCommand();
    @SuppressWarnings("unchecked")
    List<AbstractGraphicalEditPart> parts = request.getEditParts();
    Rectangle r = (Rectangle) constraint;

    for (AbstractGraphicalEditPart part : parts) {
      Rectangle newConstraint = r;
      ORMAddCommand addCommand = new ORMAddCommand();
      addCommand.setParent((RelationContainer) getHost().getModel());
      addCommand.setChild((AbstractRole) part.getModel());
      if (part.getModel() instanceof Node) {
        Node n = (Node) part.getModel();
        newConstraint = new Rectangle(r.getLocation(), n.getConstraints().getSize());
      }
      addCommand.setConstraint(newConstraint);
      addCommand.setLabel("Adding");
      addCommand.setDebugLabel("Adding");

      result.add(addCommand);
    }
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.gef.editpolicies.LayoutEditPolicy#getCreateCommand(org.eclipse.gef.requests.
   * CreateRequest)
   */
  @Override
  protected Command getCreateCommand(CreateRequest request) {
    // TODO Auto-generated method stub
    return null;
  }



  @Override
  protected Command getCloneCommand(ChangeBoundsRequest request) {
    // TODO Auto-generated method stub
    return super.getCloneCommand(request);
  }
}
