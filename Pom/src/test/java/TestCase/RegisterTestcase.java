package TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library.WrapperEx;
import ObjectMaps.RegisterPg;

public class RegisterTestcase extends WrapperEx{
	
		@BeforeClass
		public void startUp() {
			launchApplication("firefox", "https://www.facebook.com/");
		}
		
		@Test
		public void register() {
			RegisterPg rpage = new RegisterPg(driver);
			rpage.userfirstname("FirstName");
			rpage.userlastname("LastName");
			rpage.regEmailPhone("email@1234.com");
			rpage.confirmEmailPhone("email@1234.com");
			rpage.registerpass("Password");
			rpage.uRegMonth("Jun");
			rpage.uRegDay("10");
			rpage.uRegYear("1990");
//			rpage.genderM();
			rpage.usergender("Female1");
			rpage.RegSubmitbutton();
			
			
		}
		
		@AfterClass
		public void close() {
			
			quit();
		}
		
	}