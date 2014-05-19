/**
 * 
 */
package org.framed.orm.ui.editPolicy;

import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ContainerEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.RelationContainer;
import org.framed.orm.ui.command.ORMOrphanChildCommand;

/**
 * @author Lars Schuetze
 * 
 */
public class ORMContainerEditPolicy extends ContainerEditPolicy {

  @Override
  protected Command getCreateCommand(CreateRequest request) {
    // stays empty
    return null;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.eclipse.gef.editpolicies.ContainerEditPolicy#getOrphanChildrenCommand(org.eclipse.gef.requests
   * .GroupRequest)
   */
  @Override
  protected Command getOrphanChildrenCommand(GroupRequest request) {
    CompoundCommand result = new CompoundCommand();
    List<EditPart> list = request.getEditParts();

    result.setDebugLabel("Orphan children");

    for (EditPart part : list) {
      ORMOrphanChildCommand orphan = new ORMOrphanChildCommand();
      orphan.setChild((AbstractRole) part.getModel());
      orphan.setParent((RelationContainer) this.getHost().getModel());
      orphan.setLabel("Reparenting");

      result.add(orphan);
    }
    return result.unwrap();
  }


}
