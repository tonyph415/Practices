package Browsers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenURLsByList {
    
    public static void main(String[] args) {
        // generated WebBroswer 
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tuand\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    System.out.println(driver.getTitle());
        String homePage = "http://newtours.demoaut.com/";
        String url = "";
      // Methods
        HttpURLConnection huc = null;
        int respCode = 200;
        driver.manage().window().maximize();
        driver.get(homePage);
        List<WebElement> links = driver.findElements(By.tagName("a"));
  
        Iterator<WebElement> it = links.iterator();
        System.out.println("count of the links"+ links.size());
        
        while(it.hasNext()){ 
        	url = it.next().getAttribute("href");
            System.out.println(url);
            if(url == null || url.isEmpty()){
            	System.out.println("URL is either not configured for anchor tag or it is empty");
            	continue;
            }
            
            if(!url.startsWith(homePage)){
                System.out.println(" Link is loaded");
                continue;
            }
            
            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }
                    
            } catch (MalformedURLException e) {
                // Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        driver.quit();

    }

}
