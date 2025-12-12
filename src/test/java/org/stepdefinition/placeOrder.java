package org.stepdefinition;

import com.pages.SwagLoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.utils.BaseClass;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

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
        createOrder = new SwagLoginPage(driver);
        String cart = createOrder.cartIcon.getText();
        assertEquals("Cart is empty even after adding item", "1", cart);
    }

    @When("User clicks on Cart icon")
    public void user_clicks_on_cart_icon() {
        createOrder.cartIcon.click();
    }

    @When("User clicks on Checkout button")
    public void user_clicks_on_checkout_button() {
       createOrder.checkoutButton.click();
    }

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

    @When("User clicks on Fininsh button")
    public void user_clicks_on_fininsh_button() {
        createOrder.finishButton.click();
    }

}
