package org.stepdefinition;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utils.BaseClass;
import org.utils.utilities;
import com.pages.Homepage;
import com.pages.RegistrationPage;

import io.cucumber.java.en.*;




public class loginPage extends BaseClass  {
	
	private Homepage homepage;
	private RegistrationPage registrationPage;



	@Given("User launches nopcommerse website")
	public void user_launches_nopcommerse_website() {
		initializerDriverandloadurl("https://www.nopcommerce.com/en");
	}

	@When("User hovers over profile icon")
	public void user_hovers_over_profile_icon() {
		homepage = new Homepage(driver);
		homepage.userMouseOver();
//      Actions A=new Actions(driver);
//           WebElement login= driver.findElement(By.xpath("//span[@class='user-actions-ico']"));
//           A.moveToElement(login).perform();

}

	@When("User click on Register option")
	public void user_click_on_register_option() {
		//homepage.registerButton.click();
		homepage.clickRegister();
//		WebElement register =driver.findElement(By.xpath("//span[text()='Register']"));
//		register.click();
	}

	@Then("User is taken to Register Page")
	public void user_is_taken_to_register_page() {
	String title = driver.getTitle();
	
	System.out.println(title);
	}
	
	@When("User enters the required data firstName as {string} and Emailid as {string}")
	public void user_enters_the_required_data_first_name_as_and_emailid_as(String firstName, String emailId) throws InterruptedException {
		
         registrationPage=new RegistrationPage(driver);
		 
		 registrationPage.firstNameTextBox.sendKeys(firstName);
		 registrationPage.lastNameTextBox.sendKeys("krishna");
		 registrationPage.emailTextBox.sendKeys(emailId);
		 registrationPage.ConfirmEmailTextBox.sendKeys(emailId);
		 registrationPage.passwordTextBox.sendKeys("Password@1233");
		 registrationPage.ConfirmPasswordTextBox.sendKeys("Password@1233");
		 
		 utilities.SelectDropDownByValue(registrationPage.CountryDropDown, "334");
		 utilities.SelectDropDownByValue(registrationPage.TimeZoneDropDown, "India Standard Time");
		 utilities.SelectDropDownByValue(registrationPage.IndustryTypeDropDown, "1");
		 utilities.SelectDropDownByValue(registrationPage.CompanyRoleDropDown, "5");
		 utilities.SelectDropDownByValue(registrationPage.CompanySizeDropDown, "3");
         utilities.SelectDropDownByValue(registrationPage.WebsitesDevelopmentPeriodDropDown, "3");
         registrationPage.PreviousnopcommerseuseRadioButtonNo.click();
         registrationPage.CompanyWebSiteTextBox.sendKeys("https://ultimateqa.com/dummy-automation-websites/");
         
         waitAbit(4000);
         
	    
	}

//	@When("User enters the required data")
//	public void user_enters_the_required_data() throws InterruptedException {
//
//		
//		 registrationPage=new RegistrationPage(driver);
//		 
//		 registrationPage.firstNameTextBox.sendKeys("Athul");
//		 registrationPage.lastNameTextBox.sendKeys("krishna");
//		 registrationPage.emailTextBox.sendKeys("athulkrishn@gmail.com");
//		 registrationPage.ConfirmEmailTextBox.sendKeys("athulkrishn@gmail.com");
//		 registrationPage.passwordTextBox.sendKeys("Password@1233");
//		 registrationPage.ConfirmPasswordTextBox.sendKeys("password@1233");
//		 
//		 utilities.SelectDropDownByValue(registrationPage.CountryDropDown, "334");
//		 utilities.SelectDropDownByValue(registrationPage.TimeZoneDropDown, "India Standard Time");
//		 utilities.SelectDropDownByValue(registrationPage.IndustryTypeDropDown, "1");
//		 utilities.SelectDropDownByValue(registrationPage.CompanyRoleDropDown, "5");
//		 utilities.SelectDropDownByValue(registrationPage.CompanySizeDropDown, "3");
//         utilities.SelectDropDownByValue(registrationPage.WebsitesDevelopmentPeriodDropDown, "3");
//         
//         registrationPage.PreviousnopcommerseuseRadioButtonNo.click();
//         registrationPage.CompanyWebSiteTextBox.sendKeys("https://ultimateqa.com/dummy-automation-websites/");
//         
//         waitAbit(4000);
//  
//	}
	

	
	
	@When("User enters username {string}")
	public void user_enters_username(String userName) {
		WebElement username=driver.findElement(By.id("Username"));
		username.sendKeys(userName);
	}


	@When("User clicks check availability button")
	public void user_clicks_check_availability_button() throws InterruptedException {
	   WebElement checkbutton= driver.findElement(By.id("check-availability-button"));
	   checkbutton.click();
	   
	   waitAbit(3000);
	}
	

	@When("User clicks Register button")
	public void user_clicks_register_button() throws InterruptedException, IOException {
	   WebElement register= driver.findElement(By.id("register-button"));
	   register.click();
	}
	

	@Then("User is succefully Registered")
	public void user_is_succefully_registered() throws IOException{
		
		utilities.screenShot("D:\\\\Java studies");
		    
	}


}
