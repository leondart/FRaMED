package orm.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.text.FlowPage;
import org.eclipse.draw2d.text.TextFlow;

/**
 * Class for Labels in different figures
 * @author Kay Bierzynski
 * */
public class LabelFigure extends Figure {
	
	private final TextFlow textFlow;
	private final IFigure textFigure;
	
	 public LabelFigure() {

		 	FlowLayout layout = new FlowLayout();
		    layout.setMinorAlignment(FlowLayout.ALIGN_CENTER);
		    layout.setStretchMinorAxis(false);
		    setLayoutManager(layout);
		    
		    textFlow = new TextFlow();
		    FlowPage flowPage = new FlowPage();
		    flowPage.setHorizontalAligment(PositionConstants.CENTER);
		    flowPage.add(textFlow);
		    textFigure = flowPage;
		    add(flowPage);
		  }

		  public Label getNameLabel() {
		    return null;
		  }

		  public TextFlow getTextFlow() {
		    return textFlow;
		  }
		  
		  public void setText(String value) {
			    textFlow.setText(value);
			  }

		  public IFigure getTextFigure() {
		    return textFigure;
		  }
		  
}
