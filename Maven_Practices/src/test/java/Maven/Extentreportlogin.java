package Maven;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreportlogin {
	  WebDriver  driver;
      public ExtentReports extent;
	public	ExtentTest test;
		
		@BeforeTest
		public void startReport()
		{
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/myOwnreport.html",true);
		extent.addSystemInfo("HostName","kaur")
		.addSystemInfo("Environment","Prodouction environment")
		.addSystemInfo("User Name","kaur");
		extent.loadConfig(new File(System.getProperty("user.dir")+"//extent.config"));
		}
		/*@Test
		public void  demoreport()
		{
	    test=extent.startTest("demoReportPass");
		 Assert.assertTrue(true);
		 test.log(LogStatus.PASS,"Assert pass as condition is True");
		}*/
		@BeforeMethod
		public void setuptest() {

			System.setProperty("webdriver.gecko.driver","C:\\Users\\Tony\\Desktop\\Testing\\WebDrivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
	       driver.get("https://www.wellsfargo.com/");
	      // driver.get("https://www.wellsfargo.com/");
		driver.manage().window().maximize();
		Assert.assertTrue(true);
		}
		@Test
		public void wellsfargologintest()  {
			test= extent.startTest("wellsfargologintest");
			Assert.assertTrue(true);

		}
				/*driver.findElement(By.id("userid")).sendKeys("abc@mail.com");
				driver.findElement(By.id("password")).sendKeys("123");
				driver.findElement(By.id("btnSignon")).click();
				TakesScreenshot ts=(TakesScreenshot)driver;
				File source =ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source,new File("C:\\Users\\sukhd\\OneDrive\\Documents\\wellsfargo1\\screenshot.png"));
				Assert.assertTrue(false);
				test.log(LogStatus.FAIL,"Assert fail as condition is false");
		}*/
				@Test
				public void wellsfargotitletest() {
					test =  extent.startTest("wellsfargotitletest");

					String title= driver.getTitle();
					System.out.println(title);
					Assert.assertEquals(title, "Wells Fargo");	
					Assert.assertTrue(true);
				}
				@Test
				
				public void verifylogotest() {
					
				test=extent.startTest(" verifylogotest");
				      boolean  status =driver.findElement(By.xpath("//*[@id=\"brand\"]/img")).isDisplayed();	
				      Assert.assertTrue(status);
				}
		
		/*@Test
		public void demoReportfail() throws IOException
		{
		test = extent.startTest("demoReportFail");
		Assert.assertTrue(true);
		test.log(LogStatus.FAIL,"Assert fail as condition is false");
	
		}*/
		@AfterMethod
		public void getResult(ITestResult result) throws IOException
			{
		if(result.getStatus()==ITestResult.FAILURE)
		{
		test.log(LogStatus.FAIL,result.getThrowable());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("C:\\Users\\Tony\\Desktop\\Testing\\Screenshot\\screenshot.png"));}
		else if(result.getStatus()==ITestResult.SUCCESS ){
			test.log(LogStatus. PASS,result.getName());	
		}
		else if (result.getStatus()==ITestResult.SKIP) {
		test.log(LogStatus. SKIP,result.getName());
		}
		extent.endTest(test);
		}
		@AfterTest
		public void endReport()
		{
		extent.flush();//
		extent.close();
		}
}