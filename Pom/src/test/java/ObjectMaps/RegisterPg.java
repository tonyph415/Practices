package ObjectMaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPg {
	WebDriver driver;
	By firstN = By.name("firstname");
	By lastN = By.name("lastname");
	By regPhoneOrEmail = By.name("reg_email__");
	By regConphoneOrEmail = By.name("reg_email_confirmation__");
	By regPassword = By.name("reg_passwd__");
	By regMonth = By.name("birthday_month");
	By regDay = By.name("birthday_day");
	By regYear = By.name("birthday_year");
	By regFemale = By.xpath("//*[@id=\"u_0_9\"]");
	By regMale = By.xpath("//*[@id=\"u_0_a\"]");
	By regOtherGen = By.xpath("//*[@id=\"u_0_b\"]");
	By genPronoun = By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[7]/div[1]/select");
	By genOptional = By.xpath("//*[@id=\"u_0_11\"]");
	By submitbutton = By.xpath("//*[@id=\"u_0_13\"]");
	
	public RegisterPg(WebDriver driver) {
		this.driver = driver;
	}
	public void userfirstname (String fname) {
		driver.findElement(firstN).sendKeys(fname);
	}
	public void userlastname (String lname) {
		driver.findElement(lastN).sendKeys(lname);
	}
	public void regEmailPhone (String emailPhone) {
		driver.findElement(regPhoneOrEmail).sendKeys(emailPhone);
	}
	public void confirmEmailPhone (String conEmailPhone) {
		driver.findElement(regConphoneOrEmail).sendKeys(conEmailPhone);
		
	}
	public void registerpass (String passw) {
		driver.findElement(regPassword).sendKeys(passw);
	}
	public void uRegMonth (String bmonth) {
		Select month = new Select(driver.findElement(regMonth));
	    month.selectByVisibleText(bmonth);
	}
	public void uRegDay (String bday) {
		Select day = new Select(driver.findElement(regDay));
	    day.selectByVisibleText(bday);
	}
	public void uRegYear (String byear) {
		Select year = new Select(driver.findElement(regYear));
	    year.selectByVisibleText(byear);
	}
	
	public void usergender (String gen) {
			if (gen.equalsIgnoreCase("Male")) {
				driver.findElement(regMale).click();
			
			} else if (gen.equalsIgnoreCase("Female")){
				driver.findElement(regFemale).click();
			}
			else {
			driver.findElement(regOtherGen).click();
			Select option = new Select(driver.findElement(genPronoun ));
			option.selectByIndex(3);
			driver.findElement(genOptional).sendKeys("No Gender");
			}
		}
		
	
	public void RegSubmitbutton() {
		driver.findElement(submitbutton).click();
	}
	
}
