/**
 * 
 */
package org.framed.orm.ui.editPart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.jface.viewers.TextCellEditor;
import org.framed.orm.model.RelationLabel;
import org.framed.orm.ui.editPolicy.ORMRelationLabelEditPolicy;
import org.framed.orm.ui.editor.ORMNodeCellEditorLocator;
import org.framed.orm.ui.editor.ORMNodeDirectEditManager;
import org.framed.orm.ui.figure.LabelFigure;

/**
 * @author Lars Schuetze
 * 
 */
public class ORMRelationLabelEditPart extends AbstractGraphicalEditPart {

  private final Adapter adapter;

  public ORMRelationLabelEditPart() {
    super();
    adapter = new RelationLabelAdapter();
  }

  @Override
  protected IFigure createFigure() {
    return new LabelFigure();
  }

  protected LabelFigure getRelationLabelFigure() {
    return (LabelFigure) getFigure();
  }

  @Override
  protected void createEditPolicies() {
    installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ORMRelationLabelEditPolicy());
  }

  @Override
  public void performRequest(Request req) {
    if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
      performDirectEditing();
    }
  }

  private void performDirectEditing() {
    ORMNodeDirectEditManager manager =
        new ORMNodeDirectEditManager(this, TextCellEditor.class, new ORMNodeCellEditorLocator(
            getRelationLabelFigure().getTextFlow()), getRelationLabelFigure().getTextFlow());
    manager.show();
  }

  @Override
  protected void refreshVisuals() {
    getRelationLabelFigure().setText(getRelationLabel().getLabel());
    super.refreshVisuals();
  }

  private RelationLabel getRelationLabel() {
    return (RelationLabel) getModel();
  }

  public boolean isRelationEnd() {
    return getRelationLabel().isIsRelationEnd();
  }

  public void setIsRelationEnd(boolean isRelationEnd) {
    if (isRelationEnd != isRelationEnd()) {
      getRelationLabel().setIsRelationEnd(isRelationEnd);
    }
  }

  @Override
  public void activate() {
    if (!isActive()) {
      getRelationLabel().eAdapters().add(adapter);
    }
    super.activate();
  }

  @Override
  public void deactivate() {
    if (isActive()) {
      getRelationLabel().eAdapters().remove(adapter);
    }
    super.deactivate();
  }

  private class RelationLabelAdapter implements Adapter {

    @Override
    public void notifyChanged(Notification notification) {
      refreshVisuals();
    }

    @Override
    public Notifier getTarget() {
      return getRelationLabel();
    }

    @Override
    public void setTarget(Notifier newTarget) {
      // do nothing.
    }

    @Override
    public boolean isAdapterForType(Object type) {
      return type.getClass().equals(type.getClass());
    }

  }

}
