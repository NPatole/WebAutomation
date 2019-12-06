package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends BaseTest{
	
	public WebDriver driver;
	
	private LoginPage loginPage;
	
	
	
	@BeforeClass
	public void beforeClass() {
		
        loginPage = new LoginPage(getDriver());
		
	}
	
	@Test
	public void test() {
		
		
		
		System.out.println("Test PASS");
		System.out.println("Jenkin test PASS");
		
	}
		
	

}
