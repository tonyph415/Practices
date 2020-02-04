package TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library.WrapperEx;
import ObjectMaps.LocateLoginPg;

public class LoginPgTestcase extends WrapperEx {
	
	@BeforeClass
	public void startUp() {
		launchApplication("chrome", "https://www.facebook.com/");
	}
	
	@Test
	public void login() {
		LocateLoginPg lpage = new LocateLoginPg(driver);
		lpage.loginToApp_username("welcome");
		lpage.loginToApp_password("welcome123");
		lpage.loginToApp_Loginbutton();
	}
	
	@AfterClass
	public void close() {
		
		quit();
	}
	
}