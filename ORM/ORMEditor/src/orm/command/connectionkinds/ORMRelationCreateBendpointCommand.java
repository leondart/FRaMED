package orm.command.connectionkinds;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import orm.model.Relation;

/**
 * @author Kay Bierzynski
 * */
public class ORMRelationCreateBendpointCommand extends Command {
	
	/** Index on which the new bendpoint is added. */
    private int index;
    /** Location of new bendpoint. */
    private Point location;
    /** Relation to which the bendpoint is added. */
    private Relation relation;
 
    @Override public void execute() {
        relation.getBendpoints().add(index, location);
    }
 
    @Override public void undo() {
        relation.getBendpoints().remove(index);
    }
 
    /**
     * Set the index on which the bendpoint is added.
     * @param index Index on which the bendpoint should be added.
     */
    public void setIndex(final int index) {
        this.index = index;
        //TODO:validation checks.
    }
 
    /**
     * Set the location where the new bendpoint is added.
     * @param location point in the diagram where the new bendpoint
     * is added.
     */
    public void setLocation(final Point location) {
        this.location = location;
    }
 
    /**
     * Set the relation on which the new bendpoint is added.
     * @param relation relation on which the bendpoint is added.
     */
    public void setRelation(final Relation relation) {
        this.relation = relation;
    }

	
}
