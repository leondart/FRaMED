/**
 * 
 */
package org.framed.orm.ui.utilities;

import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * This class is for accessing the TextFlow utilities to calculate text sizes.
 * 
 * @author paul
 *
 */
public class ORMTextUtilities {
  
  //Hack: access text utilities of TextFlow
  private static class TextCalc extends TextFlow{
    
    static TextCalc tc = null;
    
    public static TextCalc instance() {
      if(tc == null) tc = new TextCalc();
      return tc;
    }
    
    private TextCalc(){
      super();
    }
    
    /**
     * Calculate the width of a given text for the given font f; If f == null the system font will be used 
     */
    int textWidth(String text,Font f){
      return (f == null) ? 
             getTextUtilities().getStringExtents(text, Display.getCurrent().getSystemFont()).width() : 
             getTextUtilities().getStringExtents(text, f).width();
    }
    
    /**
     * Calculate the height of a given text for the given font f; If f == null the system font will be used 
     */
    int textHeight(String text,Font f){
      return (f == null) ? 
             getTextUtilities().getStringExtents(text, Display.getCurrent().getSystemFont()).height() : 
             getTextUtilities().getStringExtents(text, f).height();
    }
  }
  
  /**
   * Calculate the width of a char for the given font f; If f == null the system font will be used 
   */
  public static int charWidth(Font f) {
    return TextCalc.instance().textWidth("A", f);
  }
  
  /**
   * Calculate the height of a char for the given font f; If f == null the system font will be used 
   */
  public static int charHeight(Font f) {
    return TextCalc.instance().textHeight("A", f);
  }
  
}
