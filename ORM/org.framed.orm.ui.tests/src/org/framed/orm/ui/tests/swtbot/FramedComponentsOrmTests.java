package org.framed.orm.ui.tests.swtbot;

import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class FramedComponentsOrmTests extends FramedComponentsAbstractTests {

  @Test
  public void canCreateNewModelFile() throws Exception {

    createTestProject();

    SWTBotShell shell =
        createNewOrmModelFileWizard(ORM_WIZARD_CATEGORY, MY_TEST_PROJECT, "Orm Model", "My.orm");

    bot.waitUntil(Conditions.shellCloses(shell));
  }
}
