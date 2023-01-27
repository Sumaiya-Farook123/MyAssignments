package practisew2d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classroomex1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		WebElement usernm = driver.findElement(By.id("username"));
		usernm.sendKeys("Demosalesmanager");
		
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		
	}

}
