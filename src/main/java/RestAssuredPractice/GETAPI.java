package RestAssuredPractice;

import io.restassured.authentication.FormAuthConfig;
import io.restassured.authentication.OAuthSignature;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GETAPI {

    SoftAssert softAssert = new SoftAssert();

    String baseUrl = "http://ergast.com/api/f1/2017/circuits.json";

    @Test(description = "GET API")
    public void validatingNumberOfCircuit(){
        //log all response
        given().get(baseUrl).then().assertThat().statusCode(200).log().all();

        // validate number of circuits

        given().get(baseUrl).then().assertThat().body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));

        // validate the response header

        given().get(baseUrl).then().assertThat().header("Content-Length", equalTo("4552"));

        // and method

        given().
                get(baseUrl).
                then().
                assertThat().
                header("Content-Length", equalTo("4552")).
                and().
                assertThat().
                header("Content-Type", equalTo("application/json; charset=utf-8")).
                and().
                statusCode(200);

        //RestAssured.given().get(baseUrl).then().assertThat().body("MRData.CircuitTable.Circuits.Location.country", hasItemInArray("Australia"));

        given().get(baseUrl).then().assertThat().body("MRData.CircuitTable.Circuits.Location.country", hasItem("Australia"));
    }

    @Test(description = "Validation of series Name which is f1")
    public void validatingSeriesName() {

        given().get(baseUrl).then().log().all();

        //Convert ResponseBody to String
        String responseBody=given().when().get(baseUrl).getBody().asString();
        //Create JsonPath Object by Passing the Response Body as a string
       JsonPath jsonPath = new JsonPath(responseBody);
       for (int i=0; i<20; i++) {
           String actualCountry = jsonPath.getString("MRData.CircuitTable.Circuits.Location.country[" + i + "]");
           System.out.println(actualCountry);

           softAssert.assertEquals(actualCountry, "Canada");
       }
        String actualSeries = jsonPath.getString("MRData.series");
        Assert.assertEquals(actualSeries, "f1");
    }

    @Test(description = "Validation of Google search using Query Params")
    public void testWithPathParams() {
        String searchItem = "https://www.wikipedia.org/";
        given().queryParam("q",searchItem).when().get("https://www.google.com/search").then().assertThat().statusCode(200);
    }

    @DataProvider(name="seasonsAndRaceNumbers")
    public Object[][] testDataFeed() {
        return new Object[][] {
                {"2017",20},
                {"2016",21}
        };
    }

    @Test(description = "Number Of Circuits validation in different Seasons",dataProvider = "seasonsAndRaceNumbers")
    public void circuitNumberValidation(String seasonYear,int raceNumbers) {
        given().pathParam("season",seasonYear).when().get("http://ergast.com/api/f1/{season}/circuits.json").then().assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(raceNumbers));
    }

    @Test(description = "cookies")
    public void cookiesValidation(){
        given().cookie("username","bhavi").when().get("https://www.google.com/").then().log().all();
    }

    @Test(description = "basic auth")
    public void basicAuthValidation(){
        given().auth().preemptive().basic("un","pwd").when().get("https://www.google.com/").then().assertThat().statusCode(200);
    }

    @Test(description = "form auth")
    public void formAuthValidation(){
        given().auth().form("un","pwd", new FormAuthConfig("when page come","un","pwd")).when().get("https://www.google.com/").then().assertThat().statusCode(200);

        given().auth().form("un", "pwd", FormAuthConfig.formAuthConfig().withCsrfFieldName("_csrf")).when().get("https://www.google.com/").then().assertThat().statusCode(200);
    }

    @Test(description = "oauth creation")
    public void oauthValidation() {
        given().auth().oauth("consumerKey","consumerSecret","accessToken","secretToken").when().get("https://www.google.com/").then().assertThat().statusCode(200);
        given().auth().oauth2("accessToken").when().get("https://www.google.com/").then().assertThat().statusCode(200);
        given().auth().oauth2("accessToken", OAuthSignature.HEADER).when().get("https://www.google.com/").then().assertThat().statusCode(200);
    }

}
