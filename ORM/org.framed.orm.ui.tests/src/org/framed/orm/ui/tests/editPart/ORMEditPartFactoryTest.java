package org.framed.orm.ui.tests.editPart;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.EditPart;
import org.framed.orm.model.Configuration;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.Shape;
import org.framed.orm.ui.editPart.ORMEditPartFactory;
import org.junit.Test;

public class ORMEditPartFactoryTest {

  @Test
  public void testCreateEditPart() {
    ORMEditPartFactory obj = new ORMEditPartFactory();
    EditPart ep = obj.createEditPart(null, new Model() {

      @Override
      public void eSetDeliver(boolean arg0) {
        // TODO Auto-generated method stub

      }

      @Override
      public void eNotify(Notification arg0) {
        // TODO Auto-generated method stub

      }

      @Override
      public boolean eDeliver() {
        // TODO Auto-generated method stub
        return false;
      }

      @Override
      public EList<Adapter> eAdapters() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public void eUnset(EStructuralFeature arg0) {
        // TODO Auto-generated method stub

      }

      @Override
      public void eSet(EStructuralFeature arg0, Object arg1) {
        // TODO Auto-generated method stub

      }

      @Override
      public Resource eResource() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public boolean eIsSet(EStructuralFeature arg0) {
        // TODO Auto-generated method stub
        return false;
      }

      @Override
      public boolean eIsProxy() {
        // TODO Auto-generated method stub
        return false;
      }

      @Override
      public Object eInvoke(EOperation arg0, EList<?> arg1) throws InvocationTargetException {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Object eGet(EStructuralFeature arg0, boolean arg1) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Object eGet(EStructuralFeature arg0) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public EList<EObject> eCrossReferences() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public EList<EObject> eContents() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public EReference eContainmentFeature() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public EStructuralFeature eContainingFeature() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public EObject eContainer() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public EClass eClass() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public TreeIterator<EObject> eAllContents() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public void setParent(Shape value) {
        // TODO Auto-generated method stub

      }

      @Override
      public Shape getParent() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public EList<ModelElement> getElements() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Configuration getConfiguration() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public void setConfiguration(Configuration value) {
        // TODO Auto-generated method stub
        
      }
    });

    assertNotNull(ep);

  }

}
