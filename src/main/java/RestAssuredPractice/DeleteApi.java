package RestAssuredPractice;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeleteApi {


    public static final String baseUrl = "https://reqres.in";

    @DataProvider(name = "deleteData")
    public Object[][] deleteApiData() {
        return new Object[][] {
                {2},{3}
        };
    }

    @Test(description = "delete api", dataProvider = "deleteData")
    public void deleteApi(int id){


        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.pathParams("id", id);
        Response deleteResponse = request.delete(baseUrl + "/api/users/{id}");
        System.out.println(deleteResponse.getBody().prettyPrint());
        Assert.assertEquals(deleteResponse.getStatusCode(), 204);


    }




}
