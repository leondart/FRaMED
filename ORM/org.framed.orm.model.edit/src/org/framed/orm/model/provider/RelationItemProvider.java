/**
 */
package org.framed.orm.model.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.framed.orm.geometry.GeometryFactory;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relation;

/**
 * This is the item provider adapter for a {@link org.framed.orm.model.Relation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationItemProvider extends ModelElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationItemProvider(AdapterFactory adapterFactory) {
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

			addTargetPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addReferencedRelationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Relation_target_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Relation_target_feature", "_UI_Relation_type"),
				OrmPackage.Literals.RELATION__TARGET, true, false, true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Relation_source_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Relation_source_feature", "_UI_Relation_type"),
				OrmPackage.Literals.RELATION__SOURCE, true, false, true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Referenced Relation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencedRelationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Relation_referencedRelation_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Relation_referencedRelation_feature",
						"_UI_Relation_type"),
				OrmPackage.Literals.RELATION__REFERENCED_RELATION, true, false,
				true, null, null, null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OrmPackage.Literals.RELATION__BENDPOINTS);
			childrenFeatures.add(OrmPackage.Literals.RELATION__SOURCE_LABEL);
			childrenFeatures.add(OrmPackage.Literals.RELATION__TARGET_LABEL);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Relation) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Relation_type")
				: getString("_UI_Relation_type") + " " + label;
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

		switch (notification.getFeatureID(Relation.class)) {
		case OrmPackage.RELATION__BENDPOINTS:
		case OrmPackage.RELATION__SOURCE_LABEL:
		case OrmPackage.RELATION__TARGET_LABEL:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				OrmPackage.Literals.RELATION__BENDPOINTS,
				GeometryFactory.eINSTANCE.createRelativePoint()));

		newChildDescriptors.add(createChildParameter(
				OrmPackage.Literals.RELATION__SOURCE_LABEL,
				OrmFactory.eINSTANCE.createModelElement()));

		newChildDescriptors.add(createChildParameter(
				OrmPackage.Literals.RELATION__SOURCE_LABEL,
				OrmFactory.eINSTANCE.createShape()));

		newChildDescriptors.add(createChildParameter(
				OrmPackage.Literals.RELATION__TARGET_LABEL,
				OrmFactory.eINSTANCE.createModelElement()));

		newChildDescriptors.add(createChildParameter(
				OrmPackage.Literals.RELATION__TARGET_LABEL,
				OrmFactory.eINSTANCE.createShape()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == OrmPackage.Literals.RELATION__SOURCE_LABEL
				|| childFeature == OrmPackage.Literals.RELATION__TARGET_LABEL;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature),
					getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
