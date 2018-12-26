package openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Module2assignment2 {

	public static void main(String[] args) {
	
        // Launch ChromeBrowser 
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
			
		//Launch Firefox 
	// System.setProperty("webdriver.gecko.driver", "C:\\Selenium New\\Driver\\geckodriver.exe");
	 //  WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.edureka.co"); 	
		driver.manage().window().maximize();
	}

}
