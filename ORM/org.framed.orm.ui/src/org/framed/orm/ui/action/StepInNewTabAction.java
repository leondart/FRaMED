package org.framed.orm.ui.action;

import org.eclipse.gef.Request;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @author Kay Bierzynski
 * */
public class StepInNewTabAction extends StepAction {

  public static final String STEP_IN_NEW_TAB_ID = "StepInNewTab";
  public static final String STEP_IN_NEW_TAB_REQUEST = "StepInNewTab";



  /**
   * Create a new instance of the class.
   * 
   * @param part
   */
  public StepInNewTabAction(IWorkbenchPart part) {
    super(part);
    setId(STEP_IN_NEW_TAB_ID);
    setText("Step in new tab");
    setRequest(new Request(STEP_IN_NEW_TAB_REQUEST));
  }

}
