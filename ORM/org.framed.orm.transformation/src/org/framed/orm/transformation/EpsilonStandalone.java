package org.framed.orm.transformation;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.models.IModel;
import org.osgi.framework.Bundle;

public abstract class EpsilonStandalone {

  protected IEolExecutableModule module;

  protected Object result;

  public abstract IEolExecutableModule createModule();

  public abstract String getSource();

  public abstract List<IModel> getModels() throws Exception;

  public void postProcess() {};

  public void preProcess() {};

  public void execute() throws Exception {

    module = createModule();
    module.parse(getTransformationFile());

    if (module.getParseProblems().size() > 0) {
      System.err.println("Parse errors occured...");
      for (ParseProblem problem : module.getParseProblems()) {
        System.err.println(problem.toString());
      }
      System.exit(-1);
    }

    for (IModel model : getModels()) {
      module.getContext().getModelRepository().addModel(model);
    }

    preProcess();
    result = execute(module);
    postProcess();

    module.getContext().getModelRepository().dispose();
  }

  protected Object execute(IEolExecutableModule module) throws EolRuntimeException {
    return module.execute();
  }

  private URI getTransformationFile() {
    Bundle bundle = Platform.getBundle("org.framed.orm.transformation");
    URL fileURL = bundle.getEntry(getSource());

    try {
      return fileURL.toURI();
    } catch (URISyntaxException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return null;
  }
}
