package org.framed.orm.ui.editor;

import static de.ovgu.featureide.fm.core.localization.StringTable.ARIAL;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.framed.orm.featuremodel.FRaMEDConfiguration;
import org.framed.orm.featuremodel.FRaMEDFeature;
import org.framed.orm.featuremodel.FeaturemodelFactory;
import org.framed.orm.model.Model;
import org.osgi.framework.Bundle;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.FunctionalInterfaces;
import de.ovgu.featureide.fm.core.color.ColorPalette;
import de.ovgu.featureide.fm.core.color.DefaultColorScheme;
import de.ovgu.featureide.fm.core.color.FeatureColor;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.configuration.SelectableFeature;
import de.ovgu.featureide.fm.core.configuration.Selection;
import de.ovgu.featureide.fm.core.configuration.TreeElement;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import de.ovgu.featureide.fm.core.io.xml.XmlFeatureModelReader;
import de.ovgu.featureide.fm.core.job.WorkMonitor;
import de.ovgu.featureide.fm.ui.editors.configuration.AsyncTree;

// import de.ovgu.featureide.fm.ui.editors.configuration.AsyncTree.Builder;

public class FeatureModelConfigurationEditor extends EditorPart {

  protected static final Color gray = new Color(null, 140, 140, 140);
  protected static final Color green = new Color(null, 0, 140, 0);
  protected static final Color blue = new Color(null, 0, 0, 200);
  protected static final Color red = new Color(null, 240, 0, 0);

  protected static final Font treeItemStandardFont = new Font(null, ARIAL, 8, SWT.NORMAL);
  protected static final Font treeItemSpecialFont = new Font(null, ARIAL, 8, SWT.BOLD);

  private ORMMultiPageEditor ormMultiPageEditor;
  
  /**
   * Configuration according to FeatureIDE-structure
   */
  private Configuration configuration;
  
  /**
   * The input {@link Resource} of this editor, which contains the emf model.
   * */
  private final Resource cdResource;
  
  /**
   * The Root {@link Model}, which represents the root of the model tree and which is the first
   * content for editor viewer.
   * */
  private Model rootmodel;
  
  /**
   * The FramedConfiguration Model {@link Model}, which represents the root of the model tree. This does only
   * contain the standard (most complete) Configuration.
   **/
  private Model standardConfigurationModel;

  /**
   * The actual feature model used for the configuration
   */
  public FeatureModel featureModel = new FeatureModel();
  
  /**
   * The file of the corresponding feature model.
   */
  File featureModelFile = null;
  
  private Label infoLabel;

  private Tree tree;
  protected final HashMap<SelectableFeature, TreeItem> itemMap =
      new HashMap<SelectableFeature, TreeItem>();

  protected boolean dirty = false;

  public FeatureModelConfigurationEditor(ORMMultiPageEditor ormMultiPageEditor, Resource resource) {
    this.ormMultiPageEditor = ormMultiPageEditor;
    this.cdResource = resource;
    // Assign rootmodel
    if (cdResource != null) {
      rootmodel = (Model) cdResource.getContents().get(0);
    } else
      throw new NullPointerException("The resource could not be loaded.");

    try {
      readFeatureModel();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (UnsupportedModelException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    loadConfiguration();
  }
  
  /**
   * Saves the changes made to this editor.
   */
  @Override
  public void doSave(IProgressMonitor monitor) {
    //if the internal representation (framed configuration) does not exist or contain features, create standard config 
      FRaMEDConfiguration framedConfiguration = getRootmodel().getFramedConfiguration();
      if (framedConfiguration == null || framedConfiguration.getFeatures() == null || framedConfiguration.getFeatures().size() < 1)       
      try {
        createStandardFramedConfiguration();
      } catch (URISyntaxException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    boolean resourceSaved = saveGraphicalResource();
    if (!resourceSaved) {
      return;
    }
    dirty = false;
    firePropertyChange(IEditorPart.PROP_DIRTY);

  }

  @Override
  public void doSaveAs() {
    // TODO Auto-generated method stub

  }
  
  /**
   * Saves graphical resource (.crom_dia) handled by the dataEditor.
   * Edits the FRaMED Configuration according to the changes in this editor. 
   * 
   * @return True if saving of model succeeds, otherwise false.
   */
  private boolean saveGraphicalResource() {
    Resource currentResource = getCdResource();
    if (currentResource == null) {
      return false;
    }

    try {
      currentResource.save(null);
      return true;
    } catch (IOException e) {
      // TODO do something smarter.
      e.printStackTrace();
    }
    return false;
  }

  @Override
  public void init(IEditorSite site, IEditorInput input) throws PartInitException {
    setSite(site);
    setInput(input);
    FRaMEDConfiguration framedConfiguration = rootmodel.getFramedConfiguration();
    if (framedConfiguration == null || framedConfiguration.getFeatures() == null || framedConfiguration.getFeatures().size() < 1) {
      try {
        createStandardFramedConfiguration();
      } catch (URISyntaxException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

  /**
   * Retrieves the standard {@link org.framed.orm.featuremodel.impl.FRaMEDConfiguration} and applies the features to
   * the runtime {@link org.framed.orm.featuremodel.impl.FRaMEDConfiguration}
   * 
   * @throws URISyntaxException
   * @throws IOException
   */
  private void createStandardFramedConfiguration() throws URISyntaxException, IOException {
    //Load standard configuration for framed
    Bundle bundle = Platform.getBundle("org.framed.orm.featuremodel");
    URL fileURL = bundle.getEntry("/standardframedconfiguration/standardframedconfiguration.crom_dia");
    ResourceSet resourceSet = new ResourceSetImpl();
    Resource resource = resourceSet.createResource(URI.createURI(FileLocator.resolve(fileURL).toURI().toString()));
    try {
      resource.load(null);
    } catch (IOException e) {
      // TODO do something smarter.
      e.printStackTrace();
      resource = null;
    }
    
    standardConfigurationModel = (Model)resource.getContents().get(0);  
    rootmodel.setFramedConfiguration(FeaturemodelFactory.eINSTANCE.createFRaMEDConfiguration());
    
    //Apply each feature in the standard configuration to the FeatureIDE Configuration
    for (FRaMEDFeature framedFeature : standardConfigurationModel.getFramedConfiguration().getFeatures()) {
      if (framedFeature.isManuallySelected()) {
        getConfiguration().setManual(framedFeature.getName(), Selection.SELECTED);
      }
      else {
        getConfiguration().setManual(framedFeature.getName(), Selection.UNDEFINED);
      }
    }
  }

  @Override
  public boolean isDirty() {
    return dirty;
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
      public void widgetDefaultSelected(SelectionEvent e) {}

      @Override
      public void widgetSelected(SelectionEvent event) {
        if (event.detail == SWT.CHECK) {
          final TreeItem item = (TreeItem) event.item;
          final Object data = item.getData();
          if (data instanceof SelectableFeature) {
            final SelectableFeature feature = (SelectableFeature) item.getData();
            item.setChecked(true);
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
    });
  }

  private void applyStandardFramedConfigurationToConfiguration() {
    
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
      if (ormMultiPageEditor.isAutoSelectFeatures()) {
        TreeElement configRootFeature = getConfiguration().getRoot();
        updateSelections(itemMap.get(configRootFeature), configRootFeature.getChildren());
      } else {
        refreshItem(item, feature);
      }
    }
    updateInfoLabel();


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
    getConfiguration().setManual(feature, selection);
    saveConfigurationToModel();
  }
  
  
  public Configuration getConfiguration() {
    return configuration;
  }

  public Resource getCdResource() {
    return cdResource;
  }

  public Model getRootmodel() {
    return rootmodel;
  }
  
  /**
   * Removes all existing Features in the current {@link org.framed.orm.featuremodel.impl.FRaMEDConfiguration},
   * and adds the currently selected Features.
   */
  private void saveConfigurationToModel() {
    Configuration configuration = getConfiguration();
    FRaMEDConfiguration framedConfiguration = getRootmodel().getFramedConfiguration();
    //Remove all existing Features
    framedConfiguration.getFeatures().clear();
    List<String> manuelleFeatureNamen = new ArrayList<String>();
    for (SelectableFeature s : configuration.getManualFeatures()) {
      manuelleFeatureNamen.add(s.getName());
    }
    //Add each selected feature to the FramedConfiguration
    for (Feature f : configuration.getSelectedFeatures()) {
      FRaMEDFeature myFeature = FeaturemodelFactory.eINSTANCE.createFRaMEDFeature();
      myFeature.setName(f.getName());
      myFeature.setManuallySelected(manuelleFeatureNamen.contains(f.getName()));
      framedConfiguration.getFeatures().add(myFeature);
    }
    
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
    infoLabel = new Label(compositeTop, SWT.NONE);
    infoLabel.setLayoutData(gridData);
    updateInfoLabel();

    // autoselect button
    // gridData = new GridData();
    // gridData.horizontalAlignment = SWT.RIGHT;
    // gridData.verticalAlignment = SWT.CENTER;
    // autoSelectButton = new Button(compositeTop, SWT.TOGGLE);
    // autoSelectButton.setText(AUTOSELECT_FEATURES);
    // autoSelectButton.setLayoutData(gridData);
    // autoSelectButton.setSelection(false);
    // autoSelectButton.setEnabled(false);
    //
    // autoSelectButton.addSelectionListener(new SelectionListener() {
    // @Override
    // public void widgetSelected(SelectionEvent e) {
    // final Configuration config = configurationEditor.getConfiguration();
    // if (configurationEditor.isAutoSelectFeatures()) {
    // invalidFeatures.clear();
    // configurationEditor.setAutoSelectFeatures(false);
    // configurationEditor.getConfigJobManager().cancelAllJobs();
    // config.makeManual(!canDeselectFeatures());
    // walkTree(new IBinaryFunction<TreeItem, SelectableFeature, Void>() {
    // @Override
    // public Void invoke(TreeItem item, SelectableFeature feature) {
    // refreshItem(item, feature);
    // return null;
    // }
    // }, new FunctionalInterfaces.NullFunction<Void, Void>());
    // updateInfoLabel(Display.getCurrent());
    // } else {
    // if (invalidFeatures.isEmpty()) {
    // configurationEditor.setAutoSelectFeatures(true);
    // // updateInfoLabel();
    // computeTree(true);
    // } else {
    // autoSelectButton.setSelection(false);
    // }
    // }
    // }
    //
    // @Override
    // public void widgetDefaultSelected(SelectionEvent e) {}
    // });

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

  private void updateInfoLabel() {
    Boolean valid = configuration.isValid();
    infoLabel.setText(valid? "VALID Configuration" : "INVALID Configuration");
    infoLabel.setForeground(valid ? blue : red);    
  }

  public void updateTree() {
    final Configuration configuration = getConfiguration();
    tree.removeAll();
    final TreeItem root = new TreeItem(tree, 0);
    final SelectableFeature rootFeature = configuration.getRoot();
    root.setText(configuration.getRoot().getName());
    root.setData(configuration.getRoot());
    refreshItem(root, rootFeature);
    itemMap.put(configuration.getRoot(), root);
    buildTree(root, configuration.getRoot().getChildren());
    updateInfoLabel();
  }

  private void buildTree(final TreeItem parent, final TreeElement[] children) {
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
            buildTree(childNode, currentFeature.getChildren());
          }
        }
      }
    }
    parent.setExpanded(true);
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
        // if (!currentFeature.getFeature().isHidden()) {
        // TreeItem childNode = null;
        // // This try for the case that the parent item is already disposed.
        // try {
        // childNode = new TreeItem(parent, 0);
        // } catch (Exception e) {
        //
        // return;
        // }
        // childNode.setText(currentFeature.getFeature().getDisplayName());
        // childNode.setData(currentFeature);
        // refreshItem(childNode, currentFeature);
        // itemMap.put(currentFeature, childNode);
        // if (currentFeature.hasChildren()) {
        // buildTree2(childNode, currentFeature.getChildren());
        // }
      }
    }
  }
  
  private void readFeatureModel() throws FileNotFoundException, UnsupportedModelException {
//  IResource res = project.findMember("platform:/plugin/org.framed.orm.featuremodel/model.xml");
  final FeatureModel featureModel = new FeatureModel();
 // FileLocator.toFileURL(url)
  
             Bundle bundle = Platform.getBundle("org.framed.orm.featuremodel");
             URL fileURL = bundle.getEntry("model.xml");
             try {
                 featureModelFile = new File(FileLocator.resolve(fileURL).toURI());
             } catch (URISyntaxException e1) {
                e1.printStackTrace();
             } catch (IOException e1) {
                 e1.printStackTrace();
             };
             
  new XmlFeatureModelReader(featureModel).readFromFile(featureModelFile);
  this.featureModel = featureModel;
//  XmlFeatureModelReader featureModelReader = new XmlFeatureModelReader(featureModel);
//  featureModelReader.readFromFile(file);
//  featureModel = featureModelReader.getFeatureModel();
}
  private void loadConfiguration() {
    FRaMEDConfiguration framedConfiguration = getRootmodel().getFramedConfiguration();
    configuration = new Configuration(featureModel);
    configuration.getPropagator().update(false, null, new WorkMonitor());
    EList<FRaMEDFeature> featuresToRemove = new BasicEList<FRaMEDFeature>();
    //Check if the FeatureName used in the .crom_dia file 
    //corresponds with an actually existing feature in the feature model
    if (framedConfiguration != null) {
      for (FRaMEDFeature f : framedConfiguration.getFeatures()){
        if (featureModel.getFeature(f.getName()) != null) {
          configuration.setManual(f.getName(), Selection.SELECTED);
        }
        else {
          featuresToRemove.add(f);
        }
      }
      for (FRaMEDFeature toRemove : featuresToRemove) {
        framedConfiguration.getFeatures().remove(toRemove);
      }
    }
//    if (!isDirty()) {
//        doSave(null);
//    }
  }

}
