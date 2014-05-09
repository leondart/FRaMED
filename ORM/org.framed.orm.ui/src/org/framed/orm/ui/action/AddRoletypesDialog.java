package org.framed.orm.ui.action;


import java.util.ArrayList;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Node;

public class AddRoletypesDialog extends Dialog {

  
  private  ArrayList<AbstractRole> roles;
  private  ArrayList<Button> roleButtons;
  
  protected AddRoletypesDialog(Shell shell) {
    super(shell);
    roleButtons = new ArrayList<Button>();
  }

  protected void cancelPressed() {
    setReturnCode(-1);
    close();
  }

  protected void configureShell(Shell newShell) {
    newShell.setText("Hello World");
    super.configureShell(newShell);
  }
  
  protected Control createDialogArea(Composite parent) {
    Composite composite = (Composite) super.createDialogArea(parent);

    for(AbstractRole role : roles){
      Button button = new Button(composite, SWT.RADIO);
      button.setText(((Node)role).getName());
      roleButtons.add(button);
    }

    return composite;
}
  
  protected void okPressed() {
    int returnCode = -1;
    setReturnCode(returnCode);
    
    close();
  }
  
  public void setRoles( ArrayList<AbstractRole> roles){
    this.roles = roles;
  }
}
