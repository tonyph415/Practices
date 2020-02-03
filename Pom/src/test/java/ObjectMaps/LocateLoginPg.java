package ObjectMaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocateLoginPg {
	
	WebDriver driver;
	By username = By.id("email");
	By password = By.id("pass");
	By loginbutton = By.xpath("//*[@id=\"u_0_2\"]");
	
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
	
}