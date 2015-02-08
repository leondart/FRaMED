package org.framed.orm.ui.tests.command;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.junit.Test;
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
import org.framed.orm.ui.command.FulfillRolesCommand;
import org.framed.orm.geometry.RelativePoint;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.model.impl.RelationImpl;

public class FulfillRolesCommandTest {

  @Test
  public void testCanExecute() {
	  FulfillRolesCommand obj = new FulfillRolesCommand();
	  obj.setFulfillment(new Relation() {
		
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
		public Object eInvoke(EOperation arg0, EList<?> arg1)
				throws InvocationTargetException {
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
		public void setTargetLabel(NamedElement value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setTarget(ModelElement value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setSourceLabel(NamedElement value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setSource(ModelElement value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setConnectionAnchor(Shape value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public NamedElement getTargetLabel() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ModelElement getTarget() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public NamedElement getSourceLabel() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ModelElement getSource() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EList<Shape> getReferencedRoles() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EList<Relation> getReferencedRelation() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Shape getConnectionAnchor() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EList<RelativePoint> getBendpoints() {
			// TODO Auto-generated method stub
			return null;
		}
	});
	  obj.setRoles(new ArrayList<Shape>());
	  
	  assertTrue(obj.canExecute());
  }

  @Test
  public void testExecute() {
	  FulfillRolesCommand obj = new FulfillRolesCommand();
	  obj.setFulfillment(new Relation() {
		
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
		public Object eInvoke(EOperation arg0, EList<?> arg1)
				throws InvocationTargetException {
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
		public void setTargetLabel(NamedElement value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setTarget(ModelElement value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setSourceLabel(NamedElement value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setSource(ModelElement value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setConnectionAnchor(Shape value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public NamedElement getTargetLabel() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ModelElement getTarget() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public NamedElement getSourceLabel() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ModelElement getSource() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EList<Shape> getReferencedRoles() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EList<Relation> getReferencedRelation() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Shape getConnectionAnchor() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EList<RelativePoint> getBendpoints() {
			// TODO Auto-generated method stub
			return null;
		}
	});
	  obj.setRoles(new ArrayList<Shape>());
	  
	  obj.execute();
	  
	  assertTrue("Can handle Exceptions", true);
  }

  @Test
  public void testUndo() {
	  FulfillRolesCommand obj = new FulfillRolesCommand();
	  obj.setFulfillment(new Relation() {
		
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
		public Object eInvoke(EOperation arg0, EList<?> arg1)
				throws InvocationTargetException {
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
		public void setTargetLabel(NamedElement value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setTarget(ModelElement value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setSourceLabel(NamedElement value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setSource(ModelElement value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setConnectionAnchor(Shape value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public NamedElement getTargetLabel() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ModelElement getTarget() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public NamedElement getSourceLabel() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ModelElement getSource() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EList<Shape> getReferencedRoles() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EList<Relation> getReferencedRelation() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Shape getConnectionAnchor() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EList<RelativePoint> getBendpoints() {
			// TODO Auto-generated method stub
			return null;
		}
	});
	  obj.setRoles(new ArrayList<Shape>());
	  
	  obj.undo();
	  
	  assertTrue("Can handle Exceptions", true);
  }

}
