package qa.tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

import javax.swing.text.Element;

public class TestCase extends BaseTest {

    ElementFetch element = new ElementFetch();
    HomePageEvents homepage = new HomePageEvents();
    LoginPageEvents loginPage = new LoginPageEvents();


    @Test
    public void sampleMethodForEnteringCredentials() {
        homepage.signInButton();
        loginPage.verifyLoginPageLoaded();
        loginPage.enterCredentialsAndLogin("Rohit", "Test");


    }
}
