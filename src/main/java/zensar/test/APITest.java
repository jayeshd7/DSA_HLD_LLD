package zensar.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import zensar.test.ResponsePOJO.SearchPOJO;

import java.util.Arrays;

//GetBookDetailsResponse response = request.get(url + "/BookStore/v1/Books").as(GetBookDetailsResponse.class);

public class APITest {

    String url = "http://universities.hipolabs.com/search";




    @Test(description = "Get the value of state province")
    public void getStateProvince() {
        RequestSpecification request = RestAssured.given();
        String country = "South Africa";
        request.queryParam("country", country);

        Response response = request.get(url);
        ResponseBody body = response.getBody();
        SearchPOJO[] resp = body.as(SearchPOJO[].class);

        Arrays.stream(resp).forEach(x -> {
            if(x.getName().equals("University of Zululand")){
                System.out.println(x.getStateProvince());
            }
        });
        Arrays.stream(resp).forEach(x -> {
            x.getDomains().stream().forEach(y -> {
                if(y.equals("unizulu.ac.za")){
                    System.out.println(x.getName());
                    System.out.println(x.getStateProvince());

                }
            });
        });



        // TODO: Get the value of state province
        /*SearchPOJO response = request.get(url).as(SearchPOJO.class);

        if(response.getName().equals("Witwatersrand")){
            System.out.println(response.getStateProvince());
        }*/






    }

    /*@Test
    public void getRequest() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        Request request = new Request.Builder()
                .url("http://universities.hipolabs.com/search?country=South+Africa")
                .get()
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string().contains("Witwatersrand"));
    }*/

}
