package org.framed.orm.ui.action;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Node;

public class RolesDialog extends Dialog {

  private final static int SIZING_SELECTION_WIDGET_HEIGHT = 250;

  private final static int SIZING_SELECTION_WIDGET_WIDTH = 300;

  private List<AbstractRole> roles;
  private List<Button> roleButtons;
  private List<String> fulfilledRoles;

  protected RolesDialog(Shell shell) {
    super(shell);
    roleButtons = new ArrayList<Button>();
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

    GridData data = new GridData(GridData.FILL_BOTH);
    data.heightHint = SIZING_SELECTION_WIDGET_HEIGHT;
    data.widthHint = SIZING_SELECTION_WIDGET_WIDTH;

    // Create a table
    Table table = new Table(composite, SWT.HIDE_SELECTION | SWT.BORDER);
    table.setLayoutData(data);


    table.setHeaderVisible(false);

    // Create a column and show
    TableColumn one = new TableColumn(table, SWT.LEFT);


    for (AbstractRole role : roles) {
      TableItem item = new TableItem(table, SWT.NONE);
      TableEditor editor = new TableEditor(table);

      String roleName = ((Node) role).getName();
      Button checkbox = new Button(table, SWT.CHECK);
      checkbox.setText(roleName);
      checkbox.setToolTipText(roleName);
      checkbox.setData(role);
      if (fulfilledRoles.contains(roleName)) {
        checkbox.setSelection(true);
      }
      checkbox.pack();

      // TODO: this variant is extremely bad --> implement a better variant
      while (SIZING_SELECTION_WIDGET_WIDTH < checkbox.getSize().x) {
        checkbox.setText(checkbox.getText().substring(0, checkbox.getText().length() - 4) + "...");
        checkbox.pack();
      }

      one.setWidth(table.getBounds().width);
      editor.minimumWidth = checkbox.getSize().x;
      editor.horizontalAlignment = SWT.LEFT;
      editor.setEditor(checkbox, item, 0);

      roleButtons.add(checkbox);
    }

    addSelectionButtons(composite);

    composite.pack();

    return composite;
  }


  /**
   * Add the selection and deselection buttons to the dialog.
   * 
   * @param composite org.eclipse.swt.widgets.Composite
   */
  private void addSelectionButtons(Composite composite) {

    initializeDialogUnits(composite);

    Composite buttonComposite = new Composite(composite, SWT.NONE);
    GridLayout layout = new GridLayout();
    layout.numColumns = 0;
    layout.marginWidth = 0;
    layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
    buttonComposite.setLayout(layout);
    buttonComposite.setLayoutData(new GridData(SWT.END, SWT.TOP, true, false));

    Button selectButton =
        createButton(buttonComposite, IDialogConstants.SELECT_ALL_ID, "Select All", false);

    SelectionListener listener = new SelectionAdapter() {
      public void widgetSelected(SelectionEvent e) {
        for (Button but : roleButtons) {
          but.setSelection(true);
        }
      }
    };
    selectButton.addSelectionListener(listener);

    Button deselectButton =
        createButton(buttonComposite, IDialogConstants.DESELECT_ALL_ID, "Deselect All", false);

    listener = new SelectionAdapter() {
      public void widgetSelected(SelectionEvent e) {
        for (Button but : roleButtons) {
          but.setSelection(false);
        }
      }
    };
    deselectButton.addSelectionListener(listener);
  }

  @Override
  protected void okPressed() {
    int returnCode = 1;
    fulfilledRoles.clear();
    setReturnCode(returnCode);
    for (Button button : roleButtons) {
      if (button.getSelection()) {
        fulfilledRoles.add(button.getToolTipText());
      }
    }
    close();
  }

  public void setRoles(List<AbstractRole> roles) {
    this.roles = roles;
  }

  public void setFulfilledRoles(List<String> fulfilledRoles) {
    this.fulfilledRoles = fulfilledRoles;
  }

  public List<String> getFulfilledRoles() {
    return fulfilledRoles;
  }
}
