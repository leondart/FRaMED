package org.framed.orm.ui.editor;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gef.ui.palette.PaletteViewerProvider;

/**
 * PaletteViewerProvider provides a standard way of creating palette viewers that can be shared
 * across different clients that need to create a palette (PaletteViewerPage and
 * FlyoutPaletteComposite, for instance).
 * 
 * @author Paul
 * @since 3.0
 */

public class ORMPaletteViewerProvider extends PaletteViewerProvider {

  /**
   * Constructor
   * 
   * @param graphicalViewerDomain The EditDomain with which each newly created PaletteViewer will be
   *        registered
   */
  public ORMPaletteViewerProvider(EditDomain graphicalViewerDomain) {
    super(graphicalViewerDomain);
  }

  /**
   * Creates a PaletteViewer on the given Composite
   * 
   * @param parent the control for the PaletteViewer
   * @return the newly created PaletteViewer
   */
  public PaletteViewer createPaletteViewer(Composite parent) {
    PaletteViewer pViewer = new PaletteViewer();
    pViewer.enableVerticalScrollbar(true);
    pViewer.createControl(parent);
    configurePaletteViewer(pViewer);
    hookPaletteViewer(pViewer);
    return pViewer;
  }

}
