package zensar.test;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import okhttp3.*;
import org.testng.annotations.Test;
import zensar.test.ResponsePOJO.SearchPOJO;

import java.io.IOException;

//GetBookDetailsResponse response = request.get(url + "/BookStore/v1/Books").as(GetBookDetailsResponse.class);

public class APITest {

    String url = "http://universities.hipolabs.com/search";




    @Test(description = "Get the value of state province")
    public void getStateProvince() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.queryParam("country", "South+Africa");
        ValidatableResponse all = request.get(url).then().log().all();
        System.out.println(all);
       // ObjectMapper objectMapper = new ObjectMapper();

        // TODO: Get the value of state province
        /*SearchPOJO response = request.get(url).as(SearchPOJO.class);

        if(response.getName().equals("Witwatersrand")){
            System.out.println(response.getStateProvince());
        }*/






    }

    @Test
    public void getRequest() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        Request request = new Request.Builder()
                .url("http://universities.hipolabs.com/search?country=South+Africa")
                .get()
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string().contains("Witwatersrand"));
    }

}
