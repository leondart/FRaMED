package org.framed.orm.ui.figure;


import java.util.List;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;

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
	
	public List<IFigure> getAllFigures(){
	  List<IFigure> tmp = attributeFigure.getChildren();
	  tmp.addAll(methodFigure.getChildren());
	  return tmp;
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
