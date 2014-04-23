package org.framed.orm.ui.command.connectionkinds;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Relation;




/**
 * Command used to delete a bendpoint from a {@link Relation}
 * This class is declared final since it has a very specific functionality.
 * @author Kay Bierzynski
 */
public class ORMRelationDeleteBendpointCommand extends Command {
	
	/** Relation that contains the bendpoint. */
	  private Relation realtion;
	  /** Index where the bendpoint is located in the link's bendpoin list. */
	  private int index;
	  /** Point in the diagram where the bendpoint is located. */
	  private Point location;
	   
	  /**
	   * Only execute when the relation is not null and index is valid.
	   */
	  @Override public boolean canExecute() {
	    return (realtion != null) && (realtion.getBendpoints().size() > index);
	  }
	  /**
	   * Remove the bendpoint from the relation.
	   */
	  @Override public void execute() {
	    location = realtion.getBendpoints().get(index);
	    realtion.getBendpoints().remove(index);
	  }
	 
	  /**
	   * Reinsert the bendpoint in the relation.
	   */
	  @Override public void undo() {
	    realtion.getBendpoints().add(index, location);
	  }
	   
	  /**
	   * Set the index of the bendpoint that should be removed.
	   * @param index the index of the bendpoint to remove.
	   */
	  public void setIndex(final int index) {
	    this.index = index;
	  }
	   
	  /**
	   * Set the relation from which the bendpoint is removed.
	   * @param relation the relation from which the bendpoint is removed.
	   */
	  public void setRelation(final Relation relation) {
	    this.realtion = relation;
	  } 

}
