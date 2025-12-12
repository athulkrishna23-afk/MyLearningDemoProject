package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseClass;

public class SwagLoginPage extends BaseClass {

    public  SwagLoginPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id="user-name")
    public WebElement UserNameTextBox;


    @FindBy(id="password")
    public WebElement PasswordTextBox;

    @FindBy(id="login-button")
    public WebElement LoginButton;

    // Swag Labs Home Page
    @FindBy(xpath="(//button[@class='btn btn_primary btn_small btn_inventory '])[1]")
    public WebElement addToCart;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement addToCart2;

    @FindBy (xpath = "(//button[@class='btn btn_secondary btn_small btn_inventory '])[1]")
    public WebElement removeFromCart;

    @FindBy(id = "remove-sauce-labs-bike-light")
    public WebElement removefromCart2;

    @FindBy(xpath="//a[@class='shopping_cart_link']")
    public WebElement cartIcon;

    //Swag Labs Cart

    @FindBy (xpath = "//button[@class='btn btn_action btn_medium checkout_button ']")
    public WebElement checkoutButton;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    public WebElement cartIconAdded;

    @FindBy(tagName = "div")
    public WebElement inCartText;

    @FindBy (id = "continue-shopping")
    public WebElement continueShoppingButton;

    // Swag labs Checkout: Your Information page
    @FindBy(id = "first-name")
    public WebElement firstNameTextBox;

    @FindBy (id = "last-name")
     public  WebElement lastNameTextBox;

    @FindBy (id = "postal-code")
    public WebElement postalCOde;

    @FindBy(xpath= "//input[@class='submit-button btn btn_primary cart_button btn_action']")
    public WebElement continueButton;

    //Checkout: Overview
    @FindBy (name = "finish")
    public WebElement  finishButton;


}
