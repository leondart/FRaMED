package org.framed.orm.transformation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;

public class TransformationExecutor extends EpsilonStandalone {

  private Resource sourceModelFile;

  private Resource targetModelFile;

  private String transformationFile;

  public TransformationExecutor() {
    sourceModelFile = null;
    targetModelFile = null;
    transformationFile = "epsilon/ORM2CROM.etl";
  }

  public Resource getSourceModelFile() {
    return sourceModelFile;
  }

  public void setSourceModelFile(Resource sourceModelFile) {
    this.sourceModelFile = sourceModelFile;
  }

  public Resource getTargetModelFile() {
    return targetModelFile;
  }

  public void setTargetModelFile(Resource targetModelFile) {
    this.targetModelFile = targetModelFile;
  }

  public void setForcedTransformation(String transformationFileName) {
    this.transformationFile = "epsilon/" + transformationFileName;
  }

  @Override
  public IEolExecutableModule createModule() {
    EtlModule module = new EtlModule();
    module.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());

    return module;
  }

  @Override
  public String getSource() {
    return transformationFile;
  }

  @Override
  public List<IModel> getModels() throws Exception {
    List<IModel> models = new ArrayList<IModel>();

    EmfModel emfModel = new EmfModel();
    emfModel.setMetamodelUri("http://orm/1.0");
    emfModel.setModelFileUri(sourceModelFile.getURI());
    emfModel.setReadOnLoad(true);
    emfModel.setStoredOnDisposal(true);
    emfModel.setName("source");
    emfModel.load();
    models.add(emfModel);

    emfModel = new EmfModel();
    emfModel.setReadOnLoad(true);
    emfModel.setModelFileUri(targetModelFile.getURI());
    emfModel.setStoredOnDisposal(true);
    emfModel.setMetamodelUri("platform:/resource/org.rosi.crom.metamodel/");
    emfModel.setName("target");
    emfModel.load();
    models.add(emfModel);

    return models;
  }

}
