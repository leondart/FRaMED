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
import org.framed.orm.model.Acyclic;
import org.framed.orm.model.Attribute;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.ComplexConstraint;
import org.framed.orm.model.Constraint;
import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.Inheritance;
import org.framed.orm.model.Irreflexive;
import org.framed.orm.model.Method;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.Node;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Parthood;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RelationLabel;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.model.RoleConstraint;
import org.framed.orm.model.RoleEquivalence;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleImplication;
import org.framed.orm.model.RoleInvariant;
import org.framed.orm.model.RoleProhibition;
import org.framed.orm.model.RoleType;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.model.Total;
import org.framed.orm.model.Type;

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
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

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
  private EClass compartmentDiagramEClass = null;

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
  private EClass compartmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeEClass = null;

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
  private EClass containerEClass = null;

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
  private EClass rolemodelEClass = null;

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
  private EClass fulfillmentEClass = null;

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
  private EClass acyclicEClass = null;

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
  private EClass relationshipEClass = null;

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
  private EClass irreflexiveEClass = null;

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
  private EClass relationshipConstraintEClass = null;

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
  private EClass roleInvariantEClass = null;

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
  private EClass complexConstraintEClass = null;

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
  public EClass getAttribute() {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Type() {
    return (EReference) attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name() {
    return (EAttribute) attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod() {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Type() {
    return (EReference) methodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Name() {
    return (EAttribute) methodEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getType_IsExpand() {
    return (EAttribute) typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompartmentDiagram() {
    return compartmentDiagramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompartmentDiagram_Compartments() {
    return (EReference) compartmentDiagramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompartmentDiagram_Groups() {
    return (EReference) compartmentDiagramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompartmentDiagram_Players() {
    return (EReference) compartmentDiagramEClass.getEStructuralFeatures().get(2);
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
  public EClass getCompartment() {
    return compartmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompartment_Rolemodel() {
    return (EReference) compartmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGrouping() {
    return groupingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrouping_Rolemodel() {
    return (EReference) groupingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNode() {
    return nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_IncomingLinks() {
    return (EReference) nodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_OutgoingLinks() {
    return (EReference) nodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNode_Name() {
    return (EAttribute) nodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNode_Constraints() {
    return (EAttribute) nodeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Container() {
    return (EReference) nodeEClass.getEStructuralFeatures().get(4);
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
  public EClass getContainer() {
    return containerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_Relations() {
    return (EReference) containerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_Nodes() {
    return (EReference) containerEClass.getEStructuralFeatures().get(1);
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
  public EReference getRoleGroup_Items() {
    return (EReference) roleGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRoleGroup_Upper() {
    return (EAttribute) roleGroupEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRolemodel() {
    return rolemodelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRolemodel_Subcontexts() {
    return (EReference) rolemodelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRolemodel_Participants() {
    return (EReference) rolemodelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRolemodel_Players() {
    return (EReference) rolemodelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRolemodel_Compartment() {
    return (EReference) rolemodelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRolemodel_ParentGroup() {
    return (EReference) rolemodelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRolemodel_Groups() {
    return (EReference) rolemodelEClass.getEStructuralFeatures().get(5);
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
  public EClass getFulfillment() {
    return fulfillmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFulfillment_FulfilledRoles() {
    return (EAttribute) fulfillmentEClass.getEStructuralFeatures().get(0);
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
  public EClass getAcyclic() {
    return acyclicEClass;
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
  public EReference getRelationship_RlshipConstraints() {
    return (EReference) relationshipEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationship_SourceLabel() {
    return (EReference) relationshipEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationship_TargetLabel() {
    return (EReference) relationshipEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationship_FirstLowerUpper() {
    return (EAttribute) relationshipEClass.getEStructuralFeatures().get(9);
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
  public EClass getIrreflexive() {
    return irreflexiveEClass;
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
  public EReference getRelation_Target() {
    return (EReference) relationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_Source() {
    return (EReference) relationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_Dim1BP() {
    return (EAttribute) relationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_Dim2BP() {
    return (EAttribute) relationEClass.getEStructuralFeatures().get(4);
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
  public EClass getRoleInvariant() {
    return roleInvariantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoleInvariant_Subject() {
    return (EReference) roleInvariantEClass.getEStructuralFeatures().get(0);
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
  public EReference getAbstractRole_First() {
    return (EReference) abstractRoleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractRole_Second() {
    return (EReference) abstractRoleEClass.getEStructuralFeatures().get(1);
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
  public EReference getComplexConstraint_Groups() {
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
    attributeEClass = createEClass(ATTRIBUTE);
    createEReference(attributeEClass, ATTRIBUTE__TYPE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);

    methodEClass = createEClass(METHOD);
    createEReference(methodEClass, METHOD__TYPE);
    createEAttribute(methodEClass, METHOD__NAME);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__ATTRIBUTES);
    createEReference(typeEClass, TYPE__OPERATIONS);
    createEAttribute(typeEClass, TYPE__IS_EXPAND);

    compartmentDiagramEClass = createEClass(COMPARTMENT_DIAGRAM);
    createEReference(compartmentDiagramEClass, COMPARTMENT_DIAGRAM__COMPARTMENTS);
    createEReference(compartmentDiagramEClass, COMPARTMENT_DIAGRAM__GROUPS);
    createEReference(compartmentDiagramEClass, COMPARTMENT_DIAGRAM__PLAYERS);

    naturalTypeEClass = createEClass(NATURAL_TYPE);

    compartmentEClass = createEClass(COMPARTMENT);
    createEReference(compartmentEClass, COMPARTMENT__ROLEMODEL);

    groupingEClass = createEClass(GROUPING);
    createEReference(groupingEClass, GROUPING__ROLEMODEL);

    nodeEClass = createEClass(NODE);
    createEReference(nodeEClass, NODE__INCOMING_LINKS);
    createEReference(nodeEClass, NODE__OUTGOING_LINKS);
    createEAttribute(nodeEClass, NODE__NAME);
    createEAttribute(nodeEClass, NODE__CONSTRAINTS);
    createEReference(nodeEClass, NODE__CONTAINER);

    roleTypeEClass = createEClass(ROLE_TYPE);

    containerEClass = createEClass(CONTAINER);
    createEReference(containerEClass, CONTAINER__RELATIONS);
    createEReference(containerEClass, CONTAINER__NODES);

    roleGroupEClass = createEClass(ROLE_GROUP);
    createEAttribute(roleGroupEClass, ROLE_GROUP__LOWER);
    createEReference(roleGroupEClass, ROLE_GROUP__ITEMS);
    createEAttribute(roleGroupEClass, ROLE_GROUP__UPPER);

    rolemodelEClass = createEClass(ROLEMODEL);
    createEReference(rolemodelEClass, ROLEMODEL__SUBCONTEXTS);
    createEReference(rolemodelEClass, ROLEMODEL__PARTICIPANTS);
    createEReference(rolemodelEClass, ROLEMODEL__PLAYERS);
    createEReference(rolemodelEClass, ROLEMODEL__COMPARTMENT);
    createEReference(rolemodelEClass, ROLEMODEL__PARENT_GROUP);
    createEReference(rolemodelEClass, ROLEMODEL__GROUPS);

    totalEClass = createEClass(TOTAL);

    fulfillmentEClass = createEClass(FULFILLMENT);
    createEAttribute(fulfillmentEClass, FULFILLMENT__FULFILLED_ROLES);

    roleEquivalenceEClass = createEClass(ROLE_EQUIVALENCE);

    acyclicEClass = createEClass(ACYCLIC);

    inheritanceEClass = createEClass(INHERITANCE);

    relationshipEClass = createEClass(RELATIONSHIP);
    createEAttribute(relationshipEClass, RELATIONSHIP__SECOND_PARTHOOD);
    createEAttribute(relationshipEClass, RELATIONSHIP__SECOND_LOWER);
    createEAttribute(relationshipEClass, RELATIONSHIP__FIRST_LOWER);
    createEAttribute(relationshipEClass, RELATIONSHIP__FIRST_UPPER);
    createEAttribute(relationshipEClass, RELATIONSHIP__SECOND_UPPER);
    createEAttribute(relationshipEClass, RELATIONSHIP__FIRST_PARTHOOD);
    createEReference(relationshipEClass, RELATIONSHIP__RLSHIP_CONSTRAINTS);
    createEReference(relationshipEClass, RELATIONSHIP__SOURCE_LABEL);
    createEReference(relationshipEClass, RELATIONSHIP__TARGET_LABEL);
    createEAttribute(relationshipEClass, RELATIONSHIP__FIRST_LOWER_UPPER);

    roleProhibitionEClass = createEClass(ROLE_PROHIBITION);

    irreflexiveEClass = createEClass(IRREFLEXIVE);

    roleImplicationEClass = createEClass(ROLE_IMPLICATION);

    relationshipConstraintEClass = createEClass(RELATIONSHIP_CONSTRAINT);
    createEReference(relationshipConstraintEClass, RELATIONSHIP_CONSTRAINT__RELATION);

    relationEClass = createEClass(RELATION);
    createEReference(relationEClass, RELATION__RELATION_CONTAINER);
    createEReference(relationEClass, RELATION__TARGET);
    createEReference(relationEClass, RELATION__SOURCE);
    createEAttribute(relationEClass, RELATION__DIM1_BP);
    createEAttribute(relationEClass, RELATION__DIM2_BP);

    constraintEClass = createEClass(CONSTRAINT);

    roleConstraintEClass = createEClass(ROLE_CONSTRAINT);
    createEReference(roleConstraintEClass, ROLE_CONSTRAINT__ENDS);
    createEReference(roleConstraintEClass, ROLE_CONSTRAINT__SECOND);
    createEReference(roleConstraintEClass, ROLE_CONSTRAINT__FIRST);

    roleInvariantEClass = createEClass(ROLE_INVARIANT);
    createEReference(roleInvariantEClass, ROLE_INVARIANT__SUBJECT);

    abstractRoleEClass = createEClass(ABSTRACT_ROLE);
    createEReference(abstractRoleEClass, ABSTRACT_ROLE__FIRST);
    createEReference(abstractRoleEClass, ABSTRACT_ROLE__SECOND);

    complexConstraintEClass = createEClass(COMPLEX_CONSTRAINT);
    createEReference(complexConstraintEClass, COMPLEX_CONSTRAINT__GROUPS);
    createEAttribute(complexConstraintEClass, COMPLEX_CONSTRAINT__EXPRESSION);

    relationLabelEClass = createEClass(RELATION_LABEL);
    createEAttribute(relationLabelEClass, RELATION_LABEL__LABEL);
    createEAttribute(relationLabelEClass, RELATION_LABEL__IS_RELATION_END);

    // Create enums
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
    typeEClass.getESuperTypes().add(this.getNode());
    compartmentDiagramEClass.getESuperTypes().add(this.getContainer());
    naturalTypeEClass.getESuperTypes().add(this.getType());
    compartmentEClass.getESuperTypes().add(this.getType());
    groupingEClass.getESuperTypes().add(this.getNode());
    roleTypeEClass.getESuperTypes().add(this.getType());
    roleTypeEClass.getESuperTypes().add(this.getAbstractRole());
    roleGroupEClass.getESuperTypes().add(this.getAbstractRole());
    roleGroupEClass.getESuperTypes().add(this.getNode());
    roleGroupEClass.getESuperTypes().add(this.getContainer());
    rolemodelEClass.getESuperTypes().add(this.getContainer());
    totalEClass.getESuperTypes().add(this.getRelationshipConstraint());
    fulfillmentEClass.getESuperTypes().add(this.getRelation());
    roleEquivalenceEClass.getESuperTypes().add(this.getRoleConstraint());
    acyclicEClass.getESuperTypes().add(this.getRelationshipConstraint());
    inheritanceEClass.getESuperTypes().add(this.getRelation());
    relationshipEClass.getESuperTypes().add(this.getRelation());
    roleProhibitionEClass.getESuperTypes().add(this.getRoleConstraint());
    irreflexiveEClass.getESuperTypes().add(this.getRelationshipConstraint());
    roleImplicationEClass.getESuperTypes().add(this.getRoleConstraint());
    relationshipConstraintEClass.getESuperTypes().add(this.getConstraint());
    constraintEClass.getESuperTypes().add(this.getRelation());
    roleConstraintEClass.getESuperTypes().add(this.getConstraint());
    roleInvariantEClass.getESuperTypes().add(this.getConstraint());
    abstractRoleEClass.getESuperTypes().add(this.getConstraint());
    complexConstraintEClass.getESuperTypes().add(this.getConstraint());

    // Initialize classes, features, and operations; add parameters
    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttribute_Type(), this.getType(), this.getType_Attributes(), "type", null, 0,
        1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "Name", "<...>", 0, 1,
        Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethod_Type(), this.getType(), this.getType_Operations(), "type", null, 0, 1,
        Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Name(), ecorePackage.getEString(), "Name", "<...>", 0, 1,
        Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getType_Attributes(), this.getAttribute(), this.getAttribute_Type(),
        "attributes", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Operations(), this.getMethod(), this.getMethod_Type(), "operations",
        null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_IsExpand(), ecorePackage.getEBoolean(), "isExpand", null, 0, 1,
        Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(compartmentDiagramEClass, CompartmentDiagram.class, "CompartmentDiagram",
        !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompartmentDiagram_Compartments(), this.getCompartment(), null,
        "compartments", null, 0, -1, CompartmentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getCompartmentDiagram_Groups(), this.getGrouping(), null, "groups", null, 0, -1,
        CompartmentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompartmentDiagram_Players(), this.getNaturalType(), null, "players", null,
        0, -1, CompartmentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(naturalTypeEClass, NaturalType.class, "NaturalType", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(compartmentEClass, Compartment.class, "Compartment", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompartment_Rolemodel(), this.getRolemodel(),
        this.getRolemodel_Compartment(), "rolemodel", null, 1, 1, Compartment.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(groupingEClass, Grouping.class, "Grouping", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGrouping_Rolemodel(), this.getRolemodel(), this.getRolemodel_ParentGroup(),
        "rolemodel", null, 1, 1, Grouping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNode_IncomingLinks(), this.getRelation(), this.getRelation_Target(),
        "incomingLinks", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_OutgoingLinks(), this.getRelation(), this.getRelation_Source(),
        "outgoingLinks", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNode_Name(), ecorePackage.getEString(), "Name", "<...>", 0, 1, Node.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getNode_Constraints(), this.getRectangle(), "constraints", null, 0, 1,
        Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Container(), this.getContainer(), this.getContainer_Nodes(),
        "Container", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleTypeEClass, RoleType.class, "RoleType", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(containerEClass, org.framed.orm.model.Container.class, "Container", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainer_Relations(), this.getRelation(),
        this.getRelation_RelationContainer(), "relations", null, 0, -1,
        org.framed.orm.model.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_Nodes(), this.getNode(), this.getNode_Container(), "nodes", null,
        0, -1, org.framed.orm.model.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleGroupEClass, RoleGroup.class, "RoleGroup", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRoleGroup_Lower(), ecorePackage.getEInt(), "lower", "0", 1, 1,
        RoleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRoleGroup_Items(), this.getAbstractRole(), null, "items", null, 0, -1,
        RoleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRoleGroup_Upper(), ecorePackage.getEInt(), "upper", "-1", 1, 1,
        RoleGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rolemodelEClass, Rolemodel.class, "Rolemodel", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRolemodel_Subcontexts(), this.getCompartment(), null, "subcontexts", null, 0,
        -1, Rolemodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRolemodel_Participants(), this.getAbstractRole(), null, "participants", null,
        0, -1, Rolemodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRolemodel_Players(), this.getNaturalType(), null, "players", null, 0, -1,
        Rolemodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRolemodel_Compartment(), this.getCompartment(),
        this.getCompartment_Rolemodel(), "compartment", null, 0, 1, Rolemodel.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getRolemodel_ParentGroup(), this.getGrouping(), this.getGrouping_Rolemodel(),
        "parentGroup", null, 0, 1, Rolemodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRolemodel_Groups(), this.getGrouping(), null, "groups", null, 0, -1,
        Rolemodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(totalEClass, Total.class, "Total", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(fulfillmentEClass, Fulfillment.class, "Fulfillment", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFulfillment_FulfilledRoles(), ecorePackage.getEString(), "fulfilledRoles",
        null, 0, -1, Fulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
        !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleEquivalenceEClass, RoleEquivalence.class, "RoleEquivalence", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(acyclicEClass, Acyclic.class, "Acyclic", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

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
    initEReference(getRelationship_RlshipConstraints(), this.getRelationshipConstraint(),
        this.getRelationshipConstraint_Relation(), "rlshipConstraints", null, 0, -1,
        Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationship_SourceLabel(), this.getRelationLabel(), null, "sourceLabel",
        null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationship_TargetLabel(), this.getRelationLabel(), null, "targetLabel",
        null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationship_FirstLowerUpper(), ecorePackage.getEString(), "firstLowerUpper",
        null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
        !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleProhibitionEClass, RoleProhibition.class, "RoleProhibition", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(irreflexiveEClass, Irreflexive.class, "Irreflexive", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    initEClass(roleImplicationEClass, RoleImplication.class, "RoleImplication", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationshipConstraintEClass, RelationshipConstraint.class,
        "RelationshipConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationshipConstraint_Relation(), this.getRelationship(),
        this.getRelationship_RlshipConstraints(), "relation", null, 1, 1,
        RelationshipConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelation_RelationContainer(), this.getContainer(),
        this.getContainer_Relations(), "relationContainer", null, 0, 1, Relation.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_Target(), this.getNode(), this.getNode_IncomingLinks(), "target",
        null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_Source(), this.getNode(), this.getNode_OutgoingLinks(), "source",
        null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelation_Dim1BP(), this.getPoint(), "dim1BP", null, 0, -1, Relation.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getRelation_Dim2BP(), this.getPoint(), "dim2BP", null, 0, -1, Relation.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

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

    initEClass(roleInvariantEClass, RoleInvariant.class, "RoleInvariant", IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoleInvariant_Subject(), this.getAbstractRole(), null, "subject", null, 1, 1,
        RoleInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractRoleEClass, AbstractRole.class, "AbstractRole", IS_ABSTRACT, IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractRole_First(), this.getRoleType(), null, "first", null, 1, 1,
        AbstractRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractRole_Second(), this.getRoleType(), null, "second", null, 1, 1,
        AbstractRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexConstraintEClass, ComplexConstraint.class, "ComplexConstraint", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComplexConstraint_Groups(), this.getRoleGroup(), null, "groups", null, 1, -1,
        ComplexConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComplexConstraint_Expression(), ecorePackage.getEString(), "expression",
        null, 0, 1, ComplexConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationLabelEClass, RelationLabel.class, "RelationLabel", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelationLabel_Label(), ecorePackage.getEString(), "label", "0..1", 1, 1,
        RelationLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationLabel_IsRelationEnd(), ecorePackage.getEBoolean(), "isRelationEnd",
        null, 1, 1, RelationLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(parthoodEEnum, Parthood.class, "Parthood");
    addEEnumLiteral(parthoodEEnum, Parthood.UNCONSTRAINED);
    addEEnumLiteral(parthoodEEnum, Parthood.SHARABLE_PART);
    addEEnumLiteral(parthoodEEnum, Parthood.MANDATORY_PART);
    addEEnumLiteral(parthoodEEnum, Parthood.ESSENTIAL_PART);
    addEEnumLiteral(parthoodEEnum, Parthood.EXCLUSIVE_PART);
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
