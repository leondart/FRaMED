/**
 */
package org.framed.orm.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.framed.orm.model.OrmFactory
 * @model kind="package"
 * @generated
 */
public interface OrmPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "orm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://orm/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "org.framed.orm.model";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OrmPackage eINSTANCE = org.framed.orm.model.impl.OrmPackageImpl.init();

  /**
   * The meta object id for the '{@link org.framed.orm.model.NamedElement <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.NamedElement
   * @see org.framed.orm.model.impl.OrmPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.ModelElement <em>Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.ModelElement
   * @see org.framed.orm.model.impl.OrmPackageImpl#getModelElement()
   * @generated
   */
  int MODEL_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT__CONTAINER = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.ModelImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getModel()
   * @generated
   */
  int MODEL = 2;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RELATIONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.ElementModelImpl <em>Element Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.ElementModelImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getElementModel()
   * @generated
   */
  int ELEMENT_MODEL = 3;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_MODEL__RELATIONS = MODEL__RELATIONS;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_MODEL__ELEMENTS = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Element Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.AbstractRoleModelImpl <em>Abstract Role Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.AbstractRoleModelImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getAbstractRoleModel()
   * @generated
   */
  int ABSTRACT_ROLE_MODEL = 4;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE_MODEL__RELATIONS = MODEL__RELATIONS;

  /**
   * The feature id for the '<em><b>Abstractroles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE_MODEL__ABSTRACTROLES = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abstract Role Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Abstract Role Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RigidTypeImpl <em>Rigid Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RigidTypeImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRigidType()
   * @generated
   */
  int RIGID_TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_TYPE__NAME = MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_TYPE__CONTAINER = MODEL_ELEMENT__CONTAINER;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_TYPE__INCOMING = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_TYPE__OUTGOING = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Boundaries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_TYPE__BOUNDARIES = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_TYPE__ATTRIBUTES = MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_TYPE__OPERATIONS = MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Rigid Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_TYPE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>Rigid Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGID_TYPE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.GroupImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getGroup()
   * @generated
   */
  int GROUP = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__CONTAINER = MODEL_ELEMENT__CONTAINER;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__RELATIONS = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__INCOMING = MODEL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__OUTGOING = MODEL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Boundaries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__BOUNDARIES = MODEL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RelationImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 7;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__RELATION_CONTAINER = 0;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__DIM1_BP = 1;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__DIM2_BP = 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__TARGET = 3;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__SOURCE = 4;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.TypedElementImpl <em>Typed Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.TypedElementImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getTypedElement()
   * @generated
   */
  int TYPED_ELEMENT = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Typed Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Typed Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.ParameterImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = TYPED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = TYPED_ELEMENT__TYPE;

  /**
   * The feature id for the '<em><b>Owneroperation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__OWNEROPERATION = TYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.OperationImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = TYPED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__TYPE = TYPED_ELEMENT__TYPE;

  /**
   * The feature id for the '<em><b>Owner</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OWNER = TYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OPERATION = TYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARAMS = TYPED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.AttributeImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = TYPED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = TYPED_ELEMENT__TYPE;

  /**
   * The feature id for the '<em><b>Owner</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__OWNER = TYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RelationTargetImpl <em>Relation Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RelationTargetImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRelationTarget()
   * @generated
   */
  int RELATION_TARGET = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_TARGET__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_TARGET__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_TARGET__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Boundaries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_TARGET__BOUNDARIES = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Relation Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_TARGET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Relation Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_TARGET_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.TypeImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getType()
   * @generated
   */
  int TYPE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = RELATION_TARGET__NAME;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__INCOMING = RELATION_TARGET__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__OUTGOING = RELATION_TARGET__OUTGOING;

  /**
   * The feature id for the '<em><b>Boundaries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__BOUNDARIES = RELATION_TARGET__BOUNDARIES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ATTRIBUTES = RELATION_TARGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__OPERATIONS = RELATION_TARGET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = RELATION_TARGET_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OPERATION_COUNT = RELATION_TARGET_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.DataTypeImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = RIGID_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__CONTAINER = RIGID_TYPE__CONTAINER;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__INCOMING = RIGID_TYPE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__OUTGOING = RIGID_TYPE__OUTGOING;

  /**
   * The feature id for the '<em><b>Boundaries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__BOUNDARIES = RIGID_TYPE__BOUNDARIES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__ATTRIBUTES = RIGID_TYPE__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__OPERATIONS = RIGID_TYPE__OPERATIONS;

  /**
   * The feature id for the '<em><b>Serializable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__SERIALIZABLE = RIGID_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tr extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__TR_EXTENDS = RIGID_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = RIGID_TYPE_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_OPERATION_COUNT = RIGID_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.NaturalTypeImpl <em>Natural Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.NaturalTypeImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getNaturalType()
   * @generated
   */
  int NATURAL_TYPE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__NAME = RIGID_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__CONTAINER = RIGID_TYPE__CONTAINER;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__INCOMING = RIGID_TYPE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__OUTGOING = RIGID_TYPE__OUTGOING;

  /**
   * The feature id for the '<em><b>Boundaries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__BOUNDARIES = RIGID_TYPE__BOUNDARIES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__ATTRIBUTES = RIGID_TYPE__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__OPERATIONS = RIGID_TYPE__OPERATIONS;

  /**
   * The feature id for the '<em><b>Tr extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__TR_EXTENDS = RIGID_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Natural Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE_FEATURE_COUNT = RIGID_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Natural Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE_OPERATION_COUNT = RIGID_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.CompartmentTypeImpl <em>Compartment Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.CompartmentTypeImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getCompartmentType()
   * @generated
   */
  int COMPARTMENT_TYPE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE__NAME = RIGID_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE__CONTAINER = RIGID_TYPE__CONTAINER;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE__INCOMING = RIGID_TYPE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE__OUTGOING = RIGID_TYPE__OUTGOING;

  /**
   * The feature id for the '<em><b>Boundaries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE__BOUNDARIES = RIGID_TYPE__BOUNDARIES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE__ATTRIBUTES = RIGID_TYPE__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE__OPERATIONS = RIGID_TYPE__OPERATIONS;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE__RELATIONS = RIGID_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abstractroles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE__ABSTRACTROLES = RIGID_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE__IS_EXPAND = RIGID_TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE__PARTS = RIGID_TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Relationships</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE__RELATIONSHIPS = RIGID_TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE__CONSTRAINTS = RIGID_TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Tr extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE__TR_EXTENDS = RIGID_TYPE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Compartment Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE_FEATURE_COUNT = RIGID_TYPE_FEATURE_COUNT + 7;

  /**
   * The number of operations of the '<em>Compartment Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TYPE_OPERATION_COUNT = RIGID_TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.AntiRigidTypeImpl <em>Anti Rigid Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.AntiRigidTypeImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getAntiRigidType()
   * @generated
   */
  int ANTI_RIGID_TYPE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_TYPE__INCOMING = TYPE__INCOMING;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_TYPE__OUTGOING = TYPE__OUTGOING;

  /**
   * The feature id for the '<em><b>Boundaries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_TYPE__BOUNDARIES = TYPE__BOUNDARIES;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_TYPE__ATTRIBUTES = TYPE__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_TYPE__OPERATIONS = TYPE__OPERATIONS;

  /**
   * The number of structural features of the '<em>Anti Rigid Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Anti Rigid Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_RIGID_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleGroupElementImpl <em>Role Group Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleGroupElementImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleGroupElement()
   * @generated
   */
  int ROLE_GROUP_ELEMENT = 44;

  /**
   * The number of structural features of the '<em>Role Group Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Role Group Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP_ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.AbstractRole <em>Abstract Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.AbstractRole
   * @see org.framed.orm.model.impl.OrmPackageImpl#getAbstractRole()
   * @generated
   */
  int ABSTRACT_ROLE = 36;

  /**
   * The feature id for the '<em><b>Fulfillment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE__FULFILLMENT = ROLE_GROUP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE__PARENT = ROLE_GROUP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Abstract Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE_FEATURE_COUNT = ROLE_GROUP_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Abstract Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE_OPERATION_COUNT = ROLE_GROUP_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleTypeImpl <em>Role Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleTypeImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleType()
   * @generated
   */
  int ROLE_TYPE = 16;

  /**
   * The feature id for the '<em><b>Fulfillment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__FULFILLMENT = ABSTRACT_ROLE__FULFILLMENT;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__PARENT = ABSTRACT_ROLE__PARENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__NAME = ABSTRACT_ROLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__INCOMING = ABSTRACT_ROLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__OUTGOING = ABSTRACT_ROLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Boundaries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__BOUNDARIES = ABSTRACT_ROLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__ATTRIBUTES = ABSTRACT_ROLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__OPERATIONS = ABSTRACT_ROLE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Tr extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__TR_EXTENDS = ABSTRACT_ROLE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Role Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE_FEATURE_COUNT = ABSTRACT_ROLE_FEATURE_COUNT + 7;

  /**
   * The number of operations of the '<em>Role Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE_OPERATION_COUNT = ABSTRACT_ROLE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RelationshipImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRelationship()
   * @generated
   */
  int RELATIONSHIP = 17;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__RELATION_CONTAINER = RELATION__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__DIM1_BP = RELATION__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__DIM2_BP = RELATION__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TARGET = RELATION__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SOURCE = RELATION__SOURCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__NAME = RELATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Second Parthood</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SECOND_PARTHOOD = RELATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Second Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SECOND_LOWER = RELATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>First Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__FIRST_LOWER = RELATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>First Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__FIRST_UPPER = RELATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Second Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SECOND_UPPER = RELATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>First Parthood</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__FIRST_PARTHOOD = RELATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Source Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SOURCE_LABEL = RELATION_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Target Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TARGET_LABEL = RELATION_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>First Lower Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__FIRST_LOWER_UPPER = RELATION_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Second Lower Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SECOND_LOWER_UPPER = RELATION_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Rlship Constraints</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__RLSHIP_CONSTRAINTS = RELATION_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__DIRECTION = RELATION_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__FIRST = RELATION_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SECOND = RELATION_FEATURE_COUNT + 14;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = RELATION_FEATURE_COUNT + 15;

  /**
   * The number of operations of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.FulfillmentImpl <em>Fulfillment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.FulfillmentImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getFulfillment()
   * @generated
   */
  int FULFILLMENT = 18;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILLMENT__RELATION_CONTAINER = RELATION__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILLMENT__DIM1_BP = RELATION__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILLMENT__DIM2_BP = RELATION__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILLMENT__TARGET = RELATION__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILLMENT__SOURCE = RELATION__SOURCE;

  /**
   * The feature id for the '<em><b>Fulfilled Roles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILLMENT__FULFILLED_ROLES = RELATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Filler</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILLMENT__FILLER = RELATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fulfillment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILLMENT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Fulfillment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILLMENT_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.InheritanceImpl <em>Inheritance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.InheritanceImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getInheritance()
   * @generated
   */
  int INHERITANCE = 19;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE__RELATION_CONTAINER = RELATION__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE__DIM1_BP = RELATION__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE__DIM2_BP = RELATION__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE__TARGET = RELATION__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE__SOURCE = RELATION__SOURCE;

  /**
   * The number of structural features of the '<em>Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.ConstraintImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 20;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__RELATION_CONTAINER = RELATION__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__DIM1_BP = RELATION__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__DIM2_BP = RELATION__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__TARGET = RELATION__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__SOURCE = RELATION__SOURCE;

  /**
   * The feature id for the '<em><b>Owner Compartment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__OWNER_COMPARTMENT = RELATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleConstraintImpl <em>Role Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleConstraintImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleConstraint()
   * @generated
   */
  int ROLE_CONSTRAINT = 21;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_CONSTRAINT__RELATION_CONTAINER = CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_CONSTRAINT__DIM1_BP = CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_CONSTRAINT__DIM2_BP = CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_CONSTRAINT__TARGET = CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_CONSTRAINT__SOURCE = CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Owner Compartment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_CONSTRAINT__OWNER_COMPARTMENT = CONSTRAINT__OWNER_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Ends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_CONSTRAINT__ENDS = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_CONSTRAINT__SECOND = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_CONSTRAINT__FIRST = CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Role Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Role Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RelationshipConstraintImpl <em>Relationship Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RelationshipConstraintImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRelationshipConstraint()
   * @generated
   */
  int RELATIONSHIP_CONSTRAINT = 22;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT__RELATION_CONTAINER = CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT__DIM1_BP = CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT__DIM2_BP = CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT__TARGET = CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT__SOURCE = CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Owner Compartment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT__OWNER_COMPARTMENT = CONSTRAINT__OWNER_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Relation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT__RELATION = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Relationship Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Relationship Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.IntraRelationshipConstraintImpl <em>Intra Relationship Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.IntraRelationshipConstraintImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getIntraRelationshipConstraint()
   * @generated
   */
  int INTRA_RELATIONSHIP_CONSTRAINT = 23;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRA_RELATIONSHIP_CONSTRAINT__RELATION_CONTAINER =
      RELATIONSHIP_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRA_RELATIONSHIP_CONSTRAINT__DIM1_BP = RELATIONSHIP_CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRA_RELATIONSHIP_CONSTRAINT__DIM2_BP = RELATIONSHIP_CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRA_RELATIONSHIP_CONSTRAINT__TARGET = RELATIONSHIP_CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRA_RELATIONSHIP_CONSTRAINT__SOURCE = RELATIONSHIP_CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Owner Compartment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRA_RELATIONSHIP_CONSTRAINT__OWNER_COMPARTMENT = RELATIONSHIP_CONSTRAINT__OWNER_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Relation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRA_RELATIONSHIP_CONSTRAINT__RELATION = RELATIONSHIP_CONSTRAINT__RELATION;

  /**
   * The number of structural features of the '<em>Intra Relationship Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRA_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Intra Relationship Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRA_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT = RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.InterRelationshipConstraintImpl <em>Inter Relationship Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.InterRelationshipConstraintImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getInterRelationshipConstraint()
   * @generated
   */
  int INTER_RELATIONSHIP_CONSTRAINT = 24;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_RELATIONSHIP_CONSTRAINT__RELATION_CONTAINER =
      RELATIONSHIP_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_RELATIONSHIP_CONSTRAINT__DIM1_BP = RELATIONSHIP_CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_RELATIONSHIP_CONSTRAINT__DIM2_BP = RELATIONSHIP_CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_RELATIONSHIP_CONSTRAINT__TARGET = RELATIONSHIP_CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_RELATIONSHIP_CONSTRAINT__SOURCE = RELATIONSHIP_CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Owner Compartment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_RELATIONSHIP_CONSTRAINT__OWNER_COMPARTMENT = RELATIONSHIP_CONSTRAINT__OWNER_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Relation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_RELATIONSHIP_CONSTRAINT__RELATION = RELATIONSHIP_CONSTRAINT__RELATION;

  /**
   * The feature id for the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_RELATIONSHIP_CONSTRAINT__FIRST = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_RELATIONSHIP_CONSTRAINT__SECOND = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inter Relationship Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Inter Relationship Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT = RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.ComplexConstraintImpl <em>Complex Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.ComplexConstraintImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getComplexConstraint()
   * @generated
   */
  int COMPLEX_CONSTRAINT = 25;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_CONSTRAINT__RELATION_CONTAINER = CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_CONSTRAINT__DIM1_BP = CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_CONSTRAINT__DIM2_BP = CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_CONSTRAINT__TARGET = CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_CONSTRAINT__SOURCE = CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Owner Compartment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_CONSTRAINT__OWNER_COMPARTMENT = CONSTRAINT__OWNER_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Targets</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_CONSTRAINT__TARGETS = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_CONSTRAINT__EXPRESSION = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Complex Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Complex Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.DataInheritanceImpl <em>Data Inheritance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.DataInheritanceImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getDataInheritance()
   * @generated
   */
  int DATA_INHERITANCE = 26;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INHERITANCE__RELATION_CONTAINER = INHERITANCE__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INHERITANCE__DIM1_BP = INHERITANCE__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INHERITANCE__DIM2_BP = INHERITANCE__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INHERITANCE__TARGET = INHERITANCE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INHERITANCE__SOURCE = INHERITANCE__SOURCE;

  /**
   * The feature id for the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INHERITANCE__SUPER = INHERITANCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INHERITANCE__SUB = INHERITANCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INHERITANCE_FEATURE_COUNT = INHERITANCE_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Data Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INHERITANCE_OPERATION_COUNT = INHERITANCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.NaturalInheritanceImpl <em>Natural Inheritance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.NaturalInheritanceImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getNaturalInheritance()
   * @generated
   */
  int NATURAL_INHERITANCE = 27;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_INHERITANCE__RELATION_CONTAINER = INHERITANCE__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_INHERITANCE__DIM1_BP = INHERITANCE__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_INHERITANCE__DIM2_BP = INHERITANCE__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_INHERITANCE__TARGET = INHERITANCE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_INHERITANCE__SOURCE = INHERITANCE__SOURCE;

  /**
   * The feature id for the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_INHERITANCE__SUPER = INHERITANCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_INHERITANCE__SUB = INHERITANCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Natural Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_INHERITANCE_FEATURE_COUNT = INHERITANCE_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Natural Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_INHERITANCE_OPERATION_COUNT = INHERITANCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.CompartmentInheritanceImpl <em>Compartment Inheritance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.CompartmentInheritanceImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getCompartmentInheritance()
   * @generated
   */
  int COMPARTMENT_INHERITANCE = 28;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INHERITANCE__RELATION_CONTAINER = INHERITANCE__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INHERITANCE__DIM1_BP = INHERITANCE__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INHERITANCE__DIM2_BP = INHERITANCE__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INHERITANCE__TARGET = INHERITANCE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INHERITANCE__SOURCE = INHERITANCE__SOURCE;

  /**
   * The feature id for the '<em><b>Sub</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INHERITANCE__SUB = INHERITANCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INHERITANCE__SUPER = INHERITANCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Compartment Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INHERITANCE_FEATURE_COUNT = INHERITANCE_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Compartment Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_INHERITANCE_OPERATION_COUNT = INHERITANCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleInheritanceImpl <em>Role Inheritance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleInheritanceImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleInheritance()
   * @generated
   */
  int ROLE_INHERITANCE = 29;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INHERITANCE__RELATION_CONTAINER = INHERITANCE__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INHERITANCE__DIM1_BP = INHERITANCE__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INHERITANCE__DIM2_BP = INHERITANCE__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INHERITANCE__TARGET = INHERITANCE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INHERITANCE__SOURCE = INHERITANCE__SOURCE;

  /**
   * The feature id for the '<em><b>Sub</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INHERITANCE__SUB = INHERITANCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INHERITANCE__SUPER = INHERITANCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Role Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INHERITANCE_FEATURE_COUNT = INHERITANCE_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Role Inheritance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INHERITANCE_OPERATION_COUNT = INHERITANCE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.PlaceImpl <em>Place</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.PlaceImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getPlace()
   * @generated
   */
  int PLACE = 30;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__LOWER = 0;

  /**
   * The feature id for the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__UPPER = 1;

  /**
   * The feature id for the '<em><b>Holder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__HOLDER = 2;

  /**
   * The number of structural features of the '<em>Place</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Place</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RelationshipImplicationImpl <em>Relationship Implication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RelationshipImplicationImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRelationshipImplication()
   * @generated
   */
  int RELATIONSHIP_IMPLICATION = 31;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_IMPLICATION__RELATION_CONTAINER =
      INTER_RELATIONSHIP_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_IMPLICATION__DIM1_BP = INTER_RELATIONSHIP_CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_IMPLICATION__DIM2_BP = INTER_RELATIONSHIP_CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_IMPLICATION__TARGET = INTER_RELATIONSHIP_CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_IMPLICATION__SOURCE = INTER_RELATIONSHIP_CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Owner Compartment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_IMPLICATION__OWNER_COMPARTMENT =
      INTER_RELATIONSHIP_CONSTRAINT__OWNER_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Relation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_IMPLICATION__RELATION = INTER_RELATIONSHIP_CONSTRAINT__RELATION;

  /**
   * The feature id for the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_IMPLICATION__FIRST = INTER_RELATIONSHIP_CONSTRAINT__FIRST;

  /**
   * The feature id for the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_IMPLICATION__SECOND = INTER_RELATIONSHIP_CONSTRAINT__SECOND;

  /**
   * The number of structural features of the '<em>Relationship Implication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_IMPLICATION_FEATURE_COUNT = INTER_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Relationship Implication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_IMPLICATION_OPERATION_COUNT = INTER_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.IrreflexiveImpl <em>Irreflexive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.IrreflexiveImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getIrreflexive()
   * @generated
   */
  int IRREFLEXIVE = 33;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE__RELATION_CONTAINER = INTRA_RELATIONSHIP_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE__DIM1_BP = INTRA_RELATIONSHIP_CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE__DIM2_BP = INTRA_RELATIONSHIP_CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE__TARGET = INTRA_RELATIONSHIP_CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE__SOURCE = INTRA_RELATIONSHIP_CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Owner Compartment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE__OWNER_COMPARTMENT = INTRA_RELATIONSHIP_CONSTRAINT__OWNER_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Relation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE__RELATION = INTRA_RELATIONSHIP_CONSTRAINT__RELATION;

  /**
   * The number of structural features of the '<em>Irreflexive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE_FEATURE_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Irreflexive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE_OPERATION_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.CyclicImpl <em>Cyclic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.CyclicImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getCyclic()
   * @generated
   */
  int CYCLIC = 34;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CYCLIC__RELATION_CONTAINER = INTRA_RELATIONSHIP_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CYCLIC__DIM1_BP = INTRA_RELATIONSHIP_CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CYCLIC__DIM2_BP = INTRA_RELATIONSHIP_CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CYCLIC__TARGET = INTRA_RELATIONSHIP_CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CYCLIC__SOURCE = INTRA_RELATIONSHIP_CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Owner Compartment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CYCLIC__OWNER_COMPARTMENT = INTRA_RELATIONSHIP_CONSTRAINT__OWNER_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Relation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CYCLIC__RELATION = INTRA_RELATIONSHIP_CONSTRAINT__RELATION;

  /**
   * The number of structural features of the '<em>Cyclic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CYCLIC_FEATURE_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Cyclic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CYCLIC_OPERATION_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.TotalImpl <em>Total</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.TotalImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getTotal()
   * @generated
   */
  int TOTAL = 35;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__RELATION_CONTAINER = INTRA_RELATIONSHIP_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__DIM1_BP = INTRA_RELATIONSHIP_CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__DIM2_BP = INTRA_RELATIONSHIP_CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__TARGET = INTRA_RELATIONSHIP_CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__SOURCE = INTRA_RELATIONSHIP_CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Owner Compartment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__OWNER_COMPARTMENT = INTRA_RELATIONSHIP_CONSTRAINT__OWNER_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Relation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__RELATION = INTRA_RELATIONSHIP_CONSTRAINT__RELATION;

  /**
   * The number of structural features of the '<em>Total</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL_FEATURE_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Total</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL_OPERATION_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleGroupImpl <em>Role Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleGroupImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleGroup()
   * @generated
   */
  int ROLE_GROUP = 37;

  /**
   * The feature id for the '<em><b>Fulfillment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__FULFILLMENT = ABSTRACT_ROLE__FULFILLMENT;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__PARENT = ABSTRACT_ROLE__PARENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__NAME = ABSTRACT_ROLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__INCOMING = ABSTRACT_ROLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__OUTGOING = ABSTRACT_ROLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Boundaries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__BOUNDARIES = ABSTRACT_ROLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__RELATIONS = ABSTRACT_ROLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Abstractroles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__ABSTRACTROLES = ABSTRACT_ROLE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__LOWER = ABSTRACT_ROLE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__UPPER = ABSTRACT_ROLE_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Role Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP_FEATURE_COUNT = ABSTRACT_ROLE_FEATURE_COUNT + 8;

  /**
   * The number of operations of the '<em>Role Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP_OPERATION_COUNT = ABSTRACT_ROLE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleImplicationImpl <em>Role Implication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleImplicationImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleImplication()
   * @generated
   */
  int ROLE_IMPLICATION = 38;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_IMPLICATION__RELATION_CONTAINER = ROLE_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_IMPLICATION__DIM1_BP = ROLE_CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_IMPLICATION__DIM2_BP = ROLE_CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_IMPLICATION__TARGET = ROLE_CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_IMPLICATION__SOURCE = ROLE_CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Owner Compartment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_IMPLICATION__OWNER_COMPARTMENT = ROLE_CONSTRAINT__OWNER_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Ends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_IMPLICATION__ENDS = ROLE_CONSTRAINT__ENDS;

  /**
   * The feature id for the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_IMPLICATION__SECOND = ROLE_CONSTRAINT__SECOND;

  /**
   * The feature id for the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_IMPLICATION__FIRST = ROLE_CONSTRAINT__FIRST;

  /**
   * The number of structural features of the '<em>Role Implication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_IMPLICATION_FEATURE_COUNT = ROLE_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Role Implication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_IMPLICATION_OPERATION_COUNT = ROLE_CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleEquivalenceImpl <em>Role Equivalence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleEquivalenceImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleEquivalence()
   * @generated
   */
  int ROLE_EQUIVALENCE = 39;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_EQUIVALENCE__RELATION_CONTAINER = ROLE_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_EQUIVALENCE__DIM1_BP = ROLE_CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_EQUIVALENCE__DIM2_BP = ROLE_CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_EQUIVALENCE__TARGET = ROLE_CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_EQUIVALENCE__SOURCE = ROLE_CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Owner Compartment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_EQUIVALENCE__OWNER_COMPARTMENT = ROLE_CONSTRAINT__OWNER_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Ends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_EQUIVALENCE__ENDS = ROLE_CONSTRAINT__ENDS;

  /**
   * The feature id for the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_EQUIVALENCE__SECOND = ROLE_CONSTRAINT__SECOND;

  /**
   * The feature id for the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_EQUIVALENCE__FIRST = ROLE_CONSTRAINT__FIRST;

  /**
   * The number of structural features of the '<em>Role Equivalence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_EQUIVALENCE_FEATURE_COUNT = ROLE_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Role Equivalence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_EQUIVALENCE_OPERATION_COUNT = ROLE_CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleProhibitionImpl <em>Role Prohibition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleProhibitionImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleProhibition()
   * @generated
   */
  int ROLE_PROHIBITION = 40;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__RELATION_CONTAINER = ROLE_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__DIM1_BP = ROLE_CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__DIM2_BP = ROLE_CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__TARGET = ROLE_CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__SOURCE = ROLE_CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Owner Compartment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__OWNER_COMPARTMENT = ROLE_CONSTRAINT__OWNER_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Ends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__ENDS = ROLE_CONSTRAINT__ENDS;

  /**
   * The feature id for the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__SECOND = ROLE_CONSTRAINT__SECOND;

  /**
   * The feature id for the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__FIRST = ROLE_CONSTRAINT__FIRST;

  /**
   * The number of structural features of the '<em>Role Prohibition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION_FEATURE_COUNT = ROLE_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Role Prohibition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION_OPERATION_COUNT = ROLE_CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.PartImpl <em>Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.PartImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getPart()
   * @generated
   */
  int PART = 41;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__LOWER = 0;

  /**
   * The feature id for the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__UPPER = 1;

  /**
   * The feature id for the '<em><b>Whole</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__WHOLE = 2;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__ROLE = 3;

  /**
   * The number of structural features of the '<em>Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.ParthoodConstraintImpl <em>Parthood Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.ParthoodConstraintImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getParthoodConstraint()
   * @generated
   */
  int PARTHOOD_CONSTRAINT = 43;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTHOOD_CONSTRAINT__RELATION_CONTAINER = INTRA_RELATIONSHIP_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTHOOD_CONSTRAINT__DIM1_BP = INTRA_RELATIONSHIP_CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTHOOD_CONSTRAINT__DIM2_BP = INTRA_RELATIONSHIP_CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTHOOD_CONSTRAINT__TARGET = INTRA_RELATIONSHIP_CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTHOOD_CONSTRAINT__SOURCE = INTRA_RELATIONSHIP_CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Owner Compartment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTHOOD_CONSTRAINT__OWNER_COMPARTMENT = INTRA_RELATIONSHIP_CONSTRAINT__OWNER_COMPARTMENT;

  /**
   * The feature id for the '<em><b>Relation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTHOOD_CONSTRAINT__RELATION = INTRA_RELATIONSHIP_CONSTRAINT__RELATION;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTHOOD_CONSTRAINT__KIND = INTRA_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parthood Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTHOOD_CONSTRAINT_FEATURE_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Parthood Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTHOOD_CONSTRAINT_OPERATION_COUNT = INTRA_RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.AbstractRoleRefImpl <em>Abstract Role Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.AbstractRoleRefImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getAbstractRoleRef()
   * @generated
   */
  int ABSTRACT_ROLE_REF = 45;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE_REF__REF = ROLE_GROUP_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abstract Role Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE_REF_FEATURE_COUNT = ROLE_GROUP_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Abstract Role Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE_REF_OPERATION_COUNT = ROLE_GROUP_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RelationLabelImpl <em>Relation Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RelationLabelImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRelationLabel()
   * @generated
   */
  int RELATION_LABEL = 46;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_LABEL__LABEL = 0;

  /**
   * The feature id for the '<em><b>Is Relation End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_LABEL__IS_RELATION_END = 1;

  /**
   * The number of structural features of the '<em>Relation Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_LABEL_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Relation Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_LABEL_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.Direction <em>Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.Direction
   * @see org.framed.orm.model.impl.OrmPackageImpl#getDirection()
   * @generated
   */
  int DIRECTION = 47;

  /**
   * The meta object id for the '{@link org.framed.orm.model.Parthood <em>Parthood</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.Parthood
   * @see org.framed.orm.model.impl.OrmPackageImpl#getParthood()
   * @generated
   */
  int PARTHOOD = 48;

  /**
   * The meta object id for the '<em>Rectangle</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.draw2d.geometry.Rectangle
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRectangle()
   * @generated
   */
  int RECTANGLE = 49;

  /**
   * The meta object id for the '<em>Point</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.draw2d.geometry.Point
   * @see org.framed.orm.model.impl.OrmPackageImpl#getPoint()
   * @generated
   */
  int POINT = 50;


  /**
   * Returns the meta object for class '{@link org.framed.orm.model.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see org.framed.orm.model.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.framed.orm.model.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Element</em>'.
   * @see org.framed.orm.model.ModelElement
   * @generated
   */
  EClass getModelElement();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.ModelElement#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Container</em>'.
   * @see org.framed.orm.model.ModelElement#getContainer()
   * @see #getModelElement()
   * @generated
   */
  EReference getModelElement_Container();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.framed.orm.model.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.Model#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relations</em>'.
   * @see org.framed.orm.model.Model#getRelations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Relations();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.ElementModel <em>Element Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Model</em>'.
   * @see org.framed.orm.model.ElementModel
   * @generated
   */
  EClass getElementModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.ElementModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.framed.orm.model.ElementModel#getElements()
   * @see #getElementModel()
   * @generated
   */
  EReference getElementModel_Elements();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.AbstractRoleModel <em>Abstract Role Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Role Model</em>'.
   * @see org.framed.orm.model.AbstractRoleModel
   * @generated
   */
  EClass getAbstractRoleModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.AbstractRoleModel#getAbstractroles <em>Abstractroles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Abstractroles</em>'.
   * @see org.framed.orm.model.AbstractRoleModel#getAbstractroles()
   * @see #getAbstractRoleModel()
   * @generated
   */
  EReference getAbstractRoleModel_Abstractroles();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.RigidType <em>Rigid Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rigid Type</em>'.
   * @see org.framed.orm.model.RigidType
   * @generated
   */
  EClass getRigidType();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see org.framed.orm.model.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see org.framed.orm.model.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.Relation#getRelationContainer <em>Relation Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Relation Container</em>'.
   * @see org.framed.orm.model.Relation#getRelationContainer()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_RelationContainer();

  /**
   * Returns the meta object for the attribute list '{@link org.framed.orm.model.Relation#getDim1BP <em>Dim1 BP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dim1 BP</em>'.
   * @see org.framed.orm.model.Relation#getDim1BP()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Dim1BP();

  /**
   * Returns the meta object for the attribute list '{@link org.framed.orm.model.Relation#getDim2BP <em>Dim2 BP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dim2 BP</em>'.
   * @see org.framed.orm.model.Relation#getDim2BP()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Dim2BP();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.Relation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.framed.orm.model.Relation#getTarget()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Target();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.Relation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see org.framed.orm.model.Relation#getSource()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Source();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.framed.orm.model.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.Parameter#getOwneroperation <em>Owneroperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owneroperation</em>'.
   * @see org.framed.orm.model.Parameter#getOwneroperation()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Owneroperation();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.framed.orm.model.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.Operation#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owner</em>'.
   * @see org.framed.orm.model.Operation#getOwner()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Owner();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Operation#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see org.framed.orm.model.Operation#getOperation()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Operation();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.Operation#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.framed.orm.model.Operation#getParams()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Params();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.framed.orm.model.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.Attribute#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Owner</em>'.
   * @see org.framed.orm.model.Attribute#getOwner()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Owner();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.framed.orm.model.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.Type#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.framed.orm.model.Type#getAttributes()
   * @see #getType()
   * @generated
   */
  EReference getType_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.Type#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see org.framed.orm.model.Type#getOperations()
   * @see #getType()
   * @generated
   */
  EReference getType_Operations();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.framed.orm.model.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.DataType#isSerializable <em>Serializable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Serializable</em>'.
   * @see org.framed.orm.model.DataType#isSerializable()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Serializable();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.DataType#getTr_extends <em>Tr extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tr extends</em>'.
   * @see org.framed.orm.model.DataType#getTr_extends()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_Tr_extends();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.NaturalType <em>Natural Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Natural Type</em>'.
   * @see org.framed.orm.model.NaturalType
   * @generated
   */
  EClass getNaturalType();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.NaturalType#getTr_extends <em>Tr extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tr extends</em>'.
   * @see org.framed.orm.model.NaturalType#getTr_extends()
   * @see #getNaturalType()
   * @generated
   */
  EReference getNaturalType_Tr_extends();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.CompartmentType <em>Compartment Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment Type</em>'.
   * @see org.framed.orm.model.CompartmentType
   * @generated
   */
  EClass getCompartmentType();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.CompartmentType#isIsExpand <em>Is Expand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Expand</em>'.
   * @see org.framed.orm.model.CompartmentType#isIsExpand()
   * @see #getCompartmentType()
   * @generated
   */
  EAttribute getCompartmentType_IsExpand();

  /**
   * Returns the meta object for the reference list '{@link org.framed.orm.model.CompartmentType#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parts</em>'.
   * @see org.framed.orm.model.CompartmentType#getParts()
   * @see #getCompartmentType()
   * @generated
   */
  EReference getCompartmentType_Parts();

  /**
   * Returns the meta object for the reference list '{@link org.framed.orm.model.CompartmentType#getRelationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Relationships</em>'.
   * @see org.framed.orm.model.CompartmentType#getRelationships()
   * @see #getCompartmentType()
   * @generated
   */
  EReference getCompartmentType_Relationships();

  /**
   * Returns the meta object for the reference list '{@link org.framed.orm.model.CompartmentType#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Constraints</em>'.
   * @see org.framed.orm.model.CompartmentType#getConstraints()
   * @see #getCompartmentType()
   * @generated
   */
  EReference getCompartmentType_Constraints();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.CompartmentType#getTr_extends <em>Tr extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tr extends</em>'.
   * @see org.framed.orm.model.CompartmentType#getTr_extends()
   * @see #getCompartmentType()
   * @generated
   */
  EReference getCompartmentType_Tr_extends();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.AntiRigidType <em>Anti Rigid Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anti Rigid Type</em>'.
   * @see org.framed.orm.model.AntiRigidType
   * @generated
   */
  EClass getAntiRigidType();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.RoleType <em>Role Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Type</em>'.
   * @see org.framed.orm.model.RoleType
   * @generated
   */
  EClass getRoleType();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.RoleType#getTr_extends <em>Tr extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tr extends</em>'.
   * @see org.framed.orm.model.RoleType#getTr_extends()
   * @see #getRoleType()
   * @generated
   */
  EReference getRoleType_Tr_extends();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see org.framed.orm.model.Relationship
   * @generated
   */
  EClass getRelationship();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Relationship#getSecondParthood <em>Second Parthood</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Second Parthood</em>'.
   * @see org.framed.orm.model.Relationship#getSecondParthood()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_SecondParthood();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Relationship#getSecondLower <em>Second Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Second Lower</em>'.
   * @see org.framed.orm.model.Relationship#getSecondLower()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_SecondLower();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Relationship#getFirstLower <em>First Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Lower</em>'.
   * @see org.framed.orm.model.Relationship#getFirstLower()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_FirstLower();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Relationship#getFirstUpper <em>First Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Upper</em>'.
   * @see org.framed.orm.model.Relationship#getFirstUpper()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_FirstUpper();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Relationship#getSecondUpper <em>Second Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Second Upper</em>'.
   * @see org.framed.orm.model.Relationship#getSecondUpper()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_SecondUpper();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Relationship#getFirstParthood <em>First Parthood</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Parthood</em>'.
   * @see org.framed.orm.model.Relationship#getFirstParthood()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_FirstParthood();

  /**
   * Returns the meta object for the containment reference '{@link org.framed.orm.model.Relationship#getSourceLabel <em>Source Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Label</em>'.
   * @see org.framed.orm.model.Relationship#getSourceLabel()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_SourceLabel();

  /**
   * Returns the meta object for the containment reference '{@link org.framed.orm.model.Relationship#getTargetLabel <em>Target Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Label</em>'.
   * @see org.framed.orm.model.Relationship#getTargetLabel()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_TargetLabel();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Relationship#getFirstLowerUpper <em>First Lower Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Lower Upper</em>'.
   * @see org.framed.orm.model.Relationship#getFirstLowerUpper()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_FirstLowerUpper();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Relationship#getSecondLowerUpper <em>Second Lower Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Second Lower Upper</em>'.
   * @see org.framed.orm.model.Relationship#getSecondLowerUpper()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_SecondLowerUpper();

  /**
   * Returns the meta object for the reference list '{@link org.framed.orm.model.Relationship#getRlshipConstraints <em>Rlship Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Rlship Constraints</em>'.
   * @see org.framed.orm.model.Relationship#getRlshipConstraints()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_RlshipConstraints();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Relationship#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.framed.orm.model.Relationship#getDirection()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_Direction();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.Relationship#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>First</em>'.
   * @see org.framed.orm.model.Relationship#getFirst()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_First();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.Relationship#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Second</em>'.
   * @see org.framed.orm.model.Relationship#getSecond()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Second();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Fulfillment <em>Fulfillment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fulfillment</em>'.
   * @see org.framed.orm.model.Fulfillment
   * @generated
   */
  EClass getFulfillment();

  /**
   * Returns the meta object for the reference list '{@link org.framed.orm.model.Fulfillment#getFulfilledRoles <em>Fulfilled Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Fulfilled Roles</em>'.
   * @see org.framed.orm.model.Fulfillment#getFulfilledRoles()
   * @see #getFulfillment()
   * @generated
   */
  EReference getFulfillment_FulfilledRoles();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.Fulfillment#getFiller <em>Filler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Filler</em>'.
   * @see org.framed.orm.model.Fulfillment#getFiller()
   * @see #getFulfillment()
   * @generated
   */
  EReference getFulfillment_Filler();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Inheritance <em>Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inheritance</em>'.
   * @see org.framed.orm.model.Inheritance
   * @generated
   */
  EClass getInheritance();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see org.framed.orm.model.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.Constraint#getOwnerCompartment <em>Owner Compartment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Owner Compartment</em>'.
   * @see org.framed.orm.model.Constraint#getOwnerCompartment()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_OwnerCompartment();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.RoleConstraint <em>Role Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Constraint</em>'.
   * @see org.framed.orm.model.RoleConstraint
   * @generated
   */
  EClass getRoleConstraint();

  /**
   * Returns the meta object for the reference list '{@link org.framed.orm.model.RoleConstraint#getEnds <em>Ends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Ends</em>'.
   * @see org.framed.orm.model.RoleConstraint#getEnds()
   * @see #getRoleConstraint()
   * @generated
   */
  EReference getRoleConstraint_Ends();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.RoleConstraint#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Second</em>'.
   * @see org.framed.orm.model.RoleConstraint#getSecond()
   * @see #getRoleConstraint()
   * @generated
   */
  EReference getRoleConstraint_Second();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.RoleConstraint#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>First</em>'.
   * @see org.framed.orm.model.RoleConstraint#getFirst()
   * @see #getRoleConstraint()
   * @generated
   */
  EReference getRoleConstraint_First();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.RelationshipConstraint <em>Relationship Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship Constraint</em>'.
   * @see org.framed.orm.model.RelationshipConstraint
   * @generated
   */
  EClass getRelationshipConstraint();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.RelationshipConstraint#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Relation</em>'.
   * @see org.framed.orm.model.RelationshipConstraint#getRelation()
   * @see #getRelationshipConstraint()
   * @generated
   */
  EReference getRelationshipConstraint_Relation();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.IntraRelationshipConstraint <em>Intra Relationship Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intra Relationship Constraint</em>'.
   * @see org.framed.orm.model.IntraRelationshipConstraint
   * @generated
   */
  EClass getIntraRelationshipConstraint();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.InterRelationshipConstraint <em>Inter Relationship Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inter Relationship Constraint</em>'.
   * @see org.framed.orm.model.InterRelationshipConstraint
   * @generated
   */
  EClass getInterRelationshipConstraint();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.InterRelationshipConstraint#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>First</em>'.
   * @see org.framed.orm.model.InterRelationshipConstraint#getFirst()
   * @see #getInterRelationshipConstraint()
   * @generated
   */
  EReference getInterRelationshipConstraint_First();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.InterRelationshipConstraint#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Second</em>'.
   * @see org.framed.orm.model.InterRelationshipConstraint#getSecond()
   * @see #getInterRelationshipConstraint()
   * @generated
   */
  EReference getInterRelationshipConstraint_Second();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.ComplexConstraint <em>Complex Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Constraint</em>'.
   * @see org.framed.orm.model.ComplexConstraint
   * @generated
   */
  EClass getComplexConstraint();

  /**
   * Returns the meta object for the reference list '{@link org.framed.orm.model.ComplexConstraint#getTargets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Targets</em>'.
   * @see org.framed.orm.model.ComplexConstraint#getTargets()
   * @see #getComplexConstraint()
   * @generated
   */
  EReference getComplexConstraint_Targets();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.ComplexConstraint#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.framed.orm.model.ComplexConstraint#getExpression()
   * @see #getComplexConstraint()
   * @generated
   */
  EAttribute getComplexConstraint_Expression();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.DataInheritance <em>Data Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Inheritance</em>'.
   * @see org.framed.orm.model.DataInheritance
   * @generated
   */
  EClass getDataInheritance();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.DataInheritance#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super</em>'.
   * @see org.framed.orm.model.DataInheritance#getSuper()
   * @see #getDataInheritance()
   * @generated
   */
  EReference getDataInheritance_Super();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.DataInheritance#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sub</em>'.
   * @see org.framed.orm.model.DataInheritance#getSub()
   * @see #getDataInheritance()
   * @generated
   */
  EReference getDataInheritance_Sub();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.NaturalInheritance <em>Natural Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Natural Inheritance</em>'.
   * @see org.framed.orm.model.NaturalInheritance
   * @generated
   */
  EClass getNaturalInheritance();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.NaturalInheritance#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super</em>'.
   * @see org.framed.orm.model.NaturalInheritance#getSuper()
   * @see #getNaturalInheritance()
   * @generated
   */
  EReference getNaturalInheritance_Super();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.NaturalInheritance#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sub</em>'.
   * @see org.framed.orm.model.NaturalInheritance#getSub()
   * @see #getNaturalInheritance()
   * @generated
   */
  EReference getNaturalInheritance_Sub();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.CompartmentInheritance <em>Compartment Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment Inheritance</em>'.
   * @see org.framed.orm.model.CompartmentInheritance
   * @generated
   */
  EClass getCompartmentInheritance();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.CompartmentInheritance#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sub</em>'.
   * @see org.framed.orm.model.CompartmentInheritance#getSub()
   * @see #getCompartmentInheritance()
   * @generated
   */
  EReference getCompartmentInheritance_Sub();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.CompartmentInheritance#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super</em>'.
   * @see org.framed.orm.model.CompartmentInheritance#getSuper()
   * @see #getCompartmentInheritance()
   * @generated
   */
  EReference getCompartmentInheritance_Super();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.RoleInheritance <em>Role Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Inheritance</em>'.
   * @see org.framed.orm.model.RoleInheritance
   * @generated
   */
  EClass getRoleInheritance();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.RoleInheritance#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sub</em>'.
   * @see org.framed.orm.model.RoleInheritance#getSub()
   * @see #getRoleInheritance()
   * @generated
   */
  EReference getRoleInheritance_Sub();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.RoleInheritance#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super</em>'.
   * @see org.framed.orm.model.RoleInheritance#getSuper()
   * @see #getRoleInheritance()
   * @generated
   */
  EReference getRoleInheritance_Super();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Place <em>Place</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Place</em>'.
   * @see org.framed.orm.model.Place
   * @generated
   */
  EClass getPlace();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Place#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see org.framed.orm.model.Place#getLower()
   * @see #getPlace()
   * @generated
   */
  EAttribute getPlace_Lower();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Place#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper</em>'.
   * @see org.framed.orm.model.Place#getUpper()
   * @see #getPlace()
   * @generated
   */
  EAttribute getPlace_Upper();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.Place#getHolder <em>Holder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Holder</em>'.
   * @see org.framed.orm.model.Place#getHolder()
   * @see #getPlace()
   * @generated
   */
  EReference getPlace_Holder();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.RelationshipImplication <em>Relationship Implication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship Implication</em>'.
   * @see org.framed.orm.model.RelationshipImplication
   * @generated
   */
  EClass getRelationshipImplication();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.RelationTarget <em>Relation Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Target</em>'.
   * @see org.framed.orm.model.RelationTarget
   * @generated
   */
  EClass getRelationTarget();

  /**
   * Returns the meta object for the reference list '{@link org.framed.orm.model.RelationTarget#getIncoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming</em>'.
   * @see org.framed.orm.model.RelationTarget#getIncoming()
   * @see #getRelationTarget()
   * @generated
   */
  EReference getRelationTarget_Incoming();

  /**
   * Returns the meta object for the reference list '{@link org.framed.orm.model.RelationTarget#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing</em>'.
   * @see org.framed.orm.model.RelationTarget#getOutgoing()
   * @see #getRelationTarget()
   * @generated
   */
  EReference getRelationTarget_Outgoing();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.RelationTarget#getBoundaries <em>Boundaries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boundaries</em>'.
   * @see org.framed.orm.model.RelationTarget#getBoundaries()
   * @see #getRelationTarget()
   * @generated
   */
  EAttribute getRelationTarget_Boundaries();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Irreflexive <em>Irreflexive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Irreflexive</em>'.
   * @see org.framed.orm.model.Irreflexive
   * @generated
   */
  EClass getIrreflexive();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Cyclic <em>Cyclic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cyclic</em>'.
   * @see org.framed.orm.model.Cyclic
   * @generated
   */
  EClass getCyclic();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Total <em>Total</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Total</em>'.
   * @see org.framed.orm.model.Total
   * @generated
   */
  EClass getTotal();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.AbstractRole <em>Abstract Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Role</em>'.
   * @see org.framed.orm.model.AbstractRole
   * @generated
   */
  EClass getAbstractRole();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.AbstractRole#getFulfillment <em>Fulfillment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Fulfillment</em>'.
   * @see org.framed.orm.model.AbstractRole#getFulfillment()
   * @see #getAbstractRole()
   * @generated
   */
  EReference getAbstractRole_Fulfillment();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.AbstractRole#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.framed.orm.model.AbstractRole#getParent()
   * @see #getAbstractRole()
   * @generated
   */
  EReference getAbstractRole_Parent();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.RoleGroup <em>Role Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Group</em>'.
   * @see org.framed.orm.model.RoleGroup
   * @generated
   */
  EClass getRoleGroup();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.RoleGroup#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see org.framed.orm.model.RoleGroup#getLower()
   * @see #getRoleGroup()
   * @generated
   */
  EAttribute getRoleGroup_Lower();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.RoleGroup#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper</em>'.
   * @see org.framed.orm.model.RoleGroup#getUpper()
   * @see #getRoleGroup()
   * @generated
   */
  EAttribute getRoleGroup_Upper();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.RoleImplication <em>Role Implication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Implication</em>'.
   * @see org.framed.orm.model.RoleImplication
   * @generated
   */
  EClass getRoleImplication();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.RoleEquivalence <em>Role Equivalence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Equivalence</em>'.
   * @see org.framed.orm.model.RoleEquivalence
   * @generated
   */
  EClass getRoleEquivalence();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.RoleProhibition <em>Role Prohibition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Prohibition</em>'.
   * @see org.framed.orm.model.RoleProhibition
   * @generated
   */
  EClass getRoleProhibition();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Part <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Part</em>'.
   * @see org.framed.orm.model.Part
   * @generated
   */
  EClass getPart();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Part#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see org.framed.orm.model.Part#getLower()
   * @see #getPart()
   * @generated
   */
  EAttribute getPart_Lower();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Part#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper</em>'.
   * @see org.framed.orm.model.Part#getUpper()
   * @see #getPart()
   * @generated
   */
  EAttribute getPart_Upper();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.Part#getWhole <em>Whole</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Whole</em>'.
   * @see org.framed.orm.model.Part#getWhole()
   * @see #getPart()
   * @generated
   */
  EReference getPart_Whole();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.Part#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Role</em>'.
   * @see org.framed.orm.model.Part#getRole()
   * @see #getPart()
   * @generated
   */
  EReference getPart_Role();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.TypedElement <em>Typed Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Element</em>'.
   * @see org.framed.orm.model.TypedElement
   * @generated
   */
  EClass getTypedElement();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.TypedElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.framed.orm.model.TypedElement#getType()
   * @see #getTypedElement()
   * @generated
   */
  EReference getTypedElement_Type();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.ParthoodConstraint <em>Parthood Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parthood Constraint</em>'.
   * @see org.framed.orm.model.ParthoodConstraint
   * @generated
   */
  EClass getParthoodConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.ParthoodConstraint#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.framed.orm.model.ParthoodConstraint#getKind()
   * @see #getParthoodConstraint()
   * @generated
   */
  EAttribute getParthoodConstraint_Kind();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.RoleGroupElement <em>Role Group Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Group Element</em>'.
   * @see org.framed.orm.model.RoleGroupElement
   * @generated
   */
  EClass getRoleGroupElement();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.AbstractRoleRef <em>Abstract Role Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Role Ref</em>'.
   * @see org.framed.orm.model.AbstractRoleRef
   * @generated
   */
  EClass getAbstractRoleRef();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.AbstractRoleRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.framed.orm.model.AbstractRoleRef#getRef()
   * @see #getAbstractRoleRef()
   * @generated
   */
  EReference getAbstractRoleRef_Ref();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.RelationLabel <em>Relation Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Label</em>'.
   * @see org.framed.orm.model.RelationLabel
   * @generated
   */
  EClass getRelationLabel();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.RelationLabel#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.framed.orm.model.RelationLabel#getLabel()
   * @see #getRelationLabel()
   * @generated
   */
  EAttribute getRelationLabel_Label();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.RelationLabel#isIsRelationEnd <em>Is Relation End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Relation End</em>'.
   * @see org.framed.orm.model.RelationLabel#isIsRelationEnd()
   * @see #getRelationLabel()
   * @generated
   */
  EAttribute getRelationLabel_IsRelationEnd();

  /**
   * Returns the meta object for enum '{@link org.framed.orm.model.Direction <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Direction</em>'.
   * @see org.framed.orm.model.Direction
   * @generated
   */
  EEnum getDirection();

  /**
   * Returns the meta object for enum '{@link org.framed.orm.model.Parthood <em>Parthood</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Parthood</em>'.
   * @see org.framed.orm.model.Parthood
   * @generated
   */
  EEnum getParthood();

  /**
   * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Rectangle</em>'.
   * @see org.eclipse.draw2d.geometry.Rectangle
   * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
   * @generated
   */
  EDataType getRectangle();

  /**
   * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Point</em>'.
   * @see org.eclipse.draw2d.geometry.Point
   * @model instanceClass="org.eclipse.draw2d.geometry.Point"
   * @generated
   */
  EDataType getPoint();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OrmFactory getOrmFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link org.framed.orm.model.NamedElement <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.NamedElement
     * @see org.framed.orm.model.impl.OrmPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.ModelElement <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.ModelElement
     * @see org.framed.orm.model.impl.OrmPackageImpl#getModelElement()
     * @generated
     */
    EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

    /**
     * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_ELEMENT__CONTAINER = eINSTANCE.getModelElement_Container();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.ModelImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RELATIONS = eINSTANCE.getModel_Relations();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.ElementModelImpl <em>Element Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.ElementModelImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getElementModel()
     * @generated
     */
    EClass ELEMENT_MODEL = eINSTANCE.getElementModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_MODEL__ELEMENTS = eINSTANCE.getElementModel_Elements();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.AbstractRoleModelImpl <em>Abstract Role Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.AbstractRoleModelImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getAbstractRoleModel()
     * @generated
     */
    EClass ABSTRACT_ROLE_MODEL = eINSTANCE.getAbstractRoleModel();

    /**
     * The meta object literal for the '<em><b>Abstractroles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ROLE_MODEL__ABSTRACTROLES = eINSTANCE.getAbstractRoleModel_Abstractroles();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RigidTypeImpl <em>Rigid Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RigidTypeImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRigidType()
     * @generated
     */
    EClass RIGID_TYPE = eINSTANCE.getRigidType();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.GroupImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RelationImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Relation Container</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__RELATION_CONTAINER = eINSTANCE.getRelation_RelationContainer();

    /**
     * The meta object literal for the '<em><b>Dim1 BP</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__DIM1_BP = eINSTANCE.getRelation_Dim1BP();

    /**
     * The meta object literal for the '<em><b>Dim2 BP</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__DIM2_BP = eINSTANCE.getRelation_Dim2BP();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__SOURCE = eINSTANCE.getRelation_Source();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.ParameterImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Owneroperation</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__OWNEROPERATION = eINSTANCE.getParameter_Owneroperation();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.OperationImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__OWNER = eINSTANCE.getOperation_Owner();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__OPERATION = eINSTANCE.getOperation_Operation();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__PARAMS = eINSTANCE.getOperation_Params();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.AttributeImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__OWNER = eINSTANCE.getAttribute_Owner();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.TypeImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__ATTRIBUTES = eINSTANCE.getType_Attributes();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__OPERATIONS = eINSTANCE.getType_Operations();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.DataTypeImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Serializable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__SERIALIZABLE = eINSTANCE.getDataType_Serializable();

    /**
     * The meta object literal for the '<em><b>Tr extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__TR_EXTENDS = eINSTANCE.getDataType_Tr_extends();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.NaturalTypeImpl <em>Natural Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.NaturalTypeImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getNaturalType()
     * @generated
     */
    EClass NATURAL_TYPE = eINSTANCE.getNaturalType();

    /**
     * The meta object literal for the '<em><b>Tr extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NATURAL_TYPE__TR_EXTENDS = eINSTANCE.getNaturalType_Tr_extends();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.CompartmentTypeImpl <em>Compartment Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.CompartmentTypeImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getCompartmentType()
     * @generated
     */
    EClass COMPARTMENT_TYPE = eINSTANCE.getCompartmentType();

    /**
     * The meta object literal for the '<em><b>Is Expand</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARTMENT_TYPE__IS_EXPAND = eINSTANCE.getCompartmentType_IsExpand();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_TYPE__PARTS = eINSTANCE.getCompartmentType_Parts();

    /**
     * The meta object literal for the '<em><b>Relationships</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_TYPE__RELATIONSHIPS = eINSTANCE.getCompartmentType_Relationships();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_TYPE__CONSTRAINTS = eINSTANCE.getCompartmentType_Constraints();

    /**
     * The meta object literal for the '<em><b>Tr extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_TYPE__TR_EXTENDS = eINSTANCE.getCompartmentType_Tr_extends();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.AntiRigidTypeImpl <em>Anti Rigid Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.AntiRigidTypeImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getAntiRigidType()
     * @generated
     */
    EClass ANTI_RIGID_TYPE = eINSTANCE.getAntiRigidType();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RoleTypeImpl <em>Role Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RoleTypeImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleType()
     * @generated
     */
    EClass ROLE_TYPE = eINSTANCE.getRoleType();

    /**
     * The meta object literal for the '<em><b>Tr extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_TYPE__TR_EXTENDS = eINSTANCE.getRoleType_Tr_extends();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RelationshipImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRelationship()
     * @generated
     */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

    /**
     * The meta object literal for the '<em><b>Second Parthood</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__SECOND_PARTHOOD = eINSTANCE.getRelationship_SecondParthood();

    /**
     * The meta object literal for the '<em><b>Second Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__SECOND_LOWER = eINSTANCE.getRelationship_SecondLower();

    /**
     * The meta object literal for the '<em><b>First Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__FIRST_LOWER = eINSTANCE.getRelationship_FirstLower();

    /**
     * The meta object literal for the '<em><b>First Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__FIRST_UPPER = eINSTANCE.getRelationship_FirstUpper();

    /**
     * The meta object literal for the '<em><b>Second Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__SECOND_UPPER = eINSTANCE.getRelationship_SecondUpper();

    /**
     * The meta object literal for the '<em><b>First Parthood</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__FIRST_PARTHOOD = eINSTANCE.getRelationship_FirstParthood();

    /**
     * The meta object literal for the '<em><b>Source Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__SOURCE_LABEL = eINSTANCE.getRelationship_SourceLabel();

    /**
     * The meta object literal for the '<em><b>Target Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__TARGET_LABEL = eINSTANCE.getRelationship_TargetLabel();

    /**
     * The meta object literal for the '<em><b>First Lower Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__FIRST_LOWER_UPPER = eINSTANCE.getRelationship_FirstLowerUpper();

    /**
     * The meta object literal for the '<em><b>Second Lower Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__SECOND_LOWER_UPPER = eINSTANCE.getRelationship_SecondLowerUpper();

    /**
     * The meta object literal for the '<em><b>Rlship Constraints</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__RLSHIP_CONSTRAINTS = eINSTANCE.getRelationship_RlshipConstraints();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__DIRECTION = eINSTANCE.getRelationship_Direction();

    /**
     * The meta object literal for the '<em><b>First</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__FIRST = eINSTANCE.getRelationship_First();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__SECOND = eINSTANCE.getRelationship_Second();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.FulfillmentImpl <em>Fulfillment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.FulfillmentImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getFulfillment()
     * @generated
     */
    EClass FULFILLMENT = eINSTANCE.getFulfillment();

    /**
     * The meta object literal for the '<em><b>Fulfilled Roles</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULFILLMENT__FULFILLED_ROLES = eINSTANCE.getFulfillment_FulfilledRoles();

    /**
     * The meta object literal for the '<em><b>Filler</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FULFILLMENT__FILLER = eINSTANCE.getFulfillment_Filler();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.InheritanceImpl <em>Inheritance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.InheritanceImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getInheritance()
     * @generated
     */
    EClass INHERITANCE = eINSTANCE.getInheritance();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.ConstraintImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Owner Compartment</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__OWNER_COMPARTMENT = eINSTANCE.getConstraint_OwnerCompartment();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RoleConstraintImpl <em>Role Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RoleConstraintImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleConstraint()
     * @generated
     */
    EClass ROLE_CONSTRAINT = eINSTANCE.getRoleConstraint();

    /**
     * The meta object literal for the '<em><b>Ends</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_CONSTRAINT__ENDS = eINSTANCE.getRoleConstraint_Ends();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_CONSTRAINT__SECOND = eINSTANCE.getRoleConstraint_Second();

    /**
     * The meta object literal for the '<em><b>First</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_CONSTRAINT__FIRST = eINSTANCE.getRoleConstraint_First();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RelationshipConstraintImpl <em>Relationship Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RelationshipConstraintImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRelationshipConstraint()
     * @generated
     */
    EClass RELATIONSHIP_CONSTRAINT = eINSTANCE.getRelationshipConstraint();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP_CONSTRAINT__RELATION = eINSTANCE.getRelationshipConstraint_Relation();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.IntraRelationshipConstraintImpl <em>Intra Relationship Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.IntraRelationshipConstraintImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getIntraRelationshipConstraint()
     * @generated
     */
    EClass INTRA_RELATIONSHIP_CONSTRAINT = eINSTANCE.getIntraRelationshipConstraint();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.InterRelationshipConstraintImpl <em>Inter Relationship Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.InterRelationshipConstraintImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getInterRelationshipConstraint()
     * @generated
     */
    EClass INTER_RELATIONSHIP_CONSTRAINT = eINSTANCE.getInterRelationshipConstraint();

    /**
     * The meta object literal for the '<em><b>First</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTER_RELATIONSHIP_CONSTRAINT__FIRST = eINSTANCE
        .getInterRelationshipConstraint_First();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTER_RELATIONSHIP_CONSTRAINT__SECOND = eINSTANCE
        .getInterRelationshipConstraint_Second();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.ComplexConstraintImpl <em>Complex Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.ComplexConstraintImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getComplexConstraint()
     * @generated
     */
    EClass COMPLEX_CONSTRAINT = eINSTANCE.getComplexConstraint();

    /**
     * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_CONSTRAINT__TARGETS = eINSTANCE.getComplexConstraint_Targets();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_CONSTRAINT__EXPRESSION = eINSTANCE.getComplexConstraint_Expression();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.DataInheritanceImpl <em>Data Inheritance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.DataInheritanceImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getDataInheritance()
     * @generated
     */
    EClass DATA_INHERITANCE = eINSTANCE.getDataInheritance();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_INHERITANCE__SUPER = eINSTANCE.getDataInheritance_Super();

    /**
     * The meta object literal for the '<em><b>Sub</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_INHERITANCE__SUB = eINSTANCE.getDataInheritance_Sub();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.NaturalInheritanceImpl <em>Natural Inheritance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.NaturalInheritanceImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getNaturalInheritance()
     * @generated
     */
    EClass NATURAL_INHERITANCE = eINSTANCE.getNaturalInheritance();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NATURAL_INHERITANCE__SUPER = eINSTANCE.getNaturalInheritance_Super();

    /**
     * The meta object literal for the '<em><b>Sub</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NATURAL_INHERITANCE__SUB = eINSTANCE.getNaturalInheritance_Sub();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.CompartmentInheritanceImpl <em>Compartment Inheritance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.CompartmentInheritanceImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getCompartmentInheritance()
     * @generated
     */
    EClass COMPARTMENT_INHERITANCE = eINSTANCE.getCompartmentInheritance();

    /**
     * The meta object literal for the '<em><b>Sub</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_INHERITANCE__SUB = eINSTANCE.getCompartmentInheritance_Sub();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_INHERITANCE__SUPER = eINSTANCE.getCompartmentInheritance_Super();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RoleInheritanceImpl <em>Role Inheritance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RoleInheritanceImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleInheritance()
     * @generated
     */
    EClass ROLE_INHERITANCE = eINSTANCE.getRoleInheritance();

    /**
     * The meta object literal for the '<em><b>Sub</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_INHERITANCE__SUB = eINSTANCE.getRoleInheritance_Sub();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_INHERITANCE__SUPER = eINSTANCE.getRoleInheritance_Super();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.PlaceImpl <em>Place</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.PlaceImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getPlace()
     * @generated
     */
    EClass PLACE = eINSTANCE.getPlace();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLACE__LOWER = eINSTANCE.getPlace_Lower();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLACE__UPPER = eINSTANCE.getPlace_Upper();

    /**
     * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLACE__HOLDER = eINSTANCE.getPlace_Holder();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RelationshipImplicationImpl <em>Relationship Implication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RelationshipImplicationImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRelationshipImplication()
     * @generated
     */
    EClass RELATIONSHIP_IMPLICATION = eINSTANCE.getRelationshipImplication();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RelationTargetImpl <em>Relation Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RelationTargetImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRelationTarget()
     * @generated
     */
    EClass RELATION_TARGET = eINSTANCE.getRelationTarget();

    /**
     * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_TARGET__INCOMING = eINSTANCE.getRelationTarget_Incoming();

    /**
     * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_TARGET__OUTGOING = eINSTANCE.getRelationTarget_Outgoing();

    /**
     * The meta object literal for the '<em><b>Boundaries</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION_TARGET__BOUNDARIES = eINSTANCE.getRelationTarget_Boundaries();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.IrreflexiveImpl <em>Irreflexive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.IrreflexiveImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getIrreflexive()
     * @generated
     */
    EClass IRREFLEXIVE = eINSTANCE.getIrreflexive();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.CyclicImpl <em>Cyclic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.CyclicImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getCyclic()
     * @generated
     */
    EClass CYCLIC = eINSTANCE.getCyclic();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.TotalImpl <em>Total</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.TotalImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getTotal()
     * @generated
     */
    EClass TOTAL = eINSTANCE.getTotal();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.AbstractRole <em>Abstract Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.AbstractRole
     * @see org.framed.orm.model.impl.OrmPackageImpl#getAbstractRole()
     * @generated
     */
    EClass ABSTRACT_ROLE = eINSTANCE.getAbstractRole();

    /**
     * The meta object literal for the '<em><b>Fulfillment</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ROLE__FULFILLMENT = eINSTANCE.getAbstractRole_Fulfillment();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ROLE__PARENT = eINSTANCE.getAbstractRole_Parent();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RoleGroupImpl <em>Role Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RoleGroupImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleGroup()
     * @generated
     */
    EClass ROLE_GROUP = eINSTANCE.getRoleGroup();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_GROUP__LOWER = eINSTANCE.getRoleGroup_Lower();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_GROUP__UPPER = eINSTANCE.getRoleGroup_Upper();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RoleImplicationImpl <em>Role Implication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RoleImplicationImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleImplication()
     * @generated
     */
    EClass ROLE_IMPLICATION = eINSTANCE.getRoleImplication();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RoleEquivalenceImpl <em>Role Equivalence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RoleEquivalenceImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleEquivalence()
     * @generated
     */
    EClass ROLE_EQUIVALENCE = eINSTANCE.getRoleEquivalence();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RoleProhibitionImpl <em>Role Prohibition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RoleProhibitionImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleProhibition()
     * @generated
     */
    EClass ROLE_PROHIBITION = eINSTANCE.getRoleProhibition();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.PartImpl <em>Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.PartImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getPart()
     * @generated
     */
    EClass PART = eINSTANCE.getPart();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART__LOWER = eINSTANCE.getPart_Lower();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART__UPPER = eINSTANCE.getPart_Upper();

    /**
     * The meta object literal for the '<em><b>Whole</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PART__WHOLE = eINSTANCE.getPart_Whole();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PART__ROLE = eINSTANCE.getPart_Role();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.TypedElementImpl <em>Typed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.TypedElementImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getTypedElement()
     * @generated
     */
    EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.ParthoodConstraintImpl <em>Parthood Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.ParthoodConstraintImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getParthoodConstraint()
     * @generated
     */
    EClass PARTHOOD_CONSTRAINT = eINSTANCE.getParthoodConstraint();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTHOOD_CONSTRAINT__KIND = eINSTANCE.getParthoodConstraint_Kind();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RoleGroupElementImpl <em>Role Group Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RoleGroupElementImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleGroupElement()
     * @generated
     */
    EClass ROLE_GROUP_ELEMENT = eINSTANCE.getRoleGroupElement();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.AbstractRoleRefImpl <em>Abstract Role Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.AbstractRoleRefImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getAbstractRoleRef()
     * @generated
     */
    EClass ABSTRACT_ROLE_REF = eINSTANCE.getAbstractRoleRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ROLE_REF__REF = eINSTANCE.getAbstractRoleRef_Ref();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RelationLabelImpl <em>Relation Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RelationLabelImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRelationLabel()
     * @generated
     */
    EClass RELATION_LABEL = eINSTANCE.getRelationLabel();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION_LABEL__LABEL = eINSTANCE.getRelationLabel_Label();

    /**
     * The meta object literal for the '<em><b>Is Relation End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION_LABEL__IS_RELATION_END = eINSTANCE.getRelationLabel_IsRelationEnd();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.Direction <em>Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.Direction
     * @see org.framed.orm.model.impl.OrmPackageImpl#getDirection()
     * @generated
     */
    EEnum DIRECTION = eINSTANCE.getDirection();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.Parthood <em>Parthood</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.Parthood
     * @see org.framed.orm.model.impl.OrmPackageImpl#getParthood()
     * @generated
     */
    EEnum PARTHOOD = eINSTANCE.getParthood();

    /**
     * The meta object literal for the '<em>Rectangle</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.draw2d.geometry.Rectangle
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRectangle()
     * @generated
     */
    EDataType RECTANGLE = eINSTANCE.getRectangle();

    /**
     * The meta object literal for the '<em>Point</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.draw2d.geometry.Point
     * @see org.framed.orm.model.impl.OrmPackageImpl#getPoint()
     * @generated
     */
    EDataType POINT = eINSTANCE.getPoint();

  }

} //OrmPackage
