package practiceAPIs;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC004_GET_Request_Autherization {
	@Test
	public void AuthenticationBasics()
	{
	 RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication";
	 RequestSpecification request = RestAssured.given();
	 
	 Response response = request.get();
	 System.out.println("Status code: " + response.getStatusCode());
	 System.out.println("Status message " + response.body().asString());
	}
}
