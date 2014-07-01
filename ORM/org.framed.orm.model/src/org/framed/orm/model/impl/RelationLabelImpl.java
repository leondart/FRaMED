/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.RelationLabel;
import org.framed.orm.model.Relationship;

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

  public static class LabelInfo {
    private int lower = -1;
    private int upper = -1;
    private String label = "";
    
    public LabelInfo(int lower, int upper) {
      this.setLower(lower);
      this.setUpper(upper);
      this.setLabel(((lower == -1) ? '*' : String.valueOf(lower)) + ".." + ((upper == -1) ? '*' : String.valueOf(upper)));
    }

    public String getLabel() {
      return label;
    }

    private void setLabel(String label) {
      this.label = label;
    }

    public int getUpper() {
      return upper;
    }

    public void setUpper(int upper) {
      this.upper = upper;
    }

    public int getLower() {
      return lower;
    }

    public void setLower(int lower) {
      this.lower = lower;
    }
  }
  
  public static LabelInfo preProcessLabelText(String newLabel) {
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
          return null;                                           //user typed in a strange number or no number at all -> keep the old values
      }
    } else {                                                //user typed in something strange -> keep the old values
      return null;
    }

//    System.out.println("Before label setting: Lower: " + lower + " Upper: " + upper);

    return new LabelInfo(lower, upper);  
  }
  
  private LabelInfo lastLabelInfoFirst = null;//TODO: get the initial loaded values here: new LabelInfo((Integer)eContainer().eGet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER),
                                              //         (Integer)eContainer().eGet(OrmPackage.Literals.RELATIONSHIP__FIRST_UPPER));
  private LabelInfo lastLabelInfoSecond = null; //TODO: get the initial loaded values here: new LabelInfo((Integer)eContainer().eGet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER),
                                                //        (Integer)eContainer().eGet(OrmPackage.Literals.RELATIONSHIP__SECOND_UPPER));
  
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   * @author Lars Schuetze
   */
  @Override
  public void setLabel(String text) {
      
    LabelInfo labelInfo = preProcessLabelText(text);
    
    if(labelInfo == null && isIsRelationEnd()) labelInfo = lastLabelInfoSecond;
    else if(labelInfo == null && !isIsRelationEnd()) labelInfo = lastLabelInfoFirst;
    else if(isIsRelationEnd()) lastLabelInfoSecond = labelInfo;
    else lastLabelInfoFirst = labelInfo;

    if(labelInfo == null) return;
    
//    System.out.println("LabelInfo: " + labelInfo);
    
    //equality check is necessary to avoid stackoverflows because we generate with notifications and resetting a cycle...
    if (isIsRelationEnd() && 
        (eContainer().eGet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER_UPPER) == null ||
        !eContainer().eGet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER_UPPER).equals(labelInfo.getLabel()))) {
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER, labelInfo.getLower());
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_UPPER, labelInfo.getUpper());
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER_UPPER, labelInfo.getLabel());
    } else if( !isIsRelationEnd() && (eContainer().eGet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER_UPPER) == null || 
                !eContainer().eGet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER_UPPER).equals(labelInfo.getLabel()))) {
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER_UPPER, labelInfo.getLabel());
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER, labelInfo.getLower());
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_UPPER, labelInfo.getUpper());
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

  @Override
  public void eNotify(Notification notification) {
    super.eNotify(notification);
   
    /*when the value was edited in the property viewer -> update labels*/
    if(!notification.getNewStringValue().isEmpty()) {
//      System.out.println("RelationLabel property changed: " + notification.getNewStringValue());
      setLabel(notification.getNewStringValue());
    }
  }
} // RelationLabelImpl
