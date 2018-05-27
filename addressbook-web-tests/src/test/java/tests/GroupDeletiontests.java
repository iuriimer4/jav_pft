package tests;

import org.testng.annotations.Test;

public class GroupDeletiontests extends TestBase {

  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteselectedGroups();
   app.getGroupHelper().returnToGroupPage();
  }

}
