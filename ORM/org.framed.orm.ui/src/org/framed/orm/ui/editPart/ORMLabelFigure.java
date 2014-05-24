/**
 * 
 */
package org.framed.orm.ui.editPart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;
import org.framed.orm.ui.figure.LabelFigure;

/**
 * @author paul
 *
 */
public class ORMLabelFigure extends LabelFigure {

  private AbstractGraphicalEditPart parentEditPart = null;
  
  //Hack
  private class TextCalc extends TextFlow{
    public TextCalc(){
      super();
    }
    
    int textWidth(String text,Font f){
      return (f == null) ? 
             getTextUtilities().getStringExtents(text, Display.getCurrent().getSystemFont()).width() : 
             getTextUtilities().getStringExtents(text, f).width();
    }
  }
  
  public ORMLabelFigure() {
    super();
  }
  
  public ORMLabelFigure(AbstractGraphicalEditPart parent) {
    super();
    parentEditPart = parent;
  }

  public AbstractGraphicalEditPart getParentEditPart(){
    return parentEditPart;
  }
  
  @Override
  public void setText(String value) {
    super.setText(value);
  }
  
  public String shortenLabel(String origText,Rectangle labelRect,Font f,Rectangle parentRect){
    int textWidth = (new TextCalc()).textWidth(origText, f); 
    
    if(labelRect == null || parentRect == null) return origText;
    
    if(parentRect.width() < textWidth)                                             //if the label does not fit -> shrink it
    {
      int avgCharWidth = (textWidth / origText.length()) + 1;                       //calc the average character width 
      int newTextLength = ((parentRect.width() /*+ labelRect.x()*/) / avgCharWidth) - 3;    //-3 for the dots ;)
      
      return (newTextLength > 0) ? (origText.substring(0, newTextLength) + "...") : "<...>";
    }
    
    return origText;
  }
  
  public String shortenLabel(String origText,TextFlow orig,Rectangle parentRect){
    return shortenLabel(origText, orig.getBounds(), orig.getFont(),parentRect);
  }
  
  public static IFigure createToolTip(IFigure origLabel,String text){
    LabelFigure ttLabel = new LabelFigure();
    
    ttLabel.setParent(origLabel.getParent());
    ttLabel.setText(text);
    
    return ttLabel;
  }
}
