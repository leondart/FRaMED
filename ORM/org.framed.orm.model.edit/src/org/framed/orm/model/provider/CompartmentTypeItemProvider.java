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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.framed.orm.model.CompartmentType;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.framed.orm.model.CompartmentType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompartmentTypeItemProvider extends RigidTypeItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentTypeItemProvider(AdapterFactory adapterFactory) {
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

      addIsExpandPropertyDescriptor(object);
      addPartsPropertyDescriptor(object);
      addRelationshipsPropertyDescriptor(object);
      addConstraintsPropertyDescriptor(object);
      addTr_extendsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Is Expand feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIsExpandPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_CompartmentType_isExpand_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CompartmentType_isExpand_feature",
            "_UI_CompartmentType_type"), OrmPackage.Literals.COMPARTMENT_TYPE__IS_EXPAND, true,
        false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Parts feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPartsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_CompartmentType_parts_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CompartmentType_parts_feature",
            "_UI_CompartmentType_type"), OrmPackage.Literals.COMPARTMENT_TYPE__PARTS, true, false,
        true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Relationships feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRelationshipsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_CompartmentType_relationships_feature"),
        getString("_UI_PropertyDescriptor_description",
            "_UI_CompartmentType_relationships_feature", "_UI_CompartmentType_type"),
        OrmPackage.Literals.COMPARTMENT_TYPE__RELATIONSHIPS, true, false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Constraints feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addConstraintsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_CompartmentType_constraints_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CompartmentType_constraints_feature",
            "_UI_CompartmentType_type"), OrmPackage.Literals.COMPARTMENT_TYPE__CONSTRAINTS, true,
        false, true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Tr extends feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTr_extendsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_CompartmentType_tr_extends_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_CompartmentType_tr_extends_feature",
            "_UI_CompartmentType_type"), OrmPackage.Literals.COMPARTMENT_TYPE__TR_EXTENDS, true,
        false, true, null, null, null));
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
      childrenFeatures.add(OrmPackage.Literals.MODEL__RELATIONS);
      childrenFeatures.add(OrmPackage.Literals.ABSTRACT_ROLE_MODEL__ABSTRACTROLES);
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
   * This returns CompartmentType.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/CompartmentType"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((CompartmentType) object).getName();
    return label == null || label.length() == 0 ? getString("_UI_CompartmentType_type")
        : getString("_UI_CompartmentType_type") + " " + label;
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

    switch (notification.getFeatureID(CompartmentType.class)) {
      case OrmPackage.COMPARTMENT_TYPE__IS_EXPAND:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false,
            true));
        return;
      case OrmPackage.COMPARTMENT_TYPE__RELATIONS:
      case OrmPackage.COMPARTMENT_TYPE__ABSTRACTROLES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true,
            false));
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

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createRelationship()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createFulfillment()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createInheritance()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createConstraint()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createIntraRelationshipConstraint()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createInterRelationshipConstraint()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createComplexConstraint()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createDataInheritance()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createNaturalInheritance()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createCompartmentInheritance()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createRoleInheritance()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createRelationshipImplication()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createIrreflexive()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createCyclic()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createTotal()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createRoleImplication()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createRoleEquivalence()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createRoleProhibition()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.MODEL__RELATIONS,
        OrmFactory.eINSTANCE.createParthoodConstraint()));

    newChildDescriptors.add(createChildParameter(
        OrmPackage.Literals.ABSTRACT_ROLE_MODEL__ABSTRACTROLES,
        OrmFactory.eINSTANCE.createRoleType()));

    newChildDescriptors.add(createChildParameter(
        OrmPackage.Literals.ABSTRACT_ROLE_MODEL__ABSTRACTROLES,
        OrmFactory.eINSTANCE.createRoleGroup()));
  }

}
