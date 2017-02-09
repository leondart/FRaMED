/**
 */
package model.impl;

import model.AbstractMappingRule;
import model.ImplicationMappingRule;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implication Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.ImplicationMappingRuleImpl#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link model.impl.ImplicationMappingRuleImpl#getConsequent <em>Consequent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplicationMappingRuleImpl extends AbstractMappingRuleImpl implements ImplicationMappingRule {
	/**
	 * The cached value of the '{@link #getAntecedent() <em>Antecedent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntecedent()
	 * @generated
	 * @ordered
	 */
	protected AbstractMappingRule antecedent;

	/**
	 * The cached value of the '{@link #getConsequent() <em>Consequent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequent()
	 * @generated
	 * @ordered
	 */
	protected AbstractMappingRule consequent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicationMappingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.IMPLICATION_MAPPING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMappingRule getAntecedent() {
		return antecedent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntecedent(AbstractMappingRule newAntecedent, NotificationChain msgs) {
		AbstractMappingRule oldAntecedent = antecedent;
		antecedent = newAntecedent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.IMPLICATION_MAPPING_RULE__ANTECEDENT, oldAntecedent, newAntecedent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntecedent(AbstractMappingRule newAntecedent) {
		if (newAntecedent != antecedent) {
			NotificationChain msgs = null;
			if (antecedent != null)
				msgs = ((InternalEObject)antecedent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.IMPLICATION_MAPPING_RULE__ANTECEDENT, null, msgs);
			if (newAntecedent != null)
				msgs = ((InternalEObject)newAntecedent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.IMPLICATION_MAPPING_RULE__ANTECEDENT, null, msgs);
			msgs = basicSetAntecedent(newAntecedent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMPLICATION_MAPPING_RULE__ANTECEDENT, newAntecedent, newAntecedent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMappingRule getConsequent() {
		return consequent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsequent(AbstractMappingRule newConsequent, NotificationChain msgs) {
		AbstractMappingRule oldConsequent = consequent;
		consequent = newConsequent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.IMPLICATION_MAPPING_RULE__CONSEQUENT, oldConsequent, newConsequent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsequent(AbstractMappingRule newConsequent) {
		if (newConsequent != consequent) {
			NotificationChain msgs = null;
			if (consequent != null)
				msgs = ((InternalEObject)consequent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.IMPLICATION_MAPPING_RULE__CONSEQUENT, null, msgs);
			if (newConsequent != null)
				msgs = ((InternalEObject)newConsequent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.IMPLICATION_MAPPING_RULE__CONSEQUENT, null, msgs);
			msgs = basicSetConsequent(newConsequent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.IMPLICATION_MAPPING_RULE__CONSEQUENT, newConsequent, newConsequent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.IMPLICATION_MAPPING_RULE__ANTECEDENT:
				return basicSetAntecedent(null, msgs);
			case ModelPackage.IMPLICATION_MAPPING_RULE__CONSEQUENT:
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
			case ModelPackage.IMPLICATION_MAPPING_RULE__ANTECEDENT:
				return getAntecedent();
			case ModelPackage.IMPLICATION_MAPPING_RULE__CONSEQUENT:
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
			case ModelPackage.IMPLICATION_MAPPING_RULE__ANTECEDENT:
				setAntecedent((AbstractMappingRule)newValue);
				return;
			case ModelPackage.IMPLICATION_MAPPING_RULE__CONSEQUENT:
				setConsequent((AbstractMappingRule)newValue);
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
			case ModelPackage.IMPLICATION_MAPPING_RULE__ANTECEDENT:
				setAntecedent((AbstractMappingRule)null);
				return;
			case ModelPackage.IMPLICATION_MAPPING_RULE__CONSEQUENT:
				setConsequent((AbstractMappingRule)null);
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
			case ModelPackage.IMPLICATION_MAPPING_RULE__ANTECEDENT:
				return antecedent != null;
			case ModelPackage.IMPLICATION_MAPPING_RULE__CONSEQUENT:
				return consequent != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplicationMappingRuleImpl
