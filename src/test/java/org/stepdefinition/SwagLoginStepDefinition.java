package org.stepdefinition;

import com.pages.SwagLoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.utils.BaseClass;
import org.utils.utilities;

import javax.swing.text.Utilities;

public class SwagLoginStepDefinition extends BaseClass {

    SwagLoginPage swagLoginPage;

    @Given("User opens Swag Labs Website")
    public void userOpensSwagLabsWebsite() {
        initializerDriverandloadurl("https://www.saucedemo.com/");
        utilities.maximize();
    }


    @Then("User Enter UserName as {string}")
    public void userEnterUserNameAs(String username) {
        swagLoginPage = new SwagLoginPage(driver);

        swagLoginPage.UserNameTextBox.sendKeys("standard_user");

    }

    @And("User Enters Password as {string}")
    public void userEntersPasswordAs(String password) {
        swagLoginPage.PasswordTextBox.sendKeys(password);
    }

    @Then("User Click on Login Button")
    public void userClickOnLoginButton() throws InterruptedException {
        swagLoginPage.LoginButton.click();
        Thread.sleep(3000);
//        utilities.alertClose();
//        utilities.alertAccept();

    }

    @Then("User is logged in")
    public void userIsLoggedIn() {
     String title= utilities.driver.getTitle();
     System.out.println(title);

    }


}
