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

public class RolesDialog extends Dialog {

  
  private  ArrayList<AbstractRole> roles;
  private  ArrayList<Button> roleButtons;
  private  ArrayList<String> choosenRoles;
  
  protected RolesDialog(Shell shell) {
    super(shell);
    roleButtons = new ArrayList<Button>();
    choosenRoles = new ArrayList<String>();
  }

  protected void cancelPressed() {
    setReturnCode(-1);
    close();
  }

  protected void configureShell(Shell newShell) {
    newShell.setText("Choose roles");
    super.configureShell(newShell);
  }
  
  protected Control createDialogArea(Composite parent) {
    Composite composite = (Composite) super.createDialogArea(parent);

    for(AbstractRole role : roles){
      Button button = new Button(composite, SWT.CHECK);
      button.setText(((Node)role).getName());
      button.setData(role);
      roleButtons.add(button);
    }

    return composite;
}
  
  protected void okPressed() {
    int returnCode = 1;
    setReturnCode(returnCode);
    for(Button button : roleButtons){
      if(button.getSelection()){
        choosenRoles.add(button.getText());
      }
    }
    close();
  }
  
  public void setRoles( ArrayList<AbstractRole> roles){
    this.roles = roles;
  }
  
  public ArrayList<String> getChoosenRoles(){
    return choosenRoles;
  }
}
