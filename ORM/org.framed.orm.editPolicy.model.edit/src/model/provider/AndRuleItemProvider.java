/**
 */
package model.provider;


import java.util.Collection;
import java.util.List;

import model.AndRule;
import model.ModelFactory;
import model.ModelPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link model.AndRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AndRuleItemProvider extends AbstractRuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndRuleItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ModelPackage.Literals.AND_RULE__RULES);
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
	 * This returns AndRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AndRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_AndRule_type");
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

		switch (notification.getFeatureID(AndRule.class)) {
			case ModelPackage.AND_RULE__RULES:
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
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createAndRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createRelationTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createOrRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createNotRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createImplicationRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createSourceTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createTargetTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createCommandNameRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createShapeTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createParentTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createStepInRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createTrueRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createFalseRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createShapeNameRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createRelationIsCyclicRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createRelationIsReflexivRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createRelationTypesAreEqualRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.AND_RULE__RULES,
				 ModelFactory.eINSTANCE.createTypeExistsRule()));
	}

}
