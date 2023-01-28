package practisew6d2;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataCreate {
	
//change the main method change void in String[][]
	public static String[][] readData() throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook("./excel/CreateL.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		 int rowcount = ws.getLastRowNum();
		int cellCount = ws.getRow(0).getLastCellNum();
		
		//declare 2D String
		String[][] data=new String[rowcount][cellCount];
	
		
	    for (int i = 1; i <= rowcount; i++) {	
		for (int j = 0; j <cellCount; j++) {

			String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
			//save data in 2D array
			data[i-1][j]=cellValue;
			System.out.println(cellValue);
		
		}	
		}
			
        wb.close();
    	//add return 
		return data;
	}

}
