package org.framed.orm.ui.editPart.shape;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.ActionEvent;
import org.eclipse.draw2d.ActionListener;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPart.ORMModelEditPart;
import org.framed.orm.ui.editor.Activator;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.editor.ORMMultiPageEditor;
import org.framed.orm.ui.figure.shapes.ORMCompartmentV1Figure;
import org.framed.orm.ui.figure.shapes.ORMCompartmentV2Figure;
import org.framed.orm.ui.figure.ORMFigureFactory;
import org.framed.orm.ui.figure.shapes.PartFigure;

/**
 * This {@link EditPart} is the controller for a {@link Shape} from type compartmenttype.
 * 
 * @author Kay Bierzynski
 * */
public class ORMCompartmentEditPart extends ORMShapeWithSegmentEditPart {
  /**
   * Defines the Number of Visible Roles per Compartment in the overview.
   */
  private final static int VisibleRoles = 5; // TODO: Should be extracted to a Configuration File

  /**
   * A {@link PartFigure} in which all {@link Shape}s from type role type and rolegroup that the
   * {@link Model} of this compartment contains are listed. A global variable is helpful, because
   * this {@link PartFigure} is used in the methods refreshVisual() and addChildVisual().
   */
  private PartFigure rolePart = null;
  /**
   * The {@link ORMModelEditPart} of the {@link Model}, which is owned by this compartment. A global
   * variable for this is nessecary, because the rmed is set addChildVisual() method in this class
   * and than used in buttonExpand() method in this class.
   */
  private ORMModelEditPart rmed = null;

  /**
   * {@inheritDoc} A Shape from type compartmenttype has as a figure a
   * {@link ORMCompartmentV1Figure}, when the user didn't step in it, and a
   * {@link ORMCompartmentV2Figure}, when the user did step in it.
   */
  @Override
  protected IFigure createFigure() {
    final ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) getViewer().getEditDomain()).getEditorPart();

    Figure fig = ORMFigureFactory.createFigure(this);
    // when this compartment editpart is not "opened"(steped in) use as
    // figure
    // ORMCompartmentV1Figure
    if (fig instanceof ORMCompartmentV1Figure) {
      return fig;
    }
    // when this edit part is "opened"(steped in) use ORMCompartmentV2Figure
    else {
      return completeORMCompartmentV2Figure((Shape) getModel(), editorPart.getIsEditorData(), fig);
    }
  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} the names of all roleTypes and
   * roleGroups in the child {@link Model} are added to the rolePart and the method
   * {@link ORMSuperShapeEditPart#refreshVisuals()} is called.
   * 
   */
  @Override
  public void refreshVisuals() {
    super.refreshVisuals();

    if (rolePart != null) {
      rolePart.removeAll();
      Model model = ((Shape) getModel()).getModel();
      addNamesToRolePart(model);

    }
  }

  /**
   * {@inheritDoc} In case of this {@link ORMCompartmentEditPart} that would be the figure of a
   * {@link Model}. If the figure of the {@link Model} or the rolePart is added to this compartment
   * depends on which version of the compartment figure is used also if the user has steped into thr
   * compartment or not. ( the adding of segment figures is handelt through calling
   * {@link ORMShapeWithSegmentEditPart#addChildVisual(EditPart, index)}.
   */
  @Override
  protected void addChildVisual(final EditPart childEditPart, final int index) {
    super.addChildVisual(childEditPart, index);
    IFigure contentPane = null;

    if (childEditPart.getModel() instanceof Model && rolePart == null) {

      // when figure is Version 2
      if (getParent() instanceof ScalableRootEditPart) {
        contentPane = ((ORMCompartmentV2Figure) getFigure()).getBasicRec();
        contentPane.add(((ORMModelEditPart) childEditPart).getFigure(), BorderLayout.CENTER);
        rmed = (ORMModelEditPart) childEditPart;
      }
      // when figure is Version 1
      else {
        contentPane = ((ORMCompartmentV1Figure) getFigure()).getBasicRec();
        Model rm = (Model) ((ORMModelEditPart) childEditPart).getModel();
        rolePart = new PartFigure();
        addNamesToRolePart(rm);
        contentPane.add(rolePart);

        rmed = (ORMModelEditPart) childEditPart;
      }
    }
  }

  /**
   * The first thing, which is done in this method is that a {@link Label} with the text ROLES is
   * added to the rolesPart. After that all names of all {@link Shape}s from type roletype and
   * rolegroup, which are in the child {@link Model} of this compartmenttype, are added to the
   * rolePart. When are more then three names in the rolePart list a ... label is added in the
   * tooltip of the ... label the names of the remaining roletypes and rolegroups are shown.
   * */
  private void addNamesToRolePart(final Model model) {
    Label lab = new Label();

    Label collectLabel = new Label();
    collectLabel.setText("....");
    PartFigure collectLabels = new PartFigure();

    int sizeList = 0;

    lab.setText("ROLES");
    rolePart.add(lab);

    for (ModelElement role : model.getElements()) {
      if (role instanceof Shape) {
        Shape shape = (Shape) role;
        if (shape.getType().equals(Type.ROLE_TYPE) || shape.getType().equals(Type.ROLE_GROUP)) {
          Label label = new Label();
          Label label2 = new Label();
          String labelText;

          label2.setText("For Editing please go in the Compartment.");
          sizeList = rolePart.getChildren().size();

          labelText = shape.getName();

          label.setText(labelText);
          label.setToolTip(label2);
          if (sizeList <= VisibleRoles) {
            rolePart.add(label);
          } else {
            collectLabels.add(label);
          }
        }
      }

      if (sizeList > VisibleRoles) {
        collectLabel.setToolTip(collectLabels);
        rolePart.add(collectLabel);
      }
    }
  }

  /**
   * When the user has stepped in a compartmenttype than the attribute and operation segment should
   * be shown in a structure, which can expanded and collapsed through a button. The functionality
   * of the button also expanding and the collapsing are done in this method.
   * */
  private void buttonExpand(final boolean isEditorData) {

    // get ormgraphicaleditor which owns the compartment to get parent
    // multipageeditor
    final ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) this.getViewer().getEditDomain()).getEditorPart();
    // get parent multipageeditor to synchronize the behavouir and data
    // ORMGraphicalEditors
    final ORMMultiPageEditor parent = (ORMMultiPageEditor) editorPart.getParentEditor();

    // get figure to remove/add the attriute and method list
    final ORMCompartmentV2Figure figure = (ORMCompartmentV2Figure) getFigure();

    final Image imageExpand =
        new Image(null, Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
            "icons/expandArrow3.png").createImage(), SWT.IMAGE_COPY);

    final Image imageCollapse =
        new Image(null, Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
            "icons/collapseArrow3.png").createImage(), SWT.IMAGE_COPY);

    // if branch: is for the case when the structure is expanded and should
    // be collapsed
    // else branch: is for the case when the structure is collapsed and
    // should be expanded
    if (figure.isExpanded()) {
      figure.getListAttOpt().remove(childFigureList.get(0));

      if (!isEditorData) {
        figure.getListAttOpt().remove(childFigureList.get(1));
      }

      ((Label) figure.getButton().getChildren().get(0)).setIcon(imageExpand);
      // switch the expandstate
      figure.setExpandState(!figure.isExpanded());

      // change the borders of the child model
      rmed.refreshVisuals();

      // synchronize the viewer of the two Editor of the MultiPageEditor
      if (!(isEditorData)) {
        parent.getDataEditor().getOwnViewer()
            .setContents(parent.getDataEditor().getOwnViewer().getContents().getModel());
      } else {
        parent.getBehaviorEditor().getOwnViewer()
            .setContents(parent.getBehaviorEditor().getOwnViewer().getContents().getModel());
      }

    } else {
      figure.getListAttOpt().add(childFigureList.get(0));

      if (!isEditorData) {
        figure.getListAttOpt().add(childFigureList.get(1));
      }

      ((Label) figure.getButton().getChildren().get(0)).setIcon(imageCollapse);
      // switch the expandstate
      figure.setExpandState(!figure.isExpanded());

      // change the borders of the child rolemodel
      rmed.refreshVisuals();

      // synchronize between the two Editor of the MultiPageEditor
      if (!(isEditorData)) {
        parent.getDataEditor().getOwnViewer()
            .setContents(parent.getDataEditor().getOwnViewer().getContents().getModel());
      } else {
        parent.getBehaviorEditor().getOwnViewer()
            .setContents(parent.getBehaviorEditor().getOwnViewer().getContents().getModel());
      }
    }

  }

  /**
   * This method does the complets the setup of the {@link ORMCompartmentV2Figure}. That means it
   * adds the collapse image to the button and sets the action listener of this button. The
   * {@link ActionListener} calls on notification the method buttonExpand.
   * */
  private ORMCompartmentV2Figure completeORMCompartmentV2Figure(final Shape model,
      final boolean isEditorData, Figure fig) {

    ORMCompartmentV2Figure figure = (ORMCompartmentV2Figure) fig;

    Image imageCollapse =
        new Image(null, Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
            "icons/collapseArrow3.png").createImage(), SWT.IMAGE_COPY);

    figure.getBasicRec().setAntialias(SWT.ON);
    figure.getButton().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent event) {

        buttonExpand(isEditorData);
      }
    });

    ((Label) figure.getButton().getChildren().get(0)).setIcon(imageCollapse);

    return figure;

  }

  /**
   * A border class where a border is drawn at top side of the figure.
   * */
  public class PartFigureBorderNotExpand extends AbstractBorder {

    /** {@inheritDoc} */
    public Insets getInsets(IFigure figure) {
      return new Insets(1, 0, 0, 0);
    }

    /** {@inheritDoc} */
    public void paint(IFigure figure, Graphics graphics, Insets insets) {
      graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(), tempRect.getTopRight());

    }
  }

}
