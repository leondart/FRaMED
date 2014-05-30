package org.framed.orm.ui.action;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

/**
 * @author Kay Bierzynski (intial development)
 * @author Lars Schuetze
 * 
 */
public class ConstraintsDialog extends Dialog {

  private List<RelationshipConstraint> constraints;
  private final List<Button> constraintButtons;
  private final List<RelationshipConstraint> chosenConstraints;

  protected ConstraintsDialog(Shell shell) {
    super(shell);
    constraintButtons = new ArrayList<>();
    chosenConstraints = new LinkedList<>();
  }

  @Override
  protected void configureShell(Shell newShell) {
    super.configureShell(newShell);
    newShell.setText("Choose constraints");
  }

  @Override
  protected Control createDialogArea(Composite parent) {
    Composite composite = (Composite) super.createDialogArea(parent);

    for (RelationshipConstraint constraint : constraints) {
      Button button = new Button(composite, SWT.CHECK);
      if (constraint instanceof Total)
        button.setText("total");
      if (constraint instanceof Acyclic)
        button.setText("acyclic");
      if (constraint instanceof Irreflexive)
        button.setText("irreflexive");
      button.setData(constraint);
      constraintButtons.add(button);
    }

    return composite;
  }

  @Override
  protected void okPressed() {
    for (Button button : constraintButtons) {
      if (button.getSelection()) {
        chosenConstraints.add((RelationshipConstraint) button.getData());
      }
    }
    setReturnCode(OK);
    close();
  }

  public void setConstraints(List<RelationshipConstraint> constraints) {
    this.constraints = constraints;
  }

  public List<RelationshipConstraint> getChosenConstraints() {
    return chosenConstraints;
  }
}
