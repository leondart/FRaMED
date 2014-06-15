package org.framed.orm.ui.action;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.framed.orm.model.Acyclic;
import org.framed.orm.model.Irreflexive;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.model.Total;
import org.framed.orm.model.provider.OrmItemProviderAdapterFactory;

/**
 * @author Kay Bierzynski (intial development)
 * @author Lars Schuetze
 * 
 */
public class ConstraintsDialog extends Dialog {

  private final static int SIZING_SELECTION_WIDGET_HEIGHT = 250;
  private final static int SIZING_SELECTION_WIDGET_WIDTH = 300;

  private List<RelationshipConstraint> constraints;
  private final List<RelationshipConstraint> chosenDeleteConstraints;
  private final List<RelationshipConstraint> chosenCreateConstraints;
  private CheckboxTableViewer viewer;

  protected ConstraintsDialog(Shell shell) {
    super(shell);
    chosenDeleteConstraints = new LinkedList<>();
    chosenCreateConstraints = new LinkedList<>();
  }

  @Override
  protected void configureShell(Shell newShell) {
    super.configureShell(newShell);
    newShell.setText("Choose constraints");
    newShell.setSize(SIZING_SELECTION_WIDGET_WIDTH, SIZING_SELECTION_WIDGET_HEIGHT);
  }

  @Override
  protected Control createDialogArea(Composite parent) {
    Composite composite = (Composite) super.createDialogArea(parent);

    List<RelationshipConstraint> viewerContent = new ArrayList<RelationshipConstraint>();
    viewerContent.addAll(constraints);
    if (viewerContent.size() < 3) {
      addMissingConstraints(viewerContent);
    }

    chosenDeleteConstraints.addAll(viewerContent);

    viewer = CheckboxTableViewer.newCheckList(composite, SWT.CHECK);
    viewer.getTable().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    AdapterFactoryLabelProvider labelProvider =
        new AdapterFactoryLabelProvider(new OrmItemProviderAdapterFactory());
    AdapterFactoryContentProvider contentProvider =
        new AdapterFactoryContentProvider(new OrmItemProviderAdapterFactory());

    viewer.setLabelProvider(labelProvider);
    viewer.setContentProvider(contentProvider);
    viewer.setInput(new ItemProvider(new OrmItemProviderAdapterFactory(), viewerContent));

    for (RelationshipConstraint constraint : viewerContent) {
      if (constraints.contains(constraint)) {
        viewer.setChecked(constraint, true);
      }
    }

    addSelectionButtons(composite);

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

    selectButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent event) {
        viewer.setAllChecked(true);
      }
    });

    Button deselectButton =
        createButton(buttonComposite, IDialogConstants.DESELECT_ALL_ID, "Deselect All", false);

    deselectButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent event) {
        viewer.setAllChecked(false);
      }
    });
  }

  public void addMissingConstraints(List<RelationshipConstraint> viewerContent) {
    for (int i = 0; i < 3; i++) {

      boolean isInList = false;
      for (RelationshipConstraint constraint : constraints) {


        if (i == 0) {
          if (constraint instanceof Irreflexive) {
            isInList = true;
          }
        } else if (i == 1) {
          if (constraint instanceof Total) {
            isInList = true;
          }
        } else if (i == 2) {
          if (constraint instanceof Acyclic) {
            isInList = true;
          }
        }

      }

      if (!isInList) {
        if (i == 0) {
          viewerContent.add(OrmFactory.eINSTANCE.createIrreflexive());
        } else if (i == 1) {
          viewerContent.add(OrmFactory.eINSTANCE.createTotal());
        } else if (i == 2) {
          viewerContent.add(OrmFactory.eINSTANCE.createAcyclic());
        }

      }
    }

  }

  @Override
  protected void okPressed() {

    for (Object object : viewer.getCheckedElements()) {
      chosenCreateConstraints.add((RelationshipConstraint) object);
    }

    chosenDeleteConstraints.removeAll(chosenCreateConstraints);

    setReturnCode(OK);
    close();
  }

  public void setConstraints(List<RelationshipConstraint> constraints) {
    this.constraints = constraints;
  }

  public List<RelationshipConstraint> getChosenCreateConstraints() {
    return chosenCreateConstraints;
  }

  public List<RelationshipConstraint> getChosenDeleteConstraints() {
    return chosenDeleteConstraints;
  }

}
