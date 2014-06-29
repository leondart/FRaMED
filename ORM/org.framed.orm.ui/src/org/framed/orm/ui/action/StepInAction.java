package org.framed.orm.ui.action;

import org.eclipse.gef.Request;
import org.eclipse.ui.IWorkbenchPart;



/**
 * @author Kay Bierzynski
 * */
public class StepInAction extends StepAction {

  public static final String STEP_IN_ID = "StepIn";
  public static final String STEP_IN_REQUEST = "StepIn";

  /**
   * Create a new instance of the class.
   * 
   * @param part
   */
  public StepInAction(IWorkbenchPart part) {
    super(part);
    setId(STEP_IN_ID);
    setText("Step in");
    setRequest(new Request(STEP_IN_REQUEST));
  }


}
