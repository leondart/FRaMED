/**
 * 
 */
package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.tools.DragEditPartsTracker;

/**
 * @author Lars Schuetze
 * 
 */
public class ORMDragEditPartsTracker extends DragEditPartsTracker {

  public ORMDragEditPartsTracker(EditPart sourceEditPart) {
    super(sourceEditPart);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.gef.tools.DragEditPartsTracker#handleDragInProgress()
   */
  @Override
  protected boolean handleDragInProgress() {
    return false;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.gef.tools.AbstractTool#handleDrag()
   */
  @Override
  protected boolean handleDrag() {
    return false;
  }

}
