package org.framed.orm.ui.figure;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Button;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;

/**
 * @author Kay Bierzynski
 * */
public class ORMCompartmentV2Figure extends  ORMTypeFigure {

	private final ShadowRectangle rectangle;
	private final PartFigure rectangle2;
	private final Button expandCollapseButt;

	private final Image image;
	//figure for maincompartments
	public ORMCompartmentV2Figure(boolean  isEditorData) {

		super();

	    rectangle = new ShadowRectangle();
	    rectangle2 = new PartFigure();

	    image =  new Image(null, ImageDescriptor.createFromFile(this.getClass(),"../icons/expandArrow3.png").createImage(), SWT.IMAGE_COPY);
	    
	    expandCollapseButt = new Button(image); 
	    expandCollapseButt.setStyle(Button.STYLE_BUTTON);
	    
	    // to only show the image of the button
	    // the border must set to null and opaque to false
	    expandCollapseButt.setBorder(null);
	    expandCollapseButt.setOpaque(false);
	    
	    BorderLayout layout = new BorderLayout();
	    ToolbarLayout layout2 = new ToolbarLayout();
	    XYLayout layout3 = new XYLayout();
	    
	    layout2.setSpacing(4); // setzt initial höhe der Kind Elemente
	    layout2.setHorizontal(false);
	    layout.setHorizontalSpacing(-1);
	    layout.setVerticalSpacing(-1);
	   
	    setLayoutManager(layout3);
	    setBackgroundColor(ColorConstants.white);
	    
	    rectangle.setLayoutManager(layout);
	    rectangle2.setLayoutManager(layout2);

	    rectangle.setFill(false);
	    rectangle.add(getLabel(),BorderLayout.TOP);
	    rectangle2.add(expandCollapseButt);
	    	  
	    rectangle2.add(getAttributeFigure());
	    if(!(isEditorData))rectangle2.add(getMethodeFigure());
	  
	    rectangle.add(rectangle2,BorderLayout.LEFT);
	    
	    add(rectangle);
	    
	    
	}
	
	

    public final PartFigure getListAttMet() {
	    return rectangle2;
	  }
	

    public ShadowRectangle getBasicRec() {
	    return rectangle;
	  }
    
    public  Button getButton() {
	    return expandCollapseButt;
	  }
  
    @Override
    protected boolean useLocalCoordinates() {
        return true;
    }
    
	@Override protected void paintFigure(Graphics graphics) {
		 super.paintFigure(graphics);
		 Rectangle r = getBounds().getCopy();
		 setConstraint(rectangle, new Rectangle(0, 0, r.width(), r.height()));
	}
	
	
}