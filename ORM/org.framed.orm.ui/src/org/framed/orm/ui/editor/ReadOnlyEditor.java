package org.framed.orm.ui.editor;

import org.eclipse.ui.editors.text.TextEditor;

/**
 * This editor ensures that the raw .crom and .crom_dia files can be monitored in read-only mode as own pages.
 * @author Marc Kandler
 *
 */
public class ReadOnlyEditor extends TextEditor{

    public ReadOnlyEditor() {
        super();
    }
    
    @Override
    public boolean isEditable() {
        return false;
    }

    @Override
    public boolean isEditorInputModifiable() {
        return false;
    }

    @Override
    public boolean isEditorInputReadOnly() {
        return true;
    }

    @Override
    public boolean isDirty() {
        return false;
    }
    
}
