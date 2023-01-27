package w2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead {

	@Test
	public  void RunEditLead() throws InterruptedException {
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
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("kumar");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
         //to verify the title of the page
		 String title1="View Lead";
		 String title = driver.getTitle();
		 if( title1.equalsIgnoreCase(title))
		 {
			 System.out.println("The text is matched");
		 }
		 else {
			 System.out.println("The text is not matched");
		 }
		 
	//to edit the lead
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Edit']")).click(); 
		 driver.findElement(By.xpath("//input[@value='TCS']")).clear(); 
		 driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("ZOHO");
		 String oldname = driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).getText();
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 String newname = driver.findElement(By.xpath("(//input[@name='companyName'])[1]")).getText();
		 if(oldname.equalsIgnoreCase(newname)) {
			 System.out.println("Correct company name");
		 }
		 else {
			 System.out.println("Wrong company name");
		 }
		 
		 driver.close();
	}

}
