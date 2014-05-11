/**
 * 
 */
package org.framed.orm.ui.editor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartListener;
import org.eclipse.gef.commands.CommandStackEvent;
import org.eclipse.gef.commands.CommandStackEventListener;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.framed.orm.ui.editor.ORMGraphicalEditor.EditorType;

/**
 * @author paul
 * 
 *         Builds the subject part of an observer pattern. Listens to events of the command stack
 *         and leads them to the registered observers. This class is needed, because Java forbids
 *         multi-inheritance... TODO: If there is already an observer without the need to subclass
 *         CommandStackEventListener use that one instead of this helper class
 * 
 */
public class EditorChangeNotifier implements EditPartListener, CommandStackEventListener, IPropertyListener/*, IWindowListener*/ {

  static int id = 0;
  private List<ORMGraphicalEditorPalette> observers = new ArrayList<ORMGraphicalEditorPalette>();
//  private static EditorChangeNotifier inst = null;
  private ORMGraphicalEditor parentEditor;
  
  public EditorChangeNotifier(ORMGraphicalEditor parent) {
    ++id;
    setParentEditor(parent);
  }

  public void pageChanged(int pageIndex){
//    System.out.println("Page changed: "+pageIndex);
  }
  
//  public static EditorChangeNotifier instance() {
//    if (inst == null)
//      inst = new EditorChangeNotifier();
//    return inst;
//  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.gef.commands.CommandStackEventListener#stackChanged(org.eclipse.gef.commands.
   * CommandStackEvent)
   */
  @Override
  public void stackChanged(CommandStackEvent event) {
    if (event.getCommand().getLabel() == null)
      return;
//     System.out.println("Stack changed: "+event.getCommand().getLabel());
    String type = event.getCommand().getLabel();
    
    if (type.equals("StepIn") || type.equals("GoDownTree") || type.equals("StepInNewPage"))
      getParentEditor().setEditorType(EditorType.ROLES);
    else
      getParentEditor().setEditorType(EditorType.COMPARTMENT);
    
//    /* notify all registered observers */
//    Iterator<ORMGraphicalEditorPalette> it = observers.iterator();
//
//    while (it.hasNext()) {
//      it.next().update();
//    }
  }

  public void editorTypeChanged(ORMGraphicalEditor.EditorType type){
    /* notify all registered observers */
    Iterator<ORMGraphicalEditorPalette> it = observers.iterator();

    while (it.hasNext()) {
      it.next().update(type);
    }
  }
  
  public void register(ORMGraphicalEditorPalette observer) {
    if (!observers.contains(observer))
      observers.add(observer);
  }

  public void unregister(ORMGraphicalEditorPalette observer) {
    observers.remove(observer);
  }

  @Override
  public void childAdded(EditPart child, int index) {
    Iterator<ORMGraphicalEditorPalette> it = observers.iterator();
//System.out.println("child added");
    while (it.hasNext()) {
      it.next().update(child.toString());
    }
  }

  @Override
  public void partActivated(EditPart editpart) {
    // TODO Auto-generated method stub

  }

  @Override
  public void partDeactivated(EditPart editpart) {
    // TODO Auto-generated method stub

  }

  @Override
  public void removingChild(EditPart child, int index) {
    // TODO Auto-generated method stub

  }

  @Override
  public void selectedStateChanged(EditPart editpart) {
    // TODO Auto-generated method stub

  }

  @Override
  public void propertyChanged(Object source, int propId) {
    // TODO Auto-generated method stub
    
//    System.out.println("Property changed("+id+"): "+source);
  }

  public ORMGraphicalEditor getParentEditor() {
    return parentEditor;
  }

  public void setParentEditor(ORMGraphicalEditor parentEditor) {
    this.parentEditor = parentEditor;
  }

}
