package org.framed.orm.ui.tool;

import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.jface.resource.ImageDescriptor;

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
