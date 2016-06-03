/**
 */
package org.framed.orm.transformation.test.model.test.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.framed.orm.model.Model;

import org.framed.orm.transformation.test.model.test.TestCase;
import org.framed.orm.transformation.test.model.test.TestPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Case</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.framed.orm.transformation.test.model.test.impl.TestCaseImpl#getTitle <em>Title
 * </em>}</li>
 * <li>{@link org.framed.orm.transformation.test.model.test.impl.TestCaseImpl#getDescription <em>
 * Description</em>}</li>
 * <li>{@link org.framed.orm.transformation.test.model.test.impl.TestCaseImpl#getFramedModel <em>
 * Framed Model</em>}</li>
 * <li>{@link org.framed.orm.transformation.test.model.test.impl.TestCaseImpl#getCromModel <em>Crom
 * Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestCaseImpl extends MinimalEObjectImpl.Container implements TestCase {
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getFramedModel() <em>Framed Model</em>}' containment
   * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getFramedModel()
   * @generated
   * @ordered
   */
  protected Model framedModel;

  /**
   * The cached value of the '{@link #getCromModel() <em>Crom Model</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCromModel()
   * @generated
   * @ordered
   */
  protected crom_l1_composed.Model cromModel;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected TestCaseImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return TestPackage.Literals.TEST_CASE;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getTitle() {
    return title;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setTitle(String newTitle) {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_CASE__TITLE, oldTitle,
          title));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setDescription(String newDescription) {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_CASE__DESCRIPTION,
          oldDescription, description));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Model getFramedModel() {
    return framedModel;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetFramedModel(Model newFramedModel, NotificationChain msgs) {
    Model oldFramedModel = framedModel;
    framedModel = newFramedModel;
    if (eNotificationRequired()) {
      ENotificationImpl notification =
          new ENotificationImpl(this, Notification.SET, TestPackage.TEST_CASE__FRAMED_MODEL,
              oldFramedModel, newFramedModel);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setFramedModel(Model newFramedModel) {
    if (newFramedModel != framedModel) {
      NotificationChain msgs = null;
      if (framedModel != null)
        msgs =
            ((InternalEObject) framedModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                - TestPackage.TEST_CASE__FRAMED_MODEL, null, msgs);
      if (newFramedModel != null)
        msgs =
            ((InternalEObject) newFramedModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                - TestPackage.TEST_CASE__FRAMED_MODEL, null, msgs);
      msgs = basicSetFramedModel(newFramedModel, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_CASE__FRAMED_MODEL,
          newFramedModel, newFramedModel));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public crom_l1_composed.Model getCromModel() {
    return cromModel;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetCromModel(crom_l1_composed.Model newCromModel,
      NotificationChain msgs) {
    crom_l1_composed.Model oldCromModel = cromModel;
    cromModel = newCromModel;
    if (eNotificationRequired()) {
      ENotificationImpl notification =
          new ENotificationImpl(this, Notification.SET, TestPackage.TEST_CASE__CROM_MODEL,
              oldCromModel, newCromModel);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setCromModel(crom_l1_composed.Model newCromModel) {
    if (newCromModel != cromModel) {
      NotificationChain msgs = null;
      if (cromModel != null)
        msgs =
            ((InternalEObject) cromModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                - TestPackage.TEST_CASE__CROM_MODEL, null, msgs);
      if (newCromModel != null)
        msgs =
            ((InternalEObject) newCromModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                - TestPackage.TEST_CASE__CROM_MODEL, null, msgs);
      msgs = basicSetCromModel(newCromModel, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_CASE__CROM_MODEL,
          newCromModel, newCromModel));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
      NotificationChain msgs) {
    switch (featureID) {
      case TestPackage.TEST_CASE__FRAMED_MODEL:
        return basicSetFramedModel(null, msgs);
      case TestPackage.TEST_CASE__CROM_MODEL:
        return basicSetCromModel(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case TestPackage.TEST_CASE__TITLE:
        return getTitle();
      case TestPackage.TEST_CASE__DESCRIPTION:
        return getDescription();
      case TestPackage.TEST_CASE__FRAMED_MODEL:
        return getFramedModel();
      case TestPackage.TEST_CASE__CROM_MODEL:
        return getCromModel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case TestPackage.TEST_CASE__TITLE:
        setTitle((String) newValue);
        return;
      case TestPackage.TEST_CASE__DESCRIPTION:
        setDescription((String) newValue);
        return;
      case TestPackage.TEST_CASE__FRAMED_MODEL:
        setFramedModel((Model) newValue);
        return;
      case TestPackage.TEST_CASE__CROM_MODEL:
        setCromModel((crom_l1_composed.Model) newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case TestPackage.TEST_CASE__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case TestPackage.TEST_CASE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case TestPackage.TEST_CASE__FRAMED_MODEL:
        setFramedModel((Model) null);
        return;
      case TestPackage.TEST_CASE__CROM_MODEL:
        setCromModel((crom_l1_composed.Model) null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case TestPackage.TEST_CASE__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case TestPackage.TEST_CASE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT
            .equals(description);
      case TestPackage.TEST_CASE__FRAMED_MODEL:
        return framedModel != null;
      case TestPackage.TEST_CASE__CROM_MODEL:
        return cromModel != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (title: ");
    result.append(title);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} // TestCaseImpl
