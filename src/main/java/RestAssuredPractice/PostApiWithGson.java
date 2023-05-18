package RestAssuredPractice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PostApiWithGson {



    public static final String baseUrl = "https://reqres.in";
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public ReqresBody getDataFromJson(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Personal_Code\\DSA_HLD_LLD\\src\\main\\java\\RestAssuredPractice\\testData.json"));
            ReqresBody reqresBody = gson.fromJson(bufferedReader, ReqresBody.class);
            return reqresBody;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
    @Test(description = "post api with gson")
    public void postApiWithGson(){
        ReqresBody dataFromJson = getDataFromJson();
        dataFromJson.setJob("leader");
        dataFromJson.setName("jayesh");

        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(dataFromJson);
        Response response = request.post(baseUrl + "/api/users");
        Assert.assertEquals(response.getStatusCode(), 201);

        ReqresPostResponse reqresPostResponse = response.getBody().as(ReqresPostResponse.class);
        Assert.assertEquals(reqresPostResponse.getName(), "jayesh");


    }

    @Test(description = "check reqres api with gson")
    public void checkLoginSuccessfull(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("email", "eve.holt@reqres.in");
        jsonObject.put("password", "cityslicka");
        request.body(jsonObject.toJSONString());
        Response response = request.post(baseUrl + "/api/login");
        Assert.assertEquals(response.getStatusCode(), 200);
        ResponseBody LoginResponse = response.getBody();
        ReqresLoginResponse reqresLoginResponse = LoginResponse.as(ReqresLoginResponse.class);
        System.out.println(reqresLoginResponse.getToken());
        Assert.assertNotNull(reqresLoginResponse.getToken());

    }
}
