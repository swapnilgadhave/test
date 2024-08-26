package RestAPI;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ParameterAnnotation {

@Test
@Parameters({"name","job"})//@Parameters({"parametername1","parametername2"})
public void strmethod(String name, String job)
{
	String str = "{\r\n"
            + "    \"name\": \"" + name + "\",\r\n"
            + "    \"job\": \"" + job + "\"\r\n"
            + "}";
	
	Response response = given().contentType("application/json")
	.body(str)
	.when().post("https://reqres.in/api/users");
	
	System.out.println(response.getBody().asString());
	System.out.println(response.getStatusCode());
	System.out.println(response.getStatusLine());
	System.out.println(response.getTime());
	}
}
