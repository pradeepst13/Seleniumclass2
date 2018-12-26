package openbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Module2assignment {

	public static void main(String[] args) {

		// ChromeBrowser and Open Edureka application
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	
	//Launch Firefox 
  //  System.setProperty("webdriver.gecko.driver", "C:\\Selenium New\\Driver\\geckodriver.exe");
     // WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.edureka.co"); 	
		driver.manage().window().maximize();
		
		// Inspect the search box with text “Search for a Course” for various attributes. Using of Firebug addon is no more used.
		
		// Using ID
		//driver.findElement(By.id("homeSearchBar")).sendKeys("Search for a course");
		
		
		  //Using Name
		// driver.findElement(By.name("user_v1[query]")).sendKeys("Search for a course");
		  
		  //Using ClassName - was not able to locate unique classnumber and has amy class name so will not be best practice to use class locator
	// driver.findElement(By.className("trackButton")).sendKeys("Search for a course");
		  
		  //Using CSS Selector
		  //driver.findElement(By.cssSelector("#homeSearchBar")).sendKeys("Search for a course");
		  
		  //Using xpath
		//driver.findElement(By.xpath("//*[@id=\"homeSearchBar\"]")).sendKeys("Search for a course");
		 
		//Using Link Text;
		//driver.findElement(By.linkText("Log In")).click();
	
		//Using partial Text
	  driver.findElement(By.partialLinkText("Log")).click();
	  
	  driver.quit();// Closes all instance the chrome or firebox browser
	  
	  //point 7 and 8 are covered in the above program except for tag name which is yet to be teached.

	}

}
