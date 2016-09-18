package org.framed.orm.ui.expression;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.framed.orm.featuremodel.FRaMEDConfiguration;
import org.framed.orm.featuremodel.FRaMEDFeature;
import org.framed.orm.featuremodel.FeatureName;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;

public class FeatureExpression {
  private String featureExpression;
  boolean singleLiteral;
  
  /**
   * Constructor for a new FeatureExpression, which consists of a arbitrary expression given. Checks the validity of the expression.
   * 
   * @param featureModel
   * @param featureExpression
   */
  public FeatureExpression(FeatureModel featureModel, String featureExpression) {
    singleLiteral = false;
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
   * @param featureModel
   * @param featureName
   */
  public FeatureExpression(FeatureModel featureModel, FeatureName featureName) {
    singleLiteral = true;
    if (featureName != null) {
      this.featureExpression = featureName.toString();
      checkForExpressionValidity(featureName.toString());
    } else
      throw new NullPointerException();
  }


  /**
   * Checks a given String expression for validity by replacing all ({@link org.framed.orm.featuremodel.FeatureName FeatureName}s) with
   * false and evaluating the resulting expression.
   * 
   * @param featureExpression
   */
  private void checkForExpressionValidity(String featureExpression) {
    String morphedExpression = featureExpression;
    for (FeatureName f : FeatureName.values()){
      morphedExpression = morphedExpression.replaceAll("(?<!_)" + f.getName() + "(?!_)", "false");
    }
    System.out.println(featureExpression + "\n ===> Morphed Expression Constructor: "+morphedExpression);
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
    try {
      Object o = engine.eval(morphedExpression);
      //Boolean wert = (boolean)engine.eval(morphedExpression);
    } catch (ScriptException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      throw new IllegalArgumentException("The specified Expression is not valid: " + featureExpression + " (" + morphedExpression + ")");
    }
    
  }

  

  public boolean evaluate(FRaMEDConfiguration fRaMEDConfiguration) throws ScriptException {
    List<String> fRaMEDConfigurationFeatureNames = new ArrayList<String>();
    //create a list of all Feature Names as Strings within the framedConfiguration
    for (FRaMEDFeature feature : fRaMEDConfiguration.getFeatures()) {
      fRaMEDConfigurationFeatureNames.add(feature.getName().getName());
    }
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
    //Shortcut to save resources if we already know the expression is only a single literal
    if (singleLiteral) {
      if (fRaMEDConfigurationFeatureNames.contains(featureExpression)) {
        engine.put(featureExpression, true);
      } 
      else {
        engine.put(featureExpression, false);
      }
    }
    else {
      //check for each existing feature name, if the current configuration does include it
      for (FeatureName f : FeatureName.VALUES) {
        if (fRaMEDConfigurationFeatureNames.contains(f.getName())) {
          engine.put(f.getName(), true);
        }
        else {
          engine.put(f.getName(), false);
        }
      }
      System.out.println("############ Beginn Bindings #########");
      String morph = featureExpression;
      for (String s : engine.getBindings(ScriptContext.ENGINE_SCOPE).keySet()) {
        System.out.println(s + ": "+engine.get(s));
        morph = morph.replaceAll("(?<!_)" + s+ "(?!_)", engine.get(s).toString());
        System.out.println("---> Morph: "+morph);
      }
      System.out.println("############ Ende Bindings #########");   
      Object o = engine.eval(featureExpression); 
      System.out.println(featureExpression +" ==> " + o);
      System.out.println(morph + " ==> " + o);
    }
    boolean val =(boolean)engine.eval(featureExpression);  
    return val;
  }
  
  
  @Override
  public String toString() {
    return featureExpression;
  }

}
