package pageEvents;

import org.testng.Assert;
import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
    ElementFetch element = new ElementFetch();

    public void verifyLoginPageLoaded() {
        Assert.assertTrue(element.getWebElements("XPATH", LoginPageElements.loginButton).size() > 0, "Element Not Found");
    }

    public void enterCredentialsAndLogin(String username, String password){
        element.getWebElement("XPATH", LoginPageElements.emailField).sendKeys(username);
        element.getWebElement("XPATH", LoginPageElements.passwordField).sendKeys(password);
        element.getWebElement("XPATH", LoginPageElements.loginButton).click();
    }

}
