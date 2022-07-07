package l_EXCEL_DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class particularvalue {
	@Test
	public void pv() throws Exception {
		//String path="C:\\Users\\HP\\Documents\\table.xlsx";
		String path="C:\\Users\\HP\\eclipse-workspace\\selenium_01\\Data_XL\\Book2.xlsx";
		File src=new File(path);
            FileInputStream fis=new FileInputStream(src);
            XSSFWorkbook wb=new XSSFWorkbook(fis);
            XSSFSheet sheet=  wb.getSheet("Sheet1");
            
            XSSFRow row=sheet.getRow(1);
            XSSFCell cell=  row.getCell(1);
            int a= (int) cell.getNumericCellValue();
            System.out.println(a);
	}
	@Test
	public void pv_00() throws Exception {
		String path="C:\\Users\\HP\\eclipse-workspace\\selenium_01\\Data_XL\\report.xlsx";
		File src=new File(path);
            FileInputStream fis=new FileInputStream(src);
            XSSFWorkbook wb=new XSSFWorkbook(fis);
            XSSFSheet sheet=  wb.getSheet("one");
           
            XSSFRow row=sheet.getRow(0);
            XSSFCell cell=  row.getCell(0);
            String a= cell.getStringCellValue();
            System.out.println(a);
		
	}

}
