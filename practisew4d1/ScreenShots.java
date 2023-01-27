package practisew4d1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://leafground.com/alert.xhtml");
	    
	    File source = driver.getScreenshotAs(OutputType.FILE);
	    File target=new File("./snaps/leaftaps.png");
	    FileUtils.copyFile(source, target);
	    
	    WebElement element = driver.findElement(By.xpath("//h5[contains(text(),'Confirm Dialog')]/following::span[text()='Show'][3]"));
	    File source1 = element.getScreenshotAs(OutputType.FILE);
	    File target1=new File("./snaps/alert.png");
	    FileUtils.copyFile(source1, target1);
	    

	}

}
