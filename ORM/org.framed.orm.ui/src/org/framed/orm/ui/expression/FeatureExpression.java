package org.framed.orm.ui.expression;

import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.framed.orm.featuremodel.FRaMEDConfiguration;
import org.framed.orm.featuremodel.FRaMEDFeature;
import org.framed.orm.featuremodel.FeatureName;

import de.ovgu.featureide.fm.core.configuration.Configuration;

/**
 * A Feature Expression is a String which represents an expression consisting of operators and features.
 * 
 * @author Marc Kandler
 *
 */
public class FeatureExpression {
  /**
   * The String-representation of the FeatureExpression
   */
  private String featureExpression;
  
  /**
   * Flag for this expression being a single literal consisting of a {@link FeatureName}
   */
  boolean singleNameLiteral = false;
  
  /**
   * Flag for this expression being a single boolean literal.
   */
  boolean isBoolean = false;
  
  /**
   * Constructor for a new FeatureExpression, which consists of an arbitrary expression given. 
   * Checks the validity of the expression.
   * 
   * @param featureExpression
   */
  public FeatureExpression(String featureExpression) {
    if (featureExpression != null) {
      this.featureExpression = featureExpression;
      checkForExpressionValidity(featureExpression);
    } else
      throw new NullPointerException();
  }

  /**
   * Constructor for a new FeatureExpression, consisting of a single literal ({@link org.framed.orm.featuremodel.FeatureName FeatureName}).
   * Checks the validity of the expression.
   *  
   * @param featureName
   */
  public FeatureExpression(FeatureName featureName) {
    singleNameLiteral = true;
    if (featureName != null) {
      this.featureExpression = featureName.toString();
      checkForExpressionValidity(featureName.toString());
    } else
      throw new NullPointerException();
  }
  
  /**
   * Constructor for a FeatureExpression which is only a single boolean literal. Therefore it does not need to be checked for validity.
   */
  public FeatureExpression(boolean value) {
    isBoolean = true;
    this.featureExpression = String.valueOf(value);
  }


  /**
   * Checks a given String expression for validity by replacing all ({@link org.framed.orm.featuremodel.FeatureName FeatureName}s) with the boolean value
   * false and evaluating the resulting expression.
   * 
   * @param featureExpression
   */
  private void checkForExpressionValidity(String featureExpression) {
    String morphedExpression = featureExpression;
    //replace each Feature name within the expression with the literal "false"
    //Be careful, as some FeatureNames are parts of other FeatureNames. This is why the regex was necessary
    for (FeatureName f : FeatureName.values()){
      morphedExpression = morphedExpression.replaceAll("(?<!_)" + f.getName() + "(?!_)", "false");
    }
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
    try {
      @SuppressWarnings("unused")
      Object o = engine.eval(morphedExpression);
    } catch (ScriptException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      throw new IllegalArgumentException("The specified Expression is not valid: " + featureExpression + " (" + morphedExpression + ")");
    } 
  }


  
  
  /**
   * Evaluates the expression by checking it against the {@link org.framed.orm.featuremodel.FRaMEDConfiguration <em>FRaMEDConfiguration</em>}.
   * Each {@link FeatureName} is replaced by a boolean value with bindings of the used JavaScript-engine.
   * 
   * @param fRaMEDConfiguration
   * @return
   * @throws ScriptException
   */
  public boolean evaluate(FRaMEDConfiguration fRaMEDConfiguration) throws ScriptException {
    List<String> fRaMEDConfigurationFeatureNames = new ArrayList<String>();
    //create a list of all Feature Names as Strings within the framedConfiguration
    for (FRaMEDFeature feature : fRaMEDConfiguration.getFeatures()) {
      fRaMEDConfigurationFeatureNames.add(feature.getName().getName());
    }
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
    //Shortcut to save resources if we already know the expression is only a single literal
    if (singleNameLiteral) {
      if (fRaMEDConfigurationFeatureNames.contains(featureExpression)) {
        engine.put(featureExpression, true);
      } 
      else {
        engine.put(featureExpression, false);
      }
    }
    else  
      if (!singleNameLiteral && !isBoolean){
      //check for each existing feature name, if the current configuration does include it
      for (FeatureName f : FeatureName.VALUES) {
        if (fRaMEDConfigurationFeatureNames.contains(f.getName())) {
          engine.put(f.getName(), true);
        }
        else {
          engine.put(f.getName(), false);
        }
      }
    } else
      if (isBoolean) {
        if (featureExpression.equals(Boolean.toString(true)))
        return true;
        if (featureExpression.equals(Boolean.toString(false)))
        return false;
      }
    boolean val = (boolean)engine.eval(featureExpression);  
    return val;
  }
  
  
  @Override
  public String toString() {
    return featureExpression;
  }

}
