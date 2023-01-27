package w2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//to login to the site
		driver.get("https://www.facebook.com/login.php");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		//to fill the mandatory fields
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("sumaiya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("farook");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sumaiya.1810@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sumaiya.1810@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sumaiya@1");
		
		WebElement dayele = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day =new Select(dayele);
		day.selectByValue("18");
		
		WebElement monthele = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month =new Select(monthele);
		month.selectByValue("10");
		
		WebElement yearele = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year =new Select(yearele);
		year.selectByValue("1994");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	    
	}

}
