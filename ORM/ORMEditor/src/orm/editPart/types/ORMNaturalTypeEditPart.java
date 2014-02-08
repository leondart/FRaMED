package orm.editPart.types;


import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPolicy;

import orm.editPolicy.ORMNodeGraphicalNodeEditPolicy;
import orm.editor.ORMGraphicalEditor;
import orm.figure.ORMNaturalTypeFigure;


/**
 * @author Kay Bierzynski
 * */
public class ORMNaturalTypeEditPart extends ORMTypeEditPart {
	
	/*
	 * Needed to be installed here and not in TypeEditPart, because 
	 * its needed that in ContextTypeEditPart it can be filtered, so that the MainContext cannot
	 * be selected for Connectioncreation.
	 * 
	 * */
	@Override public void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ORMNodeGraphicalNodeEditPolicy());
	
	}
	
	@Override
	protected IFigure createFigure() {
		ORMGraphicalEditor editorPart = (ORMGraphicalEditor) ((DefaultEditDomain)getViewer().getEditDomain()).getEditorPart();
		ORMNaturalTypeFigure figure = new ORMNaturalTypeFigure(editorPart.getIsEditorData());
	    
		return figure;
	}


}
