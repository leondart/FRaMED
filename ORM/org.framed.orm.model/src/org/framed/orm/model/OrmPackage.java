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
   * The meta object id for the '{@link org.framed.orm.model.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.AttributeImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.MethodeImpl <em>Methode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.MethodeImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getMethode()
   * @generated
   */
  int METHODE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE__NAME = 1;

  /**
   * The number of structural features of the '<em>Methode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Methode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHODE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.Node <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.Node
   * @see org.framed.orm.model.impl.OrmPackageImpl#getNode()
   * @generated
   */
  int NODE = 7;

  /**
   * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__INCOMING_LINKS = 0;

  /**
   * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__OUTGOING_LINKS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = 2;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__CONSTRAINTS = 3;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.TypeImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getType()
   * @generated
   */
  int TYPE = 2;

  /**
   * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__INCOMING_LINKS = NODE__INCOMING_LINKS;

  /**
   * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__OUTGOING_LINKS = NODE__OUTGOING_LINKS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__CONSTRAINTS = NODE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ATTRIBUTES = NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__OPERATIONS = NODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__IS_EXPAND = NODE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RelationContainerImpl <em>Relation Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RelationContainerImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRelationContainer()
   * @generated
   */
  int RELATION_CONTAINER = 9;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_CONTAINER__RELATIONS = 0;

  /**
   * The number of structural features of the '<em>Relation Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_CONTAINER_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Relation Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_CONTAINER_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.CompartmentDiagramImpl <em>Compartment Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.CompartmentDiagramImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getCompartmentDiagram()
   * @generated
   */
  int COMPARTMENT_DIAGRAM = 3;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_DIAGRAM__RELATIONS = RELATION_CONTAINER__RELATIONS;

  /**
   * The feature id for the '<em><b>Compartments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_DIAGRAM__COMPARTMENTS = RELATION_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_DIAGRAM__GROUPS = RELATION_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Players</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_DIAGRAM__PLAYERS = RELATION_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Compartment Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_DIAGRAM_FEATURE_COUNT = RELATION_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Compartment Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_DIAGRAM_OPERATION_COUNT = RELATION_CONTAINER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.NaturalTypeImpl <em>Natural Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.NaturalTypeImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getNaturalType()
   * @generated
   */
  int NATURAL_TYPE = 4;

  /**
   * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__INCOMING_LINKS = TYPE__INCOMING_LINKS;

  /**
   * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__OUTGOING_LINKS = TYPE__OUTGOING_LINKS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__CONSTRAINTS = TYPE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__ATTRIBUTES = TYPE__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__OPERATIONS = TYPE__OPERATIONS;

  /**
   * The feature id for the '<em><b>Is Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__IS_EXPAND = TYPE__IS_EXPAND;

  /**
   * The feature id for the '<em><b>Parent Rolemodel</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__PARENT_ROLEMODEL = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE__CD = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Natural Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Natural Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.CompartmentImpl <em>Compartment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.CompartmentImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getCompartment()
   * @generated
   */
  int COMPARTMENT = 5;

  /**
   * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT__INCOMING_LINKS = TYPE__INCOMING_LINKS;

  /**
   * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT__OUTGOING_LINKS = TYPE__OUTGOING_LINKS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT__CONSTRAINTS = TYPE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT__ATTRIBUTES = TYPE__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT__OPERATIONS = TYPE__OPERATIONS;

  /**
   * The feature id for the '<em><b>Is Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT__IS_EXPAND = TYPE__IS_EXPAND;

  /**
   * The feature id for the '<em><b>Cd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT__CD = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rolemodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT__ROLEMODEL = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent Rolemodel</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT__PARENT_ROLEMODEL = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Compartment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Compartment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.GroupingImpl <em>Grouping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.GroupingImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getGrouping()
   * @generated
   */
  int GROUPING = 6;

  /**
   * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING__INCOMING_LINKS = NODE__INCOMING_LINKS;

  /**
   * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING__OUTGOING_LINKS = NODE__OUTGOING_LINKS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING__NAME = NODE__NAME;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING__CONSTRAINTS = NODE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Cd</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING__CD = NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rolemodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING__ROLEMODEL = NODE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent Rolemodel</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING__PARENT_ROLEMODEL = NODE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Grouping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Grouping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleTypeImpl <em>Role Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleTypeImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleType()
   * @generated
   */
  int ROLE_TYPE = 8;

  /**
   * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__INCOMING_LINKS = TYPE__INCOMING_LINKS;

  /**
   * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__OUTGOING_LINKS = TYPE__OUTGOING_LINKS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__CONSTRAINTS = TYPE__CONSTRAINTS;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__ATTRIBUTES = TYPE__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__OPERATIONS = TYPE__OPERATIONS;

  /**
   * The feature id for the '<em><b>Is Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__IS_EXPAND = TYPE__IS_EXPAND;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__RELATION_CONTAINER = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__BENDPOINTS = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__TARGET = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__SOURCE = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__DIM1_BP = TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__DIM2_BP = TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__FIRST = TYPE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__SECOND = TYPE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Parent Rolemodel</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__PARENT_ROLEMODEL = TYPE_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Parent Role Group</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__PARENT_ROLE_GROUP = TYPE_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Role Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 10;

  /**
   * The number of operations of the '<em>Role Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.Relation <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.Relation
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 22;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__RELATION_CONTAINER = 0;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__BENDPOINTS = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__TARGET = 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__SOURCE = 3;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__DIM1_BP = 4;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__DIM2_BP = 5;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = 6;

  /**
   * The number of operations of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.ConstraintImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 23;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__RELATION_CONTAINER = RELATION__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__BENDPOINTS = RELATION__BENDPOINTS;

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
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.AbstractRole <em>Abstract Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.AbstractRole
   * @see org.framed.orm.model.impl.OrmPackageImpl#getAbstractRole()
   * @generated
   */
  int ABSTRACT_ROLE = 26;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE__RELATION_CONTAINER = CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE__BENDPOINTS = CONSTRAINT__BENDPOINTS;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE__TARGET = CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE__SOURCE = CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE__DIM1_BP = CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE__DIM2_BP = CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE__FIRST = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE__SECOND = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parent Rolemodel</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE__PARENT_ROLEMODEL = CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parent Role Group</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE__PARENT_ROLE_GROUP = CONSTRAINT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Abstract Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 4;

  /**
   * The number of operations of the '<em>Abstract Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ROLE_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleGroupImpl <em>Role Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleGroupImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleGroup()
   * @generated
   */
  int ROLE_GROUP = 10;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__RELATION_CONTAINER = ABSTRACT_ROLE__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__BENDPOINTS = ABSTRACT_ROLE__BENDPOINTS;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__TARGET = ABSTRACT_ROLE__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__SOURCE = ABSTRACT_ROLE__SOURCE;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__DIM1_BP = ABSTRACT_ROLE__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__DIM2_BP = ABSTRACT_ROLE__DIM2_BP;

  /**
   * The feature id for the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__FIRST = ABSTRACT_ROLE__FIRST;

  /**
   * The feature id for the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__SECOND = ABSTRACT_ROLE__SECOND;

  /**
   * The feature id for the '<em><b>Parent Rolemodel</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__PARENT_ROLEMODEL = ABSTRACT_ROLE__PARENT_ROLEMODEL;

  /**
   * The feature id for the '<em><b>Parent Role Group</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__PARENT_ROLE_GROUP = ABSTRACT_ROLE__PARENT_ROLE_GROUP;

  /**
   * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__INCOMING_LINKS = ABSTRACT_ROLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__OUTGOING_LINKS = ABSTRACT_ROLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__NAME = ABSTRACT_ROLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Constraints</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__CONSTRAINTS = ABSTRACT_ROLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__RELATIONS = ABSTRACT_ROLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__LOWER = ABSTRACT_ROLE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_GROUP__ITEMS = ABSTRACT_ROLE_FEATURE_COUNT + 6;

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
   * The meta object id for the '{@link org.framed.orm.model.impl.RolemodelImpl <em>Rolemodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RolemodelImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRolemodel()
   * @generated
   */
  int ROLEMODEL = 11;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLEMODEL__RELATIONS = RELATION_CONTAINER__RELATIONS;

  /**
   * The feature id for the '<em><b>Subcontexts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLEMODEL__SUBCONTEXTS = RELATION_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Participants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLEMODEL__PARTICIPANTS = RELATION_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Players</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLEMODEL__PLAYERS = RELATION_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ct</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLEMODEL__CT = RELATION_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Parent Group</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLEMODEL__PARENT_GROUP = RELATION_CONTAINER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLEMODEL__GROUPS = RELATION_CONTAINER_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Rolemodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLEMODEL_FEATURE_COUNT = RELATION_CONTAINER_FEATURE_COUNT + 6;

  /**
   * The number of operations of the '<em>Rolemodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLEMODEL_OPERATION_COUNT = RELATION_CONTAINER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RelationshipConstraintImpl <em>Relationship Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RelationshipConstraintImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRelationshipConstraint()
   * @generated
   */
  int RELATIONSHIP_CONSTRAINT = 21;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT__RELATION_CONTAINER = CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_CONSTRAINT__BENDPOINTS = CONSTRAINT__BENDPOINTS;

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
   * The meta object id for the '{@link org.framed.orm.model.impl.TotalImpl <em>Total</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.TotalImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getTotal()
   * @generated
   */
  int TOTAL = 12;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__RELATION_CONTAINER = RELATIONSHIP_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__BENDPOINTS = RELATIONSHIP_CONSTRAINT__BENDPOINTS;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__TARGET = RELATIONSHIP_CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__SOURCE = RELATIONSHIP_CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__DIM1_BP = RELATIONSHIP_CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__DIM2_BP = RELATIONSHIP_CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Relation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__RELATION = RELATIONSHIP_CONSTRAINT__RELATION;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL__GROUPS = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Total</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL_FEATURE_COUNT = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Total</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL_OPERATION_COUNT = RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.FulfilmentImpl <em>Fulfilment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.FulfilmentImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getFulfilment()
   * @generated
   */
  int FULFILMENT = 13;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILMENT__RELATION_CONTAINER = RELATION__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILMENT__BENDPOINTS = RELATION__BENDPOINTS;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILMENT__TARGET = RELATION__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILMENT__SOURCE = RELATION__SOURCE;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILMENT__DIM1_BP = RELATION__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILMENT__DIM2_BP = RELATION__DIM2_BP;

  /**
   * The feature id for the '<em><b>Fufilled Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILMENT__FUFILLED_ROLE = RELATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fulfilment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILMENT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Fulfilment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULFILMENT_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleConstraintImpl <em>Role Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleConstraintImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleConstraint()
   * @generated
   */
  int ROLE_CONSTRAINT = 24;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_CONSTRAINT__RELATION_CONTAINER = CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_CONSTRAINT__BENDPOINTS = CONSTRAINT__BENDPOINTS;

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
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleEquivalenceImpl <em>Role Equivalence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleEquivalenceImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleEquivalence()
   * @generated
   */
  int ROLE_EQUIVALENCE = 14;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_EQUIVALENCE__RELATION_CONTAINER = ROLE_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_EQUIVALENCE__BENDPOINTS = ROLE_CONSTRAINT__BENDPOINTS;

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
   * The meta object id for the '{@link org.framed.orm.model.impl.AcyclicImpl <em>Acyclic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.AcyclicImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getAcyclic()
   * @generated
   */
  int ACYCLIC = 15;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACYCLIC__RELATION_CONTAINER = RELATIONSHIP_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACYCLIC__BENDPOINTS = RELATIONSHIP_CONSTRAINT__BENDPOINTS;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACYCLIC__TARGET = RELATIONSHIP_CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACYCLIC__SOURCE = RELATIONSHIP_CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACYCLIC__DIM1_BP = RELATIONSHIP_CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACYCLIC__DIM2_BP = RELATIONSHIP_CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Relation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACYCLIC__RELATION = RELATIONSHIP_CONSTRAINT__RELATION;

  /**
   * The number of structural features of the '<em>Acyclic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACYCLIC_FEATURE_COUNT = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Acyclic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACYCLIC_OPERATION_COUNT = RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.InheritanceImpl <em>Inheritance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.InheritanceImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getInheritance()
   * @generated
   */
  int INHERITANCE = 16;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE__RELATION_CONTAINER = RELATION__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE__BENDPOINTS = RELATION__BENDPOINTS;

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
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__BENDPOINTS = RELATION__BENDPOINTS;

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
   * The feature id for the '<em><b>Second Parthood</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SECOND_PARTHOOD = RELATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Second Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SECOND_LOWER = RELATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>First Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__FIRST_LOWER = RELATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>First Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__FIRST_UPPER = RELATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Second Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SECOND_UPPER = RELATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>First Parthood</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__FIRST_PARTHOOD = RELATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Source Label Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SOURCE_LABEL_VALUE = RELATION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Target Label Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TARGET_LABEL_VALUE = RELATION_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = RELATION_FEATURE_COUNT + 8;

  /**
   * The number of operations of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleProhibitionImpl <em>Role Prohibition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleProhibitionImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleProhibition()
   * @generated
   */
  int ROLE_PROHIBITION = 18;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__RELATION_CONTAINER = ROLE_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_PROHIBITION__BENDPOINTS = ROLE_CONSTRAINT__BENDPOINTS;

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
   * The meta object id for the '{@link org.framed.orm.model.impl.IrreflexiveImpl <em>Irreflexive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.IrreflexiveImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getIrreflexive()
   * @generated
   */
  int IRREFLEXIVE = 19;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE__RELATION_CONTAINER = RELATIONSHIP_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE__BENDPOINTS = RELATIONSHIP_CONSTRAINT__BENDPOINTS;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE__TARGET = RELATIONSHIP_CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE__SOURCE = RELATIONSHIP_CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE__DIM1_BP = RELATIONSHIP_CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE__DIM2_BP = RELATIONSHIP_CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Relation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE__RELATION = RELATIONSHIP_CONSTRAINT__RELATION;

  /**
   * The number of structural features of the '<em>Irreflexive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE_FEATURE_COUNT = RELATIONSHIP_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Irreflexive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE_OPERATION_COUNT = RELATIONSHIP_CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleImplicationImpl <em>Role Implication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleImplicationImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleImplication()
   * @generated
   */
  int ROLE_IMPLICATION = 20;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_IMPLICATION__RELATION_CONTAINER = ROLE_CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_IMPLICATION__BENDPOINTS = ROLE_CONSTRAINT__BENDPOINTS;

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
   * The meta object id for the '{@link org.framed.orm.model.impl.RoleInvariantImpl <em>Role Invariant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.RoleInvariantImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleInvariant()
   * @generated
   */
  int ROLE_INVARIANT = 25;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INVARIANT__RELATION_CONTAINER = CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INVARIANT__BENDPOINTS = CONSTRAINT__BENDPOINTS;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INVARIANT__TARGET = CONSTRAINT__TARGET;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INVARIANT__SOURCE = CONSTRAINT__SOURCE;

  /**
   * The feature id for the '<em><b>Dim1 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INVARIANT__DIM1_BP = CONSTRAINT__DIM1_BP;

  /**
   * The feature id for the '<em><b>Dim2 BP</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INVARIANT__DIM2_BP = CONSTRAINT__DIM2_BP;

  /**
   * The feature id for the '<em><b>Subject</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INVARIANT__SUBJECT = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Role Invariant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INVARIANT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Role Invariant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_INVARIANT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.framed.orm.model.impl.ComplexConstraintImpl <em>Complex Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.impl.ComplexConstraintImpl
   * @see org.framed.orm.model.impl.OrmPackageImpl#getComplexConstraint()
   * @generated
   */
  int COMPLEX_CONSTRAINT = 27;

  /**
   * The feature id for the '<em><b>Relation Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_CONSTRAINT__RELATION_CONTAINER = CONSTRAINT__RELATION_CONTAINER;

  /**
   * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_CONSTRAINT__BENDPOINTS = CONSTRAINT__BENDPOINTS;

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
   * The feature id for the '<em><b>Groups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_CONSTRAINT__GROUPS = CONSTRAINT_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link org.framed.orm.model.Parthood <em>Parthood</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.Parthood
   * @see org.framed.orm.model.impl.OrmPackageImpl#getParthood()
   * @generated
   */
  int PARTHOOD = 28;

  /**
   * The meta object id for the '<em>Rectangle</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.draw2d.geometry.Rectangle
   * @see org.framed.orm.model.impl.OrmPackageImpl#getRectangle()
   * @generated
   */
  int RECTANGLE = 29;

  /**
   * The meta object id for the '<em>Point</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.draw2d.geometry.Point
   * @see org.framed.orm.model.impl.OrmPackageImpl#getPoint()
   * @generated
   */
  int POINT = 30;


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
   * Returns the meta object for the container reference '{@link org.framed.orm.model.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Type</em>'.
   * @see org.framed.orm.model.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.framed.orm.model.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Methode <em>Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Methode</em>'.
   * @see org.framed.orm.model.Methode
   * @generated
   */
  EClass getMethode();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.Methode#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Type</em>'.
   * @see org.framed.orm.model.Methode#getType()
   * @see #getMethode()
   * @generated
   */
  EReference getMethode_Type();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Methode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.framed.orm.model.Methode#getName()
   * @see #getMethode()
   * @generated
   */
  EAttribute getMethode_Name();

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
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Type#isIsExpand <em>Is Expand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Expand</em>'.
   * @see org.framed.orm.model.Type#isIsExpand()
   * @see #getType()
   * @generated
   */
  EAttribute getType_IsExpand();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.CompartmentDiagram <em>Compartment Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment Diagram</em>'.
   * @see org.framed.orm.model.CompartmentDiagram
   * @generated
   */
  EClass getCompartmentDiagram();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.CompartmentDiagram#getCompartments <em>Compartments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Compartments</em>'.
   * @see org.framed.orm.model.CompartmentDiagram#getCompartments()
   * @see #getCompartmentDiagram()
   * @generated
   */
  EReference getCompartmentDiagram_Compartments();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.CompartmentDiagram#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see org.framed.orm.model.CompartmentDiagram#getGroups()
   * @see #getCompartmentDiagram()
   * @generated
   */
  EReference getCompartmentDiagram_Groups();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.CompartmentDiagram#getPlayers <em>Players</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Players</em>'.
   * @see org.framed.orm.model.CompartmentDiagram#getPlayers()
   * @see #getCompartmentDiagram()
   * @generated
   */
  EReference getCompartmentDiagram_Players();

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
   * Returns the meta object for the container reference '{@link org.framed.orm.model.NaturalType#getParentRolemodel <em>Parent Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent Rolemodel</em>'.
   * @see org.framed.orm.model.NaturalType#getParentRolemodel()
   * @see #getNaturalType()
   * @generated
   */
  EReference getNaturalType_ParentRolemodel();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.NaturalType#getCd <em>Cd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Cd</em>'.
   * @see org.framed.orm.model.NaturalType#getCd()
   * @see #getNaturalType()
   * @generated
   */
  EReference getNaturalType_Cd();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Compartment <em>Compartment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment</em>'.
   * @see org.framed.orm.model.Compartment
   * @generated
   */
  EClass getCompartment();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.Compartment#getCd <em>Cd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Cd</em>'.
   * @see org.framed.orm.model.Compartment#getCd()
   * @see #getCompartment()
   * @generated
   */
  EReference getCompartment_Cd();

  /**
   * Returns the meta object for the containment reference '{@link org.framed.orm.model.Compartment#getRolemodel <em>Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rolemodel</em>'.
   * @see org.framed.orm.model.Compartment#getRolemodel()
   * @see #getCompartment()
   * @generated
   */
  EReference getCompartment_Rolemodel();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.Compartment#getParentRolemodel <em>Parent Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent Rolemodel</em>'.
   * @see org.framed.orm.model.Compartment#getParentRolemodel()
   * @see #getCompartment()
   * @generated
   */
  EReference getCompartment_ParentRolemodel();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Grouping <em>Grouping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grouping</em>'.
   * @see org.framed.orm.model.Grouping
   * @generated
   */
  EClass getGrouping();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.Grouping#getCd <em>Cd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Cd</em>'.
   * @see org.framed.orm.model.Grouping#getCd()
   * @see #getGrouping()
   * @generated
   */
  EReference getGrouping_Cd();

  /**
   * Returns the meta object for the containment reference '{@link org.framed.orm.model.Grouping#getRolemodel <em>Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rolemodel</em>'.
   * @see org.framed.orm.model.Grouping#getRolemodel()
   * @see #getGrouping()
   * @generated
   */
  EReference getGrouping_Rolemodel();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.Grouping#getParentRolemodel <em>Parent Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent Rolemodel</em>'.
   * @see org.framed.orm.model.Grouping#getParentRolemodel()
   * @see #getGrouping()
   * @generated
   */
  EReference getGrouping_ParentRolemodel();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see org.framed.orm.model.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the reference list '{@link org.framed.orm.model.Node#getIncomingLinks <em>Incoming Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Incoming Links</em>'.
   * @see org.framed.orm.model.Node#getIncomingLinks()
   * @see #getNode()
   * @generated
   */
  EReference getNode_IncomingLinks();

  /**
   * Returns the meta object for the reference list '{@link org.framed.orm.model.Node#getOutgoingLinks <em>Outgoing Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outgoing Links</em>'.
   * @see org.framed.orm.model.Node#getOutgoingLinks()
   * @see #getNode()
   * @generated
   */
  EReference getNode_OutgoingLinks();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.framed.orm.model.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Name();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Node#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraints</em>'.
   * @see org.framed.orm.model.Node#getConstraints()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Constraints();

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
   * Returns the meta object for class '{@link org.framed.orm.model.RelationContainer <em>Relation Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Container</em>'.
   * @see org.framed.orm.model.RelationContainer
   * @generated
   */
  EClass getRelationContainer();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.RelationContainer#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relations</em>'.
   * @see org.framed.orm.model.RelationContainer#getRelations()
   * @see #getRelationContainer()
   * @generated
   */
  EReference getRelationContainer_Relations();

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
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.RoleGroup#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.framed.orm.model.RoleGroup#getItems()
   * @see #getRoleGroup()
   * @generated
   */
  EReference getRoleGroup_Items();

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
   * Returns the meta object for class '{@link org.framed.orm.model.Rolemodel <em>Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rolemodel</em>'.
   * @see org.framed.orm.model.Rolemodel
   * @generated
   */
  EClass getRolemodel();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.Rolemodel#getSubcontexts <em>Subcontexts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subcontexts</em>'.
   * @see org.framed.orm.model.Rolemodel#getSubcontexts()
   * @see #getRolemodel()
   * @generated
   */
  EReference getRolemodel_Subcontexts();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.Rolemodel#getParticipants <em>Participants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Participants</em>'.
   * @see org.framed.orm.model.Rolemodel#getParticipants()
   * @see #getRolemodel()
   * @generated
   */
  EReference getRolemodel_Participants();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.Rolemodel#getPlayers <em>Players</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Players</em>'.
   * @see org.framed.orm.model.Rolemodel#getPlayers()
   * @see #getRolemodel()
   * @generated
   */
  EReference getRolemodel_Players();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.Rolemodel#getCt <em>Ct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Ct</em>'.
   * @see org.framed.orm.model.Rolemodel#getCt()
   * @see #getRolemodel()
   * @generated
   */
  EReference getRolemodel_Ct();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.Rolemodel#getParentGroup <em>Parent Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent Group</em>'.
   * @see org.framed.orm.model.Rolemodel#getParentGroup()
   * @see #getRolemodel()
   * @generated
   */
  EReference getRolemodel_ParentGroup();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.Rolemodel#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see org.framed.orm.model.Rolemodel#getGroups()
   * @see #getRolemodel()
   * @generated
   */
  EReference getRolemodel_Groups();

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
   * Returns the meta object for the containment reference list '{@link org.framed.orm.model.Total#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see org.framed.orm.model.Total#getGroups()
   * @see #getTotal()
   * @generated
   */
  EReference getTotal_Groups();

  /**
   * Returns the meta object for class '{@link org.framed.orm.model.Fulfilment <em>Fulfilment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fulfilment</em>'.
   * @see org.framed.orm.model.Fulfilment
   * @generated
   */
  EClass getFulfilment();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Fulfilment#getFufilledRole <em>Fufilled Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fufilled Role</em>'.
   * @see org.framed.orm.model.Fulfilment#getFufilledRole()
   * @see #getFulfilment()
   * @generated
   */
  EAttribute getFulfilment_FufilledRole();

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
   * Returns the meta object for class '{@link org.framed.orm.model.Acyclic <em>Acyclic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Acyclic</em>'.
   * @see org.framed.orm.model.Acyclic
   * @generated
   */
  EClass getAcyclic();

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
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Relationship#getSourceLabelValue <em>Source Label Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Label Value</em>'.
   * @see org.framed.orm.model.Relationship#getSourceLabelValue()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_SourceLabelValue();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.model.Relationship#getTargetLabelValue <em>Target Label Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Label Value</em>'.
   * @see org.framed.orm.model.Relationship#getTargetLabelValue()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_TargetLabelValue();

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
   * Returns the meta object for class '{@link org.framed.orm.model.Irreflexive <em>Irreflexive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Irreflexive</em>'.
   * @see org.framed.orm.model.Irreflexive
   * @generated
   */
  EClass getIrreflexive();

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
   * Returns the meta object for the attribute list '{@link org.framed.orm.model.Relation#getBendpoints <em>Bendpoints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Bendpoints</em>'.
   * @see org.framed.orm.model.Relation#getBendpoints()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Bendpoints();

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
   * Returns the meta object for class '{@link org.framed.orm.model.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see org.framed.orm.model.Constraint
   * @generated
   */
  EClass getConstraint();

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
   * Returns the meta object for class '{@link org.framed.orm.model.RoleInvariant <em>Role Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Invariant</em>'.
   * @see org.framed.orm.model.RoleInvariant
   * @generated
   */
  EClass getRoleInvariant();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.RoleInvariant#getSubject <em>Subject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Subject</em>'.
   * @see org.framed.orm.model.RoleInvariant#getSubject()
   * @see #getRoleInvariant()
   * @generated
   */
  EReference getRoleInvariant_Subject();

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
   * Returns the meta object for the reference '{@link org.framed.orm.model.AbstractRole#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>First</em>'.
   * @see org.framed.orm.model.AbstractRole#getFirst()
   * @see #getAbstractRole()
   * @generated
   */
  EReference getAbstractRole_First();

  /**
   * Returns the meta object for the reference '{@link org.framed.orm.model.AbstractRole#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Second</em>'.
   * @see org.framed.orm.model.AbstractRole#getSecond()
   * @see #getAbstractRole()
   * @generated
   */
  EReference getAbstractRole_Second();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.AbstractRole#getParentRolemodel <em>Parent Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent Rolemodel</em>'.
   * @see org.framed.orm.model.AbstractRole#getParentRolemodel()
   * @see #getAbstractRole()
   * @generated
   */
  EReference getAbstractRole_ParentRolemodel();

  /**
   * Returns the meta object for the container reference '{@link org.framed.orm.model.AbstractRole#getParentRoleGroup <em>Parent Role Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent Role Group</em>'.
   * @see org.framed.orm.model.AbstractRole#getParentRoleGroup()
   * @see #getAbstractRole()
   * @generated
   */
  EReference getAbstractRole_ParentRoleGroup();

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
   * Returns the meta object for the reference list '{@link org.framed.orm.model.ComplexConstraint#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Groups</em>'.
   * @see org.framed.orm.model.ComplexConstraint#getGroups()
   * @see #getComplexConstraint()
   * @generated
   */
  EReference getComplexConstraint_Groups();

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
     * The meta object literal for the '{@link org.framed.orm.model.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.AttributeImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.MethodeImpl <em>Methode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.MethodeImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getMethode()
     * @generated
     */
    EClass METHODE = eINSTANCE.getMethode();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHODE__TYPE = eINSTANCE.getMethode_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHODE__NAME = eINSTANCE.getMethode_Name();

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
     * The meta object literal for the '<em><b>Is Expand</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__IS_EXPAND = eINSTANCE.getType_IsExpand();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.CompartmentDiagramImpl <em>Compartment Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.CompartmentDiagramImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getCompartmentDiagram()
     * @generated
     */
    EClass COMPARTMENT_DIAGRAM = eINSTANCE.getCompartmentDiagram();

    /**
     * The meta object literal for the '<em><b>Compartments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_DIAGRAM__COMPARTMENTS = eINSTANCE.getCompartmentDiagram_Compartments();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_DIAGRAM__GROUPS = eINSTANCE.getCompartmentDiagram_Groups();

    /**
     * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_DIAGRAM__PLAYERS = eINSTANCE.getCompartmentDiagram_Players();

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
     * The meta object literal for the '<em><b>Parent Rolemodel</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NATURAL_TYPE__PARENT_ROLEMODEL = eINSTANCE.getNaturalType_ParentRolemodel();

    /**
     * The meta object literal for the '<em><b>Cd</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NATURAL_TYPE__CD = eINSTANCE.getNaturalType_Cd();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.CompartmentImpl <em>Compartment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.CompartmentImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getCompartment()
     * @generated
     */
    EClass COMPARTMENT = eINSTANCE.getCompartment();

    /**
     * The meta object literal for the '<em><b>Cd</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT__CD = eINSTANCE.getCompartment_Cd();

    /**
     * The meta object literal for the '<em><b>Rolemodel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT__ROLEMODEL = eINSTANCE.getCompartment_Rolemodel();

    /**
     * The meta object literal for the '<em><b>Parent Rolemodel</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT__PARENT_ROLEMODEL = eINSTANCE.getCompartment_ParentRolemodel();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.GroupingImpl <em>Grouping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.GroupingImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getGrouping()
     * @generated
     */
    EClass GROUPING = eINSTANCE.getGrouping();

    /**
     * The meta object literal for the '<em><b>Cd</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUPING__CD = eINSTANCE.getGrouping_Cd();

    /**
     * The meta object literal for the '<em><b>Rolemodel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUPING__ROLEMODEL = eINSTANCE.getGrouping_Rolemodel();

    /**
     * The meta object literal for the '<em><b>Parent Rolemodel</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUPING__PARENT_ROLEMODEL = eINSTANCE.getGrouping_ParentRolemodel();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.Node <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.Node
     * @see org.framed.orm.model.impl.OrmPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__INCOMING_LINKS = eINSTANCE.getNode_IncomingLinks();

    /**
     * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__OUTGOING_LINKS = eINSTANCE.getNode_OutgoingLinks();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NAME = eINSTANCE.getNode_Name();

    /**
     * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__CONSTRAINTS = eINSTANCE.getNode_Constraints();

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
     * The meta object literal for the '{@link org.framed.orm.model.impl.RelationContainerImpl <em>Relation Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RelationContainerImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRelationContainer()
     * @generated
     */
    EClass RELATION_CONTAINER = eINSTANCE.getRelationContainer();

    /**
     * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_CONTAINER__RELATIONS = eINSTANCE.getRelationContainer_Relations();

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
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_GROUP__ITEMS = eINSTANCE.getRoleGroup_Items();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE_GROUP__UPPER = eINSTANCE.getRoleGroup_Upper();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.RolemodelImpl <em>Rolemodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RolemodelImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRolemodel()
     * @generated
     */
    EClass ROLEMODEL = eINSTANCE.getRolemodel();

    /**
     * The meta object literal for the '<em><b>Subcontexts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLEMODEL__SUBCONTEXTS = eINSTANCE.getRolemodel_Subcontexts();

    /**
     * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLEMODEL__PARTICIPANTS = eINSTANCE.getRolemodel_Participants();

    /**
     * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLEMODEL__PLAYERS = eINSTANCE.getRolemodel_Players();

    /**
     * The meta object literal for the '<em><b>Ct</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLEMODEL__CT = eINSTANCE.getRolemodel_Ct();

    /**
     * The meta object literal for the '<em><b>Parent Group</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLEMODEL__PARENT_GROUP = eINSTANCE.getRolemodel_ParentGroup();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLEMODEL__GROUPS = eINSTANCE.getRolemodel_Groups();

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
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOTAL__GROUPS = eINSTANCE.getTotal_Groups();

    /**
     * The meta object literal for the '{@link org.framed.orm.model.impl.FulfilmentImpl <em>Fulfilment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.FulfilmentImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getFulfilment()
     * @generated
     */
    EClass FULFILMENT = eINSTANCE.getFulfilment();

    /**
     * The meta object literal for the '<em><b>Fufilled Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FULFILMENT__FUFILLED_ROLE = eINSTANCE.getFulfilment_FufilledRole();

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
     * The meta object literal for the '{@link org.framed.orm.model.impl.AcyclicImpl <em>Acyclic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.AcyclicImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getAcyclic()
     * @generated
     */
    EClass ACYCLIC = eINSTANCE.getAcyclic();

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
     * The meta object literal for the '<em><b>Source Label Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__SOURCE_LABEL_VALUE = eINSTANCE.getRelationship_SourceLabelValue();

    /**
     * The meta object literal for the '<em><b>Target Label Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__TARGET_LABEL_VALUE = eINSTANCE.getRelationship_TargetLabelValue();

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
     * The meta object literal for the '{@link org.framed.orm.model.impl.IrreflexiveImpl <em>Irreflexive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.IrreflexiveImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getIrreflexive()
     * @generated
     */
    EClass IRREFLEXIVE = eINSTANCE.getIrreflexive();

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
     * The meta object literal for the '{@link org.framed.orm.model.Relation <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.Relation
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
     * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__BENDPOINTS = eINSTANCE.getRelation_Bendpoints();

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
     * The meta object literal for the '{@link org.framed.orm.model.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.ConstraintImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

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
     * The meta object literal for the '{@link org.framed.orm.model.impl.RoleInvariantImpl <em>Role Invariant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.model.impl.RoleInvariantImpl
     * @see org.framed.orm.model.impl.OrmPackageImpl#getRoleInvariant()
     * @generated
     */
    EClass ROLE_INVARIANT = eINSTANCE.getRoleInvariant();

    /**
     * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_INVARIANT__SUBJECT = eINSTANCE.getRoleInvariant_Subject();

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
     * The meta object literal for the '<em><b>First</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ROLE__FIRST = eINSTANCE.getAbstractRole_First();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ROLE__SECOND = eINSTANCE.getAbstractRole_Second();

    /**
     * The meta object literal for the '<em><b>Parent Rolemodel</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ROLE__PARENT_ROLEMODEL = eINSTANCE.getAbstractRole_ParentRolemodel();

    /**
     * The meta object literal for the '<em><b>Parent Role Group</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ROLE__PARENT_ROLE_GROUP = eINSTANCE.getAbstractRole_ParentRoleGroup();

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
     * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_CONSTRAINT__GROUPS = eINSTANCE.getComplexConstraint_Groups();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_CONSTRAINT__EXPRESSION = eINSTANCE.getComplexConstraint_Expression();

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
