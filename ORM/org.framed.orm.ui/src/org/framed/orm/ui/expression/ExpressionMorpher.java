package org.framed.orm.ui.expression;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.framed.orm.featuremodel.FRaMEDConfiguration;
import org.framed.orm.featuremodel.FRaMEDFeature;
import org.framed.orm.featuremodel.FeatureName;

public class ExpressionMorpher {
  
  private Set<FeatureName> framedFeatureNames;
  
  public ExpressionMorpher(FRaMEDConfiguration fRaMEDConfiguration) {
    framedFeatureNames = new HashSet<FeatureName>();
    for (FRaMEDFeature f : fRaMEDConfiguration.getFeatures())
      framedFeatureNames.add(f.getName());
      
  }
  
  public String morph(LinkedList<Object> objects) {
    String morphedExpression = "";
    for (Object o : objects) {
      if (o instanceof ExpressionNode) {
        morphedExpression += (o.toString());
      }
      if (!(o instanceof ExpressionNode) && o instanceof FeatureName) {
        FeatureName featureName = (FeatureName) o;
        if (framedFeatureNames.contains(featureName)) {
          morphedExpression += (Boolean.toString(true));
        }
        else {
          morphedExpression += (Boolean.toString(false));
        }
      }
      morphedExpression += (" ");   
    }
    return morphedExpression;
  }

}
