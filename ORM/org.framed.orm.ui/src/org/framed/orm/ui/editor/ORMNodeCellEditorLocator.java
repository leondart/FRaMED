package org.framed.orm.ui.editor;


import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Text;


/**
 * This class creates a small editor for label editing and locates it correctly.
 * 
 * @author Kay Bierzynski
 * */
public class ORMNodeCellEditorLocator implements CellEditorLocator {

  /** The {@link Label}, whose text the user wants edit. */
  private final Label nameLabel;

  /**
   * The constructor of this class, where the {@link Label}, whose text the user wants edit, is set.
   */
  public ORMNodeCellEditorLocator(final Label label) {
    this.nameLabel = label;
  }

  /**
   * Creates a cell on the position of the {@link Label}, whose text the user wants edit.
   */
  @Override
  public void relocate(final CellEditor celleditor) {
    final Text text = (Text) celleditor.getControl(); // get the default editor cell
    final Point pref = text.computeSize(SWT.DEFAULT, SWT.DEFAULT);
    final Rectangle rect =
        (nameLabel.getBounds().isEmpty()) ? new Rectangle() : nameLabel.getTextBounds().getCopy();
    nameLabel.translateToAbsolute(rect);
    text.setBounds(rect.x - 1, rect.y - 1, pref.x + 1, pref.y + 1);
  }

}
