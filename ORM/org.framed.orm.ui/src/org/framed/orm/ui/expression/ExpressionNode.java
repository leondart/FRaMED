package org.framed.orm.ui.expression;

/**
 * Fallback for Expression nodes, which are not Feature Names. Can be used for {@link FeatureExpression}s by using the toString()-method.
 * @author Marc Kandler 
 **/
public enum ExpressionNode {

  LB(0, "("), RB(1, ")"), AND(2, "&&"), OR(3, "||"), NOT(4, "!");

  private int value;

  private String literal;

  ExpressionNode(int value, String literal) {
    this.value = value;
    this.literal = literal;
  }

  public int getValue() {
    return value;
  }

  public String getLiteral() {
    return literal;
  }

  @Override
  public String toString() {
    return literal;
  }


}
