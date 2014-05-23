package org.framed.orm.ui.editor;


import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;
import org.framed.orm.ui.editPart.ORMLabelFigure;
import org.framed.orm.ui.figure.LabelFigure;


/**
 * @author Kay Bierzynski
 * */
public class ORMNodeDirectEditManager extends DirectEditManager {

	private  TextFlow label;
//	private static int maxLength = 10;
	
	  public ORMNodeDirectEditManager(GraphicalEditPart source, Class editorType, CellEditorLocator locator, TextFlow label) {
	    super(source, editorType, locator/*,label*/);
	    this.label = label;
	  }
	 
	  @Override 
	  protected void initCellEditor() {
	    String initialLabelText = label.getText();
	    getCellEditor().setValue(initialLabelText);
	  }
	  
//	  @Override
//	  protected void commit(){
//	    TextFlow tmpLabel = (TextFlow)super.getDirectEditFeature();
//	    String newLabelStr = tmpLabel.getText();
//	    if(tmpLabel.getText().length() > maxLength)
//	    {
//	      LabelFigure tooltip = new LabelFigure();
//	      tooltip.setParent(getCellEditorFrame());
//	      tooltip.setText(tmpLabel.getText());
//	      newLabelStr = tmpLabel.getText().substring(0, maxLength) + "...";
//	      tmpLabel.setToolTip(tooltip);
//	    }
//	    super.getCellEditor().setValue(newLabelStr);
//	    label.setText(tmpLabel.getText());
//	    super.commit();
//	  }
}
