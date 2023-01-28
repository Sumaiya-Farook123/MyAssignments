package w2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead {

	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps");
		
		WebElement usernm = driver.findElement(By.id("username"));
		usernm.sendKeys("Demosalesmanager");
		
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
		// driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("345");
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// Thread.sleep(2000);
		 String leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).getText();
		 System.out.println(leadId);
	     driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	//     Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Delete']")).click();
	     driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	     driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
	     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	     String message = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	     System.out.println(message);
	     if(message.equalsIgnoreCase("No records to display")) {
	    	 System.out.println("The text is matched");
	     }
	     else {
	    	 System.out.println("Text mismatched");
	     }
		 driver.close();
		 
		 

	}

}
