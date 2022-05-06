package FOX;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.ArrayList;

public class RestServiceDemo {

    @Test
    public void postRequestDemo(){

        RestAssured.baseURI ="https://rahulshettyacademy.com";
        RestAssured.useRelaxedHTTPSValidation();

        AddPlace  pojo= new AddPlace();
        pojo.setAccuracy(70);
        pojo.setAddress("Saket Terminal");
        pojo.setLanguage("UnitedKingdon-IN");
        pojo.setPhone_number("(+91) 8567523457");
        pojo.setWebsite("http://code2test.com");
        pojo.setName("new collectorate office");

        ArrayList<String> list=new ArrayList<String>();
        list.add("Belt Number");
        list.add("Local Number");

        pojo.setTypes(list);

        Location loc=new Location();
        loc.setLat(-34.4567);
        loc.setLng(56.2453);

        pojo.setLocation(loc);

       /* Response response=RestAssured.given().queryParam("key","qaclick123")
                .body(pojo)
                .when().post("maps/api/place/add/json")
                .then().log().all().assertThat().assertThat().statusCode(200).extract().response();*/

        ResponseDataObject responseDataObject = RestAssured.given().queryParam("key","qaclick123")
                .body(pojo)
                .when().post("maps/api/place/add/json").thenReturn().as(ResponseDataObject.class);

        Assertions.assertEquals("OK",responseDataObject.getStatus());






    }
}
