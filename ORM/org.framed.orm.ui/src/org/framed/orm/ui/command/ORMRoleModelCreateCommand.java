package org.framed.orm.ui.command;


import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.Rolemodel;

/**
 * Through this command the model element {@link Rolemodel} can be created(invoked into the model
 * tree).
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleModelCreateCommand extends Command {

  /**
   * A {@link Rolemodel} can have as parent a {@link Grouping} or a {@link Compartment}. This
   * variable contains the parent {@link Grouping} of the {@link Rolemodel}.
   */
  private Grouping group;
  /**
   * A {@link Rolemodel} can have as parent a {@link Grouping} or a {@link Compartment}. This
   * variable contains the parent {@link Compartment} of the {@link Rolemodel}.
   */
  private Compartment compartment;
  /** The variable for the {@link Rolemodel}, which will be created through this command. */
  private Rolemodel rm;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   * */
  public ORMRoleModelCreateCommand() {
    super.setLabel("ORMRoleModelCreate");
  }

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter compartment or group is set.
   */
  @Override
  public boolean canExecute() {
    return compartment != null || group != null;
  }


  /**
   * {@inheritDoc} In this method the parent compartment reference of the {@link Rolemodel} is set
   * when the {@link Compartment} variable was set and the parent grouping reference of the
   * {@link Rolemodel} is set when the {@link Grouping} variable was set.
   * 
   */
  @Override
  public void execute() {

    if (compartment != null) {
      rm.setCompartment(compartment);
    }
    if (group != null) {
      rm.setParentGroup(group);
    }

  }


  /**
   * {@inheritDoc} To undo this command the parent compartment reference or parent grouping refence
   * of the {@link Rolemodel} is set on null depended on which parent variable( compartment or
   * grouping) was set. Through setting the parent reference on null the {@link Rolemodel} is
   * removed from the model tree.
   * 
   * */
  @Override
  public void undo() {
    if (compartment != null) {
      rm.setCompartment(null);
    }
    if (group != null) {
      rm.setParentGroup(null);
    }
  }

  /**
   * Setter of the {@link Rolemodel}, which should be created/invoked. The basis {@link Rolemodel}
   * class is given by the OrmFactory.eINSTANCE.createRolemodel().
   * 
   * @param rm org.framed.orm.model.Rolemodel
   * */
  public void setRolemodel(final Rolemodel rm) {
    this.rm = rm;
  }

  /**
   * Setter of the parent {@link Compartment}.
   * 
   * @param ct org.framed.orm.model.Compartment
   * */
  public void setCompartment(final Compartment ct) {
    this.compartment = ct;
  }

  /**
   * Setter of the parent {@link Grouping}.
   * 
   * @param group org.framed.orm.model.Grouping
   * */
  public void setGroup(final Grouping group) {
    this.group = group;
  }
}
