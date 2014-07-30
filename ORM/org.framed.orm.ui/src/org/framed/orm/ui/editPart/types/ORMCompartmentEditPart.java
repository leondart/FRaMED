package org.framed.orm.ui.editPart.types;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.ActionEvent;
import org.eclipse.draw2d.ActionListener;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.ui.actions.SaveAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Node;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleType;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.ExpandStateChangeCommand;
import org.framed.orm.ui.editPart.ORMRolemodelEditPart;
import org.framed.orm.ui.editPolicy.ORMNodeGraphicalNodeEditPolicy;
import org.framed.orm.ui.editor.Activator;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.editor.ORMMultiPageEditor;
import org.framed.orm.ui.figure.ORMCompartmentV1Figure;
import org.framed.orm.ui.figure.ORMCompartmentV2Figure;
import org.framed.orm.ui.figure.PartFigure;


/**
 * This {@link EditPart} is the controller for the model element {@link Compartment}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMCompartmentEditPart extends ORMTypeEditPart {

  /**
   * A {@link PartFigure} in which all {@link RoleType}s and {@link RoleGroup}s that the
   * {@link Compartment}s {@link Rolemodel} contains are listed. A global variable is helpful,
   * because this {@link PartFigure} is used in the methods refreshVisual() and addChildVisual().
   */
  private PartFigure rolePart = null;
  /**
   * The {@link ORMRolemodelEditPart} of the {@link Rolemodel}, which is owned by this
   * {@link Compartment}. A global variable for this is nessecary, because the rmed is set
   * addChildVisual() method in this class and than used in buttonExpand() method in this class.
   */
  private ORMRolemodelEditPart rmed = null;


  /**
   * A getter for the boundaries of the {@link Compartment}.
   * 
   * @return model.getConstraints()
   * */
  @Override
  public Rectangle getConstraints() {
    Compartment model = (Compartment) getModel();
    return model.getConstraints();
  }

  /**
   * {@inheritDoc} A {@link Compartment} has as a figure a {@link ORMCompartmentV1Figure}, when the
   * user didn't step in it, and a {@link ORMCompartmentV2Figure}, when the user did step in it.
   */
  @Override
  protected IFigure createFigure() {
    final Compartment model = (Compartment) getModel();
    final ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) getViewer().getEditDomain()).getEditorPart();

    // when this compartment editpart is not "opened"(steped in) use as figure
    // ORMCompartmentV1Figure
    if (getParent().getModel() instanceof Rolemodel
        || getParent().getModel() instanceof CompartmentDiagram) {

      return new ORMCompartmentV1Figure(editorPart.getIsEditorData(), (Node) getModel());
    }
    // when this edit part is "opened"(steped in) use ORMCompartmentV2Figure
    else {
      return createORMCompartmentV2Figure(model, editorPart.getIsEditorData());
    }
  }

  /**
   * {@inheritDoc} GRAPHICAL_NODE_ROLE Policy must be installed here so that we can make the
   * {@link Compartment} unselectable for connection creation, when the user steped in the
   * compartment. The other {@link EditPolicy}s are installed through calling
   * {@link ORMTypeEditPart#createEditPolicies()}.
   * 
   * */
  @Override
  public void createEditPolicies() {
    super.createEditPolicies();
    if (!(getParent() instanceof ScalableRootEditPart)) {
      installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ORMNodeGraphicalNodeEditPolicy());
    }

  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} the names of all {@link RoleType}s
   * and {@link RoleGroup}s in the child {@link Rolemodel} are added to the rolePart and the method
   * {@link ORMTypeEditPart#refreshVisuals()} is called.
   * 
   */
  @Override
  public void refreshVisuals() {
    super.refreshVisuals();

    if (rolePart != null) {
      rolePart.removeAll();
      Rolemodel rm = ((Compartment) getModel()).getRolemodel();
      addNamesToRolePart(rm);

    }
  }

  /**
   * {@inheritDoc} In case of this {@link ORMCompartmentEditPart} that would be the figure of a
   * {@link Rolemodel}. If the figure of the {@link Rolemodel} or the rolePart is added to this
   * {@link Compartment} depends on which version of the compartment figure is used also if the user
   * has steped in compartment or not. ( the adding of attribute and method figures is handelt
   * through calling {@link ORMTypeEditPart#addChildVisual(EditPart, int)}.
   */
  @Override
  protected void addChildVisual(final EditPart childEditPart, final int index) {
    super.addChildVisual(childEditPart, index);
    IFigure contentPane = null;

    if (childEditPart.getModel() instanceof Rolemodel && rolePart == null) {

      // when figure is Version 2
      if (getParent() instanceof ScalableRootEditPart) {
        contentPane = ((ORMCompartmentV2Figure) getFigure()).getBasicRec();
        contentPane.add(((ORMRolemodelEditPart) childEditPart).getFigure(), BorderLayout.CENTER);
        rmed = (ORMRolemodelEditPart) childEditPart;
      }
      // when figure is Version 1
      else {
        contentPane = ((ORMCompartmentV1Figure) getFigure()).getBasicRec();
        Rolemodel rm = (Rolemodel) ((ORMRolemodelEditPart) childEditPart).getModel();
        rolePart = new PartFigure();
        addNamesToRolePart(rm);
        contentPane.add(rolePart);

        rmed = (ORMRolemodelEditPart) childEditPart;
      }
    }
  }

  /**
   * The first thing, which is done in this method is that a {@link Label} with the text ROLES is
   * added to the rolesPart. After that all {@link RoleType}s and {@link RoleGroup}s names, which
   * are in the child {@link Rolemodel} (this will change in later version of the model) of this
   * compartment, are added to the rolePart. When are more then three names in the rolePart list a
   * ... label is added in the tooltip of the ... label the names of the remaining {@link RoleType}s
   * and {@link RoleGroup}s are shown.
   * */
  private void addNamesToRolePart(final Rolemodel rm) {
    Label lab = new Label();

    Label collectLabel = new Label();
    collectLabel.setText("....");
    PartFigure collectLabels = new PartFigure();

    int sizeList = 0;

    lab.setText("ROLES");
    rolePart.add(lab);
    List<AbstractRole> children = new ArrayList<AbstractRole>();
    children.addAll(rm.getParticipants());

    for (AbstractRole role : children) {
      Label label = new Label();
      Label label2 = new Label();
      String labelText;

      label2.setText("For Editing please go in the Compartment.");
      sizeList = rolePart.getChildren().size();

      labelText = ((Node) role).getName();

      label.setText(labelText);
      label.setToolTip(label2);
      if (sizeList <= 3) {
        rolePart.add(label);
      } else {
        collectLabels.add(label);
      }
    }

    if (sizeList > 3) {
      collectLabel.setToolTip(collectLabels);
      rolePart.add(collectLabel);
    }
  }

  /**
   * When the user has stepped in a {@link Compartment} than the attribute and method lists should
   * be shown in a structure, which can expanded and collapsed through a button. The functionality
   * of the button also expanding and the collapsing are done in this method.
   * */
  private void buttonExpand(final boolean isEditorData) {

    // get ormgraphicaleditor which owns the compartment to get parent multipageeditor
    final ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) this.getViewer().getEditDomain()).getEditorPart();
    // get parent multipageeditor to synchronize the behavouir and data ORMGraphicalEditors
    final ORMMultiPageEditor parent = (ORMMultiPageEditor) editorPart.getParentEditor();

    // get figure to remove/add the attriute and method list
    final ORMCompartmentV2Figure figure = (ORMCompartmentV2Figure) getFigure();
    // get model to setup ExpandStateChangeCommand and to retrive the expand state
    final Type model = (Type) getModel();

    final ExpandStateChangeCommand command = new ExpandStateChangeCommand();
    command.setType(model);

    // create save action
    final SaveAction save = new SaveAction(editorPart);


    final Image imageExpand =
        new Image(null, Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
            "icons/expandArrow3.png").createImage(), SWT.IMAGE_COPY);

    final Image imageCollapse =
        new Image(null, Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
            "icons/collapseArrow3.png").createImage(), SWT.IMAGE_COPY);

    // if branch: is for the case when the structure is expanded and should be collapsed
    // else branch: is for the case when the structure is collapsed and should be expanded
    if (model.isIsExpand()) {
      figure.getListAttMet().remove(figure.getAttributeFigure());

      if (!isEditorData) {
        figure.getListAttMet().remove(figure.getMethodeFigure());
      }

      ((Label) figure.getButton().getChildren().get(0)).setIcon(imageExpand);
      getViewer().getEditDomain().getCommandStack().execute(command);

      // change the borders of the child rolemodel
      rmed.refreshVisuals();

      // synchronize the viewer of thetwo Editor of the MultiPageEditor
      if (!(isEditorData)) {
        parent.getDataEditor().getOwnViewer()
            .setContents(parent.getDataEditor().getOwnViewer().getContents().getModel());
      } else {
        parent.getBehaviorEditor().getOwnViewer()
            .setContents(parent.getBehaviorEditor().getOwnViewer().getContents().getModel());
      }

      // save the state of the editor(ExpandState) so that user does not get confused when he tries
      // to hit the save button
      // when he has open the other editor
      save.run();

    } else {
      figure.getListAttMet().add(figure.getAttributeFigure());

      if (!isEditorData) {
        figure.getListAttMet().add(figure.getMethodeFigure());
      }

      ((Label) figure.getButton().getChildren().get(0)).setIcon(imageCollapse);
      getViewer().getEditDomain().getCommandStack().execute(command);

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
      // save the state of the editor(ExpandState) so that user does not get confused when he tries
      // to hit the save button
      // when he has open the other editor
      save.run();
    }


  }

  /**
   * This method does the initial setup of the {@link ORMCompartmentV2Figure}. That means depending
   * on the expandstate of the {@link Compartment} the method removes the method and attribute list
   * and add the correct image to the button. Beside these set this method the action listener of
   * this button. The {@link ActionListener} calls on notification the method buttonExpand.
   * */
  private ORMCompartmentV2Figure createORMCompartmentV2Figure(final Compartment model,
      final boolean isEditorData) {

    ORMCompartmentV2Figure figure = new ORMCompartmentV2Figure(isEditorData);

    Image imageExpand =
        new Image(null, Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
            "icons/expandArrow3.png").createImage(), SWT.IMAGE_COPY);
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

    if (model.isIsExpand()) {
      ((Label) figure.getButton().getChildren().get(0)).setIcon(imageCollapse);
    }

    if (!model.isIsExpand()) {
      figure.getListAttMet().remove(figure.getAttributeFigure());
      if (!isEditorData) {
        figure.getListAttMet().remove(figure.getMethodeFigure());
      }
      ((Label) figure.getButton().getChildren().get(0)).setIcon(imageExpand);
    }


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
