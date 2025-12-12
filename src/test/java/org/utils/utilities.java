package org.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class utilities extends BaseClass {
	
	 static Actions act= new Actions(driver);
	
	
	public static void screenShot(String targetPath) throws IOException {
		
		TakesScreenshot SS= (TakesScreenshot)driver;
	    File source= SS.getScreenshotAs(OutputType.FILE);
	    System.out.println(source);
	    File target= new File(targetPath);
	    FileHandler.copy(source, target);
	}
	
	
	public static void SelectDropDownByValue(WebElement element, String value) {
		
		Select select= new Select(element);
		select.selectByValue(value);
	}
	
	// WebDriver (Browser) Methods
	
//	public static void geturl(String url) {
//		driver.get(url);
//	}
	
	
	public static void getTitle() {
		driver.getTitle();
	}
	
	
	public static void getCurrentUrl() {
		driver.getCurrentUrl();
	}
	
	
	public static void getPageSouce() {
		driver.getPageSource();
		}
	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void navigate(String url) {
	driver.navigate().to(url);
	}
	
	
	public static void back() {
		driver.navigate().back();
	}
	
	public static void forward() {
		driver.navigate().forward();
	}
	
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	
	public static void minimize() {
		driver.manage().window().minimize();
	}
	
	
	public static void fullScreen() {
		driver.manage().window().fullscreen();
	}
	
	
	public static void implicitWait(Duration wait) {
		driver.manage().timeouts().implicitlyWait(wait);
	}
	
	// WebElement Methods
	
	public static void click(WebElement element) {
		driver.findElement((By) element).click();
	}
	
	
	public static void sendKeys(WebElement element, String text) {
		driver.findElement((By)element).sendKeys(text);
	}
	
	
	public static void clear(WebElement element) {
		driver.findElement((By) element).clear();

	}
	public static void getText(WebElement element) {
		driver.findElement((By)element).getText();
	}
	
	// Actions Class
	
	public static void hover(WebElement element) {
		
          act.moveToElement(element).perform();
	}
	
	public static void doubleClick(WebElement element) {
		
		act.doubleClick(element);
	}
	
	
	public static void rightClick(WebElement element) {
	
		act.contextClick(element);
	}
	
	
	public static void dragAndDrop(WebElement from,WebElement to) {
		act.dragAndDrop(from, to);
	}
	
	// Select Class 
	
	public static void selectByText(WebElement element, String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	
	public static void selectByIndex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);
	}
	
	

	public static void deselectByIndex(WebElement element, int value) {
		Select select=new Select(element);
		select.deselectByIndex(value);
		}
	
	
	public static void deselectByValue(WebElement element, String value) {
		Select select=new Select(element);
		select.deselectByValue(value);
	}
	
	
	public static void deselectByText(WebElement element, String text) {
		Select select=new Select(element);
		select.deSelectByContainsVisibleText(text);
	}
	
	//  Alerts
	
	public static void alertAccept () {
	Alert alert=	driver.switchTo().alert();
		alert.accept();
	}
	
	
	public static void alertClose() {
		Alert alert= driver.switchTo().alert();
		alert.dismiss();
	}
	
	
	public static void alertSendKeys(String text) {
		Alert alert=driver.switchTo().alert();
				alert.sendKeys(text);
	}
	public static void alertText() {
		Alert alert = driver.switchTo().alert();
		alert.getText();
	}
	
	// JavaScript Executor
	
	public static void JSclick(WebElement element) {
		JavascriptExecutor js=  (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	// Excel Methods
	
	public static void ExelRead(String filepath, String sheetName) throws IOException {
		

	File f= new File(filepath);
	FileInputStream fi=new FileInputStream(f);
	Workbook W=new XSSFWorkbook(fi);
	Sheet sheet= W.getSheet(sheetName);
	
	for (int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
		
		Row row=sheet.getRow(i);
		for (int j=0;j<row.getPhysicalNumberOfCells();j++) {
			
			Cell cell= row.getCell(j);
			CellType celltype= cell.getCellType();
			switch (celltype) {
			case STRING:
			String scv= cell.getStringCellValue();
			System.out.println(scv);
			break;
			case NUMERIC:
				
				boolean isDate= DateUtil.isCellDateFormatted(cell);
				if(isDate) {
					Date dcv= cell.getDateCellValue();
					
					SimpleDateFormat sdf= new SimpleDateFormat("DD-MM-YYYY");
					String date= sdf.format(dcv);
					
					System.out.println(date);
					}
				
				else {
					double ncv= cell.getNumericCellValue();
					long l= (long)ncv;
					if (ncv==1) {
						
						System.out.println(l);
						}
					else {
						System.out.println(ncv);
					}
					
					
				}
			
			}
			
		}
	
	

	}
	}
}
	
