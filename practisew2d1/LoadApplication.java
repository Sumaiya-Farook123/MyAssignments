package practisew2d1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoadApplication {

	public static void main(String[] args) {
		//to load facebook using chrome browser
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//to load facebook using edge browser
		EdgeDriver driver1=new EdgeDriver();
		driver1.get("https://www.facebook.com/");

	}

}
