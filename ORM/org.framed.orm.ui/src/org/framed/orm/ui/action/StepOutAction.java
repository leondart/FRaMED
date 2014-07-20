package org.framed.orm.ui.action;

import org.eclipse.gef.Request;
import org.eclipse.ui.IWorkbenchPart;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Grouping;


/**
 * This action is for stepping out of a {@link Compartment} or a {@link Grouping} without opening a
 * new page or a new tab. The run() and calculateEnabled() function inherits this action from the
 * {@link StepAction}.
 * 
 * @author Kay Bierzynski
 * */
public class StepOutAction extends StepAction {

  /** String which contains the id of this action. */
  public static final String STEP_OUT_ID = "StepOut";
  /** String which contains the type of the request, which is connected to this action. */
  public static final String STEP_OUT_REQUEST = "StepOut";

  /**
   * Constructor of this action, where the id of the action and the text, which is shown for example
   * in the context menu, is set and the special request connected to this action is created and
   * overrides the request from {@link StepAction}.
   * 
   * @param part org.eclipse.ui.IWorkbenchPart
   */
  public StepOutAction(IWorkbenchPart part) {
    super(part);
    setId(STEP_OUT_ID);
    setText("Step out");
    setRequest(new Request(STEP_OUT_REQUEST));
  }


}
