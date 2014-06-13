/**
 */
package org.framed.orm.model.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.framed.orm.model.Container;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.framed.orm.model.Container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerItemProvider extends ItemProviderAdapter implements
    IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
    IItemLabelProvider, IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerItemProvider(AdapterFactory adapterFactory) {
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
      childrenFeatures.add(OrmPackage.Literals.CONTAINER__RELATIONS);
      childrenFeatures.add(OrmPackage.Literals.CONTAINER__NODES);
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
   * This returns Container.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Container"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    return getString("_UI_Container_type");
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

    switch (notification.getFeatureID(Container.class)) {
      case OrmPackage.CONTAINER__RELATIONS:
      case OrmPackage.CONTAINER__NODES:
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

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createRoleType()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createRoleGroup()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createTotal()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createFulfillment()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createRoleEquivalence()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createAcyclic()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createInheritance()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createRelationship()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createRoleProhibition()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createIrreflexive()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createRoleImplication()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__RELATIONS,
        OrmFactory.eINSTANCE.createComplexConstraint()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__NODES,
        OrmFactory.eINSTANCE.createNaturalType()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__NODES,
        OrmFactory.eINSTANCE.createCompartment()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__NODES,
        OrmFactory.eINSTANCE.createGrouping()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__NODES,
        OrmFactory.eINSTANCE.createRoleType()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.CONTAINER__NODES,
        OrmFactory.eINSTANCE.createRoleGroup()));
  }

  /**
   * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child,
      Collection<?> selection) {
    Object childFeature = feature;
    Object childObject = child;

    boolean qualify =
        childFeature == OrmPackage.Literals.CONTAINER__RELATIONS
            || childFeature == OrmPackage.Literals.CONTAINER__NODES;

    if (qualify) {
      return getString("_UI_CreateChild_text2", new Object[] {getTypeText(childObject),
          getFeatureText(childFeature), getTypeText(owner)});
    }
    return super.getCreateChildText(owner, feature, child, selection);
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
