/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.RelationLabel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Relation Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.framed.orm.model.impl.RelationLabelImpl#getLabel <em>Label</em>}</li>
 * <li>{@link org.framed.orm.model.impl.RelationLabelImpl#isIsRelationEnd <em>Is Relation End</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RelationLabelImpl extends MinimalEObjectImpl.Container implements RelationLabel {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected RelationLabelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.RELATION_LABEL;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected int eStaticFeatureCount() {
    return 0;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String getLabel() {
    return (String) eGet(OrmPackage.Literals.RELATION_LABEL__LABEL, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   * @author Lars Schuetze
   */
  @Override
  public void setLabel(String newLabel) {
    int lower = -1, upper = -1;
    String[] split = newLabel.split("[\\s.-]+");             //split the new label by dots, - or whitespaces
    
//    for(int i = 0; i < split.length; ++i)
//      System.out.println("Split[ "+i+" ]: "+split[i]);
    
    if (split.length == 1 && "*".equals(newLabel)) {        //no split was possible and newlabel equals "*"
      lower = upper = -1;                                   //set lower and upper = -1
    } else if(split.length == 2){                           //split was ok, user may have set cardinalities
      try {
        upper = "*".equals(split[1]) ? -1 : Integer.parseInt(split[1]);   //if 2nd card == '*' -> upper = -1, else parse the int of split[1]
        lower = Integer.parseInt(split[0]);                               //parse the lower bound
//        System.out.println("Lower: " + lower + " Upper: " + upper);
      }catch(NumberFormatException e){
          return;                                           //user typed in a strange number or no number at all -> keep the old values
      }
    } else {                                                //user typed in something strange -> keep the old values
      return;
    }

//    System.out.println("Before label setting: Lower: " + lower + " Upper: " + upper);

    newLabel = ((lower == -1) ? '*' : String.valueOf(lower)) + ".." + ((upper == -1) ? '*' : String.valueOf(upper));    
//    System.out.println("new label: " + newLabel);
    
//    eSet(OrmPackage.Literals.RELATION_LABEL__LABEL, newLabel);

    if (isIsRelationEnd()) {
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER, lower);
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_UPPER, upper);
//      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER_UPPER, newLabel);
    } else {
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER_UPPER, newLabel);
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER, lower);
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_UPPER, upper);
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean isIsRelationEnd() {
    return (Boolean) eGet(OrmPackage.Literals.RELATION_LABEL__IS_RELATION_END, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void setIsRelationEnd(boolean newIsRelationEnd) {
    eSet(OrmPackage.Literals.RELATION_LABEL__IS_RELATION_END, newIsRelationEnd);
  }

} // RelationLabelImpl
