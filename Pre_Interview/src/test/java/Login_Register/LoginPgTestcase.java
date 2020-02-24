package Login_Register;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library.WrapperEx;
import ObjectMaps.LocateLoginPg;

public class LoginPgTestcase extends WrapperEx {
	
	@BeforeClass
	public void startUp() {
		launchApplication("firefox", "https://www.facebook.com/");
	}
	
	@Test(priority=3,invocationCount=5)
	public void loginValid() throws IOException {
		LocateLoginPg lpage = new LocateLoginPg(driver);
		lpage.loginToApp_username("example@gmail.com");
		lpage.loginToApp_password("password");
		lpage.loginToApp_Loginbutton();
		String expectedTitle="Log into Facebook | Facebook";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        takescreenshot(driver);
        driver.navigate().back();
	}
	@Test(priority=1)
	public void loginInvalid() throws IOException {
		LocateLoginPg lpage = new LocateLoginPg(driver);
		lpage.loginToApp_username("fakeusername");
		lpage.loginToApp_password("welcome123");
		lpage.loginToApp_Loginbutton();
		String expectedTitle="Log into Facebook | Facebook";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        takescreenshot(driver);
        driver.navigate().back();
	}
	@Test (priority=2)
	public void loginEmpty() throws IOException {
		LocateLoginPg lpage = new LocateLoginPg(driver);
		lpage.loginToApp_username("");
		lpage.loginToApp_password("");
		lpage.loginToApp_Loginbutton();
		String expectedTitle="Log into Facebook | Facebook";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        takescreenshot(driver);
        driver.navigate().back();
	}
	@AfterClass
	public void close() {
		
		quit();
	}
	
}