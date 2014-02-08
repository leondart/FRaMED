package orm.action;

import java.util.List;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;

import orm.editPart.ORMCompartmentEditPart;
import orm.editPart.ORMGroupingEditPart;

/**
 * @author Kay Bierzynski
 * */
public class StepOutNewPageAction extends SelectionAction {

	public static final String STEP_OUT_NEW_PAGE_ID = "StepOutNewPage";
	 public static final String STEP_OUT_NEW_PAGE_REQUEST = "StepOutNewPage";

  Request request;

  /**
   * Create a new instance of the class.
   * @param part
   */
  public  StepOutNewPageAction(IWorkbenchPart part) {
      super(part);
      setId( STEP_OUT_NEW_PAGE_ID);
      setText("Step out new Page");
      request = new Request(STEP_OUT_NEW_PAGE_REQUEST);
  }

  /**
   * Execute the commands that perform the {@link StepOutNewPageAction#STEP_OUT_NEW_PAGE_REQUEST STEP_OUT_NEW_PAGE_REQUEST}.
   *
   * It is assumed that this method is executed directly after
   * {@link StepOutNewPageAction#calculateEnabled() calculateEnabled()}
   */
  @Override
  public void run() {
	// selected objects must be compartemne or grouping editpart because the action is enabled.
      @SuppressWarnings("unchecked") List<AbstractGraphicalEditPart> editParts = getSelectedObjects();
      CompoundCommand compoundCommand = new CompoundCommand();
      for(AbstractGraphicalEditPart editPart : editParts) {
          compoundCommand.add(editPart.getCommand(request));
      }
      execute(compoundCommand);
  }


  /**
	* {@inheritDoc}
	* <p>The action is enabled if all the selected entities on the
	* editor are {@link ORMCompartmentEditPart} or  {@link ORMGroupingEditPart} instances</p>
   */
	@Override
	protected boolean calculateEnabled() {

   for(Object selectedObject : getSelectedObjects()) {
	   if(selectedObject instanceof ORMCompartmentEditPart) {
		   if(((ORMCompartmentEditPart) selectedObject).equals(((ORMCompartmentEditPart) selectedObject).getViewer().getRootEditPart().getContents()))
           return true;
       }
	   if(selectedObject instanceof ORMGroupingEditPart) {
		   if(((ORMGroupingEditPart) selectedObject).equals(((ORMGroupingEditPart) selectedObject).getViewer().getRootEditPart().getContents()))
         return true;
     }
   }
   return false;
  }


}
