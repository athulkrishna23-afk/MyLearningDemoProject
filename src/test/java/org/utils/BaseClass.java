package org.utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	
	public static void initializerDriverandloadurl(String url) {
		driver = new ChromeDriver();
		System.out.println(driver);		
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	
public static void waitAbit(int milliseconds) throws InterruptedException {
		
		Thread.sleep(milliseconds);
	}
	
	@AfterClass
	
	public void tearDown() {
		if(driver !=null) {
			driver.quit();
		}
	}

}
