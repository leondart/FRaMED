/**
 */
package org.framed.orm.model.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.RoleGroup;

/**
 * This is the item provider adapter for a {@link org.framed.orm.model.RoleGroup} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class RoleGroupItemProvider extends ConstraintItemProvider implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
    IItemLabelProvider, IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public RoleGroupItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addFirstPropertyDescriptor(object);
      addSecondPropertyDescriptor(object);
      addIncomingLinksPropertyDescriptor(object);
      addOutgoingLinksPropertyDescriptor(object);
      addNamePropertyDescriptor(object);
      addConstraintsPropertyDescriptor(object);
      addLowerPropertyDescriptor(object);
      addItemsPropertyDescriptor(object);
      addUpperPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the First feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addFirstPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_AbstractRole_first_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_AbstractRole_first_feature",
            "_UI_AbstractRole_type"), OrmPackage.Literals.ABSTRACT_ROLE__FIRST, true, false, true,
        null, null, null));
  }

  /**
   * This adds a property descriptor for the Second feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addSecondPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_AbstractRole_second_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_AbstractRole_second_feature",
            "_UI_AbstractRole_type"), OrmPackage.Literals.ABSTRACT_ROLE__SECOND, true, false, true,
        null, null, null));
  }

  /**
   * This adds a property descriptor for the Incoming Links feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addIncomingLinksPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_Node_incomingLinks_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_Node_incomingLinks_feature",
            "_UI_Node_type"), OrmPackage.Literals.NODE__INCOMING_LINKS, true, false, true, null,
        null, null));
  }

  /**
   * This adds a property descriptor for the Outgoing Links feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addOutgoingLinksPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_Node_outgoingLinks_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_Node_outgoingLinks_feature",
            "_UI_Node_type"), OrmPackage.Literals.NODE__OUTGOING_LINKS, true, false, true, null,
        null, null));
  }

  /**
   * This adds a property descriptor for the Name feature. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_Node_Name_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_Node_Name_feature", "_UI_Node_type"),
        OrmPackage.Literals.NODE__NAME, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Constraints feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addConstraintsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_Node_constraints_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_Node_constraints_feature",
            "_UI_Node_type"), OrmPackage.Literals.NODE__CONSTRAINTS, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Lower feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
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
   * This adds a property descriptor for the Items feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void addItemsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_RoleGroup_items_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_RoleGroup_items_feature",
            "_UI_RoleGroup_type"), OrmPackage.Literals.ROLE_GROUP__ITEMS, true, false, true, null,
        null, null));
  }

  /**
   * This adds a property descriptor for the Upper feature.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
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
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(OrmPackage.Literals.RELATION_CONTAINER__RELATIONS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/RoleGroup"));
  }

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated NOT
   */
  @Override
  public String getText(Object object) {
    // String label = ((RoleGroup) object).getName();
    // return label == null || label.length() == 0 ? getString("_UI_RoleGroup_type")
    // : getString("_UI_RoleGroup_type") + " " + label;
    return ((RoleGroup) object).getName();
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(RoleGroup.class)) {
      case OrmPackage.ROLE_GROUP__NAME:
      case OrmPackage.ROLE_GROUP__CONSTRAINTS:
      case OrmPackage.ROLE_GROUP__LOWER:
      case OrmPackage.ROLE_GROUP__UPPER:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false,
            true));
        return;
      case OrmPackage.ROLE_GROUP__RELATIONS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true,
            false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.RELATION_CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createRoleType()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.RELATION_CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createRoleGroup()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.RELATION_CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createTotal()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.RELATION_CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createFulfillment()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.RELATION_CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createRoleEquivalence()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.RELATION_CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createAcyclic()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.RELATION_CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createInheritance()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.RELATION_CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createRelationship()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.RELATION_CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createRoleProhibition()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.RELATION_CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createIrreflexive()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.RELATION_CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createRoleImplication()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.RELATION_CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createComplexConstraint()));
  }

}
