package practisew6d2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataEdit {

	public static String[][] ReaddataEdit() throws IOException {
		XSSFWorkbook wb= new XSSFWorkbook("./excel/CreateL.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowcount = ws.getLastRowNum();
		short cellcount = ws.getRow(0).getLastCellNum();
		//
		String[][] data=new String[rowcount][cellcount];
		for (int i = 1; i <= rowcount; i++) {
		for (int j = 0; j < cellcount; j++) {
			
			String CellValue = ws.getRow(i).getCell(j).getStringCellValue();
			System.out.println(CellValue);
			//
			data[i-1][j]=CellValue;
		}	
		}
		wb.close();	
		//
		return data;
	}

}
