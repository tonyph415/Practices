package practiceAPIs;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_POST_request {
	@Test
	void registrationSuccessful () {
		
		// specify base URI
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		// Request Object
		RequestSpecification httrequest = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("FirstName", "V5472323223ender"); 
		requestParams.put("LastName", "Sin17232323235623gh");
		requestParams.put("UserName", "sim1732323256pl32er001");
		requestParams.put("Password", "pas23232321563word1");
		requestParams.put("Email",  "some312323232563er@gmail.com");
		
		httrequest.header("Content-Type","application/json");
		httrequest.body(requestParams.toJSONString());
		
		// Response Object
		Response response = httrequest.request(Method.POST,"/register");
		
		// Print out response on console window
		String responseBody =response.getBody().asString();
		System.out.println("Response Body is: " + responseBody);
		
		// Status code validation 
		int statusCode = response.getStatusCode();
		System.out.println("Status code is:" + statusCode);
		Assert.assertEquals(statusCode,201);
		
		// SuccessCode validation 
		String successCode = response.jsonPath().get("SuccessCode");
		Assert.assertEquals(successCode, "OPERATION_SUCCESS");
		
		
		
	}
	
}
