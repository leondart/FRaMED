/**
 *
 * $Id$
 */
package org.framed.orm.geometry.validation;

import org.framed.orm.geometry.Point;

/**
 * A sample validator interface for {@link org.framed.orm.geometry.Rectangle}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RectangleValidator {
  boolean validate();

  boolean validateTopLeft(Point value);

  boolean validateBottomRight(Point value);
}
