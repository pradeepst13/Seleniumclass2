package openbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Module3assignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Launch ChromeBrowser 
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
			
		//Launch Firefox 
		//  System.setProperty("webdriver.gecko.driver", "C:\\Selenium New\\Driver\\geckodriver.exe");
		// WebDriver driver= new FirefoxDriver();
				
        driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");
 
        
        //Pageload 
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        
        //Navigate to edureka.com
               
		driver.navigate().to("https://www.edureka.co");
	    driver.manage().window().maximize();	
    	
		// Implicit wait
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	        //Searcing using xpath
	    WebElement textbox = driver.findElement(By.id("homeSearchBar"));
	    textbox.sendKeys("Selenium");
	    textbox.sendKeys(Keys.ENTER); 
	    
	    //Explicit Wait
	    
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    WebElement e = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='add-training-courses']/a")));
	    e.click();
	    
	    //Validate the page title to be “Selenium Certification Training"
	    String title = driver.getTitle();
	     System.out.println("page title is:" + title );
	     String expectedTitle = "Selenium Online Training & Certification Course- Edureka";
	     if(title.equalsIgnoreCase(expectedTitle))
	    	 System.out.println("Title Matched");
	     else
	    	 System.out.println("Title didn't match");
	     
	     //Navigate back to the previous page
	    driver.navigate().back();
	    
	    //Wait for whole page to be loaded and now select “All courses” from the menu option
	    driver.findElement(By.id("dropdownMenu1")).click();
	    
	    Thread.sleep(4000);
	    
	    
	     //Close the browser
	    driver.close();
	     
	     
       }
     
   }
