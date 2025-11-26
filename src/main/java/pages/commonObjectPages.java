package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class commonObjectPages{
	
	@FindBy(xpath = "//span[text()='Register']")
    public WebElement registerButton;

	public By username = By.xpath("//span[text()='Register']");
	
}
