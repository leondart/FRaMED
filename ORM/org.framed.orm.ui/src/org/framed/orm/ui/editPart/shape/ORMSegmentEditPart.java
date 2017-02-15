package org.framed.orm.ui.editPart.shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Segment;
import org.framed.orm.ui.editPart.ORMNamedElementEditPart;
import org.framed.orm.ui.editPolicy.EditPolicyHandler;
import org.framed.orm.ui.editPolicy.ORMSegmentXYLayoutPolicy;
import org.framed.orm.ui.figure.ORMFigureFactory;
import org.framed.orm.ui.figure.shapes.PartFigure;

/**
 * This {@link EditPart} is for {@link Segment}s.
 *
 * @author Kay Bierzynski
 * */
public class ORMSegmentEditPart extends AbstractGraphicalEditPart {

	/* editpolicyHandler for checking configuration in canExecute() of commands */
	private EditPolicyHandler ep;

  /**
   * Defines the Number of Visible Children per Segment.
   */
  private final static int VisibleChildren = 1024; // TODO: Should be extracted to a Configuration
                                                   // File

  /**
   * The {@link Adapter} of this controller, which recieves the notifications from the viewer/user.
   * This {@link EditPart} reacts on the notifications
   */
  private final ORMSegmentAdapter adapter;

  // TODO: find better names
  /**
   * A {@link Label} which will contain collectionEle as tooltip and has a text ... . A global
   * variablie is nessecary, because this variable is used in methods addChildVisual and
   * removeChildVisual.
   * */
  private final Label collectNamedElement;

  /**
   * A {@link PartFigure} which contains the names of all {@link NamedElement}s that doesn't fit in
   * the named element list of the segment figure, when the named element list already contains
   * three lements. A global variable is nessecary, because this variable is used in methods
   * addChildVisual and removeChildVisual.
   */
  private final PartFigure collectionEle;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent, initializing it's {@link Adapter} and initializing the global variables
   * collectNamedElement and collectionEle.
   */
  public ORMSegmentEditPart(EditPolicyHandler ep) {
    super();
    adapter = new ORMSegmentAdapter();
    collectNamedElement = new Label();
    collectNamedElement.setText("...");
    collectionEle = new PartFigure();
	this.ep = ep;
  }

  /** {@inheritDoc} A {@link Segment} has as a figure a {@link PartFigure}. */
  @Override
  protected IFigure createFigure() {
    return ORMFigureFactory.createFigure(this);
  }

  @Override
  public boolean isSelectable() {
    return false;
  }

  /**
   * {@inheritDoc} In case of this {@link EditPart} that would be the figure of {@link NamedElement}
   * s. When more than 3 named elements are added to this {@link Segment}, than the label
   * collectNamedElement( it has as a text ...) are added and the names of the named elements with
   * index >2 are collected and shown in the tooltip(collectionEle) of the label
   * collectNamedElement.
   *
   * */
  @Override
  protected void addChildVisual(final EditPart childEditPart, final int index) {

    if (!(childEditPart.getModel() instanceof ModelElement)) {
      final IFigure contentPane = getFigure();
      final ORMNamedElementEditPart attrEditPart = (ORMNamedElementEditPart) childEditPart;

      final NamedElement namedElement = (NamedElement) childEditPart.getModel();

      final List<NamedElement> temp = new ArrayList<NamedElement>();
      temp.addAll(((Segment) getModel()).getElements());
      // the namedElements should be added to the collectionEle and the collectNamedElement in
      // reversed
      // order
      Collections.reverse(temp);

      final int namedElementIndex = temp.indexOf(namedElement);

      addChildToCorrectPosition(namedElementIndex, attrEditPart, contentPane, collectNamedElement,
          collectionEle);
    }
  }

  /**
   * This method adds a {@link NamedElement} to the named element list of the segment figure and
   * when named elment list contains more than three named elements the latest added named element
   * is removed from the named element list and added to collectionEle and the label
   * collectNamedElement is added.
   * */
  private void addChildToCorrectPosition(final int index, final GraphicalEditPart childEditPart,
      final IFigure contentPane, final Label collect, final PartFigure collection) {

    if (index < VisibleChildren) {
      // if the contentPane contains not more than index+1 children not more than three children
      // than total than the named element should be added at top of the attribute/method
      // list(contentPane) else the child is added on it's index
      if (contentPane.getChildren().size() <= index + 1
          && contentPane.getChildren().size() != VisibleChildren) {
        contentPane.add(childEditPart.getFigure(), 0);
      } else {
        contentPane.add(childEditPart.getFigure(), index);
      }

      // if the contentPane has more than four children and the contentPane doesn't contain collect
      // label that the collect label is added at the end of the contentPane, the collection is
      // added to the collect label as tootltip and the first added(to the contentPan) child figure
      // is removed from contentPane an added to the collection
      if (contentPane.getChildren().size() >= (VisibleChildren + 1)
          && !contentPane.getChildren().get(VisibleChildren).equals(collect)) {

        contentPane.add(collect);
        collect.setToolTip(collection);


        IFigure childfig =
            (IFigure) contentPane.getChildren().get(
                contentPane.getChildren().size() - (VisibleChildren - 1));
        contentPane.getChildren().remove(childfig);
        collection.add(childfig, 0);
      }
    } else {

      if (!contentPane.getChildren().contains(collect)) {
        contentPane.add(collect);
        collect.setToolTip(collection);
      }
      // works only for the attribute/operation adding paradigm first to add is last in tool tip
      // list
      collection.add(childEditPart.getFigure(), 0);

    }
  }

  /**
   * {@inheritDoc} In case of this {@link EditPart} that would be the figures of
   * {@link NamedElement}s. Depending on the index of the named element it is removed from the
   * contentPane or the collectionEle. When after the removing the contentPane has less than four
   * children and has a collectNamedElement, which has at least one children, than a children is
   * taken from collectionNamedElement and added before the collectEle. At end this method tests if
   * the collectionNamedElement contains at least one children when not than the the collectEle is
   * removed from the conetntPane.
   *
   * */
  @Override
  protected void removeChildVisual(final EditPart childEditPart) {

    if (!(childEditPart.getModel() instanceof ModelElement)) {
      IFigure contentPane = getFigure();

      if (contentPane.getChildren().contains(((ORMNamedElementEditPart) childEditPart).getFigure())) {
        contentPane.remove(((ORMNamedElementEditPart) childEditPart).getFigure());
      } else {
        collectionEle.remove(((ORMNamedElementEditPart) childEditPart).getFigure());
      }

      if (contentPane.getChildren().contains(collectNamedElement)) {

        if (contentPane.getChildren().size() <= VisibleChildren) {
          IFigure child = (IFigure) collectionEle.getChildren().get(0);
          contentPane.remove(collectNamedElement);
          contentPane.add(child);
          contentPane.add(collectNamedElement);
        }

        if (collectionEle.getChildren().size() == 0) {
          contentPane.remove(collectNamedElement);
        }
      }
    }
  }

  /** {@inheritDoc} */
  @Override
  protected List getModelChildren() {
    Segment segment = (Segment) getModel();
    return segment.getElements();
  }


  /** {@inheritDoc} */
  @Override
  public void setLayoutConstraint(EditPart child, IFigure childFigure, Object constraint) {
    if (constraint != null) {
      childFigure.getParent().setConstraint(childFigure, constraint);
    }
  }

  /** {@inheritDoc} */
  @Override
  public void activate() {
    if (!isActive()) {
      ((Segment) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  /** {@inheritDoc} */
  @Override
  public void deactivate() {
    if (isActive()) {
      ((Segment) getModel()).eAdapters().remove(adapter);
    }

    super.deactivate();
  }


  /**
   * The {@link Adapter} of this {@link EditPart}. An adapter is a receiver of notifications and is
   * typically associated with a Notifier via an AdapterFactory. This {@link Adapter} calls the
   * refreshChildren() method when it gets a change notification.
   * */
  public class ORMSegmentAdapter implements Adapter {

    /** {@inheritDoc} */
    @Override
    public void notifyChanged(final Notification notification) {
      refreshChildren();
    }

    /** {@inheritDoc} */
    @Override
    public Notifier getTarget() {
      return (Segment) getModel();
    }

    /** {@inheritDoc} */
    @Override
    public void setTarget(final Notifier newTarget) {
      // Do nothing.
    }

    /** {@inheritDoc} */
    @Override
    public boolean isAdapterForType(final Object segment) {
      return segment.equals(Segment.class);
    }
  }


  @Override
  protected void createEditPolicies() {
    // the ORMSegmentXYLayoutPolicy is added here(although it does nothing) so that attributes and
    // operations are selectable
    installEditPolicy(EditPolicy.LAYOUT_ROLE, new ORMSegmentXYLayoutPolicy(ep));
  }


}
