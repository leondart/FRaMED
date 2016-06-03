/**
 * 
 */
package org.framed.orm.ui.editor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.gef.commands.CommandStackEvent;
import org.eclipse.gef.commands.CommandStackEventListener;

/**
 * @author paul
 * 
 *         Builds the subject part of an observer pattern. Listens to events of the command stack
 *         and leads them to the registered observers. This class is needed, because Java forbids
 *         multi-inheritance... TODO: If there is already an observer without the need to subclass
 *         CommandStackEventListener use that one instead of this helper class
 * 
 */
public class EditorChangeNotifier implements CommandStackEventListener {

  static int id = 0;
  private List<ORMGraphicalEditorPalette> observers = new ArrayList<ORMGraphicalEditorPalette>();
  private ORMGraphicalEditor parentEditor;

  public EditorChangeNotifier(ORMGraphicalEditor parent) {
    ++id;
    setParentEditor(parent);
  }


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
    String type = event.getCommand().getLabel();

    /* notify all registered observers */
    Iterator<ORMGraphicalEditorPalette> it = observers.iterator();

    while (it.hasNext()) {
      it.next().update(type);
    }
  }

  public void editorTypeChanged(ORMGraphicalEditor.EditorType type) {
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

  public ORMGraphicalEditor getParentEditor() {
    return parentEditor;
  }

  public void setParentEditor(ORMGraphicalEditor parentEditor) {
    this.parentEditor = parentEditor;
  }

}
