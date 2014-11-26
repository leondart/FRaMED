package org.framed.orm.transformation.etl;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.epsilon.standalone.handlers.AbstractTransformationHandler;
import org.framed.orm.transformation.Activator;

public class ETLHandler extends AbstractTransformationHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		return super.execute(event);
	}

	@Override
	public String getPluginID() {
		return Activator.PLUGIN_ID;
	}

}
