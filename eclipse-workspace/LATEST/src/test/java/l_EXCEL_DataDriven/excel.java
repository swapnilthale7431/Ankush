package l_EXCEL_DataDriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel {

	@Test
	public void test_exceltc_001() throws Exception  {
		
		File src=new File("C:\\Users\\HP\\Documents\\table.xlsx");
            FileInputStream fis=new FileInputStream(src);
            XSSFWorkbook wb=new XSSFWorkbook(fis);
            
	double data_1=wb.getSheet("Sheet1").getRow(9).getCell(9).getNumericCellValue();
	System.out.println(data_1);
	
	
	
	
	
	
	
	
	
	
//	
//
//		for(int i=0;i<=9;i++) {
//			
//			//XSSFWorkbook wb=new XSSFWorkbook(fis);
//			XSSFSheet sheet=  wb.getSheet("Sheet1");
//			XSSFRow row=sheet.getRow(i);
//			for(int j=0;j<=9;j++) {
//			XSSFCell cell=  row.getCell(j);
//			int a= (int) cell.getNumericCellValue();
//			
//			System.out.print("  "+a);
//			
//			}
//			System.out.println();
//			//System.out.print("---------------------------------------------------");
//		}


		
		
	}


}
