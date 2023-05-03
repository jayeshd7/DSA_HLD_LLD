package FOX;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

public class RestAssuredAPIAutomation {

    String url = "https://demoqa.com";


    @Test

    public void getRequest(){
        RequestSpecification request = RestAssured.given().auth().preemptive().basic("test", "test");
        request.header("Content-Type", "application/json");
        JsonObject requestParams = new JsonObject();
        requestParams.addProperty("userName", "test");
        requestParams.addProperty("password", "test");
        request.body(requestParams.toString());
        Response response = request.get(url);
        System.out.println(response.getBody().prettyPrint());


    }

    @Test
    public void getBookDetails(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        GetBookDetailsResponse response = request.get(url + "/BookStore/v1/Books").as(GetBookDetailsResponse.class);
        System.out.println(response.getBooks().toString());
        int size = response.getBooks().size();

        for (int i = 0; i < size; i++) {
            System.out.println(response.getBooks().get(i).getIsbn());
        }
        String getBookTitle = response.getBooks().get(0).getTitle();

        System.out.println(getBookTitle);

    }
}
