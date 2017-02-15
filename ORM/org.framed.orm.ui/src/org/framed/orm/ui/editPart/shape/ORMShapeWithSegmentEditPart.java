package org.framed.orm.ui.editPart.shape;


import java.util.ArrayList;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.framed.orm.model.Segment;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPart.ORMNamedElementEditPart;
import org.framed.orm.ui.editPolicy.ORMSegmentXYLayoutPolicy;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.figure.shapes.ORMCompartmentV1Figure;
import org.framed.orm.ui.figure.shapes.ORMCompartmentV2Figure;
import org.framed.orm.ui.figure.shapes.ORMDataTypeFigure;
import org.framed.orm.ui.figure.shapes.ORMNaturalTypeFigure;
import org.framed.orm.ui.figure.shapes.ORMRoleTypeFigure;

/**
 * This {@link EditPart} is the controller for a {@link Shape} from type natrualtype, roletype or
 * datatype. This class is the parent of {@link ORMCompartmentEditPart}.
 *
 * @author Kay Bierzynski
 * */
public class ORMShapeWithSegmentEditPart extends ORMSuperShapeEditPart {

  /**
   * A list, which contains the child {@link Segment} figures. This list is necessary for the
   * {@link ORMCompartmentEditPart}s, because when the user steps into the compartmentype he can
   * expand and collapse the segments through a button and in both cases the figure of the segments
   * are needed for the button action.
   * */
  protected ArrayList<IFigure> childFigureList;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent and initializing the childFigureList.
   */
  public ORMShapeWithSegmentEditPart() {
    super();
    childFigureList = new ArrayList<IFigure>();
  }

  /** {@inheritDoc} */
  @Override
  public void createEditPolicies() {
    super.createEditPolicies();
    // edit policy, which handles the creation of the children of the segment and the
    // adding of the children to the segment
    // this policy is installed here for better selectability for the case when the user wants to
    // create attributes and operations
	ORMGraphicalEditor editor = (ORMGraphicalEditor) ((DefaultEditDomain)this.getViewer().getEditDomain()).getEditorPart();
    installEditPolicy(EditPolicy.LAYOUT_ROLE, new ORMSegmentXYLayoutPolicy(editor.getEditPolicyHandler()));
  }

  /**
   * {@inheritDoc} In case of this {@link EditPart} that would be the figure of a {@link Segment}.
   * When the user uses the data view on the editor the second segment(operation segment) isn't
   * added to the contentPane.
   *
   * */
  @Override
  protected void addChildVisual(final EditPart childEditPart, final int index) {

    IFigure contentPane = null;
    Shape shape = (Shape) getModel();

    switch (shape.getType().getValue()) {
      case Type.COMPARTMENT_TYPE_VALUE:
        if (getFigure() instanceof ORMCompartmentV1Figure) {
          contentPane = ((ORMCompartmentV1Figure) getFigure()).getBasicRec();
        } else {
          contentPane = ((ORMCompartmentV2Figure) getFigure()).getListAttOpt();
        }
        break;
      case Type.NATURAL_TYPE_VALUE:
        contentPane = ((ORMNaturalTypeFigure) getFigure()).getBasicRec();
        break;
      case Type.DATA_TYPE_VALUE:
        contentPane = ((ORMDataTypeFigure) getFigure()).getBasicRec();
        break;
      case Type.ROLE_TYPE_VALUE:
        contentPane = ((ORMRoleTypeFigure) getFigure()).getBasicRec();
        break;
    }

    if (childEditPart instanceof ORMSegmentEditPart) {

      final ORMGraphicalEditor editorPart =
          (ORMGraphicalEditor) ((DefaultEditDomain) getViewer().getEditDomain()).getEditorPart();

      contentPane.add(((ORMSegmentEditPart) childEditPart).getFigure());
      childFigureList.add(((ORMSegmentEditPart) childEditPart).getFigure());
      if (shape.getSecondSegment() != null) {
        if (editorPart.getIsEditorData()
            && shape.getSecondSegment().equals(childEditPart.getModel())) {
          contentPane.remove(((ORMSegmentEditPart) childEditPart).getFigure());
          childFigureList.remove(((ORMSegmentEditPart) childEditPart).getFigure());
        }
      }

    }

    if (childEditPart instanceof ORMNamedElementEditPart) {
      if (shape.getType().equals(Type.ROLE_TYPE)
          && shape.getDescription().equals(childEditPart.getModel())) {

        getFigure().add(((ORMNamedElementEditPart) childEditPart).getFigure(), BorderLayout.TOP);

      }
    }
  }


}
