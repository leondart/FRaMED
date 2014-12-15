package org.framed.orm.ui.editPart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.jface.viewers.TextCellEditor;
import org.framed.orm.model.Attribute;
import org.framed.orm.ui.editPolicy.ORMAttributeOperationComponentEditPolicy;
import org.framed.orm.ui.editPolicy.ORMNamedElementDirectEditPolicy;
import org.framed.orm.ui.editPolicy.ORMDragEditPartsTracker;
import org.framed.orm.ui.editor.ORMNodeCellEditorLocator;
import org.framed.orm.ui.editor.ORMNodeDirectEditManager;

/**
 * This {@link EditPart} is the controller for the model element {@link Attribute}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMAttributeEditPart extends AbstractGraphicalEditPart {

  /**
   * The {@link Adapter} of this controller, which recieves the notifications from the viewer/user.
   * This {@link EditPart} reacts on the notifications
   */
  private final ORMAttributeAdapter adapter;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent and initializing it's {@link Adapter}.
   */
  public ORMAttributeEditPart() {
    super();
    adapter = new ORMAttributeAdapter();
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.eclipse.gef.editparts.AbstractGraphicalEditPart#getDragTracker(org.eclipse.gef.Request)
   */
  @Override
  public DragTracker getDragTracker(final Request request) {
    return new ORMDragEditPartsTracker(this);
  }

  /** {@inheritDoc} {@link Attribute}s have as figure a simple {@link Label}. */
  @Override
  protected IFigure createFigure() {
    return new Label();
  }

  /** {@inheritDoc} */
  @Override
  protected void createEditPolicies() {
    // edit policy for handling requests of editing the attribute name
    installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ORMNamedElementDirectEditPolicy());
    // edit policy, which handels requests for deleting the {@link Attribute}, which is controlled
    // through this edit part
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new ORMAttributeOperationComponentEditPolicy());
  }

  /** {@inheritDoc} */
  @Override
  public void performRequest(final Request req) {
    // handle requests for direct editing the attribute name
    if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
      performDirectEditing();
    }
  }

  /**
   * This method initializes and starts the {@link ORMNodeDirectEditManager} for direct editing the
   * attribute name.
   */
  private void performDirectEditing() {
    final Label label = (Label) (getFigure());
    final ORMNodeDirectEditManager manager =
        new ORMNodeDirectEditManager(this, TextCellEditor.class,
            new ORMNodeCellEditorLocator(label), label);
    manager.show(); // refresh view
  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} updates the text(shorten attribute
   * name) and the tooltip(complete attribute name) of the attribute figure({@link Label}.
   * 
   */
  @Override
  protected void refreshVisuals() {
    final Label label = (Label) getFigure();
    final Attribute model = (Attribute) getModel();


    label.setText(model.getName());
    label.setToolTip(new Label(model.getName()));
  }

  /** {@inheritDoc} */
  @Override
  public void activate() {
    if (!isActive()) {
      ((Attribute) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  /** {@inheritDoc} */
  @Override
  public void deactivate() {
    if (isActive()) {
      ((Attribute) getModel()).eAdapters().remove(adapter);
    }

    super.deactivate();
  }

  /**
   * The {@link Adapter} of this {@link EditPart}. An adapter is a receiver of notifications and is
   * typically associated with a Notifier via an AdapterFactory. This {@link Adapter} calls the
   * refreshVisuals() method when it gets a change notification.
   * 
   * */
  public class ORMAttributeAdapter implements Adapter {

    /** {@inheritDoc} */
    @Override
    public void notifyChanged(final Notification notification) {
      refreshVisuals();

    }

    /** {@inheritDoc} */
    @Override
    public Notifier getTarget() {
      return (Attribute) getModel();
    }
    
    /** {@inheritDoc} */
    @Override
    public void setTarget(final Notifier newTarget) {
      // Do nothing.
    }

    /** {@inheritDoc} */
    @Override
    public boolean isAdapterForType(final Object type) {
      return type.getClass().equals(Attribute.class);
    }
  }
}
