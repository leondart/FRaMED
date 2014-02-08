package orm.figure;


import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;

/**
 * @author Kay Bierzynski
 * */
public abstract class ORMTypeFigure extends Figure {
	private PartFigure attributeFigure; 
	private PartFigure methodFigure; 
 	private LabelFigure label;
	private ConnectionAnchor connectionAnchor;
	
	public ORMTypeFigure() {
	 label = new LabelFigure();
	 attributeFigure = new PartFigure();
	 methodFigure = new PartFigure();
    }
	
	public LabelFigure getLabel(){
		return label;
	}
	
	public PartFigure getAttributeFigure(){
		return attributeFigure;
	}
	
	 @Override
	    protected boolean useLocalCoordinates() {
	        return true;
	    }
	
	public PartFigure getMethodeFigure(){
		return methodFigure;
	}
	
	 public ConnectionAnchor getConnectionAnchor() {
		    if (connectionAnchor == null) {
		      connectionAnchor = new ChopboxAnchor(this);
		    }
		    return connectionAnchor;
	}
}
