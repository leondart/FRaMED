package org.framed.orm.ui.action;

import org.eclipse.gef.Request;
import org.eclipse.ui.IWorkbenchPart;

/**
 * This action is for stepping in a {@link Compartment} or in a {@link Grouping} without opening a
 * new page or a new tab. The run() and calculateEnabled() function inherits this action from the
 * {@link StepAction}.
 * 
 * @author Kay Bierzynski
 * */
public class StepInAction extends StepAction {

  /** String which contains the id of this action. */
  public static final String STEP_IN_ID = "StepIn";
  /** String which contains the type of the request, which is connected to this action. */
  public static final String STEP_IN_REQUEST = "StepIn";

  /**
   * Constructor of this action, where the id of the action and the text, which is shown for example
   * in the context menu, is set and the special request connected to this action is created and
   * overrides the request from {@link StepAction}.
   * 
   * @param part org.eclipse.ui.IWorkbenchPart
   */
  public StepInAction(final IWorkbenchPart part) {
    super(part);
    setId(STEP_IN_ID);
    setText("Step in");
    setRequest(new Request(STEP_IN_REQUEST));
  }


}
