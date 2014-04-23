package org.framed.orm.ui.editor;


import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;


/**
 * @author Kay Bierzynski
 * */
public class ORMNodeDirectEditManager extends DirectEditManager {

	private  TextFlow label; 
	  public ORMNodeDirectEditManager(GraphicalEditPart source, Class editorType, CellEditorLocator locator, TextFlow label) {
	    super(source, editorType, locator);
	    this.label = label;
	  }
	 
	  @Override protected void initCellEditor() {
	    String initialLabelText = label.getText();
	    getCellEditor().setValue(initialLabelText);
	   
	    }

}
