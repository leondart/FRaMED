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
import org.framed.orm.model.Model;
import org.framed.orm.model.Shape;
import org.framed.orm.ui.command.ORMOrphanChildCommand;

/**
 * @author Lars Schuetze
 *
 */
public class ORMContainerEditPolicy extends ContainerEditPolicy {

	private EditPolicyHandler ep;

	public ORMContainerEditPolicy(EditPolicyHandler editPolicyHandler)
	{
		this.ep = editPolicyHandler;
	}

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
      orphan.setChild((Shape) part.getModel());
      orphan.setParent((Model) this.getHost().getModel());
      orphan.setLabel("Reparenting");

      //wrap command to automatically check editPolicies on canExecute of command
      EditPolicyCommandDecorator<ORMOrphanChildCommand> cmd = new EditPolicyCommandDecorator<>(orphan);
      cmd.setEditPolicyHandler(ep);

      result.add(cmd);
    }
    return result.unwrap();
  }


}
