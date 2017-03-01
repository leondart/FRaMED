/**
 */
package model.provider;


import java.util.Collection;
import java.util.List;

import model.ImplicationRule;
import model.ModelFactory;
import model.ModelPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link model.ImplicationRule} object.
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
			childrenFeatures.add(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT);
			childrenFeatures.add(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT);
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
			case ModelPackage.IMPLICATION_RULE__ANTECEDENT:
			case ModelPackage.IMPLICATION_RULE__CONSEQUENT:
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
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createAndRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createRelationTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createOrRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createNotRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createImplicationRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createSourceTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createTargetTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createCommandNameRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createShapeTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createParentTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createStepInRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createTrueRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createFalseRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createShapeNameRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createRelationIsCyclicRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createRelationIsReflexivRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createRelationTypesAreEqualRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createTypeExistsRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createAndRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createRelationTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createOrRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createNotRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createImplicationRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createSourceTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createTargetTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createCommandNameRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createShapeTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createParentTypeRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createStepInRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createTrueRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createFalseRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createShapeNameRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createRelationIsCyclicRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createRelationIsReflexivRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createRelationTypesAreEqualRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createTypeExistsRule()));
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
			childFeature == ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT ||
			childFeature == ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
