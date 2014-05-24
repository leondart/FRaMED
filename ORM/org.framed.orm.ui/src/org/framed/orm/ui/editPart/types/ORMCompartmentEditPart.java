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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleType;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.ExpandStateChangeCommand;
import org.framed.orm.ui.editPart.ORMLabelFigure;
import org.framed.orm.ui.editPart.ORMRolemodelEditPart;
import org.framed.orm.ui.editPolicy.ORMNodeGraphicalNodeEditPolicy;
import org.framed.orm.ui.editor.Activator;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.editor.ORMMultiPageEditor;
import org.framed.orm.ui.figure.ORMCompartmentV1Figure;
import org.framed.orm.ui.figure.ORMCompartmentV2Figure;
import org.framed.orm.ui.figure.PartFigure;

/**
 * EditPart for Compartments -(this Comment related to a older version) it is in the package
 * orm.editPart, because when would it be elsewhere the imageExpand and imageCollapse would not be
 * shown when the Editor is started
 * 
 * @author Kay Bierzynski
 * */
public class ORMCompartmentEditPart extends ORMTypeEditPart {

  private ORMRolemodelEditPart rmed = null;
  public IFigure fig;
  private PartFigure rolePart = null;

  @Override
  public Rectangle getConstraints(){
    Compartment model = (Compartment) getModel();
    return model.getConstraints();
  }
  
  @Override
  protected IFigure createFigure() {
    final Compartment model = (Compartment) getModel();
    ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) getViewer().getEditDomain()).getEditorPart();

    // TODO: testing if this work for all cases
    // when this compartment editpart is not "opened" use as figure ORMCompartmentV1Figure
    if (getParent().getModel() instanceof Rolemodel
        || getParent().getModel() instanceof CompartmentDiagram) {
      ORMCompartmentV1Figure figure1 = new ORMCompartmentV1Figure(editorPart.getIsEditorData());

      fig = figure1;
    }
    // when this edit part is "opened" use ORMCompartmentV2Figure
    else {
      fig = createORMCompartmentV2Figure(model, editorPart.getIsEditorData());
    }
    return fig;
  }

  /*
   * GRAPHICAL_NODE_ROLE Policy must be installed here so that we can make the MainContext
   * unselectable for connection creation
   */

  @Override
  public void createEditPolicies() {
    super.createEditPolicies();
    if (!(getParent() instanceof ScalableRootEditPart)) {
      installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ORMNodeGraphicalNodeEditPolicy());
    }

  }

  @Override
  public void refreshVisuals() {
    super.refreshVisuals();

    // TODO: implement something better for synchronsation
    // shows all roletypes and rolegroups names, which are in the child rolemodel of this
    // compartment
    // the names are shown in a list and when are more then three names in the list a ... label is
    // added
    // in the tooltip of the ... label the other names are shown
    if (rolePart != null) {
      rolePart.removeAll();
      Rolemodel rm = ((Compartment) getModel()).getRolemodel();

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

        
        if (role instanceof RoleType)
          labelText = ((RoleType) role).getName();
        else
          labelText = ((RoleGroup) role).getName();
          
          label.setText((new ORMLabelFigure()).shortenLabel(labelText,label.getBounds(),label.getFont(),getConstraints()));
          label.setToolTip(label2);
          if (sizeList <= 3)
            rolePart.add(label);
          else
            collectLabels.add(label);
      }

      if (sizeList > 3) {
        collectLabel.setToolTip(collectLabels);

        rolePart.add(collectLabel);
      }
    }
  }

  // for adding rolemodel
  @SuppressWarnings("unchecked")
  @Override
  protected void addChildVisual(EditPart childEditPart, int index) {
    super.addChildVisual(childEditPart, index);
    Compartment model = (Compartment) getModel();
    IFigure contentPane = null;



    if (childEditPart.getModel() instanceof Rolemodel && rolePart == null) {


      // TODO: testing if this work for all cases
      // when figure is Version 2
      if (getParent() instanceof ScalableRootEditPart) {
        contentPane = ((ORMCompartmentV2Figure) getFigure()).getBasicRec();
        contentPane.add(((ORMRolemodelEditPart) childEditPart).getFigure(), BorderLayout.CENTER);
        rmed = (ORMRolemodelEditPart) childEditPart;
      }
      // when figure is Version 1
      else {
        // TODO: implement something better for synchronsation
        contentPane = ((ORMCompartmentV1Figure) getFigure()).getBasicRec();
        Rolemodel rm = (Rolemodel) ((ORMRolemodelEditPart) childEditPart).getModel();
        // shows all roletypes and rolegroups names, which are in the child rolemodel of this
        // compartment
        // the names are shown in a list and when are more then three names in the list a ... label
        // is added
        // in the tooltip of the ... label the other names are shown

        rolePart = new PartFigure();
        Label lab = new Label();

        Label collectLabel = new Label();
        collectLabel.setText("...");
        PartFigure collectLabels = new PartFigure();

        int sizeList = 0;

        lab.setText("ROLES");
        rolePart.add(lab);
        List<AbstractRole> children = new ArrayList<AbstractRole>();
        children.addAll(rm.getParticipants());
        for (AbstractRole role : children) {
          Label label = new Label();
          Label label2 = new Label();
          label2.setText("For Editing please go in the Compartment.");
          sizeList = rolePart.getChildren().size();
          if (role instanceof RoleType) {
            label.setText(((RoleType) role).getName());
            label.setToolTip(label2);
            if (sizeList <= 3)
              rolePart.add(label);
            else
              collectLabels.add(label);
          } else {
            label.setText(((RoleGroup) role).getName());
            label.setToolTip(label2);
            if (sizeList <= 3)
              rolePart.add(label);
            else
              collectLabels.add(label);
          }
        }

        if (sizeList > 3) {
          collectLabel.setToolTip(collectLabels);
          rolePart.add(collectLabel);
        }
        contentPane.add(rolePart);

        rmed = (ORMRolemodelEditPart) childEditPart;
      }
    }
  }

  // expand/collapse function for List of Attributes and methodes
  public void buttonExpand(boolean isEditorData) {

    ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) this.getViewer().getEditDomain()).getEditorPart();
    ORMMultiPageEditor parent = (ORMMultiPageEditor) editorPart.getParentEditor();

    ORMCompartmentV2Figure figure = (ORMCompartmentV2Figure) getFigure();
    Type model = (Type) getModel();
    
    ExpandStateChangeCommand command = new ExpandStateChangeCommand();
    command.setContainer(model);
    
    SaveAction save = new SaveAction(editorPart);
    Image imageExpand =
        new Image(null, Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
            "icons/expandArrow3.png").createImage(), SWT.IMAGE_COPY);
    Image imageCollapse =
        new Image(null, Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
            "icons/collapseArrow3.png").createImage(), SWT.IMAGE_COPY);
    
    if (model.isIsExpand()) {
      figure.getListAttMet().remove(figure.getAttributeFigure());
      
      if (!isEditorData)
        figure.getListAttMet().remove(figure.getMethodeFigure());
      
      ((Label) figure.getButton().getChildren().get(0)).setIcon(imageExpand);
      getViewer().getEditDomain().getCommandStack().execute(command);

      rmed.refreshVisuals();
      // synchronize between the two Editor of the MultiPageEditor
      if (!(isEditorData)) {
        parent.getEditorData().getOwnViewer()
            .setContents(parent.getEditorData().getOwnViewer().getContents().getModel());

      } else {
        parent.getEditorBeh().getOwnViewer()
            .setContents(parent.getEditorBeh().getOwnViewer().getContents().getModel());
      }
      // save the state of the editor(ExpandState) so that user does not get confused when he tries
      // to hit the save button
      // when he has open the other editor
      save.run();

    }

    else if (!(model.isIsExpand())) {
      figure.getListAttMet().add(figure.getAttributeFigure());
      if (!isEditorData)
        figure.getListAttMet().add(figure.getMethodeFigure());
      ((Label) figure.getButton().getChildren().get(0)).setIcon(imageCollapse);
      getViewer().getEditDomain().getCommandStack().execute(command);
      rmed.refreshVisuals();
      // synchronize between the two Editor of the MultiPageEditor
      if (!(isEditorData)) {
        parent.getEditorData().getOwnViewer()
            .setContents(parent.getEditorData().getOwnViewer().getContents().getModel());
      } else {
        parent.getEditorBeh().getOwnViewer()
            .setContents(parent.getEditorBeh().getOwnViewer().getContents().getModel());
      }
      // save the state of the editor(ExpandState) so that user does not get confused when he tries
      // to hit the save button
      // when he has open the other editor
      save.run();
    }


  }

  public ORMCompartmentV2Figure createORMCompartmentV2Figure(Compartment model,
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
    if (!(model.isIsExpand())) {
      figure.getListAttMet().remove(figure.getAttributeFigure());
      if (!(isEditorData))
        figure.getListAttMet().remove(figure.getMethodeFigure());
      ((Label) figure.getButton().getChildren().get(0)).setIcon(imageExpand);
    }


    return figure;

  }

  // draws border on top side
  public class PartFigureBorderNotExpand extends AbstractBorder {
    public Insets getInsets(IFigure figure) {
      return new Insets(1, 0, 0, 0);
    }

    public void paint(IFigure figure, Graphics graphics, Insets insets) {
      graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(), tempRect.getTopRight());

    }
  }

}
