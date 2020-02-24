package io.platform.project.homePageTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.platform.project.commons.Common;
import io.platform.project.commons.WebDriverManager;
import io.platform.project.pageObjects.HomePage;

public class HomePageTest {
	HomePage homePage;
	WebDriver driver;
	WebDriverManager webDrivermanager;
	
	@BeforeTest
	public void beforeTest(){
		//Open Chrome
		webDrivermanager = new WebDriverManager();
		driver = webDrivermanager.getDriver();
		//Open URL
		homePage = new HomePage(driver);
		homePage.openHomePageURL(driver);
	}

	//@Parameters({browser})
	@Test
	public void test(){
		//https://www.wellsfargo.com/
		//Page is Loaded
		//Check the title
		String str = homePage.getTitle();
		System.out.println(str);
		String title = "Wells Fargo – Banking, Credit Cards, Loans, Mortgages & More";
		Common.check(driver, title.equals(str), "Home Page Title not equal to "+ title);
	}
	
	
	@Test
	public void test2(){
		String str = homePage.getTitle();
		String title = "Wells Fargo – Banking, Credit Cards, Loans, Mortgages & More";
		Common.check(driver, title.equals(str), "Home Page Title not equal to "+ title);
		
//		public void CheckImage() throws Exception {
//			driver.get(baseUrl);
//			WebElement ImageFile = driver.findElement(By.xpath("//img[contains(@id,'Test Image')]"));
//		        
//		        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
//		        if (!ImagePresent)
//		        {
//		             System.out.println("Image not displayed.");
//		        }
//		        else
//		        {
//		            System.out.println("Image displayed.");
		
		
	}


	@AfterTest
	public void afterTest(){
		driver.quit();
	}
	

}
