package Managers;

import org.openqa.selenium.WebDriver;

import Browser.Chrome;
import Browser.IBrowser;
import Core.Constant;

public class WebDriverManager {
	
    public static ThreadLocal<WebDriver> Driver = new ThreadLocal<>();	
	
	public static WebDriver getDriver() {
		
		return Driver.get();
	}
	
	public static void setDriver(WebDriver driver) {
		
		Driver.set(driver);
	}
	
	
	
	private WebDriver initialisedriver() {
	WebDriver currentWebDriverSession =null;
	
	
	try {
		String browser= Constant.Browser;
		switch (browser) {
		case "Chrome":
			IBrowser GetBrowser= new Chrome();
			currentWebDriverSession= GetBrowser.OpenBrowser();
			
		}
		
	}catch(Exception e) {
	
	}
	
	return currentWebDriverSession;
		
	}
	
	
	public void startWebdriverInstance() {
		
		WebDriver currentWebDriverSession= initialisedriver();
		setDriver(currentWebDriverSession);
	}
	
	


}
