package org.framed.orm.ui.action;


import org.eclipse.gef.Request;
import org.eclipse.ui.IWorkbenchPart;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Grouping;

/**
 * This action is for stepping in a {@link Compartment} or in a {@link Grouping} with opening a new
 * page. The run() and calculateEnabled() function inherits this action from the {@link StepAction}.
 * 
 * @author Kay Bierzynski
 * */
public class StepInNewPageAction extends StepAction {

  /** String which contains the id of this action. */
  public static final String STEP_IN_NEW_PAGE_ID = "StepInNewPage";
  /** String which contains the type of the request, which is connected to this action. */
  public static final String STEP_IN_NEW_PAGE_REQUEST = "StepInNewPage";

  /**
   * Constructor of this action, where the id of the action and the text, which is shown for example
   * in the context menu, is set and the special request connected to this action is created and
   * overrides the request from {@link StepAction}.
   * 
   * @param part org.eclipse.ui.IWorkbenchPart
   */
  public StepInNewPageAction(final IWorkbenchPart part) {
    super(part);
    setId(STEP_IN_NEW_PAGE_ID);
    setText("Step in new Window");
    setRequest(new Request(STEP_IN_NEW_PAGE_REQUEST));
  }

}
