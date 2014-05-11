package org.framed.orm.ui.action;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.framed.orm.model.Acyclic;
import org.framed.orm.model.Irreflexive;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.model.Total;

public class ConstraintsDialog extends Dialog {

  private ArrayList<RelationshipConstraint> constraints;
  private ArrayList<Button> constraintButtons;
  private ArrayList<RelationshipConstraint> chosenConstraints;

  protected ConstraintsDialog(Shell shell) {
    super(shell);
    constraintButtons = new ArrayList<Button>();
    chosenConstraints = new ArrayList<RelationshipConstraint>();
  }

  protected void cancelPressed() {
    setReturnCode(-1);
    close();
  }

  protected void configureShell(Shell newShell) {
    newShell.setText("Choose constraints");
    super.configureShell(newShell);
  }

  protected Control createDialogArea(Composite parent) {
    Composite composite = (Composite) super.createDialogArea(parent);

    for (RelationshipConstraint constraint : constraints) {
      Button button = new Button(composite, SWT.CHECK);
      if(constraint instanceof Total)button.setText("total");
      if(constraint instanceof Acyclic)button.setText("acyclic");
      if(constraint instanceof Irreflexive)button.setText("irreflexive");
      button.setData(constraint);
      constraintButtons.add(button);
    }

    return composite;
  }

  protected void okPressed() {
    int returnCode = 1;
    setReturnCode(returnCode);
    for (Button button : constraintButtons) {
      if (button.getSelection()) {
        chosenConstraints.add((RelationshipConstraint)button.getData());
      }
    }
    close();
  }

  public void setConstraints(ArrayList<RelationshipConstraint> constraints) {
    this.constraints = constraints;
  }

  public ArrayList<RelationshipConstraint> getChosenConstraints() {
    return chosenConstraints;
  }
}
