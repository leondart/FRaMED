package org.framed.orm.ui.editor;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.draw2d.Label;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;


/**
 * Manages the direct edit operation by creating and maintaining the
 * org.eclipse.jface.viewers.CellEditor and executing the resulting command if the cell editor value
 * has changed.
 * 
 * @author Kay Bierzynski
 * @author Lars Schuetze (refactoring)
 * @author David Gollasch(implemented check for text input)
 * */
public class ORMDirectEditManager extends DirectEditManager {

  /** The {@link Label}, whose text the user wants edit. */
  private final Label label;

  /**
   * The constructor of this class, where the
   * {@link DirectEditManager#DirectEditManager(GraphicalEditPart, Class, CellEditorLocator, Object)}
   * is called and the {@link Label}, whose text the user wants edit is set.
   * */
  public ORMDirectEditManager(final GraphicalEditPart source, final Class editorType,
      final CellEditorLocator locator, final Label label) {
    super(source, editorType, locator);
    this.label = label;
  }

  /**
   * Sets the initial text in the cell editor. Usually it's the text of the label.
   */
  @Override
  protected void initCellEditor() {
    getCellEditor().setValue(label.getText());
  }
  
  /**
   * Validates the entered string for valid operation, attribute, 
   * parameter or cardinality expressions
   */
  @Override
	protected void handleValueChanged() {
		super.handleValueChanged();
		
		String value = ""; //TODO: read the changed value here
		
		// regular expressions
		String identifier = "[a-zA-Z_$][a-zA-Z\\d_$]*"; 						//string of letters and digits, first is no digit (for names)
		String qualifiedIdentifier = "(" + identifier + "\\.)*" + identifier; 	//full classes: (N.)*N (for types)
		String cardinality = "(\\d+|\\*)(\\.\\.(\\d+|\\*))?"; 					//(<integer>|"*")[".."(<integer>|"*")]
		String attribute = identifier + ":" + qualifiedIdentifier; 				//<name>:<type>
		String parameter = attribute;											//<name>:<type>
		String operation = identifier + "\\((" + parameter + "(," + parameter + ")*)?\\):" + qualifiedIdentifier;
																				//<name>"("[Parameter(","Parameter)*]"):"<type>
		
		Boolean matching = false;
		
		Pattern p_operation = Pattern.compile(operation);
		Matcher m_operation = p_operation.matcher(value);
		Pattern p_attribute = Pattern.compile(attribute);
		Matcher m_attribute = p_attribute.matcher(value);
		Pattern p_parameter = Pattern.compile(parameter);
		Matcher m_parameter = p_parameter.matcher(value);
		Pattern p_cardinali = Pattern.compile(cardinality);
		Matcher m_cardinali = p_cardinali.matcher(value);
		
		if(
			m_operation.matches() ||
			m_attribute.matches() ||
			m_parameter.matches() ||
			m_cardinali.matches()) {
			matching = true;
		} else if(value == null || value.equals("")) {
			matching = true; //..as there is no entered value to check
		}
		
		if(!matching) {
			//TODO: throw according error and reject changes
		}
		
	}

}
