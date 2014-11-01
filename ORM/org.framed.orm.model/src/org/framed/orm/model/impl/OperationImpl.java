/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.Operation;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Parameter;
import org.framed.orm.model.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.OperationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.OperationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.OperationImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends TypedElementImpl implements Operation {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getOwner() {
    return (Type) eGet(OrmPackage.Literals.OPERATION__OWNER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwner(Type newOwner) {
    eSet(OrmPackage.Literals.OPERATION__OWNER, newOwner);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperation() {
    return (String) eGet(OrmPackage.Literals.OPERATION__OPERATION, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(String newOperation) {
    eSet(OrmPackage.Literals.OPERATION__OPERATION, newOperation);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Parameter> getParams() {
    return (EList<Parameter>) eGet(OrmPackage.Literals.OPERATION__PARAMS, true);
  }

} //OperationImpl
