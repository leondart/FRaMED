/**
 */
package org.framed.orm.model.impl;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.framed.orm.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrmFactoryImpl extends EFactoryImpl implements OrmFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OrmFactory init() {
    try {
      OrmFactory theOrmFactory =
          (OrmFactory) EPackage.Registry.INSTANCE.getEFactory(OrmPackage.eNS_URI);
      if (theOrmFactory != null) {
        return theOrmFactory;
      }
    } catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OrmFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrmFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case OrmPackage.MODEL:
        return createModel();
      case OrmPackage.ELEMENT_MODEL:
        return createElementModel();
      case OrmPackage.ABSTRACT_ROLE_MODEL:
        return createAbstractRoleModel();
      case OrmPackage.RIGID_TYPE:
        return createRigidType();
      case OrmPackage.GROUP:
        return createGroup();
      case OrmPackage.PARAMETER:
        return createParameter();
      case OrmPackage.OPERATION:
        return createOperation();
      case OrmPackage.ATTRIBUTE:
        return createAttribute();
      case OrmPackage.DATA_TYPE:
        return createDataType();
      case OrmPackage.NATURAL_TYPE:
        return createNaturalType();
      case OrmPackage.COMPARTMENT_TYPE:
        return createCompartmentType();
      case OrmPackage.ANTI_RIGID_TYPE:
        return createAntiRigidType();
      case OrmPackage.ROLE_TYPE:
        return createRoleType();
      case OrmPackage.RELATIONSHIP:
        return createRelationship();
      case OrmPackage.FULFILLMENT:
        return createFulfillment();
      case OrmPackage.INHERITANCE:
        return createInheritance();
      case OrmPackage.CONSTRAINT:
        return createConstraint();
      case OrmPackage.INTRA_RELATIONSHIP_CONSTRAINT:
        return createIntraRelationshipConstraint();
      case OrmPackage.INTER_RELATIONSHIP_CONSTRAINT:
        return createInterRelationshipConstraint();
      case OrmPackage.COMPLEX_CONSTRAINT:
        return createComplexConstraint();
      case OrmPackage.DATA_INHERITANCE:
        return createDataInheritance();
      case OrmPackage.NATURAL_INHERITANCE:
        return createNaturalInheritance();
      case OrmPackage.COMPARTMENT_INHERITANCE:
        return createCompartmentInheritance();
      case OrmPackage.ROLE_INHERITANCE:
        return createRoleInheritance();
      case OrmPackage.PLACE:
        return createPlace();
      case OrmPackage.RELATIONSHIP_IMPLICATION:
        return createRelationshipImplication();
      case OrmPackage.RELATION_TARGET:
        return createRelationTarget();
      case OrmPackage.IRREFLEXIVE:
        return createIrreflexive();
      case OrmPackage.CYCLIC:
        return createCyclic();
      case OrmPackage.TOTAL:
        return createTotal();
      case OrmPackage.ROLE_GROUP:
        return createRoleGroup();
      case OrmPackage.ROLE_IMPLICATION:
        return createRoleImplication();
      case OrmPackage.ROLE_EQUIVALENCE:
        return createRoleEquivalence();
      case OrmPackage.ROLE_PROHIBITION:
        return createRoleProhibition();
      case OrmPackage.PART:
        return createPart();
      case OrmPackage.PARTHOOD_CONSTRAINT:
        return createParthoodConstraint();
      case OrmPackage.ROLE_GROUP_ELEMENT:
        return createRoleGroupElement();
      case OrmPackage.ABSTRACT_ROLE_REF:
        return createAbstractRoleRef();
      case OrmPackage.RELATION_LABEL:
        return createRelationLabel();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName()
            + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case OrmPackage.DIRECTION:
        return createDirectionFromString(eDataType, initialValue);
      case OrmPackage.PARTHOOD:
        return createParthoodFromString(eDataType, initialValue);
      case OrmPackage.RECTANGLE:
        return createRectangleFromString(eDataType, initialValue);
      case OrmPackage.POINT:
        return createPointFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName()
            + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case OrmPackage.DIRECTION:
        return convertDirectionToString(eDataType, instanceValue);
      case OrmPackage.PARTHOOD:
        return convertParthoodToString(eDataType, instanceValue);
      case OrmPackage.RECTANGLE:
        return convertRectangleToString(eDataType, instanceValue);
      case OrmPackage.POINT:
        return convertPointToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName()
            + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel() {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementModel createElementModel() {
    ElementModelImpl elementModel = new ElementModelImpl();
    return elementModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRoleModel createAbstractRoleModel() {
    AbstractRoleModelImpl abstractRoleModel = new AbstractRoleModelImpl();
    return abstractRoleModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RigidType createRigidType() {
    RigidTypeImpl rigidType = new RigidTypeImpl();
    return rigidType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group createGroup() {
    GroupImpl group = new GroupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter() {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation() {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute() {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType() {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaturalType createNaturalType() {
    NaturalTypeImpl naturalType = new NaturalTypeImpl();
    return naturalType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentType createCompartmentType() {
    CompartmentTypeImpl compartmentType = new CompartmentTypeImpl();
    return compartmentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AntiRigidType createAntiRigidType() {
    AntiRigidTypeImpl antiRigidType = new AntiRigidTypeImpl();
    return antiRigidType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleType createRoleType() {
    RoleTypeImpl roleType = new RoleTypeImpl();
    return roleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationship createRelationship() {
    RelationshipImpl relationship = new RelationshipImpl();
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fulfillment createFulfillment() {
    FulfillmentImpl fulfillment = new FulfillmentImpl();
    return fulfillment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inheritance createInheritance() {
    InheritanceImpl inheritance = new InheritanceImpl();
    return inheritance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint() {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntraRelationshipConstraint createIntraRelationshipConstraint() {
    IntraRelationshipConstraintImpl intraRelationshipConstraint =
        new IntraRelationshipConstraintImpl();
    return intraRelationshipConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterRelationshipConstraint createInterRelationshipConstraint() {
    InterRelationshipConstraintImpl interRelationshipConstraint =
        new InterRelationshipConstraintImpl();
    return interRelationshipConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexConstraint createComplexConstraint() {
    ComplexConstraintImpl complexConstraint = new ComplexConstraintImpl();
    return complexConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataInheritance createDataInheritance() {
    DataInheritanceImpl dataInheritance = new DataInheritanceImpl();
    return dataInheritance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaturalInheritance createNaturalInheritance() {
    NaturalInheritanceImpl naturalInheritance = new NaturalInheritanceImpl();
    return naturalInheritance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentInheritance createCompartmentInheritance() {
    CompartmentInheritanceImpl compartmentInheritance = new CompartmentInheritanceImpl();
    return compartmentInheritance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleInheritance createRoleInheritance() {
    RoleInheritanceImpl roleInheritance = new RoleInheritanceImpl();
    return roleInheritance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Place createPlace() {
    PlaceImpl place = new PlaceImpl();
    return place;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipImplication createRelationshipImplication() {
    RelationshipImplicationImpl relationshipImplication = new RelationshipImplicationImpl();
    return relationshipImplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationTarget createRelationTarget() {
    RelationTargetImpl relationTarget = new RelationTargetImpl();
    return relationTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Irreflexive createIrreflexive() {
    IrreflexiveImpl irreflexive = new IrreflexiveImpl();
    return irreflexive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cyclic createCyclic() {
    CyclicImpl cyclic = new CyclicImpl();
    return cyclic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Total createTotal() {
    TotalImpl total = new TotalImpl();
    return total;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleGroup createRoleGroup() {
    RoleGroupImpl roleGroup = new RoleGroupImpl();
    return roleGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleImplication createRoleImplication() {
    RoleImplicationImpl roleImplication = new RoleImplicationImpl();
    return roleImplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleEquivalence createRoleEquivalence() {
    RoleEquivalenceImpl roleEquivalence = new RoleEquivalenceImpl();
    return roleEquivalence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleProhibition createRoleProhibition() {
    RoleProhibitionImpl roleProhibition = new RoleProhibitionImpl();
    return roleProhibition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Part createPart() {
    PartImpl part = new PartImpl();
    return part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParthoodConstraint createParthoodConstraint() {
    ParthoodConstraintImpl parthoodConstraint = new ParthoodConstraintImpl();
    return parthoodConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleGroupElement createRoleGroupElement() {
    RoleGroupElementImpl roleGroupElement = new RoleGroupElementImpl();
    return roleGroupElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRoleRef createAbstractRoleRef() {
    AbstractRoleRefImpl abstractRoleRef = new AbstractRoleRefImpl();
    return abstractRoleRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationLabel createRelationLabel() {
    RelationLabelImpl relationLabel = new RelationLabelImpl();
    return relationLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
    Direction result = Direction.get(initialValue);
    if (result == null)
      throw new IllegalArgumentException("The value '" + initialValue
          + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parthood createParthoodFromString(EDataType eDataType, String initialValue) {
    Parthood result = Parthood.get(initialValue);
    if (result == null)
      throw new IllegalArgumentException("The value '" + initialValue
          + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertParthoodToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> Convert a <code>Rectangle</code> to a <code>String</code>
   * representation. The <code>Rectangle</code> is represented as "x,y,width,heigth". <!--
   * end-user-doc -->
   * 
   * @generated NOT
   */
  public String convertRectangleToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) {
      return null;
    }
    Rectangle rect = (Rectangle) instanceValue;
    return rect.x + "," + rect.y + "," + rect.width + "," + rect.height;
  }
  
  /**
   * <!-- begin-user-doc --> Create a <code>Rectangle</code> instance from a <code>String</code>.
   * The expected representation is "x,y,width,height". Illegal representations will return a null
   * value. <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Rectangle createRectangleFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) {
      return null;
    }
    initialValue.replaceAll("\\s", "");
    String[] values = initialValue.split(",");
    if (values.length != 4) {
      return null;
    }

    Rectangle rect = new Rectangle();
    try {
      rect.setLocation(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
      rect.setSize(Integer.parseInt(values[2]), Integer.parseInt(values[3]));
    } catch (NumberFormatException e) {
      EcorePlugin.INSTANCE.log(e);
      rect = null;
    }
    return rect;
  }

  /**
   * <!-- begin-user-doc -->  Create a <code>Point</code> instance from a <code>String</code>.
   * The expected representation is "x,y". Illegal representations will return a null
   * value. <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public Point createPointFromString(EDataType eDataType, String initialValue) {
    if (initialValue == null) {
      return null;
    }
    initialValue.replaceAll("\\s", "");
    String[] values = initialValue.split(",");
    if (values.length != 2) {
      return null;
    }

    Point point = new Point();
    try {
      point.setLocation(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
    } catch (NumberFormatException e) {
      EcorePlugin.INSTANCE.log(e);
      point = null;
    }
    return point;
  }

  /**
   * <!-- begin-user-doc --> Convert a <code>Point</code> to a <code>String</code>
   * representation. The <code>Point</code> is represented as "x,y". <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  public String convertPointToString(EDataType eDataType, Object instanceValue) {
    if (instanceValue == null) {
      return null;
    }
    Point p = (Point) instanceValue;
    return p.x + "," + p.y;
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrmPackage getOrmPackage() {
    return (OrmPackage) getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OrmPackage getPackage() {
    return OrmPackage.eINSTANCE;
  }

} //OrmFactoryImpl
