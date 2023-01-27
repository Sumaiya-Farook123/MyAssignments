package w2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Duplicate {

	@Test
	public  void RunDuplicateLead() throws InterruptedException {
		
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
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Email']")).click();
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("kumar@gmail.com");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(3000);
		 
		 String originaltext = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		 System.out.println(originaltext);
		 
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		 
		 String title="Duplicate Lead";
		 String tittle2 = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		 if(title.equals(tittle2)) {System.out.println("Right");}
		 else {System.out.println("Wrong");}
		 
		 driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		 String duptext = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		 if(originaltext.equals(duptext)) {System.out.println("same ");}
		 else {System.out.println("different");}
		 driver.close();
	}

}
