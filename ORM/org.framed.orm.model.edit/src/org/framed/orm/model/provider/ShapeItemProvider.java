/**
 */
package org.framed.orm.model.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.framed.orm.geometry.GeometryFactory;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Shape;

/**
 * This is the item provider adapter for a {@link org.framed.orm.model.Shape} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ShapeItemProvider extends ModelElementItemProvider {
  /**
   * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public ShapeItemProvider(AdapterFactory adapterFactory) {
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

    }
    return itemPropertyDescriptors;
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
   * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
   * {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(OrmPackage.Literals.SHAPE__FIRST_SEGMENT);
      childrenFeatures.add(OrmPackage.Literals.SHAPE__SECOND_SEGMENT);
      childrenFeatures.add(OrmPackage.Literals.SHAPE__MODEL);
      childrenFeatures.add(OrmPackage.Literals.SHAPE__DESCRIPTION);
      childrenFeatures.add(OrmPackage.Literals.SHAPE__BOUNDARIES);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns Shape.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Shape"));
  }

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((Shape) object).getName();
    return label == null || label.length() == 0 ? getString("_UI_Shape_type")
        : getString("_UI_Shape_type") + " " + label;
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

    switch (notification.getFeatureID(Shape.class)) {
      case OrmPackage.SHAPE__FIRST_SEGMENT:
      case OrmPackage.SHAPE__SECOND_SEGMENT:
      case OrmPackage.SHAPE__MODEL:
      case OrmPackage.SHAPE__DESCRIPTION:
      case OrmPackage.SHAPE__BOUNDARIES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true,
            false));
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

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.SHAPE__FIRST_SEGMENT,
        OrmFactory.eINSTANCE.createSegment()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.SHAPE__SECOND_SEGMENT,
        OrmFactory.eINSTANCE.createSegment()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.SHAPE__MODEL,
        OrmFactory.eINSTANCE.createModel()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.SHAPE__DESCRIPTION,
        OrmFactory.eINSTANCE.createNamedElement()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.SHAPE__DESCRIPTION,
        OrmFactory.eINSTANCE.createModelElement()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.SHAPE__DESCRIPTION,
        OrmFactory.eINSTANCE.createRelation()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.SHAPE__DESCRIPTION,
        OrmFactory.eINSTANCE.createShape()));

    newChildDescriptors.add(createChildParameter(OrmPackage.Literals.SHAPE__BOUNDARIES,
        GeometryFactory.eINSTANCE.createRectangle()));
  }

  /**
   * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child,
      Collection<?> selection) {
    Object childFeature = feature;
    Object childObject = child;

    boolean qualify =
        childFeature == OrmPackage.Literals.SHAPE__FIRST_SEGMENT
            || childFeature == OrmPackage.Literals.SHAPE__SECOND_SEGMENT;

    if (qualify) {
      return getString("_UI_CreateChild_text2", new Object[] {getTypeText(childObject),
          getFeatureText(childFeature), getTypeText(owner)});
    }
    return super.getCreateChildText(owner, feature, child, selection);
  }

}
