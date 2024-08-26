package RestAPI;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.RestAssured;

import io.restassured.builder.RequestSpecBuilder;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static org.hamcrest.Matchers.*;
public class responsespec {
		
	    // Define the request specification
	    private static RequestSpecification requestSpec;
	    
	    // Define the response specification
	    private static ResponseSpecification responseSpec;

	    static {
	        // Build and configure the request specification
	        requestSpec = new RequestSpecBuilder()
	                        .setBaseUri("https://reqres.in")
	                        .setBasePath("/api/users/2")
	                        .addHeader("Accept", "application/json")
	                        .build();
	        
	        // Build and configure the response specification
	         responseSpec = new ResponseSpecBuilder()
	                        .expectStatusCode(200)
	                        .expectHeader("Content-Type", "application/json; charset=utf-8")
	                        .build();
	    }

	    public static void main(String[] args) {
	        // Use the request specification and response specification
	        Response response = RestAssured.given()
	                                       .spec(requestSpec)
	                                       .when()
	                                       .get();
	        
	        // Validate the response using the response specification
	        response.then().spec(responseSpec);
	        
	        // Print the response body as a String
	        System.out.println(response.asString());
	    }
	}
	


