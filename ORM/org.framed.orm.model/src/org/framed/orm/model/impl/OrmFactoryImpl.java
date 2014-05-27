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
      OrmFactory theOrmFactory = (OrmFactory)EPackage.Registry.INSTANCE.getEFactory(OrmPackage.eNS_URI);
      if (theOrmFactory != null) {
        return theOrmFactory;
      }
    }
    catch (Exception exception) {
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
      case OrmPackage.ATTRIBUTE: return createAttribute();
      case OrmPackage.METHOD: return createMethod();
      case OrmPackage.COMPARTMENT_DIAGRAM: return createCompartmentDiagram();
      case OrmPackage.NATURAL_TYPE: return createNaturalType();
      case OrmPackage.COMPARTMENT: return createCompartment();
      case OrmPackage.GROUPING: return createGrouping();
      case OrmPackage.ROLE_TYPE: return createRoleType();
      case OrmPackage.RELATION_CONTAINER: return createRelationContainer();
      case OrmPackage.ROLE_GROUP: return createRoleGroup();
      case OrmPackage.ROLEMODEL: return createRolemodel();
      case OrmPackage.TOTAL: return createTotal();
      case OrmPackage.FULFILLMENT: return createFulfillment();
      case OrmPackage.ROLE_EQUIVALENCE: return createRoleEquivalence();
      case OrmPackage.ACYCLIC: return createAcyclic();
      case OrmPackage.INHERITANCE: return createInheritance();
      case OrmPackage.RELATIONSHIP: return createRelationship();
      case OrmPackage.ROLE_PROHIBITION: return createRoleProhibition();
      case OrmPackage.IRREFLEXIVE: return createIrreflexive();
      case OrmPackage.ROLE_IMPLICATION: return createRoleImplication();
      case OrmPackage.COMPLEX_CONSTRAINT: return createComplexConstraint();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
      case OrmPackage.PARTHOOD:
        return createParthoodFromString(eDataType, initialValue);
      case OrmPackage.RECTANGLE:
        return createRectangleFromString(eDataType, initialValue);
      case OrmPackage.POINT:
        return createPointFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
      case OrmPackage.PARTHOOD:
        return convertParthoodToString(eDataType, instanceValue);
      case OrmPackage.RECTANGLE:
        return convertRectangleToString(eDataType, instanceValue);
      case OrmPackage.POINT:
        return convertPointToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
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
  public Method createMethod() {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentDiagram createCompartmentDiagram() {
    CompartmentDiagramImpl compartmentDiagram = new CompartmentDiagramImpl();
    return compartmentDiagram;
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
  public Compartment createCompartment() {
    CompartmentImpl compartment = new CompartmentImpl();
    return compartment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grouping createGrouping() {
    GroupingImpl grouping = new GroupingImpl();
    return grouping;
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
  public RelationContainer createRelationContainer() {
    RelationContainerImpl relationContainer = new RelationContainerImpl();
    return relationContainer;
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
  public Rolemodel createRolemodel() {
    RolemodelImpl rolemodel = new RolemodelImpl();
    return rolemodel;
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
  public Fulfillment createFulfillment() {
    FulfillmentImpl fulfillment = new FulfillmentImpl();
    return fulfillment;
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
  public Acyclic createAcyclic() {
    AcyclicImpl acyclic = new AcyclicImpl();
    return acyclic;
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
  public Relationship createRelationship() {
    RelationshipImpl relationship = new RelationshipImpl();
    return relationship;
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
  public Irreflexive createIrreflexive() {
    IrreflexiveImpl irreflexive = new IrreflexiveImpl();
    return irreflexive;
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
  public ComplexConstraint createComplexConstraint() {
    ComplexConstraintImpl complexConstraint = new ComplexConstraintImpl();
    return complexConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parthood createParthoodFromString(EDataType eDataType, String initialValue) {
    Parthood result = Parthood.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
   * <!-- begin-user-doc -->
   * Create a <code>Rectangle</code> instance from a <code>String</code>. The expected
   * representation is "x,y,width,height". Illegal representations will return a null
   * value.
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Rectangle createRectangleFromString(EDataType eDataType, String initialValue) {
    if(initialValue == null) {
      return null;
    }
    initialValue.replaceAll("\\s", "");
    String[] values = initialValue.split(",");
    if(values.length != 4) {
      return null;
    }

    Rectangle rect = new Rectangle();
    try {
      rect.setLocation(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
      rect.setSize(Integer.parseInt(values[2]), Integer.parseInt(values[3]));
    } catch(NumberFormatException e) {
      EcorePlugin.INSTANCE.log(e);
      rect = null;
    }
    return rect;
  }

  /**
   * <!-- begin-user-doc -->
   * Convert a <code>Rectangle</code> to a <code>String</code> representation. The
   * <code>Rectangle</code> is represented as "x,y,width,heigth".
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertRectangleToString(EDataType eDataType, Object instanceValue) {
    if(instanceValue == null) {
      return null;
    }
    Rectangle rect = (Rectangle) instanceValue;
    return rect.x+","+rect.y+","+rect.width+","+rect.height;
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Point createPointFromString(EDataType eDataType, String initialValue) {
      if(initialValue == null) {
          return null;
      }
      initialValue.replaceAll("\\s", "");
      String[] values = initialValue.split(",");
      if(values.length != 2) {
          return null;
      }

      Point point = new Point();
      try { 
          point.setLocation(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
      } catch(NumberFormatException e) {
          EcorePlugin.INSTANCE.log(e);
          point = null;       
      }
      return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String convertPointToString(EDataType eDataType, Object instanceValue) {
      if(instanceValue == null) {
          return null;
      }
      Point p = (Point)instanceValue;
      return p.x+","+p.y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrmPackage getOrmPackage() {
    return (OrmPackage)getEPackage();
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
