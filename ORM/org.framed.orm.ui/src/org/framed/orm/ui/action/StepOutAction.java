package org.framed.orm.ui.action;

import org.eclipse.gef.Request;
import org.eclipse.ui.IWorkbenchPart;


/**
 * @author Kay BIerzynski
 * */
public class StepOutAction extends StepAction {


  public static final String STEP_OUT_ID = "StepOut";
  public static final String STEP_OUT_REQUEST = "StepOut";
  /**
   * Create a new instance of the class.
   * 
   * @param part
   */
  public StepOutAction(IWorkbenchPart part) {
    super(part);
    setId(STEP_OUT_ID);
    setText("Step out");
    setRequest(new Request(STEP_OUT_REQUEST));
  }

  
}
