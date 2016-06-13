package org.framed.orm.ui.editor;

import static de.ovgu.featureide.fm.core.localization.StringTable.ARIAL;
import static de.ovgu.featureide.fm.core.localization.StringTable.CALCULATING____;
import static de.ovgu.featureide.fm.core.localization.StringTable.INVALID_COMMA_;
import static de.ovgu.featureide.fm.core.localization.StringTable.MORE_THAN;
import static de.ovgu.featureide.fm.core.localization.StringTable.POSSIBLE_CONFIGURATIONS;
import static de.ovgu.featureide.fm.core.localization.StringTable.VALID_COMMA_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.prop4j.Node;

import de.ovgu.featureide.fm.core.configuration.ConfigurationMatrix;
import de.ovgu.featureide.fm.core.configuration.SelectableFeature;
import de.ovgu.featureide.fm.core.configuration.Selection;
import de.ovgu.featureide.fm.core.functional.Functional;
import de.ovgu.featureide.fm.core.functional.Functional.IBinaryFunction;
import de.ovgu.featureide.fm.core.functional.Functional.IConsumer;
import de.ovgu.featureide.fm.core.functional.Functional.IFunction;
import de.ovgu.featureide.fm.core.job.IJob;
import de.ovgu.featureide.fm.core.job.IStoppableJob;
import de.ovgu.featureide.fm.core.job.LongRunningJob;
import de.ovgu.featureide.fm.core.job.LongRunningMethod;
import de.ovgu.featureide.fm.core.job.LongRunningWrapper;
import de.ovgu.featureide.fm.core.job.util.JobFinishListener;
import de.ovgu.featureide.fm.ui.editors.configuration.AsyncTree;
import de.ovgu.featureide.fm.ui.editors.configuration.ConfigurationEditor;
import de.ovgu.featureide.fm.ui.editors.configuration.IConfigurationEditor;
import de.ovgu.featureide.fm.ui.editors.configuration.IConfigurationEditor.EXPAND_ALGORITHM;


public class TestEditor extends EditorPart {

  protected Tree tree;
  private final HashSet<SelectableFeature> invalidFeatures = new HashSet<SelectableFeature>();
  protected final HashSet<SelectableFeature> updateFeatures = new HashSet<SelectableFeature>();
  protected IConfigurationEditor configurationEditor = null;
  protected boolean dirty = false;
  
  protected static final Font treeItemStandardFont = new Font(null, ARIAL, 8, SWT.NORMAL);
  protected static final Font treeItemSpecialFont = new Font(null, ARIAL, 8, SWT.BOLD);
  
  protected static final Color gray = new Color(null, 140, 140, 140);
  protected static final Color green = new Color(null, 0, 140, 0);
  protected static final Color blue = new Color(null, 0, 0, 200);
  protected static final Color red = new Color(null, 240, 0, 0);
  
  protected int curGroup = 0;
  protected boolean useRecommendation = false;
  protected int maxGroup = 0;
  protected boolean useGroups = false;
  
  private Label infoLabel;

  protected final HashMap<SelectableFeature, TreeItem> itemMap = new HashMap<SelectableFeature, TreeItem>();

  
  protected void createUITree(Composite parent) {
    tree = new Tree(parent, SWT.CHECK);
    tree.addSelectionListener(new SelectionListener() {
        @Override
        public void widgetDefaultSelected(SelectionEvent e) {
        }

        @Override
        public void widgetSelected(SelectionEvent event) {
            if (event.detail == SWT.CHECK) {
                final TreeItem item = (TreeItem) event.item;
                final Object data = item.getData();
                if (data instanceof SelectableFeature) {
                    final SelectableFeature feature = (SelectableFeature) item.getData();
                    if (updateFeatures.contains(feature)) {
                        item.setChecked(true);
                    } else {
                        switch (feature.getAutomatic()) {
                        case SELECTED:
                            item.setChecked(true);
                            break;
                        case UNSELECTED:
                            item.setChecked(false);
                            break;
                        case UNDEFINED:
                            changeSelection(item, true);
                            break;
                        }
                    }
                }
            }
        }
    });
}
  
  
  public void setMultiPageEditor(ORMMultiPageEditor ormMultiPageEditor) {
     // this.configurationEditor = ormMultiPageEditor;
  }
  
  protected void changeSelection(final TreeItem item, final boolean select) {
    SelectableFeature feature = (SelectableFeature) item.getData();
    if (feature.getAutomatic() == Selection.UNDEFINED) {
        switch (feature.getManual()) {
        case SELECTED:
            set(feature, (select) ? Selection.UNDEFINED : Selection.UNSELECTED);
            if (configurationEditor.getExpandAlgorithm() == EXPAND_ALGORITHM.CHILDREN) {
                item.setExpanded(false);
            }
            break;
        case UNSELECTED:
            set(feature, (select) ? Selection.SELECTED : Selection.UNDEFINED);
            if (configurationEditor.getExpandAlgorithm() == EXPAND_ALGORITHM.CHILDREN) {
                item.setExpanded(select);
            }
            break;
        case UNDEFINED:
            set(feature, (select) ? Selection.SELECTED : Selection.UNSELECTED);
            if (configurationEditor.getExpandAlgorithm() == EXPAND_ALGORITHM.CHILDREN) {
                item.setExpanded(select);
            }
            break;
        default:
            set(feature, Selection.UNDEFINED);
        }
        if (!dirty) {
            setDirty();
        }
        if (configurationEditor.isAutoSelectFeatures()) {
            computeTree(true);
        } else {
            item.setForeground(null);
            item.setFont(treeItemStandardFont);
            refreshItem(item, feature);
            if (configurationEditor.getConfiguration().canBeValid()) {
                invalidFeatures.clear();
            } else {
                invalidFeatures.add(feature);
            }
        }
        //  updateInfoLabel();
    }
}
  
  protected void refreshItem(TreeItem item, SelectableFeature feature) {
    item.setBackground(null);
    item.setFont(treeItemStandardFont);
    item.setText(feature.getName());
    switch (feature.getAutomatic()) {
    case SELECTED:
        item.setGrayed(true);
        item.setForeground(null);
        item.setChecked(true);
        break;
    case UNSELECTED:
        item.setGrayed(true);
        item.setForeground(gray);
        item.setChecked(false);
        break;
    case UNDEFINED:
        item.setGrayed(false);
        item.setForeground(null);
        item.setChecked(feature.getManual() == Selection.SELECTED);
        break;
    }
}
  
  protected void computeTree(boolean redundantManual) {
    final Display currentDisplay = Display.getCurrent();
    if (currentDisplay == null) {
        return;
    }
    updateInfoLabel(null);

    final IStoppableJob updateJob = computeFeatures(redundantManual, currentDisplay);
    if (updateJob != null) {
        updateJob.addJobFinishedListener(new JobFinishListener() {
            @Override
            public void jobFinished(IJob finishedJob, boolean success) {
                if (success) {
                    updateInfoLabel(currentDisplay);
                    autoExpand(currentDisplay);
                    configurationEditor.getConfigJobManager().startJob(computeColoring(currentDisplay), true);
                }
            }
        });

        updateFeatures.clear();
        walkTree(new IBinaryFunction<TreeItem, SelectableFeature, Void>() {
            @Override
            public Void invoke(TreeItem item, SelectableFeature feature) {
                // lockItem(item);
                updateFeatures.add(feature);
                return null;
            }
        }, new IFunction<Void, Void>() {
            @Override
            public Void invoke(Void t) {
                configurationEditor.getConfigJobManager().startJob(updateJob, true);
                return null;
            }
        });
    }
}
  
  protected final void walkTree(final Functional.IBinaryFunction<TreeItem, SelectableFeature, Void> perNodeFunction,
      final Functional.IFunction<Void, Void> callbackIfDone) {
  AsyncTree.traverse(itemMap, tree.getItem(0), perNodeFunction, callbackIfDone);
}
  
  protected LongRunningJob<List<Node>> computeColoring(final Display currentDisplay) {
    if (!configurationEditor.isAutoSelectFeatures() || configurationEditor.getConfiguration().isValid()) {
        for (SelectableFeature selectableFeature : configurationEditor.getConfiguration().getFeatures()) {
            selectableFeature.setRecommendationValue(-1);
            selectableFeature.clearOpenClauses();
        }
        if (configurationEditor.getExpandAlgorithm() == EXPAND_ALGORITHM.OPEN_CLAUSE
                || configurationEditor.getExpandAlgorithm() == EXPAND_ALGORITHM.PARENT_CLAUSE) {
            autoExpand(currentDisplay);
        }
        return null;
    }

    final List<SelectableFeature> automaticFeatureList = new LinkedList<>();
    final List<SelectableFeature> manualFeatureList = new LinkedList<>();
    for (SelectableFeature selectableFeature : configurationEditor.getConfiguration().getFeatures()) {
        if (!selectableFeature.getFeature().getStructure().hasHiddenParent()) {
            if (selectableFeature.getAutomatic() == Selection.UNDEFINED && !selectableFeature.getFeature().getStructure().hasHiddenParent()) {
                manualFeatureList.add(selectableFeature);
            } else {
                automaticFeatureList.add(selectableFeature);
            }
        }
    }

    currentDisplay.syncExec(new Runnable() {
        @Override
        public void run() {
            for (SelectableFeature selectableFeature : automaticFeatureList) {
                selectableFeature.setRecommendationValue(-1);
                selectableFeature.clearOpenClauses();
                final TreeItem item = itemMap.get(selectableFeature);
                if (item != null) {
                    refreshItem(item, selectableFeature);
                }
            }
        }
    });
    curGroup = 0;

    if (useRecommendation) {
        final ConfigurationMatrix configurationMatrix = ((ConfigurationEditor) configurationEditor).getConfigurationMatrix();
        configurationMatrix.calcRec(configurationEditor.getConfiguration());
        final double[] rec = configurationMatrix.getRec();
        if (rec != null) {
            int i = 0;
            for (SelectableFeature selectableFeature : configurationEditor.getConfiguration().getFeatures()) {
                selectableFeature.setRecommendationValue((int) Math.floor(rec[i++] * 100));
            }
        }
    }

    
    final LongRunningMethod<List<Node>> jobs = configurationEditor.getConfiguration().getPropagator().findOpenClauses(manualFeatureList);
    LongRunningJob<List<Node>> job = new LongRunningJob<List<Node>>("FindClauses", jobs); 
    job.schedule();
    
    job.addJobFinishedListener(new JobFinishListener() {
        @SuppressWarnings("unchecked")
        @Override
        public void jobFinished(IJob finishedJob, boolean success) {
            LongRunningJob<List<Node>> job = ((LongRunningJob<List<Node>>) finishedJob);
            maxGroup = job.getResults().size() - 1;
            for (final SelectableFeature feature : manualFeatureList) {
                final TreeItem item = itemMap.get(feature);
                if (item != null) {
                    currentDisplay.asyncExec(new Runnable() {
                        @Override
                        public void run() {
                            switch (feature.getRecommended()) {
                            case SELECTED:
                                item.setFont(treeItemSpecialFont);
                                item.setForeground(green);
                                item.setText(getValueText(feature) + feature.getName() + getGroupText(feature));
                                break;
                            case UNSELECTED:
                                item.setFont(treeItemSpecialFont);
                                item.setForeground(blue);
                                item.setText(getValueText(feature) + feature.getName() + getGroupText(feature));
                                break;
                            case UNDEFINED:
                                item.setFont(treeItemStandardFont);
                                item.setForeground(null);
                                item.setText(feature.getName());
                                break;
                            }
                        }

                        private String getGroupText(SelectableFeature feature) {
                            if (!useGroups) {
                                return "";
                            }
                            // TODO @Sebastian: might not work anymore
                            final Node groupAbs = feature.getOpenClauses().iterator().next();
                            final int groupRel = feature.getOpenClauseIndexes().iterator().next();
                            final StringBuilder sb = new StringBuilder();

                            sb.append(" | ");
                            sb.append(groupRel);
                            sb.append("/");
                            sb.append(maxGroup);
                            sb.append(" (");
                            sb.append(groupAbs);
                            sb.append(")");

                            return sb.toString();
                        }

                        private String getValueText(SelectableFeature feature) {
                            if (!useRecommendation) {
                                return "";
                            }
                            final int value = feature.getRecommendationValue();
                            final StringBuilder sb = new StringBuilder();

                            // sb.append(value);
                            if (value < 0) {
                                sb.append("_____");
                            } else if (value < 20) {
                                sb.append("+____");
                            } else if (value < 40) {
                                sb.append("++___ ");
                            } else if (value < 60) {
                                sb.append("+++__");
                            } else if (value < 80) {
                                sb.append("++++_");
                            } else {
                                sb.append("+++++");
                            }
                            sb.append(" ");

                            return sb.toString();
                        }
                    });
                }
            }
        }
    });
    if (configurationEditor.getExpandAlgorithm() == EXPAND_ALGORITHM.OPEN_CLAUSE
            || configurationEditor.getExpandAlgorithm() == EXPAND_ALGORITHM.PARENT_CLAUSE) {
        job.addJobFinishedListener(new JobFinishListener() {
            @Override
            public void jobFinished(IJob finishedJob, boolean success) {
                currentDisplay.asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        curGroup = 0;
                        autoExpand();
                    }
                });
            }
        });
    }
    return job;
}
  
  private void autoExpand(Display display) {
    display.asyncExec(new Runnable() {
        @Override
        public void run() {
            autoExpand();
        }
    });
}
  
  private void autoExpand() {
    switch (configurationEditor.getExpandAlgorithm()) {
    case DEFUALT:
        break;
    case CHILDREN:
        break;
    case OPEN_CLAUSE:
        groupExpand(true);
        break;
    case PARENT:
        levelExpand();
        break;
    case PARENT_CLAUSE:
        levelExpand();
        groupExpand(false);
        break;
    default:
        throw new RuntimeException("case " + configurationEditor.getExpandAlgorithm() + " not supported!");
    }
}
  
  private void levelExpand() {
    final TreeItem root = tree.getItem(0);
    if (root != null) {
        root.setExpanded(true);
        expandRec(root);
    }
}
  
  private void expandRec(TreeItem root) {
    TreeItem[] items = root.getItems();
    for (TreeItem treeItem : items) {
        final Object data = treeItem.getData();
        if (data instanceof SelectableFeature) {
            final SelectableFeature feature = (SelectableFeature) data;
            if (feature.getSelection() == Selection.UNDEFINED || feature.getSelection() == Selection.UNSELECTED) {
                treeItem.setExpanded(false);
            } else {
                treeItem.setExpanded(true);
                expandRec(treeItem);
            }
        }
    }
}
  
  private boolean groupExpand(boolean collapse) {
    final LinkedList<TreeItem> groupItems = new LinkedList<>();
    final TreeItem root = tree.getItem(0);
    if (root != null) {
        searchGroupRec(root, groupItems);
        if (!groupItems.isEmpty()) {
            if (collapse) {
                collapseRec(root);
            }
            for (TreeItem treeItem : groupItems) {
                TreeItem parent = treeItem.getParentItem();
                while (parent != null) {
                    parent.setExpanded(true);
                    parent = parent.getParentItem();
                }
            }
            tree.showItem(groupItems.getLast());
            tree.showItem(groupItems.getFirst());
            return true;
        } else {
            levelExpand();
        }
    }
    return false;
}
  
  private void collapseRec(TreeItem root) {
    root.setExpanded(false);

    final TreeItem[] items = root.getItems();
    for (TreeItem treeItem : items) {
        collapseRec(treeItem);
    }
}

  
  private void searchGroupRec(TreeItem root, LinkedList<TreeItem> groupItems) {
    final Object data = root.getData();
    if (data instanceof SelectableFeature) {
        final SelectableFeature feature = (SelectableFeature) data;
        if (feature.getOpenClauseIndexes().contains(curGroup)) {
            groupItems.add(root);
        }
    }

    final TreeItem[] items = root.getItems();
    for (TreeItem treeItem : items) {
        searchGroupRec(treeItem, groupItems);
    }
}

  protected LongRunningJob<List<String>> computeFeatures(final boolean redundantManual, final Display currentDisplay) {
    if (!configurationEditor.isAutoSelectFeatures()) {
        return null;
    }
    final TreeItem topItem = tree.getTopItem();
    SelectableFeature feature = (SelectableFeature) (topItem.getData());
    final LongRunningMethod<List<String>> update = configurationEditor.getConfiguration().getPropagator()
            .update(redundantManual, feature.getFeature().getName());
    final LongRunningJob<List<String>> job = LongRunningWrapper.createJob("", update);
    job.setIntermediateFunction(new IConsumer<Object>() {
        @Override
        public void invoke(Object t) {
            if (t instanceof SelectableFeature) {
                final SelectableFeature feature = (SelectableFeature) t;
                final TreeItem item = itemMap.get(feature);
                if (item == null) {
                    return;
                }
                currentDisplay.asyncExec(new Runnable() {
                    @Override
                    public void run() {
                        updateFeatures.remove(feature);
                        refreshItem(item, feature);
                    }
                });
            }
        }
    });
    return job;
}
  
  
  protected void updateInfoLabel(final Display display) {
    if (display == null) {
        infoLabel.setText(CALCULATING____);
        infoLabel.setForeground(null);
        return;
    }
    final boolean valid = configurationEditor.getConfiguration().isValid();
    if (configurationEditor.getConfiguration().getPropagator() == null) {
        return;
    }
    final LongRunningJob<Long> job = LongRunningWrapper.createJob("", configurationEditor.getConfiguration().getPropagator().number(250));
    job.addJobFinishedListener(new JobFinishListener() {
        @Override
        public void jobFinished(IJob finishedJob, boolean success) {
            final StringBuilder sb = new StringBuilder();
            sb.append(valid ? VALID_COMMA_ : INVALID_COMMA_);

            @SuppressWarnings("unchecked")
            final Long number = ((LongRunningJob<Long>) finishedJob).getResults();
            if (number != null) {
                if (number < 0) {
                    sb.append(MORE_THAN);
                    sb.append(-1 - number);
                } else {
                    sb.append(number);
                }
                sb.append(POSSIBLE_CONFIGURATIONS);

                if (number == 0 && !configurationEditor.isAutoSelectFeatures()) {
                    sb.append(" - Autoselect not possible!");
                }
            }

            display.asyncExec(new Runnable() {
                @Override
                public void run() {
                    infoLabel.setText(sb.toString());
                    infoLabel.setForeground(valid ? blue : red);
                }
            });
        }
    });
    configurationEditor.getConfigJobManager().startJob(job, true);
}
  
  protected void set(SelectableFeature feature, Selection selection) {
    configurationEditor.getConfiguration().setManual(feature, selection);
}
  
  public void setDirty() {
    dirty = true;
    firePropertyChange(PROP_DIRTY);
}

//@Override
//public String getID() {
//    return ID;
//}
//
//
//@Override
//public String getPageText() {
//    return PAGE_TEXT;
//}
//
//@Override
//public void pageChangeTo(int index) {
////  final IConfiguration configuration = configurationEditor.getConfiguration();
////  for (SelectableFeature feature : configuration.getFeatures()) {
////      if (feature.getAutomatic() == Selection.UNDEFINED && feature.getManual() == Selection.UNSELECTED) {
////          configuration.setManual(feature, Selection.UNDEFINED);
////      }
////  }
//    super.pageChangeTo(index);
//}
  @Override
  public void doSave(IProgressMonitor monitor) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void doSaveAs() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void init(IEditorSite site, IEditorInput input) throws PartInitException {
    // TODO Auto-generated method stub
    
  }

  @Override
  public boolean isDirty() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isSaveAsAllowed() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void createPartControl(Composite parent) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setFocus() {
    // TODO Auto-generated method stub
    
  }



}
