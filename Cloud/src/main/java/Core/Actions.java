package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Actions {

	public static WebDriver driver;
	public WebDriverWait wait; 
	
	
	public Actions (WebDriver Driver) {
		
		this.driver= Driver;
		
		
	}
	
	public void type(WebElement ElementToType, String StringToType) {
		
		try {
			
			if(ElementToType !=null) {
				ElementToType.clear();
				ElementToType.sendKeys(StringToType);
				
			}
			
			else {
				System.out.println("Element not found");
			}
			
		}catch(Exception e) {
			
		}
	}
	
}
