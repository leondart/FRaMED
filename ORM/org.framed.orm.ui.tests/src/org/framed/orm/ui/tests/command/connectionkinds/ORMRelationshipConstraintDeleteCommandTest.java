package org.framed.orm.ui.tests.command.connectionkinds;

import static org.junit.Assert.*;

import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.geometry.Point;
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
import org.eclipse.gef.AccessibleEditPart;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.SelectionManager;
import org.eclipse.gef.EditPartViewer.Conditional;
import org.eclipse.gef.dnd.TransferDragSourceListener;
import org.eclipse.gef.dnd.TransferDropTargetListener;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.framed.orm.geometry.RelativePoint;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.connectionkinds.ORMRelationshipConstraintDeleteCommand;
import org.junit.Test;

public class ORMRelationshipConstraintDeleteCommandTest {

  @Test
  public void testCanExecute() {
	  ORMRelationshipConstraintDeleteCommand obj = new ORMRelationshipConstraintDeleteCommand();
	  obj.setEPViewer(new EditPartViewer() {
		
		@Override
		public void setSelection(ISelection arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeSelectionChangedListener(ISelectionChangedListener arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addSelectionChangedListener(ISelectionChangedListener arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void unregisterAccessibleEditPart(AccessibleEditPart acc) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setSelectionManager(SelectionManager manager) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setRouteEventsToEditDomain(boolean value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setRootEditPart(RootEditPart root) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setProperty(String propertyName, Object value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setKeyHandler(KeyHandler keyHandler) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setFocus(EditPart focus) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setEditPartFactory(EditPartFactory factory) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setEditDomain(EditDomain domain) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setCursor(Cursor cursor) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setControl(Control control) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setContextMenu(MenuManager contextMenu) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setContents(Object contents) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setContents(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void select(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void reveal(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removePropertyChangeListener(PropertyChangeListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeDropTargetListener(
				org.eclipse.jface.util.TransferDropTargetListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeDropTargetListener(TransferDropTargetListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeDragSourceListener(
				org.eclipse.jface.util.TransferDragSourceListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeDragSourceListener(TransferDragSourceListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void registerAccessibleEditPart(AccessibleEditPart acc) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public Map getVisualPartMap() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public SelectionManager getSelectionManager() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ISelection getSelection() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List getSelectedEditParts() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public RootEditPart getRootEditPart() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResourceManager getResourceManager() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Object getProperty(String key) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public KeyHandler getKeyHandler() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPart getFocusEditPart() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Map getEditPartRegistry() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPartFactory getEditPartFactory() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditDomain getEditDomain() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Control getControl() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public MenuManager getContextMenu() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPart getContents() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void flush() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public EditPart findObjectAtExcluding(Point location,
				Collection exclusionSet, Conditional conditional) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPart findObjectAtExcluding(Point location,
				Collection exclusionSet) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPart findObjectAt(Point location) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void deselectAll() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deselect(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public Control createControl(Composite composite) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void appendSelection(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addPropertyChangeListener(PropertyChangeListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addDropTargetListener(
				org.eclipse.jface.util.TransferDropTargetListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addDropTargetListener(TransferDropTargetListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addDragSourceListener(
				org.eclipse.jface.util.TransferDragSourceListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addDragSourceListener(TransferDragSourceListener listener) {
			// TODO Auto-generated method stub
			
		}
	});
	  obj.setRelation(new Relation() {
		
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
	  assertTrue(obj.canExecute());
  }

  @Test
  public void testExecute() {
	  ORMRelationshipConstraintDeleteCommand obj = new ORMRelationshipConstraintDeleteCommand();
	  obj.setEPViewer(new EditPartViewer() {
		
		@Override
		public void setSelection(ISelection arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeSelectionChangedListener(ISelectionChangedListener arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addSelectionChangedListener(ISelectionChangedListener arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void unregisterAccessibleEditPart(AccessibleEditPart acc) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setSelectionManager(SelectionManager manager) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setRouteEventsToEditDomain(boolean value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setRootEditPart(RootEditPart root) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setProperty(String propertyName, Object value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setKeyHandler(KeyHandler keyHandler) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setFocus(EditPart focus) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setEditPartFactory(EditPartFactory factory) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setEditDomain(EditDomain domain) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setCursor(Cursor cursor) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setControl(Control control) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setContextMenu(MenuManager contextMenu) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setContents(Object contents) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setContents(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void select(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void reveal(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removePropertyChangeListener(PropertyChangeListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeDropTargetListener(
				org.eclipse.jface.util.TransferDropTargetListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeDropTargetListener(TransferDropTargetListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeDragSourceListener(
				org.eclipse.jface.util.TransferDragSourceListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeDragSourceListener(TransferDragSourceListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void registerAccessibleEditPart(AccessibleEditPart acc) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public Map getVisualPartMap() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public SelectionManager getSelectionManager() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ISelection getSelection() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List getSelectedEditParts() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public RootEditPart getRootEditPart() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResourceManager getResourceManager() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Object getProperty(String key) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public KeyHandler getKeyHandler() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPart getFocusEditPart() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Map getEditPartRegistry() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPartFactory getEditPartFactory() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditDomain getEditDomain() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Control getControl() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public MenuManager getContextMenu() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPart getContents() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void flush() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public EditPart findObjectAtExcluding(Point location,
				Collection exclusionSet, Conditional conditional) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPart findObjectAtExcluding(Point location,
				Collection exclusionSet) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPart findObjectAt(Point location) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void deselectAll() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deselect(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public Control createControl(Composite composite) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void appendSelection(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addPropertyChangeListener(PropertyChangeListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addDropTargetListener(
				org.eclipse.jface.util.TransferDropTargetListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addDropTargetListener(TransferDropTargetListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addDragSourceListener(
				org.eclipse.jface.util.TransferDragSourceListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addDragSourceListener(TransferDragSourceListener listener) {
			// TODO Auto-generated method stub
			
		}
	});
	  obj.setRelation(new Relation() {
		
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
	  obj.execute();
	  assertTrue(true);
  }

  @Test
  public void testUndo() {
	  ORMRelationshipConstraintDeleteCommand obj = new ORMRelationshipConstraintDeleteCommand();
	  obj.setEPViewer(new EditPartViewer() {
		
		@Override
		public void setSelection(ISelection arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeSelectionChangedListener(ISelectionChangedListener arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addSelectionChangedListener(ISelectionChangedListener arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void unregisterAccessibleEditPart(AccessibleEditPart acc) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setSelectionManager(SelectionManager manager) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setRouteEventsToEditDomain(boolean value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setRootEditPart(RootEditPart root) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setProperty(String propertyName, Object value) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setKeyHandler(KeyHandler keyHandler) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setFocus(EditPart focus) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setEditPartFactory(EditPartFactory factory) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setEditDomain(EditDomain domain) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setCursor(Cursor cursor) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setControl(Control control) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setContextMenu(MenuManager contextMenu) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setContents(Object contents) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setContents(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void select(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void reveal(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removePropertyChangeListener(PropertyChangeListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeDropTargetListener(
				org.eclipse.jface.util.TransferDropTargetListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeDropTargetListener(TransferDropTargetListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeDragSourceListener(
				org.eclipse.jface.util.TransferDragSourceListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void removeDragSourceListener(TransferDragSourceListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void registerAccessibleEditPart(AccessibleEditPart acc) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public Map getVisualPartMap() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public SelectionManager getSelectionManager() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ISelection getSelection() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List getSelectedEditParts() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public RootEditPart getRootEditPart() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ResourceManager getResourceManager() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Object getProperty(String key) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public KeyHandler getKeyHandler() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPart getFocusEditPart() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Map getEditPartRegistry() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPartFactory getEditPartFactory() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditDomain getEditDomain() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Control getControl() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public MenuManager getContextMenu() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPart getContents() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void flush() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public EditPart findObjectAtExcluding(Point location,
				Collection exclusionSet, Conditional conditional) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPart findObjectAtExcluding(Point location,
				Collection exclusionSet) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public EditPart findObjectAt(Point location) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void deselectAll() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deselect(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public Control createControl(Composite composite) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void appendSelection(EditPart editpart) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addPropertyChangeListener(PropertyChangeListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addDropTargetListener(
				org.eclipse.jface.util.TransferDropTargetListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addDropTargetListener(TransferDropTargetListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addDragSourceListener(
				org.eclipse.jface.util.TransferDragSourceListener listener) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void addDragSourceListener(TransferDragSourceListener listener) {
			// TODO Auto-generated method stub
			
		}
	});
	  obj.setRelation(new Relation() {
		
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
	  obj.undo();
	  assertTrue(true);
  }

}
