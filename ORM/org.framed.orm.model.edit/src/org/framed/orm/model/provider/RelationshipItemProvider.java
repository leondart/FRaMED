/**
 */
package org.framed.orm.model.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Parthood;
import org.framed.orm.model.Relationship;

/**
 * This is the item provider adapter for a {@link org.framed.orm.model.Relationship} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationshipItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      //addBendpointsPropertyDescriptor(object);
      addTargetPropertyDescriptor(object);
      addSourcePropertyDescriptor(object);
      //addDim1BPPropertyDescriptor(object);
      //addDim2BPPropertyDescriptor(object);
      //addSecondParthoodPropertyDescriptor(object);
      addSecondLowerPropertyDescriptor(object);
      addFirstLowerPropertyDescriptor(object);
      addFirstUpperPropertyDescriptor(object);
      addSecondUpperPropertyDescriptor(object);
      //addFirstParthoodPropertyDescriptor(object);
      //addSourceLabelValuePropertyDescriptor(object);
      //addTargetLabelValuePropertyDescriptor(object);
      //addRlshipConstraintsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Bendpoints feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBendpointsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Relation_bendpoints_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Relation_bendpoints_feature", "_UI_Relation_type"),
         OrmPackage.Literals.RELATION__BENDPOINTS,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Target feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTargetPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Relation_target_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Relation_target_feature", "_UI_Relation_type"),
         OrmPackage.Literals.RELATION__TARGET,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Source feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSourcePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Relation_source_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Relation_source_feature", "_UI_Relation_type"),
         OrmPackage.Literals.RELATION__SOURCE,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Dim1 BP feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDim1BPPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Relation_dim1BP_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Relation_dim1BP_feature", "_UI_Relation_type"),
         OrmPackage.Literals.RELATION__DIM1_BP,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Dim2 BP feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDim2BPPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Relation_dim2BP_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Relation_dim2BP_feature", "_UI_Relation_type"),
         OrmPackage.Literals.RELATION__DIM2_BP,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Second Parthood feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSecondParthoodPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Relationship_secondParthood_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Relationship_secondParthood_feature", "_UI_Relationship_type"),
         OrmPackage.Literals.RELATIONSHIP__SECOND_PARTHOOD,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Second Lower feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSecondLowerPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Relationship_secondLower_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Relationship_secondLower_feature", "_UI_Relationship_type"),
         OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the First Lower feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFirstLowerPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Relationship_firstLower_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Relationship_firstLower_feature", "_UI_Relationship_type"),
         OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the First Upper feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFirstUpperPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Relationship_firstUpper_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Relationship_firstUpper_feature", "_UI_Relationship_type"),
         OrmPackage.Literals.RELATIONSHIP__FIRST_UPPER,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Second Upper feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSecondUpperPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Relationship_secondUpper_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Relationship_secondUpper_feature", "_UI_Relationship_type"),
         OrmPackage.Literals.RELATIONSHIP__SECOND_UPPER,
         true,
         false,
         false,
         ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the First Parthood feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFirstParthoodPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Relationship_firstParthood_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Relationship_firstParthood_feature", "_UI_Relationship_type"),
         OrmPackage.Literals.RELATIONSHIP__FIRST_PARTHOOD,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Source Label Value feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSourceLabelValuePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Relationship_sourceLabelValue_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Relationship_sourceLabelValue_feature", "_UI_Relationship_type"),
         OrmPackage.Literals.RELATIONSHIP__SOURCE_LABEL_VALUE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Target Label Value feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTargetLabelValuePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Relationship_targetLabelValue_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Relationship_targetLabelValue_feature", "_UI_Relationship_type"),
         OrmPackage.Literals.RELATIONSHIP__TARGET_LABEL_VALUE,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Rlship Constraints feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRlshipConstraintsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Relationship_rlshipConstraints_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Relationship_rlshipConstraints_feature", "_UI_Relationship_type"),
         OrmPackage.Literals.RELATIONSHIP__RLSHIP_CONSTRAINTS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This returns Relationship.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Relationship"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    Parthood labelValue = ((Relationship)object).getSecondParthood();
    String label = labelValue == null ? null : labelValue.toString();
    return label == null || label.length() == 0 ?
      getString("_UI_Relationship_type") :
      getString("_UI_Relationship_type") + " " + label;
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

    switch (notification.getFeatureID(Relationship.class)) {
      case OrmPackage.RELATIONSHIP__BENDPOINTS:
      case OrmPackage.RELATIONSHIP__DIM1_BP:
      case OrmPackage.RELATIONSHIP__DIM2_BP:
      case OrmPackage.RELATIONSHIP__SECOND_PARTHOOD:
      case OrmPackage.RELATIONSHIP__SECOND_LOWER:
      case OrmPackage.RELATIONSHIP__FIRST_LOWER:
      case OrmPackage.RELATIONSHIP__FIRST_UPPER:
      case OrmPackage.RELATIONSHIP__SECOND_UPPER:
      case OrmPackage.RELATIONSHIP__FIRST_PARTHOOD:
      case OrmPackage.RELATIONSHIP__SOURCE_LABEL_VALUE:
      case OrmPackage.RELATIONSHIP__TARGET_LABEL_VALUE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator() {
    return ORMEditPlugin.INSTANCE;
  }

}
