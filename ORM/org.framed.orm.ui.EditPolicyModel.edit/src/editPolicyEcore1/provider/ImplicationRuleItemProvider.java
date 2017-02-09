/**
 */
package editPolicyEcore1.provider;


import editPolicyEcore1.EditPolicyEcore1Factory;
import editPolicyEcore1.EditPolicyEcore1Package;
import editPolicyEcore1.ImplicationRule;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link editPolicyEcore1.ImplicationRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplicationRuleItemProvider extends AbstractRuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicationRuleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT);
			childrenFeatures.add(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ImplicationRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImplicationRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ImplicationRule_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ImplicationRule.class)) {
			case EditPolicyEcore1Package.IMPLICATION_RULE__ANTECEDENT:
			case EditPolicyEcore1Package.IMPLICATION_RULE__CONSEQUENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT,
				 EditPolicyEcore1Factory.eINSTANCE.createAndRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT,
				 EditPolicyEcore1Factory.eINSTANCE.createRelationNameRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT,
				 EditPolicyEcore1Factory.eINSTANCE.createOrRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT,
				 EditPolicyEcore1Factory.eINSTANCE.createNotRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT,
				 EditPolicyEcore1Factory.eINSTANCE.createImplicationRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT,
				 EditPolicyEcore1Factory.eINSTANCE.createSourceTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT,
				 EditPolicyEcore1Factory.eINSTANCE.createTargetTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT,
				 EditPolicyEcore1Factory.eINSTANCE.createCommandNameRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT,
				 EditPolicyEcore1Factory.eINSTANCE.createShapeTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT,
				 EditPolicyEcore1Factory.eINSTANCE.createParentTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT,
				 EditPolicyEcore1Factory.eINSTANCE.createStepInRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT,
				 EditPolicyEcore1Factory.eINSTANCE.createTrueRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT,
				 EditPolicyEcore1Factory.eINSTANCE.createFalseRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT,
				 EditPolicyEcore1Factory.eINSTANCE.createShapeNameRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT,
				 EditPolicyEcore1Factory.eINSTANCE.createAndRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT,
				 EditPolicyEcore1Factory.eINSTANCE.createRelationNameRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT,
				 EditPolicyEcore1Factory.eINSTANCE.createOrRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT,
				 EditPolicyEcore1Factory.eINSTANCE.createNotRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT,
				 EditPolicyEcore1Factory.eINSTANCE.createImplicationRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT,
				 EditPolicyEcore1Factory.eINSTANCE.createSourceTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT,
				 EditPolicyEcore1Factory.eINSTANCE.createTargetTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT,
				 EditPolicyEcore1Factory.eINSTANCE.createCommandNameRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT,
				 EditPolicyEcore1Factory.eINSTANCE.createShapeTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT,
				 EditPolicyEcore1Factory.eINSTANCE.createParentTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT,
				 EditPolicyEcore1Factory.eINSTANCE.createStepInRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT,
				 EditPolicyEcore1Factory.eINSTANCE.createTrueRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT,
				 EditPolicyEcore1Factory.eINSTANCE.createFalseRule()));

		newChildDescriptors.add
			(createChildParameter
				(EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT,
				 EditPolicyEcore1Factory.eINSTANCE.createShapeNameRule()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == EditPolicyEcore1Package.Literals.IMPLICATION_RULE__ANTECEDENT ||
			childFeature == EditPolicyEcore1Package.Literals.IMPLICATION_RULE__CONSEQUENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
