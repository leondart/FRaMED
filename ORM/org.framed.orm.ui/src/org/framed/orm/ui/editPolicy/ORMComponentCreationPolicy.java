/**
 * 
 */
package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.requests.CreateRequest;

/**
 * @author paul
 *
 *	\brief 	Class for the logic of the model with respect to the creation of components.
 *			Offers functions to test, whether it is possible to create a component in the current state of the editor.
 */
public class ORMComponentCreationPolicy {

	public boolean canCreate(CreateRequest request){
		return true;
	}
	
}
