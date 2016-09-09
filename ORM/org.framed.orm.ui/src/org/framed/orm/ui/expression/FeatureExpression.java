package org.framed.orm.ui.expression;

import java.util.LinkedList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.framed.orm.featuremodel.FRaMEDConfiguration;
import org.framed.orm.featuremodel.FeatureName;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;

public class FeatureExpression {
  private LinkedList<Object> expressionContents;
  
  //We do not accept a String as expression, because we use these expressions as keys of a map
  public FeatureExpression(FeatureModel featureModel, Object...objects) {
    expressionContents = new LinkedList<Object>();
    for (Object o : objects) {
      if (o instanceof ExpressionNode) {
        expressionContents.add(o);
      }
      else if (o instanceof FeatureName) {
        if (!featureModel.getFeatureNames().contains(((FeatureName) o).getName()))
          throw new IllegalArgumentException ("The Feature" + o + "is not part of the FeatureModel.");
        expressionContents.add(o);
      }
      else {
        throw new IllegalArgumentException ("The parameter " + o + " of type " + o.getClass() + " is not part of a FeatureExpression.");
      }
    }
  }
  
  
  public boolean evaluate(FRaMEDConfiguration fRaMEDConfiguration) throws ScriptException {
    ExpressionMorpher expressionMorpher = new ExpressionMorpher(fRaMEDConfiguration);
    String morphedExpression = expressionMorpher.morph(expressionContents);
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
    return (boolean)engine.eval(morphedExpression); 
  }
  
  public String toMorphedString(FRaMEDConfiguration fRaMEDConfiguration) {
    ExpressionMorpher expressionMorpher = new ExpressionMorpher(fRaMEDConfiguration);
    String morphedExpression = expressionMorpher.morph(expressionContents);
    return morphedExpression;
  }
  
  @Override
  public String toString() {
    String expression = "";
    for (Object o : expressionContents) {
      expression += o.toString() + " ";
    }
    return expression;
  }

}
