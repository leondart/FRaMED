/**
 * 
 */
package org.framed.orm.ui.editPart;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Node;
import org.framed.orm.ui.editPart.types.ORMTypeEditPart;

/**
 * @author paul
 *
 */
public class ORMLabelFigure {

  private AbstractEditPart parentEditPart = null;
  private ORMTypeEditPart parentTypeEditPart = null;
  private Node parent = null;
  private Figure figure = null;
  
  //Hack
  private static class TextCalc extends TextFlow{
    
    static TextCalc tc = null;
    
    public static TextCalc instance() {
      if(tc == null) tc = new TextCalc();
      return tc;
    }
    
    private TextCalc(){
      super();
    }
    
    int textWidth(String text,Font f){
      return (f == null) ? 
             getTextUtilities().getStringExtents(text, Display.getCurrent().getSystemFont()).width() : 
             getTextUtilities().getStringExtents(text, f).width();
    }
    
    int textHeight(String text,Font f){
      return (f == null) ? 
             getTextUtilities().getStringExtents(text, Display.getCurrent().getSystemFont()).height() : 
             getTextUtilities().getStringExtents(text, f).height();
    }
  }
   
  public ORMLabelFigure() {
//    super();
  }
  
  
  
  public static int charWidth(Font f) {
    return TextCalc.instance().textWidth("A", f);
  }
  
  public static int charHeight(Font f) {
    return TextCalc.instance().textHeight("A", f);
  }
  
}
