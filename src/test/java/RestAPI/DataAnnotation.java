package RestAPI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DataAnnotation {

	@DataProvider(name="userdata")
	public Object[][] CreateData()
	{
		return new Object[][]
				{
			{"morpheus", "leader"},
            {"neo", "the one"},
            {"trinity", "hacker"}
				};
	}
	@Test(priority = 1 ,dataProvider="userdata")
	public void strmethod(String name, String job)
	{
		String str = "{\r\n"
                + "    \"name\": \"" + name + "\",\r\n"
                + "    \"job\": \"" + job + "\"\r\n"
                + "}";
		Response response = given().contentType("application/json")
		.body(str).when().post("https://reqres.in/api/users");
		System.out.println(response.getBody().asString());
		
		
	}
}
