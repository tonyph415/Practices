package Practices;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC005_ExtracEachValuesInNodes {
	@Test
	void getweatherDetails()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification req=RestAssured.given();
		Response response = req.request(Method.GET, "/Hyderabad");
		
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Assert
		// validate all nodes
		JsonPath jsonpath = response.jsonPath();
		System.out.println(jsonpath.get("Temperature"));
		System.out.println(jsonpath.get("wind"));
		System.out.println(jsonpath.get(""));
		
		
}
}
