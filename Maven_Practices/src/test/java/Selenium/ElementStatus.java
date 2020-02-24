package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementStatus {

//	
//		WebElement rxBtn = driver.findElement(By.className("icon-rx"));
//	    WebElement otcBtn = driver.findElement(By.className("icon-otc"));
//	    WebElement herbBtn = driver.findElement(By.className("icon-herb"));
//
//	    Assert.assertEquals(true, rxBtn.isDisplayed());
//	    Assert.assertEquals(true, otcBtn.isDisplayed());
//	    Assert.assertEquals(true, herbBtn.isDisplayed());
//	
//	
//	
//	private enum ElementStatus{
//        VISIBLE,
//        NOTVISIBLE,
//        ENABLED,
//        NOTENABLED,
//        PRESENT,
//        NOTPRESENT
//    }
//    private ElementStatus isElementVisible(WebDriver driver, By by,ElementStatus getStatus){
//        try{
//            if(getStatus.equals(ElementStatus.ENABLED)){
//                if(driver.findElement(by).isEnabled())
//                    return ElementStatus.ENABLED;
//                return ElementStatus.NOTENABLED; 
//            }
//            if(getStatus.equals(ElementStatus.VISIBLE)){
//                if(driver.findElement(by).isDisplayed())
//                    return ElementStatus.VISIBLE;
//                return ElementStatus.NOTVISIBLE;
//            }
//            return ElementStatus.PRESENT;
//        }catch(org.openqa.selenium.NoSuchElementException nse){
//            return ElementStatus.NOTPRESENT;
//        }
//    }
//	///////////////////////////////////////////////////
//    protected boolean isElementPresent(By by){
//        try{
//            driver.findElement(by);
//            return true;
//        }
//        catch(NoSuchElementException e){
//            return false;
//        }
//    }
//	
    ///////////////////
	
//	private boolean existsElement(String id) {
//	    try {
//	        driver.findElement(By.id(id));
//	    } catch (NoSuchElementException e) {
//	        return false;
//	    }
//	    return true;
//	}
    
}
