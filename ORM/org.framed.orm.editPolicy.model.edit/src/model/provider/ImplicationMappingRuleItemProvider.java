/**
 */
package model.provider;


import java.util.Collection;
import java.util.List;

import model.ImplicationMappingRule;
import model.ModelFactory;
import model.ModelPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link model.ImplicationMappingRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplicationMappingRuleItemProvider extends AbstractMappingRuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicationMappingRuleItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ModelPackage.Literals.IMPLICATION_MAPPING_RULE__ANTECEDENT);
			childrenFeatures.add(ModelPackage.Literals.IMPLICATION_MAPPING_RULE__CONSEQUENT);
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
	 * This returns ImplicationMappingRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImplicationMappingRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ImplicationMappingRule_type");
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

		switch (notification.getFeatureID(ImplicationMappingRule.class)) {
			case ModelPackage.IMPLICATION_MAPPING_RULE__ANTECEDENT:
			case ModelPackage.IMPLICATION_MAPPING_RULE__CONSEQUENT:
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
				(ModelPackage.Literals.IMPLICATION_MAPPING_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createFeatureNameMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_MAPPING_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createAndMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_MAPPING_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createNotMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_MAPPING_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createOrMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_MAPPING_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createImplicationMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_MAPPING_RULE__ANTECEDENT,
				 ModelFactory.eINSTANCE.createTrueMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_MAPPING_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createFeatureNameMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_MAPPING_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createAndMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_MAPPING_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createNotMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_MAPPING_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createOrMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_MAPPING_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createImplicationMappingRule()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.IMPLICATION_MAPPING_RULE__CONSEQUENT,
				 ModelFactory.eINSTANCE.createTrueMappingRule()));
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
			childFeature == ModelPackage.Literals.IMPLICATION_MAPPING_RULE__ANTECEDENT ||
			childFeature == ModelPackage.Literals.IMPLICATION_MAPPING_RULE__CONSEQUENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
