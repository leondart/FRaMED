package org.framed.orm.ui.command.connectionkinds;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Relation;


/**
 * Move a link bendpoint.
 * This class is declared final since it has a very specific functionality.
 * @author Kay Bierzynski
 */
public class ORMRelationMoveBendpointCommand extends Command {
	
	/** Old location of the moved bendpoint. */
	  private Point oldLocation;
	  /** New location of the moved bendpoint. */
	  private Point newLocation;
	  /** Index of the bendpoint in the relations's bendpoint list. */
	  private int index;
	  /** Relation that contains the bendpoint. */
	  private Relation relation;
	   
	  /** Move the bendpoint to the new location. */
	  public void execute() {
	    if(oldLocation == null) {
	      oldLocation = relation.getBendpoints().get(index);
	    }
	    relation.getBendpoints().set(index, newLocation);
	  }
	   
	  /** Restore the old location of the bendpoint. */
	  @Override public void undo() {
	    relation.getBendpoints().set(index, oldLocation);
	  }
	 
	  /**
	   * Set the index where the bendpoint is located in the bendpoint list.
	   * @param index the index where the bendpoint is located.
	   */
	  public void setIndex(final int index) {
	    this.index = index;
	  }
	   
	  /**
	   * Set the relation where the bendpoint is located.
	   * @param relation the relation where the bendpoint is located.
	   */
	  public void setRelation(final Relation relation) {
	    this.relation = relation;
	  }
	   
	  /**
	   * Set the new location of the bendpoint.
	   * @param newLocation the new location of the bendpoint.
	   */
	  public void setLocation(final Point newLocation) {
	    this.newLocation = newLocation;
	  }

	
}
