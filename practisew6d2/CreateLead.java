package practisew6d2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	@Test(dataProvider="fetchData")
	public  void runCreateLead(String company,String firstName,String lastName) throws InterruptedException {
		driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		  driver.findElement(By.name("submitButton")).click();		 
}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {	
		String[][] readData = ReadExcelDataCreate.readData();
		return readData;
		/*
		 * String[][] data=new String[2][3];
		 * 
		 * data[0][0]="TestLeaf"; data[0][1]="Hari"; data[0][2]="R" ;
		 * 
		 * data[1][0]="Qeagle"; data[1][1]="Sumaiya"; data[1][2]="M" ;
		 * 
		 * return data;
		 */
	}
}
