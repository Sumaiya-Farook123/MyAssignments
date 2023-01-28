package w2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateContact {

	
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
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Create Contact")).click();
		 Thread.sleep(3000);
		 
		 // to enter the details in create contact
		 driver.findElement(By.id("firstNameField")).sendKeys("testabcdfirstname");
		 driver.findElement(By.id("lastNameField")).sendKeys("testabcdlastname");
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("localFirstName");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("localLastName");
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Technology");
		 driver.findElement(By.id("createContactForm_description")).sendKeys("Description bla blah blahhhh");
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
		 Thread.sleep(3000);
		 
		 WebElement stateele = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select state=new Select(stateele);
		 state.selectByValue("NY");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		 
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("It is really something important!!!");
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 
		 String title = driver.getTitle();
		 System.out.println("The title of the page is"+title);
		 driver.close();
	
		
	}

}
