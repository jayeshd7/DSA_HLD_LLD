package FOX;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RestAssuredRequest {

    private static String requestBody = "{\n" +
            "  \"title\": \"foo\",\n" +
            "  \"body\": \"bar\",\n" +
            "  \"userId\": \"1\" \n}";


    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
    @Test
    public void getRequest(){
     Response response = (Response) RestAssured.given().contentType(ContentType.JSON).param("postID","2")
             .when().get("/posts").then().extract();
       // System.out.println(response.getBody().prettyPrint());
        Assertions.assertEquals(200, response.statusCode());
        String Actual = response.jsonPath().getString("title[1]");
        ResponseBody actualResponse  = response.getBody();

        Assertions.assertEquals("qui est esse", Actual);
    }

    @Test
    public void getRequest2() {
        Response response = RestAssured.given().auth().form("username", "password")
                .when().get("/posts/2")
                .then().statusCode(200).extract().response();

        System.out.println(response.getBody().prettyPrint());
    }
    @Test
    public void postRequest() {
        Response response = RestAssured.given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .extract().response();

        Assertions.assertEquals(201, response.statusCode());
        Assertions.assertEquals("foo", response.jsonPath().getString("title"));
        Assertions.assertEquals("bar", response.jsonPath().getString("body"));
        Assertions.assertEquals("1", response.jsonPath().getString("userId"));
        Assertions.assertEquals("101", response.jsonPath().getString("id"));
    }

    @Test
    public void test2() {

        JSONObject request = new JSONObject();
        request.put("name", "chaya");
        request.put("job", "BA");

        System.out.println(request);
        System.out.println(request.toString());

        Response response = (Response) RestAssured.given().
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().extract().response();
        String ar = response.getBody().asString();


    }

}
