package practiceAPIs;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_request {

	@Test
	void getweatherdetails () {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		RequestSpecification httrequest = RestAssured.given();
		
		Response response = httrequest.request(Method.GET,"/Hyderabad");
		
		String responseBody =response.getBody().asString();
		System.out.println("Response Body is: " + responseBody);
		
		
		int statusCode = response.getStatusCode();
		System.out.println("Status code is:" + statusCode);
		Assert.assertEquals(statusCode, 200);
		
		String statusline = response.getStatusLine();
		System.out.println("status line is: " + statusline);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
		
	}
	
	
	
	
	
}
