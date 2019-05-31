package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import Managers.WebDriverManager;

public class BaseTest {

	
	private WebDriverManager webDriverManager;  
	public WebDriver driver;
	
	
	public BaseTest() {
		
		webDriverManager = new WebDriverManager();
		
		
	}
	
	
	protected WebDriver getDriver() {
		
		driver= WebDriverManager.getDriver();
		
		return driver;
		
		
	}
	
	
	@BeforeSuite()
	
	public void initBaseSuit() {
		
		
		
		webDriverManager.startWebdriverInstance();
	}
	
	
	
}
