package RestAPI;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import RestAPI.pojoclass;
import io.restassured.response.Response;

public class genertaerequests {

	public static void main(String[] args) {

		// Map<String, String> jsonmap = new HashMap<>();
		pojoclass p1 = new pojoclass();
		p1.setJob("Testing");
		p1.setName("User1");

		Response response1 = given().contentType("application/json").body(p1).when()
				.post("https://reqres.in/api/users");

		System.out.println("Response Body: " + response1.getBody().asString());
		System.out.println(response1.getContentType());
		System.out.println(response1.getStatusCode());
		response1.then().statusCode(201);

	}
}
