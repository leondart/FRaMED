package org.framed.orm.ui.tests;


import org.framed.orm.ui.tests.action.FulfillRolesActionTest;
import org.framed.orm.ui.tests.action.StepActionTest;
import org.framed.orm.ui.tests.command.FulfillRolesCommandTest;
import org.framed.orm.ui.tests.command.ORMAddCommandTest;
import org.framed.orm.ui.tests.command.ORMOrphanChildCommandTest;
import org.framed.orm.ui.tests.command.StepCommandTest;
import org.framed.orm.ui.tests.command.shape.ORMShapeChangeBoundariesCommandTest;
import org.framed.orm.ui.tests.command.shape.ORMShapeCreateCommandTest;
import org.framed.orm.ui.tests.editPart.ORMEditPartFactoryTest;
import org.framed.orm.ui.tests.editPart.ORMModelEditPartTest;
import org.framed.orm.ui.tests.editPolicy.ORMAbstractXYLayoutPolicyTest;
import org.framed.orm.ui.tests.editPolicy.ORMModelXYLayoutPolicyTest;
import org.framed.orm.ui.tests.factory.ORMCompartmentTypeFactoryTest;
import org.framed.orm.ui.tests.factory.ORMGroupFactoryTest;
import org.framed.orm.ui.tests.factory.ORMNaturalTypeFactoryTest;
import org.framed.orm.ui.tests.factory.ORMRoleGroupFactoryTest;
import org.framed.orm.ui.tests.factory.ORMRoleTypeFactoryTest;
import org.framed.orm.ui.tests.figures.ORMFigureFactoryTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ORMAddCommandTest.class, ORMOrphanChildCommandTest.class,
    ORMShapeChangeBoundariesCommandTest.class, ORMShapeCreateCommandTest.class,
    ORMEditPartFactoryTest.class, ORMModelEditPartTest.class, ORMAbstractXYLayoutPolicyTest.class,
    ORMModelXYLayoutPolicyTest.class, ORMCompartmentTypeFactoryTest.class,
    ORMGroupFactoryTest.class, ORMNaturalTypeFactoryTest.class, ORMRoleGroupFactoryTest.class,
    ORMRoleTypeFactoryTest.class, ORMFigureFactoryTest.class, StepActionTest.class,
    StepCommandTest.class, FulfillRolesActionTest.class, FulfillRolesCommandTest.class})
public class FramedAllJUnitTests {

}
