/**
 */
package org.framed.orm.model.provider;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.framed.orm.model.ModelElement} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ModelElementItemProvider extends NamedElementItemProvider {
  /**
   * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public ModelElementItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addIncomingRelationsPropertyDescriptor(object);
      addOutgoingRelationsPropertyDescriptor(object);
      addTypePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Incoming Relations feature. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addIncomingRelationsPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_ModelElement_incomingRelations_feature"),
            getString("_UI_PropertyDescriptor_description",
                "_UI_ModelElement_incomingRelations_feature", "_UI_ModelElement_type"),
            OrmPackage.Literals.MODEL_ELEMENT__INCOMING_RELATIONS, true, false, true, null, null,
            null));
  }

  /**
   * This adds a property descriptor for the Outgoing Relations feature. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addOutgoingRelationsPropertyDescriptor(Object object) {
    itemPropertyDescriptors
        .add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_ModelElement_outgoingRelations_feature"),
            getString("_UI_PropertyDescriptor_description",
                "_UI_ModelElement_outgoingRelations_feature", "_UI_ModelElement_type"),
            OrmPackage.Literals.MODEL_ELEMENT__OUTGOING_RELATIONS, true, false, true, null, null,
            null));
  }

  /**
   * This adds a property descriptor for the Type feature. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  protected void addTypePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
        ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
        getResourceLocator(),
        getString("_UI_ModelElement_type_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_type_feature",
            "_UI_ModelElement_type"), OrmPackage.Literals.MODEL_ELEMENT__TYPE, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This returns ModelElement.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelElement"));
  }

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((ModelElement) object).getName();
    return label == null || label.length() == 0 ? getString("_UI_ModelElement_type")
        : getString("_UI_ModelElement_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(ModelElement.class)) {
      case OrmPackage.MODEL_ELEMENT__TYPE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false,
            true));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
   * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

}
