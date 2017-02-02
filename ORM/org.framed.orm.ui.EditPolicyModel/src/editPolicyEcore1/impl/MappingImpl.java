/**
 */
package editPolicyEcore1.impl;

import editPolicyEcore1.AbstractMappingRule;
import editPolicyEcore1.EditPolicyEcore1Package;
import editPolicyEcore1.Mapping;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link editPolicyEcore1.impl.MappingImpl#getPolicyName <em>Policy Name</em>}</li>
 *   <li>{@link editPolicyEcore1.impl.MappingImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends EObjectImpl implements Mapping {
	/**
	 * The default value of the '{@link #getPolicyName() <em>Policy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyName()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyName() <em>Policy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyName()
	 * @generated
	 * @ordered
	 */
	protected String policyName = POLICY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected AbstractMappingRule rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditPolicyEcore1Package.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyName() {
		return policyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyName(String newPolicyName) {
		String oldPolicyName = policyName;
		policyName = newPolicyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditPolicyEcore1Package.MAPPING__POLICY_NAME, oldPolicyName, policyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMappingRule getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(AbstractMappingRule newRule, NotificationChain msgs) {
		AbstractMappingRule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditPolicyEcore1Package.MAPPING__RULE, oldRule, newRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(AbstractMappingRule newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditPolicyEcore1Package.MAPPING__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditPolicyEcore1Package.MAPPING__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditPolicyEcore1Package.MAPPING__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EditPolicyEcore1Package.MAPPING__RULE:
				return basicSetRule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EditPolicyEcore1Package.MAPPING__POLICY_NAME:
				return getPolicyName();
			case EditPolicyEcore1Package.MAPPING__RULE:
				return getRule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EditPolicyEcore1Package.MAPPING__POLICY_NAME:
				setPolicyName((String)newValue);
				return;
			case EditPolicyEcore1Package.MAPPING__RULE:
				setRule((AbstractMappingRule)newValue);
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
			case EditPolicyEcore1Package.MAPPING__POLICY_NAME:
				setPolicyName(POLICY_NAME_EDEFAULT);
				return;
			case EditPolicyEcore1Package.MAPPING__RULE:
				setRule((AbstractMappingRule)null);
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
			case EditPolicyEcore1Package.MAPPING__POLICY_NAME:
				return POLICY_NAME_EDEFAULT == null ? policyName != null : !POLICY_NAME_EDEFAULT.equals(policyName);
			case EditPolicyEcore1Package.MAPPING__RULE:
				return rule != null;
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
		result.append(" (policyName: ");
		result.append(policyName);
		result.append(')');
		return result.toString();
	}

} //MappingImpl
