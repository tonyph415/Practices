package FBtest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStep {
	WebDriver driver;
	@Given("^Open the Firefox and launch the application$")
	public void user_have_open_the_browser() throws Throwable {
		System.setProperty("webdriver.gecko.driver","Driver//geckodriver.exe");
		driver = new FirefoxDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();    // maximize the window
		driver.manage().deleteAllCookies();		// delete all cookies
	}
	@When("^Enter the Username \"([^\"]*)\"and Password \"([^\"]*)\"$")		
    public void enter_the_Username_and_Password(String username,String password) throws Throwable {	
	    driver.findElement(By.id("email")).sendKeys(username);
	    driver.findElement(By.id("pass")).sendKeys(password);
	}
	@Then("^Login the account$")
	public void login_the_account() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();  
	    
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	    Thread.sleep(5000);
	   System.out.println(driver.getTitle());
	   File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   // Copy the screenshot to disk
		FileUtils.copyFile(screenshot, new File("Sceenshot//" + System.currentTimeMillis()+".png"));
		System.out.println("Screenshot of \""+ driver.getTitle() + "\" is "+ System.currentTimeMillis()+".png");
	   
	   
	   
	   driver.close();
	}


}
