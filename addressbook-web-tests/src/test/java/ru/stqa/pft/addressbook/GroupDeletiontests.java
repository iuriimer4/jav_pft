package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupDeletiontests extends TestBase {

  @Test
  public void testGroupDeletion() {
    goToGroupPage();
    selectGroup();
    deleteselectedGroups();
   returnToGroupPage();
  }

}
