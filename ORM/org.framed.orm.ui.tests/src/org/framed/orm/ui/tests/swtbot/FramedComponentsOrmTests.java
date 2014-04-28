package org.framed.orm.ui.tests.swtbot;

import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class FramedComponentsOrmTests extends FramedComponentsAbstractTests {

  private static String TEST_PROJECT_NAME = "junit-plugin-test";

  @Test
  public void canCreateNewModelFile() throws Exception {

    createTestProject();

    bot.menu("File").menu("New").menu("Other...").click();

    SWTBotShell shell = bot.shell("New");
    shell.activate();

    bot.tree().expandNode("Example EMF Model Creation Wizards").select("Orm Model");
    bot.button("Next >").click();

    bot.textWithLabel("Enter or select the parent folder:").setText(TEST_PROJECT_NAME);
    bot.button("Next >").click();

    bot.comboBox("Model Object").setSelection("Compartment Diagram");
    bot.button("Finish").click();

    bot.waitUntil(Conditions.shellCloses(shell));
  }
}
