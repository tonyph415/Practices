package ObjectMaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocateLoginPg {
	
	WebDriver driver;
	By username = By.id("email");
	By password = By.id("pass");
	By loginbutton = By.xpath("//*[@id=\"u_0_2\"]");
	By errInvalid = By.xpath("//*[@id=\\\"error_box\\\"]/div[1]");
	By errEmpty = By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div");
	
	public LocateLoginPg(WebDriver driver) {
		this.driver = driver;
	}
	public void loginToApp_username (String userid) {
		driver.findElement(username).sendKeys(userid);
	}
	public void loginToApp_password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void loginToApp_Loginbutton() {
		driver.findElement(loginbutton).click();
	}
	public void fakeuser () {
		
	}
}