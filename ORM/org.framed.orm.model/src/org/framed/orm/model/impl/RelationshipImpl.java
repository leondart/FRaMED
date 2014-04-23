/**
 */
package org.framed.orm.model.impl;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.framed.orm.model.Node;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Parthood;
import org.framed.orm.model.RelationContainer;
import org.framed.orm.model.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getRelationContainer <em>Relation Container</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSecondParthood <em>Second Parthood</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSecondLower <em>Second Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getFirstLower <em>First Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getFirstUpper <em>First Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSecondUpper <em>Second Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getFirstParthood <em>First Parthood</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSourceLabelValue <em>Source Label Value</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getTargetLabelValue <em>Target Label Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship {
  /**
   * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBendpoints()
   * @generated
   * @ordered
   */
  protected EList<Point> bendpoints;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Node target;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Node source;

  /**
   * The default value of the '{@link #getSecondParthood() <em>Second Parthood</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondParthood()
   * @generated
   * @ordered
   */
  protected static final Parthood SECOND_PARTHOOD_EDEFAULT = Parthood.UNCONSTRAINED;

  /**
   * The cached value of the '{@link #getSecondParthood() <em>Second Parthood</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondParthood()
   * @generated
   * @ordered
   */
  protected Parthood secondParthood = SECOND_PARTHOOD_EDEFAULT;

  /**
   * The default value of the '{@link #getSecondLower() <em>Second Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondLower()
   * @generated
   * @ordered
   */
  protected static final int SECOND_LOWER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSecondLower() <em>Second Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondLower()
   * @generated
   * @ordered
   */
  protected int secondLower = SECOND_LOWER_EDEFAULT;

  /**
   * The default value of the '{@link #getFirstLower() <em>First Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstLower()
   * @generated
   * @ordered
   */
  protected static final int FIRST_LOWER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFirstLower() <em>First Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstLower()
   * @generated
   * @ordered
   */
  protected int firstLower = FIRST_LOWER_EDEFAULT;

  /**
   * The default value of the '{@link #getFirstUpper() <em>First Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstUpper()
   * @generated
   * @ordered
   */
  protected static final int FIRST_UPPER_EDEFAULT = 1;

  /**
   * The cached value of the '{@link #getFirstUpper() <em>First Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstUpper()
   * @generated
   * @ordered
   */
  protected int firstUpper = FIRST_UPPER_EDEFAULT;

  /**
   * The default value of the '{@link #getSecondUpper() <em>Second Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondUpper()
   * @generated
   * @ordered
   */
  protected static final int SECOND_UPPER_EDEFAULT = 1;

  /**
   * The cached value of the '{@link #getSecondUpper() <em>Second Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondUpper()
   * @generated
   * @ordered
   */
  protected int secondUpper = SECOND_UPPER_EDEFAULT;

  /**
   * The default value of the '{@link #getFirstParthood() <em>First Parthood</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstParthood()
   * @generated
   * @ordered
   */
  protected static final Parthood FIRST_PARTHOOD_EDEFAULT = Parthood.UNCONSTRAINED;

  /**
   * The cached value of the '{@link #getFirstParthood() <em>First Parthood</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstParthood()
   * @generated
   * @ordered
   */
  protected Parthood firstParthood = FIRST_PARTHOOD_EDEFAULT;

  /**
   * The default value of the '{@link #getSourceLabelValue() <em>Source Label Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceLabelValue()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_LABEL_VALUE_EDEFAULT = "*";

  /**
   * The cached value of the '{@link #getSourceLabelValue() <em>Source Label Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceLabelValue()
   * @generated
   * @ordered
   */
  protected String sourceLabelValue = SOURCE_LABEL_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetLabelValue() <em>Target Label Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetLabelValue()
   * @generated
   * @ordered
   */
  protected static final String TARGET_LABEL_VALUE_EDEFAULT = "*";

  /**
   * The cached value of the '{@link #getTargetLabelValue() <em>Target Label Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetLabelValue()
   * @generated
   * @ordered
   */
  protected String targetLabelValue = TARGET_LABEL_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.RELATIONSHIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationContainer getRelationContainer() {
    if (eContainerFeatureID() != OrmPackage.RELATIONSHIP__RELATION_CONTAINER) return null;
    return (RelationContainer)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationContainer(RelationContainer newRelationContainer, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newRelationContainer, OrmPackage.RELATIONSHIP__RELATION_CONTAINER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationContainer(RelationContainer newRelationContainer) {
    if (newRelationContainer != eInternalContainer() || (eContainerFeatureID() != OrmPackage.RELATIONSHIP__RELATION_CONTAINER && newRelationContainer != null)) {
      if (EcoreUtil.isAncestor(this, newRelationContainer))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newRelationContainer != null)
        msgs = ((InternalEObject)newRelationContainer).eInverseAdd(this, OrmPackage.RELATION_CONTAINER__RELATIONS, RelationContainer.class, msgs);
      msgs = basicSetRelationContainer(newRelationContainer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RELATIONSHIP__RELATION_CONTAINER, newRelationContainer, newRelationContainer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Point> getBendpoints() {
    if (bendpoints == null) {
      bendpoints = new EDataTypeUniqueEList<Point>(Point.class, this, OrmPackage.RELATIONSHIP__BENDPOINTS);
    }
    return bendpoints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getTarget() {
    if (target != null && target.eIsProxy()) {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Node)eResolveProxy(oldTarget);
      if (target != oldTarget) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.RELATIONSHIP__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetTarget() {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(Node newTarget, NotificationChain msgs) {
    Node oldTarget = target;
    target = newTarget;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.RELATIONSHIP__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Node newTarget) {
    if (newTarget != target) {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, OrmPackage.NODE__INCOMING_LINKS, Node.class, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, OrmPackage.NODE__INCOMING_LINKS, Node.class, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RELATIONSHIP__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getSource() {
    if (source != null && source.eIsProxy()) {
      InternalEObject oldSource = (InternalEObject)source;
      source = (Node)eResolveProxy(oldSource);
      if (source != oldSource) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.RELATIONSHIP__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetSource() {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(Node newSource, NotificationChain msgs) {
    Node oldSource = source;
    source = newSource;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.RELATIONSHIP__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Node newSource) {
    if (newSource != source) {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, OrmPackage.NODE__OUTGOING_LINKS, Node.class, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, OrmPackage.NODE__OUTGOING_LINKS, Node.class, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RELATIONSHIP__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parthood getSecondParthood() {
    return secondParthood;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondParthood(Parthood newSecondParthood) {
    Parthood oldSecondParthood = secondParthood;
    secondParthood = newSecondParthood == null ? SECOND_PARTHOOD_EDEFAULT : newSecondParthood;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RELATIONSHIP__SECOND_PARTHOOD, oldSecondParthood, secondParthood));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSecondLower() {
    return secondLower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondLower(int newSecondLower) {
    int oldSecondLower = secondLower;
    secondLower = newSecondLower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RELATIONSHIP__SECOND_LOWER, oldSecondLower, secondLower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFirstLower() {
    return firstLower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstLower(int newFirstLower) {
    int oldFirstLower = firstLower;
    firstLower = newFirstLower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RELATIONSHIP__FIRST_LOWER, oldFirstLower, firstLower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFirstUpper() {
    return firstUpper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstUpper(int newFirstUpper) {
    int oldFirstUpper = firstUpper;
    firstUpper = newFirstUpper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RELATIONSHIP__FIRST_UPPER, oldFirstUpper, firstUpper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSecondUpper() {
    return secondUpper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondUpper(int newSecondUpper) {
    int oldSecondUpper = secondUpper;
    secondUpper = newSecondUpper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RELATIONSHIP__SECOND_UPPER, oldSecondUpper, secondUpper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parthood getFirstParthood() {
    return firstParthood;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstParthood(Parthood newFirstParthood) {
    Parthood oldFirstParthood = firstParthood;
    firstParthood = newFirstParthood == null ? FIRST_PARTHOOD_EDEFAULT : newFirstParthood;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RELATIONSHIP__FIRST_PARTHOOD, oldFirstParthood, firstParthood));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSourceLabelValue() {
    return sourceLabelValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceLabelValue(String newSourceLabelValue) {
    String oldSourceLabelValue = sourceLabelValue;
    sourceLabelValue = newSourceLabelValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RELATIONSHIP__SOURCE_LABEL_VALUE, oldSourceLabelValue, sourceLabelValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetLabelValue() {
    return targetLabelValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetLabelValue(String newTargetLabelValue) {
    String oldTargetLabelValue = targetLabelValue;
    targetLabelValue = newTargetLabelValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RELATIONSHIP__TARGET_LABEL_VALUE, oldTargetLabelValue, targetLabelValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.RELATIONSHIP__RELATION_CONTAINER:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetRelationContainer((RelationContainer)otherEnd, msgs);
      case OrmPackage.RELATIONSHIP__TARGET:
        if (target != null)
          msgs = ((InternalEObject)target).eInverseRemove(this, OrmPackage.NODE__INCOMING_LINKS, Node.class, msgs);
        return basicSetTarget((Node)otherEnd, msgs);
      case OrmPackage.RELATIONSHIP__SOURCE:
        if (source != null)
          msgs = ((InternalEObject)source).eInverseRemove(this, OrmPackage.NODE__OUTGOING_LINKS, Node.class, msgs);
        return basicSetSource((Node)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.RELATIONSHIP__RELATION_CONTAINER:
        return basicSetRelationContainer(null, msgs);
      case OrmPackage.RELATIONSHIP__TARGET:
        return basicSetTarget(null, msgs);
      case OrmPackage.RELATIONSHIP__SOURCE:
        return basicSetSource(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
      case OrmPackage.RELATIONSHIP__RELATION_CONTAINER:
        return eInternalContainer().eInverseRemove(this, OrmPackage.RELATION_CONTAINER__RELATIONS, RelationContainer.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.RELATIONSHIP__RELATION_CONTAINER:
        return getRelationContainer();
      case OrmPackage.RELATIONSHIP__BENDPOINTS:
        return getBendpoints();
      case OrmPackage.RELATIONSHIP__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case OrmPackage.RELATIONSHIP__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case OrmPackage.RELATIONSHIP__SECOND_PARTHOOD:
        return getSecondParthood();
      case OrmPackage.RELATIONSHIP__SECOND_LOWER:
        return getSecondLower();
      case OrmPackage.RELATIONSHIP__FIRST_LOWER:
        return getFirstLower();
      case OrmPackage.RELATIONSHIP__FIRST_UPPER:
        return getFirstUpper();
      case OrmPackage.RELATIONSHIP__SECOND_UPPER:
        return getSecondUpper();
      case OrmPackage.RELATIONSHIP__FIRST_PARTHOOD:
        return getFirstParthood();
      case OrmPackage.RELATIONSHIP__SOURCE_LABEL_VALUE:
        return getSourceLabelValue();
      case OrmPackage.RELATIONSHIP__TARGET_LABEL_VALUE:
        return getTargetLabelValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmPackage.RELATIONSHIP__RELATION_CONTAINER:
        setRelationContainer((RelationContainer)newValue);
        return;
      case OrmPackage.RELATIONSHIP__BENDPOINTS:
        getBendpoints().clear();
        getBendpoints().addAll((Collection<? extends Point>)newValue);
        return;
      case OrmPackage.RELATIONSHIP__TARGET:
        setTarget((Node)newValue);
        return;
      case OrmPackage.RELATIONSHIP__SOURCE:
        setSource((Node)newValue);
        return;
      case OrmPackage.RELATIONSHIP__SECOND_PARTHOOD:
        setSecondParthood((Parthood)newValue);
        return;
      case OrmPackage.RELATIONSHIP__SECOND_LOWER:
        setSecondLower((Integer)newValue);
        return;
      case OrmPackage.RELATIONSHIP__FIRST_LOWER:
        setFirstLower((Integer)newValue);
        return;
      case OrmPackage.RELATIONSHIP__FIRST_UPPER:
        setFirstUpper((Integer)newValue);
        return;
      case OrmPackage.RELATIONSHIP__SECOND_UPPER:
        setSecondUpper((Integer)newValue);
        return;
      case OrmPackage.RELATIONSHIP__FIRST_PARTHOOD:
        setFirstParthood((Parthood)newValue);
        return;
      case OrmPackage.RELATIONSHIP__SOURCE_LABEL_VALUE:
        setSourceLabelValue((String)newValue);
        return;
      case OrmPackage.RELATIONSHIP__TARGET_LABEL_VALUE:
        setTargetLabelValue((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case OrmPackage.RELATIONSHIP__RELATION_CONTAINER:
        setRelationContainer((RelationContainer)null);
        return;
      case OrmPackage.RELATIONSHIP__BENDPOINTS:
        getBendpoints().clear();
        return;
      case OrmPackage.RELATIONSHIP__TARGET:
        setTarget((Node)null);
        return;
      case OrmPackage.RELATIONSHIP__SOURCE:
        setSource((Node)null);
        return;
      case OrmPackage.RELATIONSHIP__SECOND_PARTHOOD:
        setSecondParthood(SECOND_PARTHOOD_EDEFAULT);
        return;
      case OrmPackage.RELATIONSHIP__SECOND_LOWER:
        setSecondLower(SECOND_LOWER_EDEFAULT);
        return;
      case OrmPackage.RELATIONSHIP__FIRST_LOWER:
        setFirstLower(FIRST_LOWER_EDEFAULT);
        return;
      case OrmPackage.RELATIONSHIP__FIRST_UPPER:
        setFirstUpper(FIRST_UPPER_EDEFAULT);
        return;
      case OrmPackage.RELATIONSHIP__SECOND_UPPER:
        setSecondUpper(SECOND_UPPER_EDEFAULT);
        return;
      case OrmPackage.RELATIONSHIP__FIRST_PARTHOOD:
        setFirstParthood(FIRST_PARTHOOD_EDEFAULT);
        return;
      case OrmPackage.RELATIONSHIP__SOURCE_LABEL_VALUE:
        setSourceLabelValue(SOURCE_LABEL_VALUE_EDEFAULT);
        return;
      case OrmPackage.RELATIONSHIP__TARGET_LABEL_VALUE:
        setTargetLabelValue(TARGET_LABEL_VALUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case OrmPackage.RELATIONSHIP__RELATION_CONTAINER:
        return getRelationContainer() != null;
      case OrmPackage.RELATIONSHIP__BENDPOINTS:
        return bendpoints != null && !bendpoints.isEmpty();
      case OrmPackage.RELATIONSHIP__TARGET:
        return target != null;
      case OrmPackage.RELATIONSHIP__SOURCE:
        return source != null;
      case OrmPackage.RELATIONSHIP__SECOND_PARTHOOD:
        return secondParthood != SECOND_PARTHOOD_EDEFAULT;
      case OrmPackage.RELATIONSHIP__SECOND_LOWER:
        return secondLower != SECOND_LOWER_EDEFAULT;
      case OrmPackage.RELATIONSHIP__FIRST_LOWER:
        return firstLower != FIRST_LOWER_EDEFAULT;
      case OrmPackage.RELATIONSHIP__FIRST_UPPER:
        return firstUpper != FIRST_UPPER_EDEFAULT;
      case OrmPackage.RELATIONSHIP__SECOND_UPPER:
        return secondUpper != SECOND_UPPER_EDEFAULT;
      case OrmPackage.RELATIONSHIP__FIRST_PARTHOOD:
        return firstParthood != FIRST_PARTHOOD_EDEFAULT;
      case OrmPackage.RELATIONSHIP__SOURCE_LABEL_VALUE:
        return SOURCE_LABEL_VALUE_EDEFAULT == null ? sourceLabelValue != null : !SOURCE_LABEL_VALUE_EDEFAULT.equals(sourceLabelValue);
      case OrmPackage.RELATIONSHIP__TARGET_LABEL_VALUE:
        return TARGET_LABEL_VALUE_EDEFAULT == null ? targetLabelValue != null : !TARGET_LABEL_VALUE_EDEFAULT.equals(targetLabelValue);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (bendpoints: ");
    result.append(bendpoints);
    result.append(", secondParthood: ");
    result.append(secondParthood);
    result.append(", secondLower: ");
    result.append(secondLower);
    result.append(", firstLower: ");
    result.append(firstLower);
    result.append(", firstUpper: ");
    result.append(firstUpper);
    result.append(", secondUpper: ");
    result.append(secondUpper);
    result.append(", firstParthood: ");
    result.append(firstParthood);
    result.append(", sourceLabelValue: ");
    result.append(sourceLabelValue);
    result.append(", targetLabelValue: ");
    result.append(targetLabelValue);
    result.append(')');
    return result.toString();
  }

} //RelationshipImpl
