package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Actions;

public class LoginPage extends Actions{
	
	
	WebDriver driver;
	
	public LoginPage (WebDriver Driver) {
		
		
	super(Driver);
	this.driver=Driver;
	PageFactory.initElements(Driver, this);
			
		
	}
	
	
	@FindBy(xpath="")
	private WebElement UserName;
	
	
	
	public void singIn() {
		
	}

}
