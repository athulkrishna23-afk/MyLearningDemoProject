package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseClass;

public class Homepage extends BaseClass{
	
	public  Homepage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[text()='Register']")
	public  WebElement registerButton;
	
	@FindBy (xpath = "//span[@class='user-actions-ico']")
	public  WebElement UserIcon;
	 
	
	public void clickRegister() {
		registerButton.click();
	}
	
	public void userMouseOver() {
		Actions A=new Actions(driver);
		A.moveToElement(UserIcon).perform();
	}
	
	

	
}
