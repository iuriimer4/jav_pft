package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
    
    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().createContact(new ContactData("dave",
                "gahan",
                "5511 N Chester ave",
                "7565655656",
                "test1"), true);
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("dave",
                "gahan",
                "5511 N Chester ave",
                "7565655656",
                "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }

}
