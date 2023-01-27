package practisew2d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classroomex2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://login.salesforce.com");
		
		WebElement usernm = driver.findElement(By.id("username"));
		usernm.sendKeys("hari.radhakrishnan@qeagle.com");
		
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("Testleaf$321");
		
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		driver.close();

	}

}
