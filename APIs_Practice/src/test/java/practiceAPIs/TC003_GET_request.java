package practiceAPIs;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_GET_request {
	@Test
	void googleMaps () {
		RestAssured.baseURI="http://maps.googleapi.com";
		
		RequestSpecification httrequest = RestAssured.given();
		
		Response response = httrequest.request(Method.GET,"/maps/search/post+office+near+me/@37.3157843,-122.0064286,11z/data=!3m1!4b1");
		
		String responseBody =response.getBody().asString();
		System.out.println("Response Body is: " + responseBody);
		
		
		int statusCode = response.getStatusCode();
		System.out.println("Status code is:" + statusCode);
		Assert.assertEquals(statusCode, 200);
		
		String statusline = response.getStatusLine();
		System.out.println("status line is: " + statusline);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
		
		
		// capture details of header from response
		String contentType = response.getHeader("Content-Type");
		System.out.println("Content Type is: "+contentType);
		Assert.assertEquals(contentType, "text/html; charset=UTF-8");
		
		String contentEncoding = response.getHeader("Content-Type");
		System.out.println("Content Encoding is: "+contentEncoding);
		Assert.assertEquals(contentType, "gzip");
		
		
	}
	
}
