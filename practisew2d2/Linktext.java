package practisew2d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

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
		 
		 //to click on leads tab
		 driver.findElement(By.linkText("Leads")).click();
		 
		 //to clink on create tab
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.close();
		

	}

}
