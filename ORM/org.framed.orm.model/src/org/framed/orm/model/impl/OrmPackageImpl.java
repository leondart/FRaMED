/**
 */
package org.framed.orm.model.impl;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.AbstractRoleModel;
import org.framed.orm.model.AbstractRoleRef;
import org.framed.orm.model.AntiRigidType;
import org.framed.orm.model.Attribute;
import org.framed.orm.model.CompartmentInheritance;
import org.framed.orm.model.CompartmentType;
import org.framed.orm.model.ComplexConstraint;
import org.framed.orm.model.Constraint;
import org.framed.orm.model.Cyclic;
import org.framed.orm.model.DataInheritance;
import org.framed.orm.model.DataType;
import org.framed.orm.model.Direction;
import org.framed.orm.model.ElementModel;
import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.Group;
import org.framed.orm.model.Inheritance;
import org.framed.orm.model.InterRelationshipConstraint;
import org.framed.orm.model.IntraRelationshipConstraint;
import org.framed.orm.model.Irreflexive;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.NaturalInheritance;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.Operation;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Parameter;
import org.framed.orm.model.Part;
import org.framed.orm.model.Parthood;
import org.framed.orm.model.ParthoodConstraint;
import org.framed.orm.model.Place;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RelationLabel;
import org.framed.orm.model.RelationTarget;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.model.RelationshipImplication;
import org.framed.orm.model.RigidType;
import org.framed.orm.model.RoleConstraint;
import org.framed.orm.model.RoleEquivalence;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleGroupElement;
import org.framed.orm.model.RoleImplication;
import org.framed.orm.model.RoleInheritance;
import org.framed.orm.model.RoleProhibition;
import org.framed.orm.model.RoleType;
import org.framed.orm.model.Total;
import org.framed.orm.model.Type;
import org.framed.orm.model.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrmPackageImpl extends EPackageImpl implements OrmPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractRoleModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rigidTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass naturalTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compartmentTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass antiRigidTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fulfillmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inheritanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intraRelationshipConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interRelationshipConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataInheritanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass naturalInheritanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compartmentInheritanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleInheritanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass placeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipImplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass irreflexiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cyclicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass totalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractRoleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleImplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleEquivalenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleProhibitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parthoodConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleGroupElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractRoleRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationLabelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum directionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum parthoodEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType rectangleEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType pointEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.framed.orm.model.OrmPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OrmPackageImpl() {
    super(eNS_URI, OrmFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link OrmPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OrmPackage init() {
    if (isInited)
      return (OrmPackage) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI);

    // Obtain or create and register package
    OrmPackageImpl theOrmPackage =
        (OrmPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrmPackageImpl ? EPackage.Registry.INSTANCE
            .get(eNS_URI) : new OrmPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theOrmPackage.createPackageContents();

    // Initialize created meta-data
    theOrmPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOrmPackage.freeze();


    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OrmPackage.eNS_URI, theOrmPackage);
    return theOrmPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedElement() {
    return namedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedElement_Name() {
    return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelElement() {
    return modelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelElement_Container() {
    return (EReference) modelElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel() {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Relations() {
    return (EReference) modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementModel() {
    return elementModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementModel_Elements() {
    return (EReference) elementModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractRoleModel() {
    return abstractRoleModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRoleModel_Abstractroles() {
    return (EReference) abstractRoleModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRigidType() {
    return rigidTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroup() {
    return groupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelation() {
    return relationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_RelationContainer() {
    return (EReference) relationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_Dim1BP() {
    return (EAttribute) relationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_Dim2BP() {
    return (EAttribute) relationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Target() {
    return (EReference) relationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Source() {
    return (EReference) relationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter() {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Owneroperation() {
    return (EReference) parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation() {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Owner() {
    return (EReference) operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Operation() {
    return (EAttribute) operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Params() {
    return (EReference) operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute() {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Owner() {
    return (EReference) attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType() {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Attributes() {
    return (EReference) typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Operations() {
    return (EReference) typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataType() {
    return dataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataType_Serializable() {
    return (EAttribute) dataTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataType_Tr_extends() {
    return (EReference) dataTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaturalType() {
    return naturalTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaturalType_Tr_extends() {
    return (EReference) naturalTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompartmentType() {
    return compartmentTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompartmentType_IsExpand() {
    return (EAttribute) compartmentTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompartmentType_Parts() {
    return (EReference) compartmentTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompartmentType_Relationships() {
    return (EReference) compartmentTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompartmentType_Constraints() {
    return (EReference) compartmentTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompartmentType_Tr_extends() {
    return (EReference) compartmentTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAntiRigidType() {
    return antiRigidTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoleType() {
    return roleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoleType_Tr_extends() {
    return (EReference) roleTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationship() {
    return relationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationship_SecondParthood() {
    return (EAttribute) relationshipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationship_SecondLower() {
    return (EAttribute) relationshipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationship_FirstLower() {
    return (EAttribute) relationshipEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationship_FirstUpper() {
    return (EAttribute) relationshipEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationship_SecondUpper() {
    return (EAttribute) relationshipEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationship_FirstParthood() {
    return (EAttribute) relationshipEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationship_SourceLabel() {
    return (EReference) relationshipEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationship_TargetLabel() {
    return (EReference) relationshipEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationship_FirstLowerUpper() {
    return (EAttribute) relationshipEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationship_SecondLowerUpper() {
    return (EAttribute) relationshipEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationship_RlshipConstraints() {
    return (EReference) relationshipEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationship_Direction() {
    return (EAttribute) relationshipEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationship_First() {
    return (EReference) relationshipEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationship_Second() {
    return (EReference) relationshipEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFulfillment() {
    return fulfillmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFulfillment_FulfilledRoles() {
    return (EReference) fulfillmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFulfillment_Filler() {
    return (EReference) fulfillmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInheritance() {
    return inheritanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint() {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstraint_OwnerCompartment() {
    return (EReference) constraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoleConstraint() {
    return roleConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoleConstraint_Ends() {
    return (EReference) roleConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoleConstraint_Second() {
    return (EReference) roleConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoleConstraint_First() {
    return (EReference) roleConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationshipConstraint() {
    return relationshipConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationshipConstraint_Relation() {
    return (EReference) relationshipConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntraRelationshipConstraint() {
    return intraRelationshipConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterRelationshipConstraint() {
    return interRelationshipConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterRelationshipConstraint_First() {
    return (EReference) interRelationshipConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterRelationshipConstraint_Second() {
    return (EReference) interRelationshipConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexConstraint() {
    return complexConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexConstraint_Targets() {
    return (EReference) complexConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexConstraint_Expression() {
    return (EAttribute) complexConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataInheritance() {
    return dataInheritanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataInheritance_Super() {
    return (EReference) dataInheritanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataInheritance_Sub() {
    return (EReference) dataInheritanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaturalInheritance() {
    return naturalInheritanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaturalInheritance_Super() {
    return (EReference) naturalInheritanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaturalInheritance_Sub() {
    return (EReference) naturalInheritanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompartmentInheritance() {
    return compartmentInheritanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompartmentInheritance_Sub() {
    return (EReference) compartmentInheritanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompartmentInheritance_Super() {
    return (EReference) compartmentInheritanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoleInheritance() {
    return roleInheritanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoleInheritance_Sub() {
    return (EReference) roleInheritanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoleInheritance_Super() {
    return (EReference) roleInheritanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlace() {
    return placeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlace_Lower() {
    return (EAttribute) placeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlace_Upper() {
    return (EAttribute) placeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlace_Holder() {
    return (EReference) placeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationshipImplication() {
    return relationshipImplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationTarget() {
    return relationTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationTarget_Incoming() {
    return (EReference) relationTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationTarget_Outgoing() {
    return (EReference) relationTargetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationTarget_Boundaries() {
    return (EAttribute) relationTargetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIrreflexive() {
    return irreflexiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCyclic() {
    return cyclicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTotal() {
    return totalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractRole() {
    return abstractRoleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRole_Fulfillment() {
    return (EReference) abstractRoleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRole_Parent() {
    return (EReference) abstractRoleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoleGroup() {
    return roleGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRoleGroup_Lower() {
    return (EAttribute) roleGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRoleGroup_Upper() {
    return (EAttribute) roleGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoleImplication() {
    return roleImplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoleEquivalence() {
    return roleEquivalenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoleProhibition() {
    return roleProhibitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPart() {
    return partEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPart_Lower() {
    return (EAttribute) partEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPart_Upper() {
    return (EAttribute) partEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPart_Whole() {
    return (EReference) partEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPart_Role() {
    return (EReference) partEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypedElement() {
    return typedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypedElement_Type() {
    return (EReference) typedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParthoodConstraint() {
    return parthoodConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParthoodConstraint_Kind() {
    return (EAttribute) parthoodConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoleGroupElement() {
    return roleGroupElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractRoleRef() {
    return abstractRoleRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRoleRef_Ref() {
    return (EReference) abstractRoleRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationLabel() {
    return relationLabelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationLabel_Label() {
    return (EAttribute) relationLabelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationLabel_IsRelationEnd() {
    return (EAttribute) relationLabelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDirection() {
    return directionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getParthood() {
    return parthoodEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getRectangle() {
    return rectangleEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getPoint() {
    return pointEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrmFactory getOrmFactory() {
    return (OrmFactory) getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated)
      return;
    isCreated = true;

    // Create classes and their features
    namedElementEClass = createEClass(NAMED_ELEMENT);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

    modelElementEClass = createEClass(MODEL_ELEMENT);
    createEReference(modelElementEClass, MODEL_ELEMENT__CONTAINER);

    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__RELATIONS);

    elementModelEClass = createEClass(ELEMENT_MODEL);
    createEReference(elementModelEClass, ELEMENT_MODEL__ELEMENTS);

    abstractRoleModelEClass = createEClass(ABSTRACT_ROLE_MODEL);
    createEReference(abstractRoleModelEClass, ABSTRACT_ROLE_MODEL__ABSTRACTROLES);

    rigidTypeEClass = createEClass(RIGID_TYPE);

    groupEClass = createEClass(GROUP);

    relationEClass = createEClass(RELATION);
    createEReference(relationEClass, RELATION__RELATION_CONTAINER);
    createEAttribute(relationEClass, RELATION__DIM1_BP);
    createEAttribute(relationEClass, RELATION__DIM2_BP);
    createEReference(relationEClass, RELATION__TARGET);
    createEReference(relationEClass, RELATION__SOURCE);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__OWNEROPERATION);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__OWNER);
    createEAttribute(operationEClass, OPERATION__OPERATION);
    createEReference(operationEClass, OPERATION__PARAMS);

    attributeEClass = createEClass(ATTRIBUTE);
    createEReference(attributeEClass, ATTRIBUTE__OWNER);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__ATTRIBUTES);
    createEReference(typeEClass, TYPE__OPERATIONS);

    dataTypeEClass = createEClass(DATA_TYPE);
    createEAttribute(dataTypeEClass, DATA_TYPE__SERIALIZABLE);
    createEReference(dataTypeEClass, DATA_TYPE__TR_EXTENDS);

    naturalTypeEClass = createEClass(NATURAL_TYPE);
    createEReference(naturalTypeEClass, NATURAL_TYPE__TR_EXTENDS);

    compartmentTypeEClass = createEClass(COMPARTMENT_TYPE);
    createEAttribute(compartmentTypeEClass, COMPARTMENT_TYPE__IS_EXPAND);
    createEReference(compartmentTypeEClass, COMPARTMENT_TYPE__PARTS);
    createEReference(compartmentTypeEClass, COMPARTMENT_TYPE__RELATIONSHIPS);
    createEReference(compartmentTypeEClass, COMPARTMENT_TYPE__CONSTRAINTS);
    createEReference(compartmentTypeEClass, COMPARTMENT_TYPE__TR_EXTENDS);

    antiRigidTypeEClass = createEClass(ANTI_RIGID_TYPE);

    roleTypeEClass = createEClass(ROLE_TYPE);
    createEReference(roleTypeEClass, ROLE_TYPE__TR_EXTENDS);

    relationshipEClass = createEClass(RELATIONSHIP);
    createEAttribute(relationshipEClass, RELATIONSHIP__SECOND_PARTHOOD);
    createEAttribute(relationshipEClass, RELATIONSHIP__SECOND_LOWER);
    createEAttribute(relationshipEClass, RELATIONSHIP__FIRST_LOWER);
    createEAttribute(relationshipEClass, RELATIONSHIP__FIRST_UPPER);
    createEAttribute(relationshipEClass, RELATIONSHIP__SECOND_UPPER);
    createEAttribute(relationshipEClass, RELATIONSHIP__FIRST_PARTHOOD);
    createEReference(relationshipEClass, RELATIONSHIP__SOURCE_LABEL);
    createEReference(relationshipEClass, RELATIONSHIP__TARGET_LABEL);
    createEAttribute(relationshipEClass, RELATIONSHIP__FIRST_LOWER_UPPER);
    createEAttribute(relationshipEClass, RELATIONSHIP__SECOND_LOWER_UPPER);
    createEReference(relationshipEClass, RELATIONSHIP__RLSHIP_CONSTRAINTS);
    createEAttribute(relationshipEClass, RELATIONSHIP__DIRECTION);
    createEReference(relationshipEClass, RELATIONSHIP__FIRST);
    createEReference(relationshipEClass, RELATIONSHIP__SECOND);

    fulfillmentEClass = createEClass(FULFILLMENT);
    createEReference(fulfillmentEClass, FULFILLMENT__FULFILLED_ROLES);
    createEReference(fulfillmentEClass, FULFILLMENT__FILLER);

    inheritanceEClass = createEClass(INHERITANCE);

    constraintEClass = createEClass(CONSTRAINT);
    createEReference(constraintEClass, CONSTRAINT__OWNER_COMPARTMENT);

    roleConstraintEClass = createEClass(ROLE_CONSTRAINT);
    createEReference(roleConstraintEClass, ROLE_CONSTRAINT__ENDS);
    createEReference(roleConstraintEClass, ROLE_CONSTRAINT__SECOND);
    createEReference(roleConstraintEClass, ROLE_CONSTRAINT__FIRST);

    relationshipConstraintEClass = createEClass(RELATIONSHIP_CONSTRAINT);
    createEReference(relationshipConstraintEClass, RELATIONSHIP_CONSTRAINT__RELATION);

    intraRelationshipConstraintEClass = createEClass(INTRA_RELATIONSHIP_CONSTRAINT);

    interRelationshipConstraintEClass = createEClass(INTER_RELATIONSHIP_CONSTRAINT);
    createEReference(interRelationshipConstraintEClass, INTER_RELATIONSHIP_CONSTRAINT__FIRST);
    createEReference(interRelationshipConstraintEClass, INTER_RELATIONSHIP_CONSTRAINT__SECOND);

    complexConstraintEClass = createEClass(COMPLEX_CONSTRAINT);
    createEReference(complexConstraintEClass, COMPLEX_CONSTRAINT__TARGETS);
    createEAttribute(complexConstraintEClass, COMPLEX_CONSTRAINT__EXPRESSION);

    dataInheritanceEClass = createEClass(DATA_INHERITANCE);
    createEReference(dataInheritanceEClass, DATA_INHERITANCE__SUPER);
    createEReference(dataInheritanceEClass, DATA_INHERITANCE__SUB);

    naturalInheritanceEClass = createEClass(NATURAL_INHERITANCE);
    createEReference(naturalInheritanceEClass, NATURAL_INHERITANCE__SUPER);
    createEReference(naturalInheritanceEClass, NATURAL_INHERITANCE__SUB);

    compartmentInheritanceEClass = createEClass(COMPARTMENT_INHERITANCE);
    createEReference(compartmentInheritanceEClass, COMPARTMENT_INHERITANCE__SUB);
    createEReference(compartmentInheritanceEClass, COMPARTMENT_INHERITANCE__SUPER);

    roleInheritanceEClass = createEClass(ROLE_INHERITANCE);
    createEReference(roleInheritanceEClass, ROLE_INHERITANCE__SUB);
    createEReference(roleInheritanceEClass, ROLE_INHERITANCE__SUPER);

    placeEClass = createEClass(PLACE);
    createEAttribute(placeEClass, PLACE__LOWER);
    createEAttribute(placeEClass, PLACE__UPPER);
    createEReference(placeEClass, PLACE__HOLDER);

    relationshipImplicationEClass = createEClass(RELATIONSHIP_IMPLICATION);

    relationTargetEClass = createEClass(RELATION_TARGET);
    createEReference(relationTargetEClass, RELATION_TARGET__INCOMING);
    createEReference(relationTargetEClass, RELATION_TARGET__OUTGOING);
    createEAttribute(relationTargetEClass, RELATION_TARGET__BOUNDARIES);

    irreflexiveEClass = createEClass(IRREFLEXIVE);

    cyclicEClass = createEClass(CYCLIC);

    totalEClass = createEClass(TOTAL);

    abstractRoleEClass = createEClass(ABSTRACT_ROLE);
    createEReference(abstractRoleEClass, ABSTRACT_ROLE__FULFILLMENT);
    createEReference(abstractRoleEClass, ABSTRACT_ROLE__PARENT);

    roleGroupEClass = createEClass(ROLE_GROUP);
    createEAttribute(roleGroupEClass, ROLE_GROUP__LOWER);
    createEAttribute(roleGroupEClass, ROLE_GROUP__UPPER);

    roleImplicationEClass = createEClass(ROLE_IMPLICATION);

    roleEquivalenceEClass = createEClass(ROLE_EQUIVALENCE);

    roleProhibitionEClass = createEClass(ROLE_PROHIBITION);

    partEClass = createEClass(PART);
    createEAttribute(partEClass, PART__LOWER);
    createEAttribute(partEClass, PART__UPPER);
    createEReference(partEClass, PART__WHOLE);
    createEReference(partEClass, PART__ROLE);

    typedElementEClass = createEClass(TYPED_ELEMENT);
    createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

    parthoodConstraintEClass = createEClass(PARTHOOD_CONSTRAINT);
    createEAttribute(parthoodConstraintEClass, PARTHOOD_CONSTRAINT__KIND);

    roleGroupElementEClass = createEClass(ROLE_GROUP_ELEMENT);

    abstractRoleRefEClass = createEClass(ABSTRACT_ROLE_REF);
    createEReference(abstractRoleRefEClass, ABSTRACT_ROLE_REF__REF);

    relationLabelEClass = createEClass(RELATION_LABEL);
    createEAttribute(relationLabelEClass, RELATION_LABEL__LABEL);
    createEAttribute(relationLabelEClass, RELATION_LABEL__IS_RELATION_END);

    // Create enums
    directionEEnum = createEEnum(DIRECTION);
    parthoodEEnum = createEEnum(PARTHOOD);

    // Create data types
    rectangleEDataType = createEDataType(RECTANGLE);
    pointEDataType = createEDataType(POINT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized)
      return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    modelElementEClass.getESuperTypes().add(this.getNamedElement());
    elementModelEClass.getESuperTypes().add(this.getModel());
    abstractRoleModelEClass.getESuperTypes().add(this.getModel());
    rigidTypeEClass.getESuperTypes().add(this.getModelElement());
    rigidTypeEClass.getESuperTypes().add(this.getType());
    groupEClass.getESuperTypes().add(this.getModelElement());
    groupEClass.getESuperTypes().add(this.getElementModel());
    groupEClass.getESuperTypes().add(this.getRelationTarget());
    parameterEClass.getESuperTypes().add(this.getTypedElement());
    operationEClass.getESuperTypes().add(this.getTypedElement());
    attributeEClass.getESuperTypes().add(this.getTypedElement());
    typeEClass.getESuperTypes().add(this.getRelationTarget());
    dataTypeEClass.getESuperTypes().add(this.getRigidType());
    naturalTypeEClass.getESuperTypes().add(this.getRigidType());
    compartmentTypeEClass.getESuperTypes().add(this.getRigidType());
    compartmentTypeEClass.getESuperTypes().add(this.getAbstractRoleModel());
    antiRigidTypeEClass.getESuperTypes().add(this.getType());
    roleTypeEClass.getESuperTypes().add(this.getAbstractRole());
    roleTypeEClass.getESuperTypes().add(this.getAntiRigidType());
    relationshipEClass.getESuperTypes().add(this.getRelation());
    relationshipEClass.getESuperTypes().add(this.getNamedElement());
    fulfillmentEClass.getESuperTypes().add(this.getRelation());
    inheritanceEClass.getESuperTypes().add(this.getRelation());
    constraintEClass.getESuperTypes().add(this.getRelation());
    roleConstraintEClass.getESuperTypes().add(this.getConstraint());
    relationshipConstraintEClass.getESuperTypes().add(this.getConstraint());
    intraRelationshipConstraintEClass.getESuperTypes().add(this.getRelationshipConstraint());
    interRelationshipConstraintEClass.getESuperTypes().add(this.getRelationshipConstraint());
    complexConstraintEClass.getESuperTypes().add(this.getConstraint());
    dataInheritanceEClass.getESuperTypes().add(this.getInheritance());
    naturalInheritanceEClass.getESuperTypes().add(this.getInheritance());
    compartmentInheritanceEClass.getESuperTypes().add(this.getInheritance());
    roleInheritanceEClass.getESuperTypes().add(this.getInheritance());
    relationshipImplicationEClass.getESuperTypes().add(this.getInterRelationshipConstraint());
    relationTargetEClass.getESuperTypes().add(this.getNamedElement());
    irreflexiveEClass.getESuperTypes().add(this.getIntraRelationshipConstraint());
    cyclicEClass.getESuperTypes().add(this.getIntraRelationshipConstraint());
    totalEClass.getESuperTypes().add(this.getIntraRelationshipConstraint());
    abstractRoleEClass.getESuperTypes().add(this.getRoleGroupElement());
    roleGroupEClass.getESuperTypes().add(this.getAbstractRole());
    roleGroupEClass.getESuperTypes().add(this.getRelationTarget());
    roleGroupEClass.getESuperTypes().add(this.getAbstractRoleModel());
    roleImplicationEClass.getESuperTypes().add(this.getRoleConstraint());
    roleEquivalenceEClass.getESuperTypes().add(this.getRoleConstraint());
    roleProhibitionEClass.getESuperTypes().add(this.getRoleConstraint());
    typedElementEClass.getESuperTypes().add(this.getNamedElement());
    parthoodConstraintEClass.getESuperTypes().add(this.getIntraRelationshipConstraint());
    abstractRoleRefEClass.getESuperTypes().add(this.getRoleGroupElement());

    // Initialize classes, features, and operations; add parameters
    initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1,
        NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelElement_Container(), this.getElementModel(),
        this.getElementModel_Elements(), "container", null, 1, 1, ModelElement.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Relations(), this.getRelation(), this.getRelation_RelationContainer(),
        "relations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementModelEClass, ElementModel.class, "ElementModel", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementModel_Elements(), this.getModelElement(),
        this.getModelElement_Container(), "elements", null, 0, -1, ElementModel.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractRoleModelEClass, AbstractRoleModel.class, "AbstractRoleModel", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractRoleModel_Abstractroles(), this.getAbstractRole(),
        this.getAbstractRole_Parent(), "abstractroles", null, 0, -1, AbstractRoleModel.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rigidTypeEClass, RigidType.class, "RigidType", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelation_RelationContainer(), this.getModel(), this.getModel_Relations(),
        "relationContainer", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getRelation_Dim1BP(), this.getPoint(), "dim1BP", null, 0, -1, Relation.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getRelation_Dim2BP(), this.getPoint(), "dim2BP", null, 0, -1, Relation.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getRelation_Target(), this.getRelationTarget(),
        this.getRelationTarget_Incoming(), "target", null, 0, 1, Relation.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_Source(), this.getRelationTarget(),
        this.getRelationTarget_Outgoing(), "source", null, 0, 1, Relation.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Owneroperation(), this.getOperation(), this.getOperation_Params(),
        "owneroperation", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperation_Owner(), this.getType(), this.getType_Operations(), "owner", null,
        1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Operation(), ecorePackage.getEString(), "operation", "<...>", 0, 1,
        Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Params(), this.getParameter(), this.getParameter_Owneroperation(),
        "params", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttribute_Owner(), this.getType(), this.getType_Attributes(), "owner", null,
        1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getType_Attributes(), this.getAttribute(), this.getAttribute_Owner(),
        "attributes", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Operations(), this.getOperation(), this.getOperation_Owner(),
        "operations", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataType_Serializable(), ecorePackage.getEBoolean(), "serializable", null, 1,
        1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataType_Tr_extends(), this.getDataType(), null, "tr_extends", null, 0, 1,
        DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(naturalTypeEClass, NaturalType.class, "NaturalType", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNaturalType_Tr_extends(), this.getNaturalType(), null, "tr_extends", null, 0,
        1, NaturalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compartmentTypeEClass, CompartmentType.class, "CompartmentType", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCompartmentType_IsExpand(), ecorePackage.getEBoolean(), "isExpand", null, 0,
        1, CompartmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
        !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompartmentType_Parts(), this.getPart(), this.getPart_Whole(), "parts", null,
        0, -1, CompartmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompartmentType_Relationships(), this.getRelationship(), null,
        "relationships", null, 0, -1, CompartmentType.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getCompartmentType_Constraints(), this.getConstraint(),
        this.getConstraint_OwnerCompartment(), "constraints", null, 0, -1, CompartmentType.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompartmentType_Tr_extends(), this.getCompartmentType(), null, "tr_extends",
        null, 0, 1, CompartmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(antiRigidTypeEClass, AntiRigidType.class, "AntiRigidType", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(roleTypeEClass, RoleType.class, "RoleType", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoleType_Tr_extends(), this.getRoleType(), null, "tr_extends", null, 0, 1,
        RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelationship_SecondParthood(), this.getParthood(), "secondParthood",
        "Unconstrained", 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationship_SecondLower(), ecorePackage.getEInt(), "secondLower", "0", 1, 1,
        Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationship_FirstLower(), ecorePackage.getEInt(), "firstLower", "0", 1, 1,
        Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationship_FirstUpper(), ecorePackage.getEInt(), "firstUpper", "1", 1, 1,
        Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationship_SecondUpper(), ecorePackage.getEInt(), "secondUpper", "1", 1, 1,
        Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationship_FirstParthood(), this.getParthood(), "firstParthood",
        "Unconstrained", 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationship_SourceLabel(), this.getRelationLabel(), null, "sourceLabel",
        null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationship_TargetLabel(), this.getRelationLabel(), null, "targetLabel",
        null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationship_FirstLowerUpper(), ecorePackage.getEString(), "firstLowerUpper",
        null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
        !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationship_SecondLowerUpper(), ecorePackage.getEString(),
        "secondLowerUpper", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationship_RlshipConstraints(), this.getRelationshipConstraint(),
        this.getRelationshipConstraint_Relation(), "rlshipConstraints", null, 0, -1,
        Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationship_Direction(), this.getDirection(), "direction", null, 1, 1,
        Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationship_First(), this.getPlace(), null, "first", null, 1, 1,
        Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationship_Second(), this.getPlace(), null, "second", null, 1, 1,
        Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fulfillmentEClass, Fulfillment.class, "Fulfillment", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFulfillment_FulfilledRoles(), this.getAbstractRole(),
        this.getAbstractRole_Fulfillment(), "fulfilledRoles", null, 0, -1, Fulfillment.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFulfillment_Filler(), this.getRigidType(), null, "filler", null, 1, 1,
        Fulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstraint_OwnerCompartment(), this.getCompartmentType(),
        this.getCompartmentType_Constraints(), "ownerCompartment", null, 1, 1, Constraint.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleConstraintEClass, RoleConstraint.class, "RoleConstraint", IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoleConstraint_Ends(), this.getRoleType(), null, "ends", null, 2, 2,
        RoleConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoleConstraint_Second(), this.getAbstractRole(), null, "second", null, 1, 1,
        RoleConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoleConstraint_First(), this.getAbstractRole(), null, "first", null, 1, 1,
        RoleConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipConstraintEClass, RelationshipConstraint.class,
        "RelationshipConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationshipConstraint_Relation(), this.getRelationship(),
        this.getRelationship_RlshipConstraints(), "relation", null, 1, 1,
        RelationshipConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intraRelationshipConstraintEClass, IntraRelationshipConstraint.class,
        "IntraRelationshipConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interRelationshipConstraintEClass, InterRelationshipConstraint.class,
        "InterRelationshipConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterRelationshipConstraint_First(), this.getRelationship(), null, "first",
        null, 1, 1, InterRelationshipConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterRelationshipConstraint_Second(), this.getRelationship(), null, "second",
        null, 1, 1, InterRelationshipConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexConstraintEClass, ComplexConstraint.class, "ComplexConstraint", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComplexConstraint_Targets(), this.getAbstractRole(), null, "targets", null,
        1, -1, ComplexConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComplexConstraint_Expression(), ecorePackage.getEString(), "expression",
        null, 0, 1, ComplexConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataInheritanceEClass, DataInheritance.class, "DataInheritance", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataInheritance_Super(), this.getDataType(), null, "super", null, 1, 1,
        DataInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataInheritance_Sub(), this.getDataType(), null, "sub", null, 1, 1,
        DataInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(naturalInheritanceEClass, NaturalInheritance.class, "NaturalInheritance",
        !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNaturalInheritance_Super(), this.getNaturalType(), null, "super", null, 1, 1,
        NaturalInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNaturalInheritance_Sub(), this.getNaturalType(), null, "sub", null, 1, 1,
        NaturalInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compartmentInheritanceEClass, CompartmentInheritance.class,
        "CompartmentInheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompartmentInheritance_Sub(), this.getCompartmentType(), null, "sub", null,
        1, 1, CompartmentInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompartmentInheritance_Super(), this.getCompartmentType(), null, "super",
        null, 1, 1, CompartmentInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleInheritanceEClass, RoleInheritance.class, "RoleInheritance", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoleInheritance_Sub(), this.getRoleType(), null, "sub", null, 1, 1,
        RoleInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoleInheritance_Super(), this.getRoleType(), null, "super", null, 1, 1,
        RoleInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlace_Lower(), ecorePackage.getEInt(), "lower", null, 1, 1, Place.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getPlace_Upper(), ecorePackage.getEInt(), "upper", null, 1, 1, Place.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getPlace_Holder(), this.getRoleType(), null, "holder", null, 1, 1, Place.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipImplicationEClass, RelationshipImplication.class,
        "RelationshipImplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationTargetEClass, RelationTarget.class, "RelationTarget", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationTarget_Incoming(), this.getRelation(), this.getRelation_Target(),
        "incoming", null, 0, -1, RelationTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationTarget_Outgoing(), this.getRelation(), this.getRelation_Source(),
        "outgoing", null, 0, -1, RelationTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationTarget_Boundaries(), this.getRectangle(), "boundaries", null, 0, 1,
        RelationTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(irreflexiveEClass, Irreflexive.class, "Irreflexive", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(cyclicEClass, Cyclic.class, "Cyclic", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(totalEClass, Total.class, "Total", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractRoleEClass, AbstractRole.class, "AbstractRole", IS_ABSTRACT, IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractRole_Fulfillment(), this.getFulfillment(),
        this.getFulfillment_FulfilledRoles(), "fulfillment", null, 1, 1, AbstractRole.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractRole_Parent(), this.getAbstractRoleModel(),
        this.getAbstractRoleModel_Abstractroles(), "parent", null, 1, 1, AbstractRole.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleGroupEClass, RoleGroup.class, "RoleGroup", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRoleGroup_Lower(), ecorePackage.getEInt(), "lower", "0", 1, 1,
        RoleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRoleGroup_Upper(), ecorePackage.getEInt(), "upper", "-1", 1, 1,
        RoleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleImplicationEClass, RoleImplication.class, "RoleImplication", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(roleEquivalenceEClass, RoleEquivalence.class, "RoleEquivalence", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(roleProhibitionEClass, RoleProhibition.class, "RoleProhibition", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPart_Lower(), ecorePackage.getEInt(), "lower", null, 1, 1, Part.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getPart_Upper(), ecorePackage.getEInt(), "upper", null, 1, 1, Part.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getPart_Whole(), this.getCompartmentType(), this.getCompartmentType_Parts(),
        "whole", null, 1, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPart_Role(), this.getAbstractRole(), null, "role", null, 1, 1, Part.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypedElement_Type(), this.getRigidType(), null, "type", null, 1, 1,
        TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parthoodConstraintEClass, ParthoodConstraint.class, "ParthoodConstraint",
        !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParthoodConstraint_Kind(), this.getParthood(), "kind", null, 1, 1,
        ParthoodConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
        !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleGroupElementEClass, RoleGroupElement.class, "RoleGroupElement", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractRoleRefEClass, AbstractRoleRef.class, "AbstractRoleRef", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractRoleRef_Ref(), this.getAbstractRole(), null, "ref", null, 1, 1,
        AbstractRoleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationLabelEClass, RelationLabel.class, "RelationLabel", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelationLabel_Label(), ecorePackage.getEString(), "label", "0..1", 1, 1,
        RelationLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationLabel_IsRelationEnd(), ecorePackage.getEBoolean(), "isRelationEnd",
        null, 1, 1, RelationLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(directionEEnum, Direction.class, "Direction");
    addEEnumLiteral(directionEEnum, Direction.UNDIRECTED);
    addEEnumLiteral(directionEEnum, Direction.FIRST_TO_SECOND);
    addEEnumLiteral(directionEEnum, Direction.SECOND_TO_FIRST);

    initEEnum(parthoodEEnum, Parthood.class, "Parthood");
    addEEnumLiteral(parthoodEEnum, Parthood.UNCONSTRAINED);
    addEEnumLiteral(parthoodEEnum, Parthood.EXCLUSIVE_PART);
    addEEnumLiteral(parthoodEEnum, Parthood.SHARABLE_PART);
    addEEnumLiteral(parthoodEEnum, Parthood.ESSENTIAL_PART);
    addEEnumLiteral(parthoodEEnum, Parthood.MANDATORY_PART);
    addEEnumLiteral(parthoodEEnum, Parthood.INSEPERABLE_PART);

    // Initialize data types
    initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE,
        !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE,
        !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //OrmPackageImpl
