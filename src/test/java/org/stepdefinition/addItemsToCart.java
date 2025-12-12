package org.stepdefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utils.BaseClass;

public class addItemsToCart extends BaseClass {
    @And("User click on add to cart button for multiple items")
    public void userClickOnAddToCartButtonForMultipleItems() throws InterruptedException {
        for (int i = 1; i <= 3; i++) {
//            Thread.sleep(5000);
          // WebElement addTOCart= driver.findElement(By.xpath("(//button[@class='btn btn_secondary btn_small btn_inventory '])[" + i + "]"));
            WebElement addTOCart = driver.findElement(By.xpath("(//button[text()='Add to cart'])["+i+"]"));
            Thread.sleep(3000);
           addTOCart.click();
        }

    }

    @And("User removed items from cart")
    public void userRemovedItemsFromCart() throws InterruptedException {
        Thread.sleep(3000);

        for (int i = 1; i <= 2; i++) {
            WebElement RemoveFromCart=  driver.findElement(By.xpath("(//button[text()='Remove'])["+ i +"]"));
            RemoveFromCart.click();
                WebElement cartIcon = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
                String itemNumber= cartIcon.getText();
                System.out.println(itemNumber);
            }
        }

    }
