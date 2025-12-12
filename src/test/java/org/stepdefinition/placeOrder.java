package org.stepdefinition;

import com.pages.SwagLoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.utils.BaseClass;
import org.utils.utilities;

import java.io.IOException;

public class placeOrder extends BaseClass {

    SwagLoginPage createOrder;

    @When("User click on add to card button for an item")
    public void user_click_on_add_to_card_button_for_an_item() throws InterruptedException {
        createOrder = new SwagLoginPage(driver);
        createOrder.addToCart.click();
        Thread.sleep(3000);
    }

    @Then("Item is added to cart")
    public void item_is_added_to_cart() throws IOException {
//        utilities.screenShot("D:\\Swag Labs");

    }

    @When("User clicks on Cart icon")
    public void user_clicks_on_cart_icon() {
        createOrder = new SwagLoginPage(driver);
        createOrder.cartIcon.click();
    }

//    @Then("User is taken to the cart")
//    public void user_is_taken_to_the_cart() throws IOException {
//       utilities.screenShot("D:\\Swag Labs");
//    }

    @When("User clicks on Checkout button")
    public void user_clicks_on_checkout_button() {
       createOrder.checkoutButton.click();
    }

//    @Then("User is taken to Information page")
//    public void user_is_taken_to_information_page() throws IOException {
//       utilities.screenShot("D:\\Swag Labs");
//    }

    @When("User Enters First name as {string}")
    public void user_enters_first_name_as(String string) {
       createOrder.firstNameTextBox.sendKeys("Athul");
    }

    @When("User Enters Last name as {string}")
    public void user_enters_last_name_as(String string) {
        createOrder.lastNameTextBox.sendKeys("krishan");
    }

    @When("User enters zip code as {string}")
    public void user_enters_zip_code_as(String string) {
        createOrder.postalCOde.sendKeys("673310");
    }

    @When("Clicks on Continue button")
    public void clicks_on_continue_button() {
       createOrder.continueButton.click();
    }

//    @Then("User is taken to Payment information page")
//    public void user_is_taken_to_payment_information_page() throws IOException {
//       utilities.screenShot("D:\\Swag Labs");
//    }

    @When("User clicks on Fininsh button")
    public void user_clicks_on_fininsh_button() {
        createOrder.finishButton.click();
    }



//    @Then("Order is placed")
//    public void order_is_placed() throws IOException {
//        utilities.screenShot("D:\\Swag Labs");
//    }

}
