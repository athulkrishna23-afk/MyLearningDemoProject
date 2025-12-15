package org.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseClass {
	
	public static WebDriver driver;
	

	public static void initializerDriverandloadurl(String url) {
		ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
       // System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
//        driver = new EdgeDriver();
		System.out.println(driver);		
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	
public static void waitAbit(int milliseconds) throws InterruptedException {
		
		Thread.sleep(milliseconds);
	}
	
	@AfterClass
	
	public static void tearDown() {
		if(driver !=null) {
			driver.quit();
		}
	}

    public static void Excel() throws IOException {
        File f= new File("D:/Xcel sheet/Book1.xlsx");
        FileInputStream fi=new FileInputStream(f);
        Workbook W=new XSSFWorkbook(fi);
        Sheet sheet= W.getSheet("Sheet1");

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

