package org.framed.orm.ui.tests.command.shape;

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
import org.framed.orm.geometry.Point;
import org.framed.orm.geometry.Rectangle;
import org.framed.orm.model.Configuration;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Segment;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.shapes.ORMShapeCreateCommand;
import org.junit.Test;

public class ORMShapeCreateCommandTest {

  @Test
  public void testCanExecute() {
    ORMShapeCreateCommand obj = new ORMShapeCreateCommand();
    obj.setShape(new Shape() {

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
      public void setName(String value) {
        // TODO Auto-generated method stub

      }

      @Override
      public String getName() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public void setType(Type value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setContainer(Model value) {
        // TODO Auto-generated method stub

      }

      @Override
      public Type getType() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public EList<Relation> getOutgoingRelations() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public EList<Relation> getIncomingRelations() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Model getContainer() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public void setSecondSegment(Segment value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setModel(Model value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setFirstSegment(Segment value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setDescription(NamedElement value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setBoundaries(Rectangle value) {
        // TODO Auto-generated method stub

      }

      @Override
      public Segment getSecondSegment() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Model getModel() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Segment getFirstSegment() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public NamedElement getDescription() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Rectangle getBoundaries() {
        // TODO Auto-generated method stub
        return null;
      }
    });
    obj.setBoundaries(new Rectangle() {

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
      public void setTopLeft(Point value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setBottomRight(Point value) {
        // TODO Auto-generated method stub

      }

      @Override
      public Point getTopLeft() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Point getBottomRight() {
        // TODO Auto-generated method stub
        return null;
      }
    });
    obj.setContainer(new Model() {

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
    assertTrue(obj.canExecute());
  }

  @Test
  public void testExecute() {
    ORMShapeCreateCommand obj = new ORMShapeCreateCommand();
    obj.setShape(new Shape() {

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
      public void setName(String value) {
        // TODO Auto-generated method stub

      }

      @Override
      public String getName() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public void setType(Type value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setContainer(Model value) {
        // TODO Auto-generated method stub

      }

      @Override
      public Type getType() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public EList<Relation> getOutgoingRelations() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public EList<Relation> getIncomingRelations() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Model getContainer() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public void setSecondSegment(Segment value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setModel(Model value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setFirstSegment(Segment value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setDescription(NamedElement value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setBoundaries(Rectangle value) {
        // TODO Auto-generated method stub

      }

      @Override
      public Segment getSecondSegment() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Model getModel() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Segment getFirstSegment() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public NamedElement getDescription() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Rectangle getBoundaries() {
        // TODO Auto-generated method stub
        return null;
      }
    });
    obj.setBoundaries(new Rectangle() {

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
      public void setTopLeft(Point value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setBottomRight(Point value) {
        // TODO Auto-generated method stub

      }

      @Override
      public Point getTopLeft() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Point getBottomRight() {
        // TODO Auto-generated method stub
        return null;
      }
    });
    obj.setContainer(new Model() {

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
    obj.execute();
    assertTrue(true);
  }

  @Test
  public void testUndo() {
    ORMShapeCreateCommand obj = new ORMShapeCreateCommand();
    obj.setShape(new Shape() {

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
      public void setName(String value) {
        // TODO Auto-generated method stub

      }

      @Override
      public String getName() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public void setType(Type value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setContainer(Model value) {
        // TODO Auto-generated method stub

      }

      @Override
      public Type getType() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public EList<Relation> getOutgoingRelations() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public EList<Relation> getIncomingRelations() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Model getContainer() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public void setSecondSegment(Segment value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setModel(Model value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setFirstSegment(Segment value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setDescription(NamedElement value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setBoundaries(Rectangle value) {
        // TODO Auto-generated method stub

      }

      @Override
      public Segment getSecondSegment() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Model getModel() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Segment getFirstSegment() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public NamedElement getDescription() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Rectangle getBoundaries() {
        // TODO Auto-generated method stub
        return null;
      }
    });
    obj.setBoundaries(new Rectangle() {

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
      public void setTopLeft(Point value) {
        // TODO Auto-generated method stub

      }

      @Override
      public void setBottomRight(Point value) {
        // TODO Auto-generated method stub

      }

      @Override
      public Point getTopLeft() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Point getBottomRight() {
        // TODO Auto-generated method stub
        return null;
      }
    });
    obj.setContainer(new Model() {

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
    obj.undo();
    assertTrue(true);
  }

}
