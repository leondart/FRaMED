package org.framed.orm.ui.editor;

public interface ORMGraphicalEditorObserver {
	public void update(final String type);
	public void update(final ORMGraphicalEditor.EditorType type);

}
