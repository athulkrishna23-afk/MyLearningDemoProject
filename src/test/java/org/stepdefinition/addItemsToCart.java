package org.stepdefinition;

import com.pages.SwagLoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utils.BaseClass;

import static org.junit.Assert.assertEquals;

public class addItemsToCart extends BaseClass {
    SwagLoginPage StepDefinitionsCommon;

    @And("User click on add to cart button for multiple items")

    public void userClickOnAddToCartButtonForMultipleItems() throws InterruptedException {
        StepDefinitionsCommon = new SwagLoginPage(driver);
        for (int i = 1; i <= 3; i++) {
            WebElement addTOCart = driver.findElement(By.xpath("(//button[text()='Add to cart'])["+i+"]"));
            Thread.sleep(3000);
           addTOCart.click();
            String itemsInCart= StepDefinitionsCommon.cartIcon.getText();

            assertEquals("Items are added to cart", String.valueOf(i),itemsInCart);
            System.out.println(itemsInCart);
        }

    }

    @And("User removed items from cart")
    public void userRemovedItemsFromCart() throws InterruptedException {
        Thread.sleep(3000);

        for (int i = 1; i <= 2; i++) {
            WebElement RemoveFromCart=  driver.findElement(By.xpath("(//button[text()='Remove'])["+ i +"]"));
            RemoveFromCart.click();
                String itemNumber= StepDefinitionsCommon.cartIcon.getText();
                System.out.println(itemNumber);
            if(itemNumber.equals("2")){
                assertEquals("Number of items is in the cart is not as expected","2",itemNumber);
            }else{
                assertEquals("Number of items is in the cart is not as expected","1",itemNumber);
            }

            }
        }

    }
