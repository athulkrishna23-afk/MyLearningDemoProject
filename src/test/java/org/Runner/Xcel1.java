package org.Runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class Xcel1 {
	
	public static void main (String []args) throws IOException {
		
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
