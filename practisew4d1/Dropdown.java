package practisew4d1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/select.xhtml");
		
		//Which is your favorite UI Automation tool
		 WebElement element = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
         Select drp1=new Select(element);
         drp1.selectByVisibleText("Playwright");
         
         //Choose your preferred country.
         driver.findElement(By.xpath("//label[text()='Select Country']")).click();
         driver.findElement(By.xpath("//li[text()='Germany']")).click();
		String text = driver.findElement(By.xpath("//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all']")).getText();
		System.out.println(text);
		
		//Confirm Cities belongs to Country is loaded
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("//li[text()='Frankfurt']")).click();
		
		//Choose the Course
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'ui-button-icon-primary ui-icon')]")).click();
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'ui-button-icon-primary ui-icon')]")).click();
		driver.findElement(By.xpath("//li[text()='Appium']")).click();
		
		//Choose language randomly
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		
		
		
	}

}
