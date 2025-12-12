package org.stepdefinition;

import com.pages.SwagLoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.utils.BaseClass;
import org.utils.utilities;

public class commonStepDefinitions extends BaseClass {

    SwagLoginPage StepDefinitionsCommon;

    @And("User cliks on add to cart button of second item")
    public void userCliksOnAddToCartButtonOfSecondItem() {
        StepDefinitionsCommon = new SwagLoginPage(driver);
        StepDefinitionsCommon.addToCart2.click();
    }

    @Then("Item is added to Cart and the User is able to verify that the Button changes to Remove")
    public void itemIsAddedToCartAndTheUserIsAbleToVerifyThatTheButtonChangesToRemove() {


       String itemAdded=  StepDefinitionsCommon.cartIconAdded.getText();
       System.out.println(itemAdded);
    }

    @When("User clicks on remove from cart button")
    public void userClicksOnRemoveFromCartButton() {
      StepDefinitionsCommon.removeFromCart.click();

    }

    @Then("Item is removed and user is able to verify")
    public void itemIsRemovedAndUserIsAbleToVerify() {
        StepDefinitionsCommon.cartIcon.click();
        String cart= StepDefinitionsCommon.inCartText.getText();
        System.out.println(cart);

    }


    @Then("User is able to verify that the number above cart icon is reduced")
    public void userIsAbleToVerifyThatTheNumberAboveCartIconIsReduced() {

        String itemAdded=  StepDefinitionsCommon.cartIconAdded.getText();
        System.out.println(itemAdded);

    }

    @And("User click on remove button from cart page")
    public void userClickOnRemoveButtonFromCartPage() {
        StepDefinitionsCommon.removefromCart2.click();

    }

}
