package org.framed.orm.ui.editPolicy;

import java.util.List;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.swt.widgets.Display;
import org.framed.orm.model.Node;
import org.framed.orm.model.Container;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.ui.command.ORMAddCommand;
import org.framed.orm.ui.utilities.ORMTextUtilities;

/**
 * @author Lars Schuetze
 * 
 */
public abstract class ORMAbstractXYLayoutPolicy extends XYLayoutEditPolicy {

  static Dimension dynamicDimensions(Object obj) {
    Dimension d = new Dimension();
    
    d.setWidth(200);
    
    if(obj == null) {
      d.setHeight(ORMTextUtilities.charHeight(null) * 10);   //charHeight * 10: title + 3 attributes + 3 methods + 3 dots
      return d;
    }
    
    if(obj.equals(RoleGroup.class)) {
      d.setHeight(2 * ORMTextUtilities.charHeight(null) + dynamicDimensions(null).height());   //offset + title + role height
      d.setWidth(250);
    }else {
      d.setHeight(ORMTextUtilities.charHeight(null) * 10);   //charHeight * 10: title + 3 attributes + 3 methods + 3 dots
    }
    
    return d;
  }
  
  @Override
  protected Command createAddCommand(ChangeBoundsRequest request, EditPart child, Object constraint) {
    CompoundCommand result = new CompoundCommand();
    @SuppressWarnings("unchecked")
    List<AbstractGraphicalEditPart> parts = request.getEditParts();
    Rectangle r = (Rectangle) constraint;

    for (AbstractGraphicalEditPart part : parts) {
      Rectangle newConstraint = r;
      ORMAddCommand addCommand = new ORMAddCommand();
      addCommand.setParent((Container) getHost().getModel());
      addCommand.setChild((Node) part.getModel());
      if (part.getModel() instanceof Node) {
        Node n = (Node) part.getModel();
        newConstraint = new Rectangle(r.getLocation(), n.getConstraints().getSize());
      }
      addCommand.setBoundaries(newConstraint);
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
