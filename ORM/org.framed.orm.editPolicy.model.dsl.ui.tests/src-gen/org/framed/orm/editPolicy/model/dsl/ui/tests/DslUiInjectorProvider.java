/*
 * generated by Xtext 2.10.0
 */
package org.framed.orm.editPolicy.model.dsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.framed.orm.editPolicy.model.dsl.ui.internal.DslActivator;

public class DslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("org.framed.orm.editPolicy.model.dsl.Dsl");
	}

}
