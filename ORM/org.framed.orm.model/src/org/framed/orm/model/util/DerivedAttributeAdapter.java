/*
 * @see http://wiki.eclipse.org/EMF/Recipes#Recipe:_Derived_Attribute_Notifier
 */
package org.framed.orm.model.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * 
 * @author pvmellor
 *
 */
public class DerivedAttributeAdapter extends AdapterImpl {
  private final InternalEObject source;
  private final EStructuralFeature derivedFeature;

  private List<EStructuralFeature> localFeatures = new ArrayList<EStructuralFeature>();

  // TODO this lot could be put into a subclass and put in a list to allow for
  // multiple navigated dependencies
  private EStructuralFeature dependantFeature = null;
  private EStructuralFeature navigationFeature = null;

  private AdapterImpl dependantAdapter = new AdapterImpl() {

    @Override
    public void notifyChanged(Notification msg) {

      if (msg.getEventType() == Notification.SET && msg.getFeature().equals(dependantFeature)) {
        notifyDerivedAttributeChange();
      }
    }
  };

  /*
   * Convenience constructor for a local and navigated dependency
   */
  public DerivedAttributeAdapter(EObject source, EStructuralFeature derivedFeature,
      EStructuralFeature navigationFeature, EStructuralFeature dependantFeature,
      EStructuralFeature localFeature) {
    this(source, derivedFeature);
    addNavigatedDependency(navigationFeature, dependantFeature);
    addLocalDependency(localFeature);
  }

  /*
   * Convenience constructor for a navigated dependency
   */
  public DerivedAttributeAdapter(EObject source, EStructuralFeature derivedFeature,
      EStructuralFeature navigationFeature, EStructuralFeature dependantFeature) {
    this(source, derivedFeature);
    addNavigatedDependency(navigationFeature, dependantFeature);
  }

  /*
   * Convenience constructor for a local dependency
   */
  public DerivedAttributeAdapter(EObject source, EStructuralFeature derivedFeature,
      EStructuralFeature localFeature) {
    this(source, derivedFeature);
    addLocalDependency(localFeature);
  }

  public DerivedAttributeAdapter(EObject source, EStructuralFeature derivedFeature) {
    super();
    this.source = (InternalEObject) source;
    this.derivedFeature = derivedFeature;
    source.eAdapters().add(this);
  }

  public void addNavigatedDependency(EStructuralFeature navigationFeature,
      EStructuralFeature dependantFeature) {
    this.dependantFeature = dependantFeature;
    this.navigationFeature = navigationFeature;
  }

  public void addLocalDependency(EStructuralFeature localFeature) {
    localFeatures.add(localFeature);
  }

  @Override
  public void notifyChanged(Notification notification) {
    if (notification.getFeature().equals(navigationFeature)) {
      switch (notification.getEventType()) {
      // TODO support ADD_MANY/REMOVE_MANY?
        case Notification.ADD:
          EObject added = (EObject) notification.getNewValue();
          added.eAdapters().add(dependantAdapter);
          break;
        case Notification.SET:
          EObject newValue = (EObject) notification.getNewValue();
          EObject oldValue = (EObject) notification.getOldValue();
          if (oldValue != null)
            oldValue.eAdapters().remove(dependantAdapter);
          if (newValue != null)
            newValue.eAdapters().add(dependantAdapter);
          break;
        case Notification.REMOVE:
          EObject removed = (EObject) notification.getOldValue();
          removed.eAdapters().remove(dependantAdapter);
          break;
        default:
          return; // No notification
      }
      notifyDerivedAttributeChange();
    } else if (localFeatures.contains(notification.getFeature())) {
      notifyDerivedAttributeChange();
    }
  }

  private void notifyDerivedAttributeChange() {
    if (source.eNotificationRequired()) {
      source.eNotify(new ENotificationImpl(source, Notification.SET, derivedFeature, null, source
          .eGet(derivedFeature, true, true)));
    }
  }
}
