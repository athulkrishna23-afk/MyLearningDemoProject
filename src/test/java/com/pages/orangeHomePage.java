package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseClass;

public class orangeHomePage extends BaseClass{

	public orangeHomePage (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(name="username")
		public WebElement usernameTextbox;
		@FindBy(name="password")
		public WebElement passwordTextBox;
		@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
		public WebElement loginButton;
		@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
		public WebElement userDropdown;
		@FindBy(xpath="(//a[@class='oxd-userdropdown-link'])[4]")
		public WebElement logout;
	}
	

