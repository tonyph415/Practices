package Practices;

import org.apache.http.Header;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_GET_Request {

	@Test
    void RegistrationSucessful() {
          // specify base URI
          RestAssured.baseURI = "http://maps.googleapis.com";
          RequestSpecification httprequest = RestAssured.given();

          // now send the request
          Response response = httprequest.request(Method.POST, "//maps//api//place//nearbysearch//xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyBjGCE3VpLU4lgTqSTDmHmJ2HoELb4Jy1s\\");
          // print response in console window

          String responseBody = response.getBody().asString();
          System.out.println("Response Body is :" + responseBody);
          
          // print response body
          System.out.println(responseBody);
          // Capture details of header from response
          String contentType = response.getHeader("Content-Type");
          System.out.println("Content-Type is " + contentType);

          // Assert
          // content encoding 
          String contentEnCoding = response.header("Content_Encoding");
          System.out.println("Content encoding Type is " + contentEnCoding);
          
          // Assert
          // display all headers in the response
          Headers allHeaders = response.headers();
          // for (Header header: allHeaders) {
          for (io.restassured.http.Header header: allHeaders) { 
        	  System.out.println(header.getName()+"  ---->  " + header.getValue());
          }



        

    }



}