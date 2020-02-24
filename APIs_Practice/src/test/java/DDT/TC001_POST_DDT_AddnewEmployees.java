package DDT;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import com.sun.xml.xsom.impl.Ref.ContentType;
public class TC001_POST_DDT_AddnewEmployees {
	
	@Test(dataProvider = "empdataprovider")
    public void createEmployee(String ename, String esal, String eage) {
 
		// specify base URI
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/";
		// Request Object
		RequestSpecification httrequest = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("name", ename); 
		requestParams.put("salary", esal);
		requestParams.put("age", eage);
		
		
		// add header starting the request body is a JSON
		httrequest.header("Content-Type","application/json");
		// Add the JSON to the body of the request
		httrequest.body(requestParams.toJSONString());
		
		// Response Object
		Response response = httrequest.request(Method.POST,"/create");

		// Print out response on console window
		String responseBody =response.getBody().asString();
		System.out.println("Response Body is: " + responseBody);
		
		Assert.assertEquals(responseBody.contains(ename), true);
		Assert.assertEquals(responseBody.contains(esal), true);
		Assert.assertEquals(responseBody.contains(eage), true);
//		Assert.assertEquals(responseBody.contains("44"), true);
		
		// Status code validation 
		int statusCode = response.getStatusCode();
		System.out.println("Status code is:" + statusCode);
		Assert.assertEquals(statusCode,200);
	}
	
	@DataProvider (name="empdataprovider")
	String[][] getEmpData () throws IOException {
		// Read Data from Excel
		String path="C:\\Users\\tuand\\eclipse-workspace\\practiceAPIs\\src\\main\\resources\\Book1.xlsx";
//		String path=System.getProperty("user.dir")+ "src/main/resources/Book1.xlsx";
			
		int rownum = XLUtils.getRowCount(path,"EMP");
		int colcount = XLUtils.getCellCount(path,"EMP",1);
		
		String empdata[][] = new String [rownum][colcount];
		
		for (int i=1; i<=rownum; i++) {
			for (int j=1; j<=colcount; j++) {
			empdata[i-1][j] = XLUtils.getCellData(path, "EMP", i, j);
			
		}
		}
		
		
		
//		String empdata[][]= {{"name1","120300","34"},{"name2","122300","44"},{"name3","111300","24"} };
		return (empdata);
		
	}
	
}
