package Login_Register;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class Excelloin {
		public static void main(String[] args) throws InterruptedException, IOException{
			FileInputStream fil = new FileInputStream(new File("C:\\Users\\tuand\\Desktop\\Testing\\Book1.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook (fil);
			XSSFSheet sheet= workbook.getSheet("UP");
			int count = sheet.getLastRowNum();
			System.out.println(count);
			for(int i=1; i<=count; i++){
				XSSFRow row= sheet.getRow(i);
				XSSFCell cell= row.getCell(0);
				String un =cell.getStringCellValue();
				XSSFCell cell1= row.getCell(1);
				String pwd = cell.getStringCellValue();
				
				System.setProperty("webdriver.gecko.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://facebook.com");
			driver.findElement(By.name("email")).sendKeys(un);
			driver.findElement(By.name("pass")).sendKeys(pwd);
			driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
			Thread.sleep(3000);
			driver.close();
	}
		
	
	
	}
	
	}
