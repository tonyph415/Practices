package Practices;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo {

	@Test

    void RegistrationSucessful() {

          // specify base URI

          RestAssured.baseURI = "http://restapi.demoqa.com/customer";

          RequestSpecification httprequest = RestAssured.given();



          // theses are all request payload sendinf along with post request

          JSONObject requestParams = new JSONObject();

         

          requestParams.put("FirstName", "2Agama1");

          requestParams.put("LastName", "A2gamaj Fremont");

          requestParams.put("UserName","Ag2amar");

          requestParams.put("Password", "Aga2mar");

          requestParams.put("Email", "Agam22fa@agamaSolutions.com");

          httprequest.header("content- Type", "application/json");

          httprequest.body(requestParams.toJSONString());



          // now send the request

          Response response = httprequest.request(Method.POST, "/register");



          // print response in console window

          String responseBody = response.getBody().asString();

          System.out.println("Response Body is :" + responseBody);



          // how to capture the status code?for post the sucess id 201

          int statusCode = response.getStatusCode();

          System.out.println(statusCode);

         // Assert.assertEquals(statusCode, 201);



          // Assert



          String sucessCode = response.jsonPath().get("SucessCode");

          //Assert.assertEquals(sucessCode, "OPERATION_SUCCESS");

    }



}