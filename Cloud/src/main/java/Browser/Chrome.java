package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Core.Constant;;

public class Chrome implements IBrowser{
	
	public WebDriver Driver;
	
	
	public Chrome () {
		
		
		try {
			
			
			System.setProperty("webdriver.chrome.driver", "/Users/tml/ChromeDriverexe/chromedriver");
			 
			 Driver=new ChromeDriver();
			 
			 
			/*
			 * // Initialize browser WebDriver driver=new ChromeDriver();
			 * 
			 * // Open facebook driver.get("http://www.facebook.com");
			 * 
			 * // Maximize browser
			 * 
			 * driver.manage().window().maximize();
			 */
			 
			
			
		}
		catch(Exception e ) {
			
			
		}
	}
	
	
	public WebDriver OpenBrowser () {
		
		try {
		Driver.get(Constant.URL);
		Driver.manage().window().maximize();
		
		
		}
		
		catch (Exception e) {
			
			
		}
		
		return Driver;
	}

}
