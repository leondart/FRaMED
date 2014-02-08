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
public class StepInNewPageAction extends SelectionAction {

   public static final String STEP_IN_NEW_PAGE_ID = "StepInNewPage";
   public static final String STEP_IN_NEW_PAGE_REQUEST = "StepInNewPage";

   private Request request;

   /**
    * Create a new instance of the class.
    * @param part
    */
   public  StepInNewPageAction(IWorkbenchPart part) {
       super(part);
       setId( STEP_IN_NEW_PAGE_ID);
       setText("Step in new Page");
       request = new Request(STEP_IN_NEW_PAGE_REQUEST);
   }

   /**
    * Execute the commands that perform the {@link StepInNewPageAction#STEP_IN_NEW_PAGE_REQUEST STEP_IN_NEW_PAGE_REQUEST}.
    *
    * It is assumed that this method is executed directly after
    * {@link StepInNewPageAction#calculateEnabled() calculateEnabled()}
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
	   if(getSelectedObjects().isEmpty()) {
           return false;
       }
       for(Object selectedObject : getSelectedObjects()) {
    	   if(selectedObject instanceof ORMCompartmentEditPart) {
    		   ORMCompartmentEditPart test = (ORMCompartmentEditPart) selectedObject;
    		   if(test.equals(test.getViewer().getRootEditPart().getContents()))
               return false;
           }
    	   if(selectedObject instanceof ORMGroupingEditPart) {
    		   ORMGroupingEditPart test = (ORMGroupingEditPart) selectedObject;
    		   if(test.equals(test.getViewer().getRootEditPart().getContents()))
               return false;
           }
           if(!(selectedObject instanceof ORMCompartmentEditPart) && !(selectedObject instanceof ORMGroupingEditPart)) {
               return false;
           }
       }
       return true;
      }

}
