/**
 */
package orm.model.impl;

import java.util.Collection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import orm.model.AbstractRole;
import orm.model.Constraint;
import orm.model.Node;
import orm.model.OrmPackage;
import orm.model.Relation;
import orm.model.RelationContainer;
import orm.model.RoleGroup;
import orm.model.RoleType;
import orm.model.Rolemodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orm.model.impl.RoleTypeImpl#getRelationContainer <em>Relation Container</em>}</li>
 *   <li>{@link orm.model.impl.RoleTypeImpl#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link orm.model.impl.RoleTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link orm.model.impl.RoleTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link orm.model.impl.RoleTypeImpl#getFirst <em>First</em>}</li>
 *   <li>{@link orm.model.impl.RoleTypeImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link orm.model.impl.RoleTypeImpl#getParentRolemodel <em>Parent Rolemodel</em>}</li>
 *   <li>{@link orm.model.impl.RoleTypeImpl#getParentRoleGroup <em>Parent Role Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleTypeImpl extends TypeImpl implements RoleType {
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
	 * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected RoleType first;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected RoleType second;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.ROLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationContainer getRelationContainer() {
		if (eContainerFeatureID() != OrmPackage.ROLE_TYPE__RELATION_CONTAINER) return null;
		return (RelationContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationContainer(RelationContainer newRelationContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRelationContainer, OrmPackage.ROLE_TYPE__RELATION_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationContainer(RelationContainer newRelationContainer) {
		if (newRelationContainer != eInternalContainer() || (eContainerFeatureID() != OrmPackage.ROLE_TYPE__RELATION_CONTAINER && newRelationContainer != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_TYPE__RELATION_CONTAINER, newRelationContainer, newRelationContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getBendpoints() {
		if (bendpoints == null) {
			bendpoints = new EDataTypeUniqueEList<Point>(Point.class, this, OrmPackage.ROLE_TYPE__BENDPOINTS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.ROLE_TYPE__TARGET, oldTarget, target));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_TYPE__TARGET, oldTarget, newTarget);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_TYPE__TARGET, newTarget, newTarget));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.ROLE_TYPE__SOURCE, oldSource, source));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_TYPE__SOURCE, oldSource, newSource);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_TYPE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getFirst() {
		if (first != null && first.eIsProxy()) {
			InternalEObject oldFirst = (InternalEObject)first;
			first = (RoleType)eResolveProxy(oldFirst);
			if (first != oldFirst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.ROLE_TYPE__FIRST, oldFirst, first));
			}
		}
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(RoleType newFirst) {
		RoleType oldFirst = first;
		first = newFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_TYPE__FIRST, oldFirst, first));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getSecond() {
		if (second != null && second.eIsProxy()) {
			InternalEObject oldSecond = (InternalEObject)second;
			second = (RoleType)eResolveProxy(oldSecond);
			if (second != oldSecond) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.ROLE_TYPE__SECOND, oldSecond, second));
			}
		}
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(RoleType newSecond) {
		RoleType oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_TYPE__SECOND, oldSecond, second));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rolemodel getParentRolemodel() {
		if (eContainerFeatureID() != OrmPackage.ROLE_TYPE__PARENT_ROLEMODEL) return null;
		return (Rolemodel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRolemodel(Rolemodel newParentRolemodel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRolemodel, OrmPackage.ROLE_TYPE__PARENT_ROLEMODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRolemodel(Rolemodel newParentRolemodel) {
		if (newParentRolemodel != eInternalContainer() || (eContainerFeatureID() != OrmPackage.ROLE_TYPE__PARENT_ROLEMODEL && newParentRolemodel != null)) {
			if (EcoreUtil.isAncestor(this, newParentRolemodel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentRolemodel != null)
				msgs = ((InternalEObject)newParentRolemodel).eInverseAdd(this, OrmPackage.ROLEMODEL__PARTICIPANTS, Rolemodel.class, msgs);
			msgs = basicSetParentRolemodel(newParentRolemodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_TYPE__PARENT_ROLEMODEL, newParentRolemodel, newParentRolemodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleGroup getParentRoleGroup() {
		if (eContainerFeatureID() != OrmPackage.ROLE_TYPE__PARENT_ROLE_GROUP) return null;
		return (RoleGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRoleGroup(RoleGroup newParentRoleGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRoleGroup, OrmPackage.ROLE_TYPE__PARENT_ROLE_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRoleGroup(RoleGroup newParentRoleGroup) {
		if (newParentRoleGroup != eInternalContainer() || (eContainerFeatureID() != OrmPackage.ROLE_TYPE__PARENT_ROLE_GROUP && newParentRoleGroup != null)) {
			if (EcoreUtil.isAncestor(this, newParentRoleGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentRoleGroup != null)
				msgs = ((InternalEObject)newParentRoleGroup).eInverseAdd(this, OrmPackage.ROLE_GROUP__ITEMS, RoleGroup.class, msgs);
			msgs = basicSetParentRoleGroup(newParentRoleGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_TYPE__PARENT_ROLE_GROUP, newParentRoleGroup, newParentRoleGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.ROLE_TYPE__RELATION_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRelationContainer((RelationContainer)otherEnd, msgs);
			case OrmPackage.ROLE_TYPE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, OrmPackage.NODE__INCOMING_LINKS, Node.class, msgs);
				return basicSetTarget((Node)otherEnd, msgs);
			case OrmPackage.ROLE_TYPE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, OrmPackage.NODE__OUTGOING_LINKS, Node.class, msgs);
				return basicSetSource((Node)otherEnd, msgs);
			case OrmPackage.ROLE_TYPE__PARENT_ROLEMODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRolemodel((Rolemodel)otherEnd, msgs);
			case OrmPackage.ROLE_TYPE__PARENT_ROLE_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRoleGroup((RoleGroup)otherEnd, msgs);
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
			case OrmPackage.ROLE_TYPE__RELATION_CONTAINER:
				return basicSetRelationContainer(null, msgs);
			case OrmPackage.ROLE_TYPE__TARGET:
				return basicSetTarget(null, msgs);
			case OrmPackage.ROLE_TYPE__SOURCE:
				return basicSetSource(null, msgs);
			case OrmPackage.ROLE_TYPE__PARENT_ROLEMODEL:
				return basicSetParentRolemodel(null, msgs);
			case OrmPackage.ROLE_TYPE__PARENT_ROLE_GROUP:
				return basicSetParentRoleGroup(null, msgs);
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
			case OrmPackage.ROLE_TYPE__RELATION_CONTAINER:
				return eInternalContainer().eInverseRemove(this, OrmPackage.RELATION_CONTAINER__RELATIONS, RelationContainer.class, msgs);
			case OrmPackage.ROLE_TYPE__PARENT_ROLEMODEL:
				return eInternalContainer().eInverseRemove(this, OrmPackage.ROLEMODEL__PARTICIPANTS, Rolemodel.class, msgs);
			case OrmPackage.ROLE_TYPE__PARENT_ROLE_GROUP:
				return eInternalContainer().eInverseRemove(this, OrmPackage.ROLE_GROUP__ITEMS, RoleGroup.class, msgs);
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
			case OrmPackage.ROLE_TYPE__RELATION_CONTAINER:
				return getRelationContainer();
			case OrmPackage.ROLE_TYPE__BENDPOINTS:
				return getBendpoints();
			case OrmPackage.ROLE_TYPE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case OrmPackage.ROLE_TYPE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OrmPackage.ROLE_TYPE__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case OrmPackage.ROLE_TYPE__SECOND:
				if (resolve) return getSecond();
				return basicGetSecond();
			case OrmPackage.ROLE_TYPE__PARENT_ROLEMODEL:
				return getParentRolemodel();
			case OrmPackage.ROLE_TYPE__PARENT_ROLE_GROUP:
				return getParentRoleGroup();
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
			case OrmPackage.ROLE_TYPE__RELATION_CONTAINER:
				setRelationContainer((RelationContainer)newValue);
				return;
			case OrmPackage.ROLE_TYPE__BENDPOINTS:
				getBendpoints().clear();
				getBendpoints().addAll((Collection<? extends Point>)newValue);
				return;
			case OrmPackage.ROLE_TYPE__TARGET:
				setTarget((Node)newValue);
				return;
			case OrmPackage.ROLE_TYPE__SOURCE:
				setSource((Node)newValue);
				return;
			case OrmPackage.ROLE_TYPE__FIRST:
				setFirst((RoleType)newValue);
				return;
			case OrmPackage.ROLE_TYPE__SECOND:
				setSecond((RoleType)newValue);
				return;
			case OrmPackage.ROLE_TYPE__PARENT_ROLEMODEL:
				setParentRolemodel((Rolemodel)newValue);
				return;
			case OrmPackage.ROLE_TYPE__PARENT_ROLE_GROUP:
				setParentRoleGroup((RoleGroup)newValue);
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
			case OrmPackage.ROLE_TYPE__RELATION_CONTAINER:
				setRelationContainer((RelationContainer)null);
				return;
			case OrmPackage.ROLE_TYPE__BENDPOINTS:
				getBendpoints().clear();
				return;
			case OrmPackage.ROLE_TYPE__TARGET:
				setTarget((Node)null);
				return;
			case OrmPackage.ROLE_TYPE__SOURCE:
				setSource((Node)null);
				return;
			case OrmPackage.ROLE_TYPE__FIRST:
				setFirst((RoleType)null);
				return;
			case OrmPackage.ROLE_TYPE__SECOND:
				setSecond((RoleType)null);
				return;
			case OrmPackage.ROLE_TYPE__PARENT_ROLEMODEL:
				setParentRolemodel((Rolemodel)null);
				return;
			case OrmPackage.ROLE_TYPE__PARENT_ROLE_GROUP:
				setParentRoleGroup((RoleGroup)null);
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
			case OrmPackage.ROLE_TYPE__RELATION_CONTAINER:
				return getRelationContainer() != null;
			case OrmPackage.ROLE_TYPE__BENDPOINTS:
				return bendpoints != null && !bendpoints.isEmpty();
			case OrmPackage.ROLE_TYPE__TARGET:
				return target != null;
			case OrmPackage.ROLE_TYPE__SOURCE:
				return source != null;
			case OrmPackage.ROLE_TYPE__FIRST:
				return first != null;
			case OrmPackage.ROLE_TYPE__SECOND:
				return second != null;
			case OrmPackage.ROLE_TYPE__PARENT_ROLEMODEL:
				return getParentRolemodel() != null;
			case OrmPackage.ROLE_TYPE__PARENT_ROLE_GROUP:
				return getParentRoleGroup() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Relation.class) {
			switch (derivedFeatureID) {
				case OrmPackage.ROLE_TYPE__RELATION_CONTAINER: return OrmPackage.RELATION__RELATION_CONTAINER;
				case OrmPackage.ROLE_TYPE__BENDPOINTS: return OrmPackage.RELATION__BENDPOINTS;
				case OrmPackage.ROLE_TYPE__TARGET: return OrmPackage.RELATION__TARGET;
				case OrmPackage.ROLE_TYPE__SOURCE: return OrmPackage.RELATION__SOURCE;
				default: return -1;
			}
		}
		if (baseClass == Constraint.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractRole.class) {
			switch (derivedFeatureID) {
				case OrmPackage.ROLE_TYPE__FIRST: return OrmPackage.ABSTRACT_ROLE__FIRST;
				case OrmPackage.ROLE_TYPE__SECOND: return OrmPackage.ABSTRACT_ROLE__SECOND;
				case OrmPackage.ROLE_TYPE__PARENT_ROLEMODEL: return OrmPackage.ABSTRACT_ROLE__PARENT_ROLEMODEL;
				case OrmPackage.ROLE_TYPE__PARENT_ROLE_GROUP: return OrmPackage.ABSTRACT_ROLE__PARENT_ROLE_GROUP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Relation.class) {
			switch (baseFeatureID) {
				case OrmPackage.RELATION__RELATION_CONTAINER: return OrmPackage.ROLE_TYPE__RELATION_CONTAINER;
				case OrmPackage.RELATION__BENDPOINTS: return OrmPackage.ROLE_TYPE__BENDPOINTS;
				case OrmPackage.RELATION__TARGET: return OrmPackage.ROLE_TYPE__TARGET;
				case OrmPackage.RELATION__SOURCE: return OrmPackage.ROLE_TYPE__SOURCE;
				default: return -1;
			}
		}
		if (baseClass == Constraint.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractRole.class) {
			switch (baseFeatureID) {
				case OrmPackage.ABSTRACT_ROLE__FIRST: return OrmPackage.ROLE_TYPE__FIRST;
				case OrmPackage.ABSTRACT_ROLE__SECOND: return OrmPackage.ROLE_TYPE__SECOND;
				case OrmPackage.ABSTRACT_ROLE__PARENT_ROLEMODEL: return OrmPackage.ROLE_TYPE__PARENT_ROLEMODEL;
				case OrmPackage.ABSTRACT_ROLE__PARENT_ROLE_GROUP: return OrmPackage.ROLE_TYPE__PARENT_ROLE_GROUP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(')');
		return result.toString();
	}

} //RoleTypeImpl
