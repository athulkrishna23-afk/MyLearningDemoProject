package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseClass;

public class RegistrationPage extends BaseClass{
	
	public  RegistrationPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="FirstName")
	public WebElement firstNameTextBox;
	
	@FindBy(id="LastName")
	public WebElement lastNameTextBox;

	@FindBy(id="Email")
	public WebElement emailTextBox;
	
	@FindBy(id="ConfirmEmail")
	public WebElement ConfirmEmailTextBox;
	
	@FindBy(id="CountryId")
	public WebElement CountryDropDown;
	
	@FindBy(id="TimeZoneId")
	public WebElement TimeZoneDropDown;
	
	@FindBy(id="Password")
	public WebElement passwordTextBox;
	
	@FindBy(id="ConfirmPassword")
	public WebElement ConfirmPasswordTextBox;
	
	@FindBy(id="Details_CompanyIndustryId")
	public WebElement IndustryTypeDropDown;
	
	@FindBy(id="Details_CompanyRoleId")
	public WebElement CompanyRoleDropDown;
	
	@FindBy(id="Details_CompanySizeId")
	public WebElement CompanySizeDropDown;
	
	@FindBy(id="Details_CompanyWebsiteUrl")
	public WebElement CompanyWebSiteTextBox;
	
	
	@FindBy(id="Details_WebsitesDevelopmentPeriodId")
	public WebElement WebsitesDevelopmentPeriodDropDown;
	
	
	@FindBy(xpath ="(//label[@class='custom-control-label'])[3]")
	public WebElement PreviousnopcommerseuseRadioButtonNo;
	
	
	
}
