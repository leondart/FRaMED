package org.framed.orm.ui.editor;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.part.Page;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gef.ui.palette.PaletteViewerProvider;
import org.eclipse.gef.ui.views.palette.PalettePage;

/**
 * The default page for the PaletteView that works in conjunction with a
 * PaletteViewerProvider.
 * 
 * @author Pratik Shah
 * @since 3.0
 */
public class ORMPaletteViewerPage extends Page implements PalettePage, IAdaptable {

    /**
     * The PaletteViewerProvider that is used to create the PaletteViewer
     */
    protected ORMPaletteViewerProvider provider;
    /**
     * The PaletteViewer created for this page
     */
    protected PaletteViewer viewer;

    /**
     * Constructor
     * 
     * @param ormPaletteViewerProvider
     *            the provider used to create the palette viewer
     */
    public ORMPaletteViewerPage(ORMPaletteViewerProvider ormPaletteViewerProvider) {
        Assert.isNotNull(ormPaletteViewerProvider);
        provider = ormPaletteViewerProvider;
    }

    /**
     * Creates the palette viewer and its control.
     * 
     * @see Page#createControl(org.eclipse.swt.widgets.Composite)
     */
    public void createControl(Composite parent) {
        viewer = provider.createPaletteViewer(parent);
    }

    /**
     * Releases the palette viewer from the edit domain
     * 
     * @see Page#dispose()
     */
    public void dispose() {
        if (provider.getEditDomain().getPaletteViewer() == viewer)
            provider.getEditDomain().setPaletteViewer(null);
        super.dispose();
        viewer = null;
    }

    /**
     * @see IAdaptable#getAdapter(java.lang.Class)
     */
    public Object getAdapter(Class adapter) {
        if (adapter == EditPart.class && viewer != null)
            return viewer.getEditPartRegistry().get(viewer.getPaletteRoot());
        if (adapter == IFigure.class && viewer != null) {
            Object obj = viewer.getEditPartRegistry().get(
                    viewer.getPaletteRoot());
            if (obj instanceof GraphicalEditPart)
                return ((GraphicalEditPart) obj).getFigure();
        }
        return null;
    }

    /**
     * @return the palette viewer's control
     * @see Page#getControl()
     */
    public Control getControl() {
        return viewer.getControl();
    }

    /**
     * Sets focus on the palette's control
     * 
     * @see Page#setFocus()
     */
    public void setFocus() {
        getControl().setFocus();
    }

}
