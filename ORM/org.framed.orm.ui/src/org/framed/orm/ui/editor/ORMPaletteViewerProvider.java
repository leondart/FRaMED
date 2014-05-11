package org.framed.orm.ui.editor;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.ui.palette.PaletteContextMenuProvider;
import org.eclipse.gef.ui.palette.PaletteViewer;

/**
 * PaletteViewerProvider provides a standard way of creating palette viewers
 * that can be shared across different clients that need to create a palette
 * (PaletteViewerPage and FlyoutPaletteComposite, for instance).
 * 
 * @author Pratik Shah
 * @author Paul
 * @since 3.0
 */

public class ORMPaletteViewerProvider {

  private EditDomain graphicalViewerEditDomain;

  /**
   * Constructor
   * 
   * @param graphicalViewerDomain
   *            The EditDomain with which each newly created PaletteViewer
   *            will be registered
   */
  public ORMPaletteViewerProvider(EditDomain graphicalViewerDomain) {
    Assert.isNotNull(graphicalViewerDomain);
    graphicalViewerEditDomain = graphicalViewerDomain;
  }

  /**
   * This method is invoked from {@link #createPaletteViewer(Composite)}. It
   * configures the given viewer's settings.
   * 
   * @param viewer
   *            the viewer that is to be configured
   */
  protected void configurePaletteViewer(PaletteViewer viewer) {
    viewer.setContextMenu(new PaletteContextMenuProvider(viewer));
  }

  /**
   * Creates a PaletteViewer on the given Composite
   * 
   * @param parent
   *            the control for the PaletteViewer
   * @return the newly created PaletteViewer
   */
  public PaletteViewer createPaletteViewer(Composite parent) {
    PaletteViewer pViewer = new PaletteViewer();
    pViewer.createControl(parent);
    configurePaletteViewer(pViewer);
    hookPaletteViewer(pViewer);
    return pViewer;
  }

  /**
   * @return the EditDomain provided during creation of this
   *         PaletteViewerProvider
   */
  public final EditDomain getEditDomain() {
    return graphicalViewerEditDomain;
  }

  /**
   * This method is invoked from {@link #createPaletteViewer(Composite)}. It
   * is a step in the process of setting up the PaletteViewer after it has
   * been created.
   * 
   * @param viewer
   *            the viewer that is to be configured
   */
  protected void hookPaletteViewer(PaletteViewer viewer) {
    getEditDomain().setPaletteViewer(viewer);
  }


}
