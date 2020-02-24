package Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ExcelRegister {
		public static void main(String[] args) throws InterruptedException, IOException{
			FileInputStream fil = new FileInputStream(new File("C:\\Users\\Tony\\Desktop\\Testing\\Book1.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook (fil);
			XSSFSheet sheet= workbook.getSheet("RegisterData");
			int count = sheet.getLastRowNum();
			System.out.println(count);
			for(int i=1; i<=count; i++){
				XSSFRow row= sheet.getRow(i);
				XSSFCell cell= row.getCell(0);
				String fn =cell.getStringCellValue();
				XSSFCell cell1= row.getCell(1);
				String ln = cell1.getStringCellValue();
				XSSFCell cell3= row.getCell(2);
				String me = cell1.getStringCellValue();
				XSSFCell cell4= row.getCell(3);
				String pwd = cell1.getStringCellValue();
				XSSFCell cell5= row.getCell(4);
				String mo = cell1.getStringCellValue();
				XSSFCell cell6= row.getCell(5);
				String da = cell1.getStringCellValue();
				XSSFCell cell7= row.getCell(6);
				String ya = cell1.getStringCellValue();
				XSSFCell cell8= row.getCell(7);
				String gen = cell1.getStringCellValue();
				
				
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Tony\\Desktop\\Testing\\WebDrivers\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				 Actions act = new Actions(driver);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://facebook.com");
			driver.findElement(By.name("firstname")).sendKeys(fn);
			driver.findElement(By.name("lastname")).sendKeys(ln);
			driver.findElement(By.name("reg_email__")).sendKeys(me);
			driver.findElement(By.name("reg_passwd__")).sendKeys(pwd);
		
//			driver.findElement(By.name("birthday_month")).click();
//			Select bmo = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
//			bmo.selectByVisibleText(mo);
//			act.sendKeys(mo).perform();
			
			
//			Select bda = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
//			bda.selectByVisibleText(da);
			driver.findElement(By.name("birthday_day")).click();
			WebElement date = driver.findElement(By.name("birthday_day"));
			String dateVal = da;
			
//			act.moveToElement(driver.findElement(ByVisibleText())).build().perform();
//			act.sendKeys(Keys.TAB).perform();
//			
//			driver.findElement(By.name("birthday_year")).click();
//			Select bya = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
//			bya.selectByVisibleText(ya);
//			act.sendKeys(Keys.TAB).perform();
//			
//			driver.findElement(By.name("lastname")).sendKeys(gen);
//			
			driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
			Thread.sleep(3000);
//			driver.close();
	}
//		Xls_Reader reader = new Xls_Reader("C:\\Users\\Tony\\Desktop\\Testing\\Book1.xlsx");
	

}
		public static void selectDateByJS (WebDriver drive, WebElement element, String dateVal) {
			JavascriptExecutor driver = null;
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		}
}