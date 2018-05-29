package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
    
    @Test
    public void testContactCreation() {
        app.getNavigationHelper().goToContactPage();
        app.getContactHelper().fillContactForm(new ContactData("dave", "gahan", "5511 N Chester ave", "7565655656"));
        app.getContactHelper().submitContactCreation();
    }

}
