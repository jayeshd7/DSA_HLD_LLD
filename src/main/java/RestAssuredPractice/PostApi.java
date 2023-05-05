package RestAssuredPractice;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostApi {

    String baseUrl = "https://demoqa.com";

    String reqresUrl = "https://reqres.in";

    GETAPI getApi = new GETAPI();




    @Test(description = "test reqres post api using json object")
    public void postReqresApi(){


        RequestSpecification request = RestAssured.given();
        /*JsonObject body = new JsonObject();
        body.addProperty("name", "morpheus");
        body.addProperty("job", "leader");
        request.header("Content-Type", "application/json");*/

        ReqresBody reqresBody = new ReqresBody();
        reqresBody.setName("morpheus");
        reqresBody.setJob("leader");
        request.header("Content-Type", "application/json");
        request.body(reqresBody);

        Response response = request.post(reqresUrl + "/api/users");
        System.out.println(response.getBody().prettyPrint());
        ResponseBody resBody = response.getBody();
        ReqresPostResponse reqResponse = resBody.as(ReqresPostResponse.class);

        System.out.println(reqResponse.getName());
        Assert.assertEquals(reqResponse.getName(), "morpheus");


    }

    @Test(description = "This is a test method")
    public void testPostResponse(){

        //Response response = given().header("Content-Type", "application/json").body(requestBody.toJSONString()).when().post(baseUrl + "/Account/v1");
        //System.out.println(response.getBody().prettyPrint());
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("UserName", "test_rest");
        requestParams.put("Password", "rest@123");
        request.header("Content-Type", "application/json");
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
