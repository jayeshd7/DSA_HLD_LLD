package RestAssuredPractice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostApi {

    String baseUrl = "https://demoqa.com";

    @Test(description = "This is a test method")
    public void testPostResponse(){

        //Response response = given().header("Content-Type", "application/json").body(requestBody.toJSONString()).when().post(baseUrl + "/Account/v1");
        //System.out.println(response.getBody().prettyPrint());
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("UserName", "test_rest");
        requestParams.put("Password", "rest@123");
        request.body(requestParams.toJSONString());
        Response response = request.when().post(baseUrl+"/Account/v1/User");
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(),400);
        ResponseBody body = response.getBody();
        System.out.println(body.prettyPrint());

        JSONSuccessResponse res = body.as(JSONSuccessResponse.class);

        Assert.assertEquals(res.getCode(), "1200");
        Assert.assertTrue(res.getMessage().contains("required"));


    }

}
