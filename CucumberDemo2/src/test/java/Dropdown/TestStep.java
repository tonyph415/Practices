package Dropdown;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStep {
	WebDriver driver;
	@Given("^Open the Firefox and launch the application$")
	public void user_have_open_the_browser() throws Throwable {
		System.setProperty("webdriver.gecko.driver","Driver//geckodriver.exe");
		driver = new FirefoxDriver();
	    driver.get("http://newtours.demoaut.com/mercuryreservation.php?osCsid=010999779d3673bc82fa6430732c74e5");
	    driver.manage().window().maximize();    // maximize the window
		driver.manage().deleteAllCookies();		// delete all cookies
		
		
	}
	@When("^Login Account$")
	public void login_Account() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	    Thread.sleep(5000);
	   System.out.println(driver.getTitle());
	}

	@Then("^Enter the Passengers \"([^\"]*)\"and Departing From: \"([^\"]*)\" and Arriving \"([^\"]*)\"$")
	public void enter_the_Passengers_and_Departing_From_and_Arriving(String Passengers, String Departing, String Arriving) throws Throwable {
		Select passenger = new Select(driver.findElement(By.xpath("passCount")));
		passenger.selectByVisibleText(Passengers);
		//		((Select) driver.findElement(By.name("passCount"))).selectByIndex("Passengers");
		
		driver.findElement(By.name("fromPort")).click();
		((Select) driver.findElement(By.name("fromPort"))).selectByVisibleText(Departing);
		
		driver.findElement(By.name("toPort")).click();
		((Select) driver.findElement(By.name("toPort"))).selectByVisibleText(Arriving);
	}

	@Then("^book the fight$")
	public void book_the_fight() throws Throwable {
		driver.findElement(By.name("findFlights")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}


}
