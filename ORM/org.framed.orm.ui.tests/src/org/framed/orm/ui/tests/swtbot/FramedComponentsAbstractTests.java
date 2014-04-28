package org.framed.orm.ui.tests.swtbot;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class FramedComponentsAbstractTests {

  protected static String MY_TEST_PROJECT = "FramedTestProject";

  protected static SWTWorkbenchBot bot;

  @BeforeClass
  public static void beforeClass() throws Exception {
    bot = new SWTWorkbenchBot();

    closeWelcomePage();
  }

  @AfterClass
  public static void afterClass() throws Exception {
    bot.resetWorkbench();
  }

  protected static void closeWelcomePage() {
    bot.viewByTitle("Welcome").close();
  }

  protected void createTestProject() {
    createProjectInWorkspace("General", "Project", MY_TEST_PROJECT);
  }

  protected void createProjectInWorkspace(String category, String projectType, String projectName) {
    SWTBotShell shell = createNewProjectWizard(category, projectType, projectName);

    bot.button("Finish").click();
    // assert project exists
  }

  protected SWTBotShell createNewProjectWizard(String category, String projectType,
      String projectName) {
    bot.menu("File").menu("New").menu("Project...").click();

    SWTBotShell shell = bot.shell("New Project");
    shell.setFocus();

    bot.text().setText("Project");

    bot.waitUntil(new NodeAvailableAndSelect(bot.tree(), category, projectName));

    bot.button("Next >").click();
    bot.textWithLabel("Project name:").setText(projectName);
    return shell;
  }

  private static class NodeAvailableAndSelect extends DefaultCondition {

    private SWTBotTree tree;
    private String parent;
    private String node;

    public NodeAvailableAndSelect(SWTBotTree tree, String parent, String node) {
      this.tree = tree;
      this.parent = parent;
      this.node = node;
    }

    @Override
    public boolean test() {
      try {
        SWTBotTreeItem parentNode = tree.getTreeItem(parent);
        parentNode.getNode(node).select();
      } catch (WidgetNotFoundException e) {
        return false;
      }
      return true;
    }

    @Override
    public String getFailureMessage() {
      return "Timed out waiting for " + node;
    }
  }
}
