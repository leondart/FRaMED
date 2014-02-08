package orm.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.text.FlowPage;
import org.eclipse.draw2d.text.ParagraphTextLayout;
import org.eclipse.draw2d.text.TextFlow;

/**
 * Class for multi line Texts 
* @author Kay Bierzynski
 * */
public class TextFigure extends FlowPage {

	  private TextFlow message;
	     
	    public TextFigure() {
	        message = new TextFlow();
	        message.setText("");
	        // layout needed for linebreaks
	        message.setLayoutManager(new ParagraphTextLayout(message,
	        		               ParagraphTextLayout.WORD_WRAP_SOFT));
	        message.setForegroundColor(ColorConstants.black);
	        setHorizontalAligment(PositionConstants.CENTER);
	        add(message);
	    }
	     
	    @Override
	    public Dimension getPreferredSize(int w, int h) {
	        Dimension d = super.getPreferredSize(-1, -1);
	        //gives size for when a line break should occur
	        if (d.width > 150)
	            d = super.getPreferredSize(150, -1);
	        return d;
	    }
	     
	    public void setMessage(String txt) {
	        message.setText(txt);
	        revalidate();
	        repaint();
	    }
	
	    public TextFlow getMessage() {
		    return message;
		  }
	
}
