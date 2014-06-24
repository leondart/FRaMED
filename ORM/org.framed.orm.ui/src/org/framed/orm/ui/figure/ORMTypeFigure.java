package org.framed.orm.ui.figure;


import java.util.List;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.framed.orm.model.Node;
import org.framed.orm.ui.editPart.ORMLabelFigure;

/**
 * @author Kay Bierzynski
 * */
public abstract class ORMTypeFigure extends Figure {
	private PartFigure attributeFigure; 
	private PartFigure methodFigure; 
 	private Label label;
	private ConnectionAnchor connectionAnchor;
	
	public ORMTypeFigure(Node parent){
	  label = new Label();
	  attributeFigure = new PartFigure();
	  methodFigure = new PartFigure();
	}
	
//	public ORMTypeFigure(AbstractGraphicalEditPart parent) {
//	 label = new ORMLabelFigure((Node) parent);
//	 attributeFigure = new PartFigure();
//	 methodFigure = new PartFigure();
//    }
	
	public Label getLabel(){
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
