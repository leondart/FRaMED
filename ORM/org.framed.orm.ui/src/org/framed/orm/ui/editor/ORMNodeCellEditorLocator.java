package org.framed.orm.ui.editor;


import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Text;


/**
 * @author Kay Bierzynski
 * */
public class ORMNodeCellEditorLocator implements CellEditorLocator{
	
	 
	  private TextFlow  nameLabel;
		
	  public ORMNodeCellEditorLocator(TextFlow label) {
		    this.nameLabel = label;
		  }
	
	  // create a cell on the position of the textflow
	  @Override 
	  public void relocate(CellEditor celleditor) {
		    Text text = (Text) celleditor.getControl();
		    Point pref = text.computeSize(SWT.DEFAULT, SWT.DEFAULT);
		    Rectangle rect = nameLabel.getBounds().getCopy();
		    nameLabel.translateToAbsolute(rect);
		    text.setBounds(rect.x - 1, rect.y - 1, pref.x + 1, pref.y + 1);  
		  }
	
}
