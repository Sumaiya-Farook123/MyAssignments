package practisew4d1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalAlerts {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    driver.get("https://leafground.com/alert.xhtml");
    
    
    //to interact with simple dialog
    driver.findElement(By.xpath("//h5[contains(text(),'Simple Dialog')]/following::span[text()='Show']")).click();
    Alert alert = driver.switchTo().alert();
    String msgdialog = alert.getText();
    System.out.println("This is simple message---" + msgdialog);
    alert.accept();
    
    //to interact withconfirm dailog
    driver.findElement(By.xpath("//h5[contains(text(),'Confirm Dialog')]/following::span[text()='Show']")).click();
    Alert alert2 = driver.switchTo().alert();
    String msgconfirm = alert2.getText();
    System.out.println("This is confirm message---"+ msgconfirm);
    alert2.dismiss();
     
    //to interact withpromptdialog
    driver.findElement(By.xpath("//h5[contains(text(),'Prompt Dialog')]/following::span[text()='Show']")).click();
    Alert alert3 = driver.switchTo().alert();
    alert3.sendKeys("Sumaiya");
    String promptmsg = alert3.getText();
    System.out.println("This is prompt message---"+ promptmsg);
    alert3.accept();
    
  
   
    
    
    
    
    
    
	}

}
