package org.framed.orm.ui.editor;


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

  private final TextFlow label;

  // private static int maxLength = 10;

  public ORMNodeDirectEditManager(GraphicalEditPart source, Class editorType,
      CellEditorLocator locator, TextFlow label) {
    super(source, editorType, locator/*,label*/);
    this.label = label;
    String name = label.getText();
    
    if(source.getModel() instanceof Node) name = ((Node)source.getModel()).getName();
    else if(source.getModel() instanceof Attribute) name = ((Attribute)source.getModel()).getName();
    else if(source.getModel() instanceof Method) name = ((Method)source.getModel()).getName();
    
    this.label.setText(name);
  }

  @Override
  protected void initCellEditor() {
    String initialLabelText = label.getText();
    getCellEditor().setValue(initialLabelText);
  }

  // @Override
  // protected void commit(){
  // TextFlow tmpLabel = (TextFlow)super.getDirectEditFeature();
  // String newLabelStr = tmpLabel.getText();
  // if(tmpLabel.getText().length() > maxLength)
  // {
  // LabelFigure tooltip = new LabelFigure();
  // tooltip.setParent(getCellEditorFrame());
  // tooltip.setText(tmpLabel.getText());
  // newLabelStr = tmpLabel.getText().substring(0, maxLength) + "...";
  // tmpLabel.setToolTip(tooltip);
  // }
  // super.getCellEditor().setValue(newLabelStr);
  // label.setText(tmpLabel.getText());
  // super.commit();
  // }
}
