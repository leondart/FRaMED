package org.framed.orm.ui.editor;


import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;
import org.framed.orm.model.Attribute;
import org.framed.orm.model.Method;
import org.framed.orm.model.Node;


/**
 * @author Kay Bierzynski
 * @author Lars Schuetze (refactoring)
 * */
public class ORMNodeDirectEditManager extends DirectEditManager {

  private final Label label;

  public ORMNodeDirectEditManager(GraphicalEditPart source, Class editorType,
      CellEditorLocator locator, Label label) {
    super(source, editorType, locator);
    this.label = label;
    String name = label.getText();
    
    if(source.getModel() instanceof Node) name = ((Node)source.getModel()).getName();
    else if(source.getModel() instanceof Attribute) name = ((Attribute)source.getModel()).getName();
    else if(source.getModel() instanceof Method) name = ((Method)source.getModel()).getName();
    
    this.label.setText(name);
  }

  /**
   * Sets the initial text in the cell editor. Usually it's the text of the label.
   */
  @Override
  protected void initCellEditor() {
    String initialLabelText = label.getText();
    getCellEditor().setValue(initialLabelText);
  }

}
