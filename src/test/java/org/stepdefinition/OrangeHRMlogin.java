package org.stepdefinition;

import org.utils.BaseClass;9
import com.pages.orangeHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMlogin extends BaseClass {
	
	private orangeHomePage HomePage;

	@Given("User opens OrangeHRM website")
	public void user_opens_orange_hrm_website() {
		initializerDriverandloadurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    //utilities.geturl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	    utilities.maximize();
	}

	@When("User enters Correct username")
	public void user_enters_correct_username() throws InterruptedException {
		System.out.println("Inside");
		Thread.sleep(5000);
		
		HomePage= new orangeHomePage(driver);
		HomePage.usernameTextbox.sendKeys("admin");
		
	}

	@When("user enters correct password")
	public void user_enters_correct_password() {
	    HomePage.passwordTextBox.sendKeys("admin123");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		HomePage.loginButton.click();
		Thread.sleep(5000);
	}
	

	@Then("user is successfully logged in")
	public void user_is_successfully_logged_in() {
	    String title=driver.getTitle();
	    System.out.println(title);
	    
	}


	@When("User clicks on profile icon")
	public void user_clicks_on_profile_icon() {
	  HomePage.userDropdown.click();
	}

	@When("User clicks on Logout option")
	public void user_clicks_on_logout_option() {
		   HomePage.logout.click();

	}

	@Then("user is logged out")
	public void user_is_logged_out() {
	    String title = driver.getTitle();
	    System.out.println(title+"Logged out");
	}

}
