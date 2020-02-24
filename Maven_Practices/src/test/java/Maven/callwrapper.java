package Maven;

import java.io.IOException;
import org.testng.xml.dom.Wrapper;

public class callwrapper {

	public static void main(String[] args) throws IOException {
		
		Wrappermethods wm = new Wrappermethods();
		wm.insertapp("https://www.facebook.com/");
		wm.enterbyid("email", "abc@gmail.com");
		wm.enterbyid("pass", "123");
		wm.clickbyxpath("//*[@id=\"u_0_2\"]");
		wm.takesnap("C:\\Users\\tuand\\Desktop\\Testing\\Screenshot\\" + System.currentTimeMillis()+".png");
		wm.closeapp();


	}

}
