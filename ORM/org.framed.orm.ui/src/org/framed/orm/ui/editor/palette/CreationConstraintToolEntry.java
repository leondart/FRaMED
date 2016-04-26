package org.framed.orm.ui.editor.palette;

import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.framed.orm.ui.editor.ORMGraphicalEditor;

/**
 * This class is needed for constraint entries in EditorPalette for handling onClick by MouseListener in ORMGraphicalEditor.
 * 
 * @author Duc Dung Dam
 * */

public class CreationConstraintToolEntry extends CombinedTemplateCreationEntry{
	private int typeValue;
	public CreationConstraintToolEntry(String label, String shortDesc,
			CreationFactory factory, ImageDescriptor iconSmall,
			ImageDescriptor iconLarge, int typeValue) {
		super(label, shortDesc, factory, iconSmall, iconLarge);
		this.typeValue = typeValue;
	}
	
	public int getTypeValue(){
		return this.typeValue;
	}
	
}
