package RestAssuredPractice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
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
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/jayeshdalal/PersonalGitHubCode/GFG/src/main/java/RestAssuredPractice/testData.json"));
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
        Assert.assertEquals(reqresPostResponse.getName(), "jysh");


    }
}
