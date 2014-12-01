package org.eclipse.epsilon.standalone.util;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

public class ExtensionUtil {
	
	private static String EXTENSION_ID = "org.eclipse.epsilon.standalone.transform";

	private ExtensionUtil() {
	}
	
	public static IConfigurationElement findConfigurationElementForPlugin(String pluginID) {
		IConfigurationElement[] configurationElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_ID);
		System.out.println("Found " + configurationElements.length + " elements");
		for (IConfigurationElement configurationElement : configurationElements) {
			if (configurationElement.getContributor().getName().equals(pluginID)) {
				System.out.println("Found plugin from configuration");
				return configurationElement;
			}
		}
		return null;
	}

}

