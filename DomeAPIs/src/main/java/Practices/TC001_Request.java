package Practices;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TC001_Request {
	
	@Test
	void getweatherDetails()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification req=RestAssured.given();
		Response response = req.request(Method.GET, "/Hyderabad");
		String responseBody=response.getBody().asString();
		System.out.println("Response Body is "+responseBody);
		int statuscode=response.getStatusCode();
		System.out.println("StatusCode is "+statuscode);
		Assert.assertEquals(statuscode, 200);
		
		String statusline=response.getStatusLine();
		System.out.println("The status Line is "+statusline);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
		
	}

}