package org.framed.orm.ui.editor;


import org.eclipse.draw2d.Label;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;


/**
 * Manages the direct edit operation by creating and maintaining the
 * org.eclipse.jface.viewers.CellEditor and executing the resulting command if the cell editor value
 * has changed.
 * 
 * @author Kay Bierzynski
 * @author Lars Schuetze (refactoring)
 * */
public class ORMNodeDirectEditManager extends DirectEditManager {

  /** The {@link Label}, whose text the user wants edit. */
  private final Label label;

  /**
   * The constructor of this class, where the
   * {@link DirectEditManager#DirectEditManager(GraphicalEditPart, Class, CellEditorLocator, Object)}
   * is called and the {@link Label}, whose text the user wants edit is set.
   * */
  public ORMNodeDirectEditManager(final GraphicalEditPart source, final Class editorType,
      final CellEditorLocator locator, final Label label) {
    super(source, editorType, locator);
    this.label = label;
  }

  /**
   * Sets the initial text in the cell editor. Usually it's the text of the label.
   */
  @Override
  protected void initCellEditor() {
    getCellEditor().setValue(label.getText());
  }

}
