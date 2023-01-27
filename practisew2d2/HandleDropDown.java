package practisew2d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://leaftaps.com/opentaps");
		
		WebElement usernm = driver.findElement(By.id("username"));
		usernm.sendKeys("Demosalesmanager");
		
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		
		 //handle dropdown using visible by text
		 
		 WebElement driver1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select drp1=new Select(driver1);
		 drp1.selectByVisibleText("Conference");
		 
		 //handle dropdown using visible by value
		 
		 WebElement driver2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select drp2 =new Select(driver2);
		 drp2.selectByValue("IND_FINANCE");
		 
		 //handle dropdown using visible by index
		 WebElement driver3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select drp3=new Select(driver3);
		 drp3.selectByIndex(5); 

	}

}
