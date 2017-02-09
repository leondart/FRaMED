/**
 */
package editPolicyEcore1.impl;

import editPolicyEcore1.AbstractRule;
import editPolicyEcore1.EditPolicyEcore1Package;
import editPolicyEcore1.ImplicationRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implication Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link editPolicyEcore1.impl.ImplicationRuleImpl#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link editPolicyEcore1.impl.ImplicationRuleImpl#getConsequent <em>Consequent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplicationRuleImpl extends AbstractRuleImpl implements ImplicationRule {
	/**
	 * The cached value of the '{@link #getAntecedent() <em>Antecedent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedent()
	 * @generated
	 * @ordered
	 */
	protected AbstractRule antecedent;

	/**
	 * The cached value of the '{@link #getConsequent() <em>Consequent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequent()
	 * @generated
	 * @ordered
	 */
	protected AbstractRule consequent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditPolicyEcore1Package.Literals.IMPLICATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRule getAntecedent() {
		return antecedent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntecedent(AbstractRule newAntecedent, NotificationChain msgs) {
		AbstractRule oldAntecedent = antecedent;
		antecedent = newAntecedent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditPolicyEcore1Package.IMPLICATION_RULE__ANTECEDENT, oldAntecedent, newAntecedent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedent(AbstractRule newAntecedent) {
		if (newAntecedent != antecedent) {
			NotificationChain msgs = null;
			if (antecedent != null)
				msgs = ((InternalEObject)antecedent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditPolicyEcore1Package.IMPLICATION_RULE__ANTECEDENT, null, msgs);
			if (newAntecedent != null)
				msgs = ((InternalEObject)newAntecedent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditPolicyEcore1Package.IMPLICATION_RULE__ANTECEDENT, null, msgs);
			msgs = basicSetAntecedent(newAntecedent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditPolicyEcore1Package.IMPLICATION_RULE__ANTECEDENT, newAntecedent, newAntecedent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRule getConsequent() {
		return consequent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsequent(AbstractRule newConsequent, NotificationChain msgs) {
		AbstractRule oldConsequent = consequent;
		consequent = newConsequent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EditPolicyEcore1Package.IMPLICATION_RULE__CONSEQUENT, oldConsequent, newConsequent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequent(AbstractRule newConsequent) {
		if (newConsequent != consequent) {
			NotificationChain msgs = null;
			if (consequent != null)
				msgs = ((InternalEObject)consequent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EditPolicyEcore1Package.IMPLICATION_RULE__CONSEQUENT, null, msgs);
			if (newConsequent != null)
				msgs = ((InternalEObject)newConsequent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EditPolicyEcore1Package.IMPLICATION_RULE__CONSEQUENT, null, msgs);
			msgs = basicSetConsequent(newConsequent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditPolicyEcore1Package.IMPLICATION_RULE__CONSEQUENT, newConsequent, newConsequent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EditPolicyEcore1Package.IMPLICATION_RULE__ANTECEDENT:
				return basicSetAntecedent(null, msgs);
			case EditPolicyEcore1Package.IMPLICATION_RULE__CONSEQUENT:
				return basicSetConsequent(null, msgs);
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
			case EditPolicyEcore1Package.IMPLICATION_RULE__ANTECEDENT:
				return getAntecedent();
			case EditPolicyEcore1Package.IMPLICATION_RULE__CONSEQUENT:
				return getConsequent();
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
			case EditPolicyEcore1Package.IMPLICATION_RULE__ANTECEDENT:
				setAntecedent((AbstractRule)newValue);
				return;
			case EditPolicyEcore1Package.IMPLICATION_RULE__CONSEQUENT:
				setConsequent((AbstractRule)newValue);
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
			case EditPolicyEcore1Package.IMPLICATION_RULE__ANTECEDENT:
				setAntecedent((AbstractRule)null);
				return;
			case EditPolicyEcore1Package.IMPLICATION_RULE__CONSEQUENT:
				setConsequent((AbstractRule)null);
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
			case EditPolicyEcore1Package.IMPLICATION_RULE__ANTECEDENT:
				return antecedent != null;
			case EditPolicyEcore1Package.IMPLICATION_RULE__CONSEQUENT:
				return consequent != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplicationRuleImpl
