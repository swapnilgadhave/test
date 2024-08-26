package RestAPI;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import net.minidev.json.JSONObject;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class providingstr {
	
	private String id;
	
	@BeforeTest()
	public void setupurl()
	{
		RestAssured.baseURI="https://reqres.in/api/users";
	}
	@Test(priority=1)
	public void strmethod()
	{
		String str = "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		Response response = given().contentType("application/json")
		.body(str)
		.when().post("/users");
	
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		
		JsonPath jspath = response.jsonPath();
		System.out.println(jspath.getString("name"));
		 id = jspath.getString("id");
		
		System.out.println("Id after post request " +id);
		
	}
	
	@Test(priority=3 , dependsOnMethods= {"UpdateMethod"})
	public void delete()
	{
		
		Response response = given().contentType("application/json").when()
		.delete("/users" +id);
		
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println("ID after delete " +id);
		System.out.println(response.then().statusLine("HTTP/1.1 204 No Content"));
		
		
	}
	
	@Test(priority = 2, dependsOnMethods= {"strmethod"})
	public void UpdateMethod()
	{
		String str = "{\r\n"
				+ "    \"name\": \"updatedname\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		
		Response response = given().contentType("application/json").body(str)
		.when().put("/users" +id);
		
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println("id after update " +id);
	}
	

}
