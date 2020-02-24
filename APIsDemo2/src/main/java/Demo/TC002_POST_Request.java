package Demo;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_POST_Request {

	
	@Test
	void RegistrationSuccessful () {
		// specify base URI
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RequestSpecification httprequest = RestAssured.given();
		
		// These are all request payload sendinf along with post request
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("FirstName", "fname1");
		requestParams.put("LastName", "lname1");
		requestParams.put("UserName", "user1");
		requestParams.put("Password", "pword1");
		requestParams.put("Email", "example@gmail.com");
		httprequest.header("contetn - Type", "application/json");
		httprequest.body(requestParams.toJSONString());
		
		// Now send the request
		Response response = httprequest.request(Method.POST, "/register");
		
		// print response in console window
		String responseBody = response.getBody().asString();
	System.out.println("Response Body is "+ responseBody);
		
		// Capture the status code
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 201);
		
		//Assert
		String sucessCode = response.jsonPath().get("SucessCode");
//		Assert.assertEquals(sucessCode,  "OPERTION_SUCESS");

	}
	
	
	
}