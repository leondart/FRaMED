package org.framed.orm.ui.action;


import org.eclipse.gef.Request;
import org.eclipse.ui.IWorkbenchPart;



/**
 * @author Kay Bierzynski
 * */
public class StepInNewPageAction extends StepAction {

  public static final String STEP_IN_NEW_PAGE_ID = "StepInNewPage";
  public static final String STEP_IN_NEW_PAGE_REQUEST = "StepInNewPage";

  /**
   * Create a new instance of the class.
   * 
   * @param part
   */
  public StepInNewPageAction(IWorkbenchPart part) {
    super(part);
    setId(STEP_IN_NEW_PAGE_ID);
    setText("Step in new Window");
    setRequest(new Request(STEP_IN_NEW_PAGE_REQUEST));
  }

}
