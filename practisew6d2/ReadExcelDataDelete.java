package practisew6d2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataDelete {

	public static String[][] readDeleteData() throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./excel/CreateL.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int rowcount = ws.getLastRowNum();
		short cellcount = ws.getRow(0).getLastCellNum();
		String[][] data=new String[rowcount][rowcount];
		 
		for (int i = 1; i <= rowcount; i++) {
		for (int j = 0; j <cellcount ; j++) {
			
			
			String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
	        System.out.println(cellValue);
	        data[i-1][j]=cellValue;
			
		}	
		}
		
        wb.close();
        return data;
	}

}
