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

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.RoleGroup;

/**
 * This is the item provider adapter for a {@link org.framed.orm.model.RoleGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleGroupItemProvider extends RoleGroupElementItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleGroupItemProvider(AdapterFactory adapterFactory) {
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

      addFulfillmentPropertyDescriptor(object);
      addNamePropertyDescriptor(object);
      addIncomingPropertyDescriptor(object);
      addOutgoingPropertyDescriptor(object);
      addBoundariesPropertyDescriptor(object);
      addLowerPropertyDescriptor(object);
      addUpperPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Fulfillment feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFulfillmentPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_AbstractRole_fulfillment_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_AbstractRole_fulfillment_feature",
            "_UI_AbstractRole_type"), OrmPackage.Literals.ABSTRACT_ROLE__FULFILLMENT, true, false,
        true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_NamedElement_name_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature",
            "_UI_NamedElement_type"), OrmPackage.Literals.NAMED_ELEMENT__NAME, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Incoming feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIncomingPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_RelationTarget_incoming_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_RelationTarget_incoming_feature",
            "_UI_RelationTarget_type"), OrmPackage.Literals.RELATION_TARGET__INCOMING, true, false,
        true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Outgoing feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addOutgoingPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_RelationTarget_outgoing_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_RelationTarget_outgoing_feature",
            "_UI_RelationTarget_type"), OrmPackage.Literals.RELATION_TARGET__OUTGOING, true, false,
        true, null, null, null));
  }

  /**
   * This adds a property descriptor for the Boundaries feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBoundariesPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_RelationTarget_boundaries_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_RelationTarget_boundaries_feature",
            "_UI_RelationTarget_type"), OrmPackage.Literals.RELATION_TARGET__BOUNDARIES, true,
        false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Lower feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addLowerPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_RoleGroup_lower_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_RoleGroup_lower_feature",
            "_UI_RoleGroup_type"), OrmPackage.Literals.ROLE_GROUP__LOWER, true, false, false,
        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Upper feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addUpperPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_RoleGroup_upper_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_RoleGroup_upper_feature",
            "_UI_RoleGroup_type"), OrmPackage.Literals.ROLE_GROUP__UPPER, true, false, false,
        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
   * This returns RoleGroup.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/RoleGroup"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((RoleGroup) object).getName();
    return label == null || label.length() == 0 ? getString("_UI_RoleGroup_type")
        : getString("_UI_RoleGroup_type") + " " + label;
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

    switch (notification.getFeatureID(RoleGroup.class)) {
      case OrmPackage.ROLE_GROUP__NAME:
      case OrmPackage.ROLE_GROUP__BOUNDARIES:
      case OrmPackage.ROLE_GROUP__LOWER:
      case OrmPackage.ROLE_GROUP__UPPER:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false,
            true));
        return;
      case OrmPackage.ROLE_GROUP__RELATIONS:
      case OrmPackage.ROLE_GROUP__ABSTRACTROLES:
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
