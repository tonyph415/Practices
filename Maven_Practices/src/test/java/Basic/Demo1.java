package Basic;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class Demo1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//	    driver.get("https://www.safeway.com/account/sign-in.html#error=login_required");
//	    System.out.println(driver.getTitle());
//	    
//	    driver.findElement(By.name("userId")).sendKeys("mecury");
//	    driver.findElement(By.name("inputPassword")).sendKeys("mecury");
//	    	    
//	    driver.findElement(By.xpath("//*[@id=\"btnSignIn\"]")).click();
//	    System.out.println(driver.getTitle());
//	    driver.close();

	    
	    import java.awt.Point;
	    import java.awt.image.BufferedImage;
	    import java.io.File;
	    import java.io.IOException;
	    import java.util.concurrent.TimeUnit;

	    import javax.imageio.ImageIO;

	    import org.apache.commons.io.FileUtils;
	    import org.openqa.selenium.By;
	    import org.openqa.selenium.OutputType;
	    import org.openqa.selenium.TakesScreenshot;
	    import org.openqa.selenium.WebDriver;
	    import org.openqa.selenium.WebElement;
	    import org.openqa.selenium.chrome.ChromeDriver;

	    public class Demo1 {
	    	
	    //	
//	    	public static void main(String[] args) throws IOException  {
	    //
//	    		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");	
//	    		WebDriver driver = new ChromeDriver();
//	    		driver.get("http://www.google.com");
	    //	
//	    		// Get entire page screenshot
//	    		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    		
//	    		// Copy the element screenshot to disk
//	    		File screenshotLocation = new File("C:\\Users\\Tony\\Desktop\\Testing\\Screenshot\\" + System.currentTimeMillis()+" screenshot.png");
//	    		FileUtils.copyFile(screenshot, screenshotLocation);
//	    		
//	    		
//	            driver.quit();
//	        }

	    	
	    	
	    	WebDriver driver;

	    	 public void setup() throws Exception {
	    		 
	    		 System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");	
	    		 WebDriver driver = new ChromeDriver();
    
	    	  driver.manage().window().maximize();
	    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	  driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
	    	 }
	    	 

	    	 public void captureScreenshot() throws Exception {
	    	  //Locate Image element to capture screenshot.
	    	        WebElement Image = driver.findElement(By.xpath("//img[@border='0']"));
	    	        //Call captureElementScreenshot function to capture screenshot of element.
	    	        captureElementScreenshot(Image);
	    	 }
	    	 
	    	 public void captureElementScreenshot(WebElement element) throws IOException{
	    	  //Capture entire page screenshot as buffer.
	    	  //Used TakesScreenshot, OutputType Interface of selenium and File class of java to capture screenshot of entire page.
	    	  File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    	  
	    	  //Used selenium getSize() method to get height and width of element.
	    	  //Retrieve width of element.
	    	  int ImageWidth = element.getSize().getWidth();
	    	  //Retrieve height of element.
	    	  int ImageHeight = element.getSize().getHeight();  
	    	  
	    	  //Used selenium Point class to get x y coordinates of Image element.
	    	  //get location(x y coordinates) of the element.
	    	  Object point = element.getLocation();
	    	  int xcord = (int) ((Point) point).getX();
	    	  int ycord = (int) ((Point) point).getY();
	    	  
	    	  //Reading full image screenshot.
	    	  BufferedImage img = ImageIO.read(screen);
	    	  
	    	  //cut Image using height, width and x y coordinates parameters.
	    	  BufferedImage dest = img.getSubimage(xcord, ycord, ImageWidth, ImageHeight);
	    	  ImageIO.write(dest, "png", screen);
	    	  
	    	  //Used FileUtils class of apache.commons.io.
	    	  //save Image screenshot In D: drive.
	    	  FileUtils.copyFile(screen, new File("C:\\Users\\tuand\\Desktop\\Testing\\Screenshot" + System.currentTimeMillis()+"screenshot.png"));
	    	
	    	 }       
	    
}
