package org.framed.orm.ui.editor;

import static de.ovgu.featureide.fm.core.localization.StringTable.ARIAL;

import java.util.HashMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FunctionalInterfaces;
import de.ovgu.featureide.fm.core.color.ColorPalette;
import de.ovgu.featureide.fm.core.color.DefaultColorScheme;
import de.ovgu.featureide.fm.core.color.FeatureColor;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.configuration.SelectableFeature;
import de.ovgu.featureide.fm.core.configuration.Selection;
import de.ovgu.featureide.fm.core.configuration.TreeElement;
import de.ovgu.featureide.fm.ui.editors.configuration.AsyncTree;
//import de.ovgu.featureide.fm.ui.editors.configuration.AsyncTree.Builder;

public class TestEditor3 extends EditorPart{
  
  protected static final Color gray = new Color(null, 140, 140, 140);
  protected static final Color green = new Color(null, 0, 140, 0);
  protected static final Color blue = new Color(null, 0, 0, 200);
  protected static final Color red = new Color(null, 240, 0, 0);

  protected static final Font treeItemStandardFont = new Font(null, ARIAL, 8, SWT.NORMAL);
  protected static final Font treeItemSpecialFont = new Font(null, ARIAL, 8, SWT.BOLD);

  private ORMMultiPageEditor ormMultiPageEditor;
  
  private Tree tree;
  protected final HashMap<SelectableFeature, TreeItem> itemMap = new HashMap<SelectableFeature, TreeItem>();
  
  protected boolean dirty = false;

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
    setSite(site);
    setInput(input);   
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
  public void setFocus() {
    // TODO Auto-generated method stub
    
  }
  
  public void setDirty() {
    dirty = true;
    firePropertyChange(PROP_DIRTY);
}

  public void setOrmMultiPageEditor(ORMMultiPageEditor editor) {
    this.ormMultiPageEditor = editor;
  }
  
  public ORMMultiPageEditor getOrmMultiPageEditor() {
    return ormMultiPageEditor;
  }
  
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
                    
                    
                    item.setChecked(true);
//                    if (updateFeatures.contains(feature)) {
//                        item.setChecked(true);
//                    } else {
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
//                    }
                }
            }
        }
    });
}
  
  protected void changeSelection(final TreeItem item, final boolean select) {
    SelectableFeature feature = (SelectableFeature) item.getData();
    if (feature.getAutomatic() == Selection.UNDEFINED) {
        switch (feature.getManual()) {
        case SELECTED:
            set(feature, (select) ? Selection.UNDEFINED : Selection.UNSELECTED);
            break;
        case UNSELECTED:
            set(feature, (select) ? Selection.SELECTED : Selection.UNDEFINED);
            break;
        case UNDEFINED:
            set(feature, (select) ? Selection.SELECTED : Selection.UNSELECTED);
            break;
        default:
            set(feature, Selection.UNDEFINED);
        }
        if (!dirty) {
            setDirty();
        }
        //System.out.println("ormMultiPageEditor.isAutoSelectFeatures(): " + ormMultiPageEditor.isAutoSelectFeatures());
        if (ormMultiPageEditor.isAutoSelectFeatures()) {
            //computeTree(false);
            //              updateInfoLabel();
          TreeElement configRootFeature = ormMultiPageEditor.getConfiguration().getRoot();
          updateSelections(itemMap.get(configRootFeature), configRootFeature.getChildren());
        } else {
            refreshItem(item, feature);
            //              updateInfoLabel();
        }
    }
    
    
}
  
  
  protected void refreshItem(TreeItem item, SelectableFeature feature) {
    item.setBackground(null);
    item.setFont(treeItemStandardFont);
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
  
  protected void set(SelectableFeature feature, Selection selection) {
    ormMultiPageEditor.getConfiguration().setManual(feature, selection);
}
  
  @Override
  public void createPartControl(Composite parent) {
      // parent composite
      GridLayout gridLayout = new GridLayout(1, false);
      gridLayout.verticalSpacing = 4;
      gridLayout.marginHeight = 2;
      gridLayout.marginWidth = 0;
      parent.setLayout(gridLayout);

      // 1. sub composite
      GridData gridData = new GridData();
      gridData.horizontalAlignment = SWT.FILL;
      gridData.grabExcessHorizontalSpace = true;
      gridData.grabExcessVerticalSpace = false;
      gridData.verticalAlignment = SWT.TOP;
      gridLayout = new GridLayout(1, false);
      gridLayout.marginHeight = 0;
      gridLayout.marginWidth = 0;
      gridLayout.marginLeft = 4;
      final Composite compositeTop = new Composite(parent, SWT.NONE);
      compositeTop.setLayout(gridLayout);
      compositeTop.setLayoutData(gridData);

      // info label
      gridData = new GridData();
      gridData.horizontalAlignment = SWT.FILL;
      gridData.grabExcessHorizontalSpace = true;
      gridData.verticalAlignment = SWT.CENTER;
    //  infoLabel = new Label(compositeTop, SWT.NONE);
     // infoLabel.setLayoutData(gridData);
      //updateInfoLabel(Display.getCurrent());

      // autoselect button 
      //      gridData = new GridData();
      //      gridData.horizontalAlignment = SWT.RIGHT;
      //      gridData.verticalAlignment = SWT.CENTER;
      //      autoSelectButton = new Button(compositeTop, SWT.TOGGLE);
      //      autoSelectButton.setText(AUTOSELECT_FEATURES);
      //      autoSelectButton.setLayoutData(gridData);
      //      autoSelectButton.setSelection(false);
      //      autoSelectButton.setEnabled(false);
      //              
      //      autoSelectButton.addSelectionListener(new SelectionListener() {
      //          @Override
      //          public void widgetSelected(SelectionEvent e) {
      //              final Configuration config = configurationEditor.getConfiguration();
      //              if (configurationEditor.isAutoSelectFeatures()) {
      //                  invalidFeatures.clear();
      //                  configurationEditor.setAutoSelectFeatures(false);
      //                  configurationEditor.getConfigJobManager().cancelAllJobs();
      //                  config.makeManual(!canDeselectFeatures());
      //                  walkTree(new IBinaryFunction<TreeItem, SelectableFeature, Void>() {
      //                      @Override
      //                      public Void invoke(TreeItem item, SelectableFeature feature) {
      //                          refreshItem(item, feature);
      //                          return null;
      //                      }
      //                  }, new FunctionalInterfaces.NullFunction<Void, Void>());
      //                  updateInfoLabel(Display.getCurrent());
      //              } else {
      //                  if (invalidFeatures.isEmpty()) {
      //                      configurationEditor.setAutoSelectFeatures(true);
      ////                        updateInfoLabel();
      //                      computeTree(true);
      //                  } else {
      //                      autoSelectButton.setSelection(false);
      //                  }
      //              }
      //          }
      //          
      //          @Override
      //          public void widgetDefaultSelected(SelectionEvent e) {}
      //      });

      // 2. sub composite
      gridData = new GridData();
      gridData.horizontalAlignment = SWT.FILL;
      gridData.verticalAlignment = SWT.FILL;
      gridData.grabExcessHorizontalSpace = true;
      gridData.grabExcessVerticalSpace = true;
      final Composite compositeBottom = new Composite(parent, SWT.BORDER);
      compositeBottom.setLayout(new FillLayout());
      compositeBottom.setLayoutData(gridData);

      createUITree(compositeBottom);
  }
  
  public void updateTree() {
    final Configuration configuration = ormMultiPageEditor.getConfiguration();
    tree.removeAll();
//    tree.addListener(SWT.PaintItem, new Listener() {
//      @Override
//      public void handleEvent(Event event) {
//        if (event.item instanceof TreeItem) {
//          TreeItem item = (TreeItem) event.item;
//          if (item.getData() instanceof SelectableFeature) {
//            SelectableFeature selectableFeature = (SelectableFeature) item.getData();
//            Feature feature = selectableFeature.getFeature();
//          }
//        }
//      }
//    });
    final TreeItem root = new TreeItem(tree, 0);

    root.setText(configuration.getRoot().getName());
    root.setData(configuration.getRoot());
    itemMap.put(configuration.getRoot(), root);
    buildTree2(root, configuration.getRoot().getChildren());
//    
//    itemMap.clear();
//    if (errorMessage(tree)) {
//        final Configuration configuration = ormMultiPageEditor.getConfiguration();
//        tree.removeAll();
//        tree.addListener(SWT.PaintItem, new Listener() {
//            @Override
//            public void handleEvent(Event event) {
//                if (event.item instanceof TreeItem) {
//                    TreeItem item = (TreeItem) event.item;
//                    if (item.getData() instanceof SelectableFeature) {
//                        SelectableFeature selectableFeature = (SelectableFeature) item.getData();
//                        Feature feature = selectableFeature.getFeature();
//                        FeatureColor color = new DefaultColorScheme().getColor(feature); //FeatureColorManager.getColor(feature);
//                        if (color != FeatureColor.NO_COLOR) {
//                            item.setBackground(new Color(null, ColorPalette.getRGB(color.getValue(), 0.5f)));
//                        }
//                    }
//                }
//            }
//        });
//        final TreeItem root = new TreeItem(tree, 0);
//
//        root.setText(configuration.getRoot().getName());
//        root.setData(configuration.getRoot());
//        itemMap.put(configuration.getRoot(), root);
//
//        buildTree(root, configuration.getRoot().getChildren(), new FunctionalInterfaces.IFunction<Void, Void>() {
//            @Override
//            public Void invoke(Void t) {
//                //                  updateInfoLabel();
//                computeTree(false);
//                return null;
//            }
//        });
//    }
}
  
  private void buildTree(final TreeItem node, final TreeElement[] children, final FunctionalInterfaces.IFunction<Void, Void> callbackIfDone) {
    AsyncTree.build(itemMap, node, children, callbackIfDone);
}
  
  private void buildTree2(final TreeItem parent, final TreeElement[] children) {
    for (int i = 0; i < children.length; i++) {
      final TreeElement child = children[i];
      if (child instanceof SelectableFeature) {
          final SelectableFeature currentFeature = (SelectableFeature) child;
          if (!currentFeature.getFeature().isHidden()) {
              TreeItem childNode = null;
              // This try for the case that the parent item is already disposed.
              try {
                  childNode = new TreeItem(parent, 0);
              } catch (Exception e) {
                  
                  return;
              }
              childNode.setText(currentFeature.getFeature().getDisplayName());
              childNode.setData(currentFeature);
              refreshItem(childNode, currentFeature);
              itemMap.put(currentFeature, childNode);
              if (currentFeature.hasChildren()) {
                  buildTree2(childNode, currentFeature.getChildren());
              }
          }
      }
  }
    parent.setExpanded(true);
//  try {
//      parent.setExpanded(true);
//  } catch (Exception e) {
//      AsyncTree.this.interrupt();
//      return;
//  }
  }
  
  private void updateSelections(final TreeItem parent, final TreeElement[] children) {
    for (int i = 0; i < children.length; i++) {
      final TreeElement child = children[i];
      if (child instanceof SelectableFeature) {
          final SelectableFeature currentFeature = (SelectableFeature) child;
          for (TreeItem t : parent.getItems()) {
            if (t.getData().equals(currentFeature)) {
              refreshItem(t, currentFeature);
              updateSelections(t, currentFeature.getChildren());
              break;
            }
          }
//          if (!currentFeature.getFeature().isHidden()) {
//              TreeItem childNode = null;
//              // This try for the case that the parent item is already disposed.
//              try {
//                  childNode = new TreeItem(parent, 0);
//              } catch (Exception e) {
//                  
//                  return;
//              }
//              childNode.setText(currentFeature.getFeature().getDisplayName());
//              childNode.setData(currentFeature);
//              refreshItem(childNode, currentFeature);
//              itemMap.put(currentFeature, childNode);
//              if (currentFeature.hasChildren()) {
//                  buildTree2(childNode, currentFeature.getChildren());
//              }
          }
      }
  }

}
