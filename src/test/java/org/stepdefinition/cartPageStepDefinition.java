package org.stepdefinition;

import com.pages.SwagLoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utils.BaseClass;
import org.utils.utilities;

public class cartPageStepDefinition extends BaseClass {
    SwagLoginPage cartPageStepDefinitions;

    @And("User Clicks on continue shopping button")
    public void userClicksOnContinueShoppingButton() {
        cartPageStepDefinitions= new SwagLoginPage(driver);
        cartPageStepDefinitions.continueShoppingButton.click();
    }

    @Then("User is taken to the product page")
    public void userIsTakenToTheProductPage() {
        utilities.driver.getTitle();
    }
}
