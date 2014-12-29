package org.framed.orm.ui.editPart.types;


import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.framed.orm.model.Segment;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.figure.ORMCompartmentV1Figure;
import org.framed.orm.ui.figure.ORMCompartmentV2Figure;
import org.framed.orm.ui.figure.ORMNaturalTypeFigure;
import org.framed.orm.ui.figure.ORMRoleTypeFigure;

/**
 * This {@link EditPart} is the controller for a {@link Shape} from type natrualtype, roletype and
 * datatype. This class is the parent of {@link ORMCompartmentEditPart}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMShapeWithSegmentEditPart extends ORMSuperShapeEditPart {


  /**
   * {@inheritDoc} In case of this {@link EditPart} that would be the figure of a {@link Segment}.
   * When the user uses the data view on the editor the second segment(operation segment) isn't
   * added to the contentPane.
   * 
   * */
  @Override
  protected void addChildVisual(final EditPart childEditPart, final int index) {
    if (childEditPart instanceof ORMSegmentEditPart) {

      IFigure contentPane = null;
      Shape shape = (Shape) getModel();
      final ORMGraphicalEditor editorPart =
          (ORMGraphicalEditor) ((DefaultEditDomain) getViewer().getEditDomain()).getEditorPart();


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
          break;
        case Type.ROLE_TYPE_VALUE:
          contentPane = ((ORMRoleTypeFigure) getFigure()).getBasicRec();
          break;
      }

      contentPane.add(((ORMSegmentEditPart) childEditPart).getFigure());
      if (editorPart.getIsEditorData() && shape.getSecondSegment().equals(childEditPart.getModel())) {
        contentPane.remove(((ORMSegmentEditPart) childEditPart).getFigure());
      }

    }
  }


}
