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

  /**
   * 
   * The LabelInfo class stores the information for one cardinality label. This is the lower and upper bound and the resulting label
   * string.
   * 
   * @author Paul Peschel
   *
   */
  public static class LabelInfo {
    private int lower = -1;
    private int upper = -1;
    private String label = "";
    
    /**
     * Ctor stores lower and upper bounds and builds the resulting string for the label.
     * @param lower The lower bound. If it is -1 it will be replaced by a star.
     * @param upper The upper bound. If it is -1 it will be replaced by a star.
     */
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
  
  /**
   * Parse the raw cardinality strings typed in by the user.
   * @param newLabel
   * @return
   */
  public static LabelInfo preProcessLabelText(String newLabel) {
    int lower = -1, upper = -1;
    String[] split = newLabel.split("[\\s.-]+");             //split the new label by dots, - or whitespaces
    
    if (split.length == 1 && "*".equals(newLabel)) {        //no split was possible and newlabel equals "*"
      lower = upper = -1;                                   //set lower and upper = -1
    } else if(split.length == 2){                           //split was ok, user may have set cardinalities
      try {
        upper = "*".equals(split[1]) ? -1 : Integer.parseInt(split[1]);   //if 2nd card == '*' -> upper = -1, else parse the int of split[1]
        lower = Integer.parseInt(split[0]);                               //parse the lower bound
      }catch(NumberFormatException e){
          return null;                                           //user typed in a strange number or no number at all -> keep the old values
      }
    } else {                                                    //user typed in something strange -> keep the old values
      return null;
    }

    return new LabelInfo(lower, upper);  
  }
  
  /**
   * The label shown if there was an error with the new typed in label.
   * TODO: get the initial loaded values here: new LabelInfo((Integer)eContainer().eGet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER),
   *           (Integer)eContainer().eGet(OrmPackage.Literals.RELATIONSHIP__FIRST_UPPER)); 
   */
  private LabelInfo lastLabelInfoFirst = null;
  private LabelInfo lastLabelInfoSecond = null; //TODO: get the initial loaded values here: new LabelInfo((Integer)eContainer().eGet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER),
                                                //        (Integer)eContainer().eGet(OrmPackage.Literals.RELATIONSHIP__SECOND_UPPER));
  
  /**
   * Sets the label for a relationship cardinality. Processes the raw text inputted by the user to a correct cardinality label text in
   * the format "<lower_card>..<upper_card>". If the user typed in rubbish, the cardinalities won't be changed. Instead of two dots, the 
   * user can type in an arbitrary number of dots or even '-'.
   *  
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param text The raw cardinality string.
   * @generated NOT
   * @author Lars Schuetze, Paul Peschel
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
   * Returns true, if the currently processed label is at the relation end. So the target label is edited.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean isIsRelationEnd() {
    return (Boolean) eGet(OrmPackage.Literals.RELATION_LABEL__IS_RELATION_END, true);
  }

  /**
   * Set it to true, if the target label is edited.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void setIsRelationEnd(boolean newIsRelationEnd) {
    eSet(OrmPackage.Literals.RELATION_LABEL__IS_RELATION_END, newIsRelationEnd);
  }

  /**
   * Connect the property viewer with the relationship labels. If something changed, change it also in the labels.
   */
  @Override
  public void eNotify(Notification notification) {
    super.eNotify(notification);
   
    /*when the value was edited in the property viewer -> update labels*/
    if(!notification.getNewStringValue().isEmpty()) {
      setLabel(notification.getNewStringValue());
    }
  }
} // RelationLabelImpl
