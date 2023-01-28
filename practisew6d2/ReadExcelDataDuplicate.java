package practisew6d2;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataDuplicate {

	public  static String[][]  readDuplicateExcel() throws IOException {
		XSSFWorkbook wb= new XSSFWorkbook("./excel/CreateL.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowcount = ws.getLastRowNum();
		short cellcount = ws.getRow(0).getLastCellNum();
		String[][] data=new String[rowcount][cellcount];
		
		for (int i = 1; i <= rowcount;i++) {
		for (int j = 0; j <cellcount ;j++) {
			String CellValue = ws.getRow(i).getCell(j).getStringCellValue();
			data[i-1][j]=CellValue;
		    System.out.println(CellValue);
		}	
		}
		
		wb.close();
        return data;
	}

}
