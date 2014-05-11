/**
 * 
 */
package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.RelationContainer;
import org.framed.orm.ui.command.ORMAddCommand;

/**
 * @author Lars Schuetze
 * 
 */
public abstract class ORMAbstractXYLayoutPolicy extends XYLayoutEditPolicy {


  @Override
  public Command getAddCommand(Request request) {
    CompoundCommand result = new CompoundCommand();
    if (request instanceof ChangeBoundsRequest) {
      ChangeBoundsRequest cbr = (ChangeBoundsRequest) request;

      for (Object part : cbr.getEditParts()) {
        ORMAddCommand add = new ORMAddCommand();
        add.setChild((AbstractRole) ((EditPart) part).getModel());
        add.setParent((RelationContainer) this.getHost().getModel());
        add.setLabel("Adding");
        result.add(add);
      }
    }
    return result.unwrap();
  }

  @Override
  protected Command getCloneCommand(ChangeBoundsRequest request) {
    // TODO Auto-generated method stub
    return super.getCloneCommand(request);
  }

  /*
   * @Override protected Command getOrphanChildrenCommand(Request request) { CompoundCommand result
   * = new CompoundCommand(); if (request instanceof GroupRequest) { List<EditPart> list =
   * ((GroupRequest) request).getEditParts();
   * 
   * result.setDebugLabel("Orphan children");
   * 
   * for (EditPart part : list) { ORMOrphanChildCommand orphan = new ORMOrphanChildCommand();
   * orphan.setChild((AbstractRole) part.getModel()); orphan.setParent((RelationContainer)
   * this.getHost().getModel()); orphan.setLabel("Reparenting"); result.add(orphan); } } return
   * result.unwrap(); }
   */


}
