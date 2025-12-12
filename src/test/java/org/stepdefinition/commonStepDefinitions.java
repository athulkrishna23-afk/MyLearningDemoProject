package org.stepdefinition;

import com.pages.SwagLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utils.BaseClass;


import java.awt.*;
import java.util.List;

import static org.junit.Assert.*;

public class commonStepDefinitions extends BaseClass {

    SwagLoginPage StepDefinitionsCommon;
    @And("User cliks on add to cart button of second item")
    public void userCliksOnAddToCartButtonOfSecondItem() {
        StepDefinitionsCommon = new SwagLoginPage(driver);
        StepDefinitionsCommon.addToCart2.click();
    }

    @Then("Item is added to Cart and the User is able to verify that the Button changes to Remove")
    public void itemIsAddedToCartAndTheUserIsAbleToVerifyThatTheButtonChangesToRemove() {
        StepDefinitionsCommon = new SwagLoginPage(driver);
        String Remove = StepDefinitionsCommon.removeFromCart.getText();
       assertEquals("Button did not change to remove","Remove", Remove);


    }

    @When("User clicks on remove from cart button")
    public void userClicksOnRemoveFromCartButton() {
      StepDefinitionsCommon.removeFromCart.click();

    }
    @Then("User is able to verify that the number above cart icon is reduced")
    public void userIsAbleToVerifyThatTheNumberAboveCartIconIsReduced() {

        String itemAdded=  StepDefinitionsCommon.cartIconAdded.getText();
        assertEquals("Items in cart are not as expected", "1", itemAdded);

    }

    @And("User click on remove button from cart page")
    public void userClickOnRemoveButtonFromCartPage() {
        StepDefinitionsCommon.removefromCart2.click();

    }

    @Then("Item is removed and user is able to verify")
    public void itemIsRemovedAndUserIsAbleToVerify() {
        StepDefinitionsCommon.cartIcon.click();
       List <WebElement> cart = driver.findElements(By.xpath("//span[@class='shopping_cart_badge']"));
        Assert.assertTrue("There are items in the cart", cart.size()==0);

    }
}
