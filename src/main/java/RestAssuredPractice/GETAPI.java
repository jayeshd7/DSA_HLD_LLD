package RestAssuredPractice;

import io.restassured.RestAssured;
import io.restassured.authentication.FormAuthConfig;
import io.restassured.authentication.OAuthSignature;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GETAPI {

    SoftAssert softAssert = new SoftAssert();

    String baseUrl = "http://ergast.com/api/f1/2017/circuits.json";


    String jiraUrl = "https://gofin.atlassian.net";

    @Test(description = "GET JIRA API")
    public void getJIRApi() {
        String un = "jayesh.dalal@gojek.com";
        String pwd = "ATATT3xFfGF0CIPpHVIgZmSQAZmP3rI6ZmIju3HIplB239WPULqlB2fXPkbC5Xkqzh4QgW36VvT9HsQd91M6FOaJ8nXCMqaZppLOyJ5H6zKF3BAVadSGZWpg1OPVmPSCvS3Jb_heKwsRvNR7hXYwTLc5pg9UwuWIeGJf4NMhEDWqwyUQfXrjwT8=C28B498B";

        RequestSpecification request = RestAssured.given();
        request.auth().preemptive().basic(un,pwd);
        request.header("Content-Type", "application/json");
        Response response = request.get(jiraUrl + "/rest/servicedeskapi/request");
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
        Assert.assertEquals(response.getStatusCode(), 200);

        JiraResponse jiraResponse = response.as(JiraResponse.class);
        Assert.assertTrue(jiraResponse.get_expands().get(0).equals("participant"));

        int valueSize = jiraResponse.getValues().size();
        for (int i = 0; i < valueSize; i++) {
            if(jiraResponse.getValues().get(i).getIssueId().equals("48950")){
                System.out.println(jiraResponse.getValues().get(i).getIssueKey());

            }
        }
    }


    @Test(description = "GET API")
    public void validatingNumberOfCircuit(){
        //log all response
        given().get(baseUrl).then().assertThat().statusCode(200).log().all();

        // validate number of circuits

        given().get(baseUrl).then().assertThat().body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));

        // validate the response header

        given().get(baseUrl).then().assertThat().header("Content-Length", equalTo("4552"));

        // and method

        Response response = given().
                get(baseUrl).
                then().
                extract().response();
        Assert.assertTrue(response.getHeader("Content-Length").equals("4552"));
        Assert.assertEquals(response.getStatusCode(), 200);
        int length = response.jsonPath().getString("MRData.CircuitTable.Circuits").length();
        System.out.println("length is " + length);
        Assert.assertEquals(response.jsonPath().getString(
                "MRData.CircuitTable.Circuits.circuitId[0]"), hasItem("albert_park"));

        //RestAssured.given().get(baseUrl).then().assertThat().body("MRData.CircuitTable.Circuits.Location.country", hasItemInArray("Australia"));

        //given().get(baseUrl).then().assertThat().body("MRData.CircuitTable.Circuits.Location.country", hasItem("Australia"));
    }


    @Test(description = "checking status of api")
    public void getAssertDataUsingPojo() {

        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        Response response = request.get(baseUrl);
        Assert.assertEquals(response.getStatusCode(), 200);
        ResponseBody body = response.getBody();
        System.out.println(body.prettyPrint());

        MRDataResponse mrResponse = body.as(MRDataResponse.class);
        int size = mrResponse.getMRData().getCircuitTable().getCircuits().size();
        System.out.println("size is " + size);
        Assert.assertEquals(size, 20);
        for (int i = 0; i < size; i++) {
            String actualCountry = mrResponse.getMRData().getCircuitTable().getCircuits().get(i).getLocation().getCountry();
            if(actualCountry.equals("Canada")){
                String locality = mrResponse.getMRData().getCircuitTable().getCircuits().get(i).getLocation().getLocality();
                System.out.println("locality is " + locality);
            }
        }



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
