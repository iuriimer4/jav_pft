package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    if(! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("dave",
              "gahan",
              "5511 N Chester ave",
              "7565655656",
              "test1"), true);
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Man",
                    "Petrov",
                    "59 S HALE St",
                    "7774555555",
                    "null"),
            false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();

  }


}
