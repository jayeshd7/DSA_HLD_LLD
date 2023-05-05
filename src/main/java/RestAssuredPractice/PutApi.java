package RestAssuredPractice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class PutApi {

    String baseUrl = "https://reqres.in";

    @Test
    public void testPutApi(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.header("Authorization", "Bearer ea9b6efb237270f2823699c477d3b4034f840ef2a87567ea8924f811a43a8f68a2c7f870cec5516e75552e0477a830ca15d9350d2b3c64810fe8b5fc35ad2c02d07204915acc2c7a016fd8c21d0410bbdcea79658be083319f12cdcf12c12b4b111e04c389dfae2317a2b200b1278d8dc165e2975e564935df98d3728d39392b27aefd00e1e87ce16510426fb622b8f7ff671fb73ee38341fe930ae8d56014cfbc7c1196107216d6fc01f14a73c661114f9ba42d874f67b2358066c54ba766a5632d04be3495956af9b1d3266f112ecce45902fb05973966dc023f7e602b79f6b128f0381629cbd2125b946611955d25e9a3071fd2cbe57bb77fe8451fb191fbc5e350705acfb1df2fb8fc580dcfbc0236b9042d66891c7fb544a3bf2f73d1a6230359e0fe665fa78c83703c44c5dd7124bae99b7855d89f81368fbdd41472bfdd437fc831d788072e79b33f563fc89729aaf64d83666b66f4381658c753ae88d7cd5a72cf3b8ca5a5f06d347ac367cf93d847e5b9ffd9eb1dda75f6a753a9356a158e6a0e7169b16bd3b397acf7b1c308f3da2c65863335a8740c9152e4d94ba41d6d32aff9c1461d876d2d0f928e5307e1a2cef3b79bd8bd7a25ee1bc8d3dfdf03c1af04e26c1f2b5a33ed8279e9f231277812b78fba583b88f6eac3957bba");

        ReqresBody reqresBody = new ReqresBody();
        reqresBody.setName("morpheus");
        reqresBody.setJob("zion resident");
        request.body(reqresBody);

        Response response = request.put(baseUrl + "/api/users/2");
        System.out.println(response.getBody().prettyPrint());
        Assert.assertEquals(response.getStatusCode(), 200);

        ResponseBody resbody = response.getBody();
        ReqresPostResponse reqResponse = resbody.as(ReqresPostResponse.class);
        Assert.assertEquals(reqResponse.getName(), "morpheus");



    }


}
