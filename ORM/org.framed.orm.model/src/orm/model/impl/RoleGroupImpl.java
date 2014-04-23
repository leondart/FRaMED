/**
 */
package orm.model.impl;

import java.util.Collection;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import orm.model.AbstractRole;
import orm.model.Node;
import orm.model.OrmPackage;
import orm.model.Relation;
import orm.model.RelationContainer;
import orm.model.RoleGroup;
import orm.model.RoleType;
import orm.model.Rolemodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link orm.model.impl.RoleGroupImpl#getFirst <em>First</em>}</li>
 *   <li>{@link orm.model.impl.RoleGroupImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link orm.model.impl.RoleGroupImpl#getParentRolemodel <em>Parent Rolemodel</em>}</li>
 *   <li>{@link orm.model.impl.RoleGroupImpl#getParentRoleGroup <em>Parent Role Group</em>}</li>
 *   <li>{@link orm.model.impl.RoleGroupImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link orm.model.impl.RoleGroupImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link orm.model.impl.RoleGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link orm.model.impl.RoleGroupImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link orm.model.impl.RoleGroupImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link orm.model.impl.RoleGroupImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link orm.model.impl.RoleGroupImpl#getItems <em>Items</em>}</li>
 *   <li>{@link orm.model.impl.RoleGroupImpl#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleGroupImpl extends ConstraintImpl implements RoleGroup {
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
	 * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> incomingLinks;

	/**
	 * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> outgoingLinks;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "<...>";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle CONSTRAINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected Rectangle constraints = CONSTRAINTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected int lower = LOWER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractRole> items;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected int upper = UPPER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.ROLE_GROUP;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.ROLE_GROUP__FIRST, oldFirst, first));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_GROUP__FIRST, oldFirst, first));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.ROLE_GROUP__SECOND, oldSecond, second));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_GROUP__SECOND, oldSecond, second));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rolemodel getParentRolemodel() {
		if (eContainerFeatureID() != OrmPackage.ROLE_GROUP__PARENT_ROLEMODEL) return null;
		return (Rolemodel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRolemodel(Rolemodel newParentRolemodel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRolemodel, OrmPackage.ROLE_GROUP__PARENT_ROLEMODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRolemodel(Rolemodel newParentRolemodel) {
		if (newParentRolemodel != eInternalContainer() || (eContainerFeatureID() != OrmPackage.ROLE_GROUP__PARENT_ROLEMODEL && newParentRolemodel != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_GROUP__PARENT_ROLEMODEL, newParentRolemodel, newParentRolemodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleGroup getParentRoleGroup() {
		if (eContainerFeatureID() != OrmPackage.ROLE_GROUP__PARENT_ROLE_GROUP) return null;
		return (RoleGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRoleGroup(RoleGroup newParentRoleGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRoleGroup, OrmPackage.ROLE_GROUP__PARENT_ROLE_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRoleGroup(RoleGroup newParentRoleGroup) {
		if (newParentRoleGroup != eInternalContainer() || (eContainerFeatureID() != OrmPackage.ROLE_GROUP__PARENT_ROLE_GROUP && newParentRoleGroup != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_GROUP__PARENT_ROLE_GROUP, newParentRoleGroup, newParentRoleGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getIncomingLinks() {
		if (incomingLinks == null) {
			incomingLinks = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, OrmPackage.ROLE_GROUP__INCOMING_LINKS, OrmPackage.RELATION__TARGET);
		}
		return incomingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getOutgoingLinks() {
		if (outgoingLinks == null) {
			outgoingLinks = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, OrmPackage.ROLE_GROUP__OUTGOING_LINKS, OrmPackage.RELATION__SOURCE);
		}
		return outgoingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		int oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_GROUP__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractRole> getItems() {
		if (items == null) {
			items = new EObjectContainmentWithInverseEList<AbstractRole>(AbstractRole.class, this, OrmPackage.ROLE_GROUP__ITEMS, OrmPackage.ABSTRACT_ROLE__PARENT_ROLE_GROUP);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		int oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_GROUP__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(Rectangle newConstraints) {
		Rectangle oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_GROUP__CONSTRAINTS, oldConstraints, constraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentWithInverseEList<Relation>(Relation.class, this, OrmPackage.ROLE_GROUP__RELATIONS, OrmPackage.RELATION__RELATION_CONTAINER);
		}
		return relations;
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
			case OrmPackage.ROLE_GROUP__PARENT_ROLEMODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRolemodel((Rolemodel)otherEnd, msgs);
			case OrmPackage.ROLE_GROUP__PARENT_ROLE_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRoleGroup((RoleGroup)otherEnd, msgs);
			case OrmPackage.ROLE_GROUP__INCOMING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
			case OrmPackage.ROLE_GROUP__OUTGOING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLinks()).basicAdd(otherEnd, msgs);
			case OrmPackage.ROLE_GROUP__RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelations()).basicAdd(otherEnd, msgs);
			case OrmPackage.ROLE_GROUP__ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItems()).basicAdd(otherEnd, msgs);
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
			case OrmPackage.ROLE_GROUP__PARENT_ROLEMODEL:
				return basicSetParentRolemodel(null, msgs);
			case OrmPackage.ROLE_GROUP__PARENT_ROLE_GROUP:
				return basicSetParentRoleGroup(null, msgs);
			case OrmPackage.ROLE_GROUP__INCOMING_LINKS:
				return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
			case OrmPackage.ROLE_GROUP__OUTGOING_LINKS:
				return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
			case OrmPackage.ROLE_GROUP__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case OrmPackage.ROLE_GROUP__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case OrmPackage.ROLE_GROUP__PARENT_ROLEMODEL:
				return eInternalContainer().eInverseRemove(this, OrmPackage.ROLEMODEL__PARTICIPANTS, Rolemodel.class, msgs);
			case OrmPackage.ROLE_GROUP__PARENT_ROLE_GROUP:
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
			case OrmPackage.ROLE_GROUP__FIRST:
				if (resolve) return getFirst();
				return basicGetFirst();
			case OrmPackage.ROLE_GROUP__SECOND:
				if (resolve) return getSecond();
				return basicGetSecond();
			case OrmPackage.ROLE_GROUP__PARENT_ROLEMODEL:
				return getParentRolemodel();
			case OrmPackage.ROLE_GROUP__PARENT_ROLE_GROUP:
				return getParentRoleGroup();
			case OrmPackage.ROLE_GROUP__INCOMING_LINKS:
				return getIncomingLinks();
			case OrmPackage.ROLE_GROUP__OUTGOING_LINKS:
				return getOutgoingLinks();
			case OrmPackage.ROLE_GROUP__NAME:
				return getName();
			case OrmPackage.ROLE_GROUP__CONSTRAINTS:
				return getConstraints();
			case OrmPackage.ROLE_GROUP__RELATIONS:
				return getRelations();
			case OrmPackage.ROLE_GROUP__LOWER:
				return getLower();
			case OrmPackage.ROLE_GROUP__ITEMS:
				return getItems();
			case OrmPackage.ROLE_GROUP__UPPER:
				return getUpper();
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
			case OrmPackage.ROLE_GROUP__FIRST:
				setFirst((RoleType)newValue);
				return;
			case OrmPackage.ROLE_GROUP__SECOND:
				setSecond((RoleType)newValue);
				return;
			case OrmPackage.ROLE_GROUP__PARENT_ROLEMODEL:
				setParentRolemodel((Rolemodel)newValue);
				return;
			case OrmPackage.ROLE_GROUP__PARENT_ROLE_GROUP:
				setParentRoleGroup((RoleGroup)newValue);
				return;
			case OrmPackage.ROLE_GROUP__INCOMING_LINKS:
				getIncomingLinks().clear();
				getIncomingLinks().addAll((Collection<? extends Relation>)newValue);
				return;
			case OrmPackage.ROLE_GROUP__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				getOutgoingLinks().addAll((Collection<? extends Relation>)newValue);
				return;
			case OrmPackage.ROLE_GROUP__NAME:
				setName((String)newValue);
				return;
			case OrmPackage.ROLE_GROUP__CONSTRAINTS:
				setConstraints((Rectangle)newValue);
				return;
			case OrmPackage.ROLE_GROUP__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case OrmPackage.ROLE_GROUP__LOWER:
				setLower((Integer)newValue);
				return;
			case OrmPackage.ROLE_GROUP__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends AbstractRole>)newValue);
				return;
			case OrmPackage.ROLE_GROUP__UPPER:
				setUpper((Integer)newValue);
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
			case OrmPackage.ROLE_GROUP__FIRST:
				setFirst((RoleType)null);
				return;
			case OrmPackage.ROLE_GROUP__SECOND:
				setSecond((RoleType)null);
				return;
			case OrmPackage.ROLE_GROUP__PARENT_ROLEMODEL:
				setParentRolemodel((Rolemodel)null);
				return;
			case OrmPackage.ROLE_GROUP__PARENT_ROLE_GROUP:
				setParentRoleGroup((RoleGroup)null);
				return;
			case OrmPackage.ROLE_GROUP__INCOMING_LINKS:
				getIncomingLinks().clear();
				return;
			case OrmPackage.ROLE_GROUP__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				return;
			case OrmPackage.ROLE_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OrmPackage.ROLE_GROUP__CONSTRAINTS:
				setConstraints(CONSTRAINTS_EDEFAULT);
				return;
			case OrmPackage.ROLE_GROUP__RELATIONS:
				getRelations().clear();
				return;
			case OrmPackage.ROLE_GROUP__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case OrmPackage.ROLE_GROUP__ITEMS:
				getItems().clear();
				return;
			case OrmPackage.ROLE_GROUP__UPPER:
				setUpper(UPPER_EDEFAULT);
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
			case OrmPackage.ROLE_GROUP__FIRST:
				return first != null;
			case OrmPackage.ROLE_GROUP__SECOND:
				return second != null;
			case OrmPackage.ROLE_GROUP__PARENT_ROLEMODEL:
				return getParentRolemodel() != null;
			case OrmPackage.ROLE_GROUP__PARENT_ROLE_GROUP:
				return getParentRoleGroup() != null;
			case OrmPackage.ROLE_GROUP__INCOMING_LINKS:
				return incomingLinks != null && !incomingLinks.isEmpty();
			case OrmPackage.ROLE_GROUP__OUTGOING_LINKS:
				return outgoingLinks != null && !outgoingLinks.isEmpty();
			case OrmPackage.ROLE_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OrmPackage.ROLE_GROUP__CONSTRAINTS:
				return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
			case OrmPackage.ROLE_GROUP__RELATIONS:
				return relations != null && !relations.isEmpty();
			case OrmPackage.ROLE_GROUP__LOWER:
				return lower != LOWER_EDEFAULT;
			case OrmPackage.ROLE_GROUP__ITEMS:
				return items != null && !items.isEmpty();
			case OrmPackage.ROLE_GROUP__UPPER:
				return upper != UPPER_EDEFAULT;
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
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case OrmPackage.ROLE_GROUP__INCOMING_LINKS: return OrmPackage.NODE__INCOMING_LINKS;
				case OrmPackage.ROLE_GROUP__OUTGOING_LINKS: return OrmPackage.NODE__OUTGOING_LINKS;
				case OrmPackage.ROLE_GROUP__NAME: return OrmPackage.NODE__NAME;
				case OrmPackage.ROLE_GROUP__CONSTRAINTS: return OrmPackage.NODE__CONSTRAINTS;
				default: return -1;
			}
		}
		if (baseClass == RelationContainer.class) {
			switch (derivedFeatureID) {
				case OrmPackage.ROLE_GROUP__RELATIONS: return OrmPackage.RELATION_CONTAINER__RELATIONS;
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
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case OrmPackage.NODE__INCOMING_LINKS: return OrmPackage.ROLE_GROUP__INCOMING_LINKS;
				case OrmPackage.NODE__OUTGOING_LINKS: return OrmPackage.ROLE_GROUP__OUTGOING_LINKS;
				case OrmPackage.NODE__NAME: return OrmPackage.ROLE_GROUP__NAME;
				case OrmPackage.NODE__CONSTRAINTS: return OrmPackage.ROLE_GROUP__CONSTRAINTS;
				default: return -1;
			}
		}
		if (baseClass == RelationContainer.class) {
			switch (baseFeatureID) {
				case OrmPackage.RELATION_CONTAINER__RELATIONS: return OrmPackage.ROLE_GROUP__RELATIONS;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", constraints: ");
		result.append(constraints);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(')');
		return result.toString();
	}

} //RoleGroupImpl
