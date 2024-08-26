package RestAPI;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;

public class getResponse {

	public static void main (String[] args)
	{
	Response response = RestAssured.given().when().get("https://reqres.in/api/users/2");
	System.out.println(response.asString());// convert the response to string
	
	JsonPath js = response.jsonPath();//JSONPath
	String id = js.getString("data.id");
	String name = js.getString("data.first_name");
	System.out.println(id);
	System.out.println(name);
	
	//To validate response code, content-type, header
	response.then().statusCode(200);
	response.then().contentType("application/json");
	
	System.out.println(response.getStatusCode());
	System.out.println(response.getContentType());
	System.out.println("------------------------------");
	System.out.println(response.getHeaders());
	
	response.then().body("data.email",equalTo("janet.weaver@reqres.in"));
	//Assert.assertEquals(response.then().statusCode(), 200);
	
	
	}
}
