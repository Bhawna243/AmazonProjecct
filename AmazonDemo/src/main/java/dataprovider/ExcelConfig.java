package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelConfig {
	HSSFWorkbook hb;
	HSSFSheet sheet1;

    public ExcelConfig(String excelpath)
    {
    	try {
			File src= new File("C:\\Users\\bshik\\eclipse-workspace\\AmazonDemo\\src\\main\\java\\com\\testdata\\testdata.xls");
			InputStream ExcelFileToRead = new FileInputStream(src);
			//loads full workbook
			hb = new HSSFWorkbook(ExcelFileToRead);
			
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    } 	
		 public String getExcelData(int sheetnumber,int row,int column) {
			 
			 sheet1= hb.getSheetAt(sheetnumber);
			 String data= sheet1.getRow(row).getCell(column).getStringCellValue();
			 return data;
			 
		 }
	
		
		
    }
    
    
    
