package AugustBatchProblem.Advanced.javaDP;


import org.junit.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HackerRankAPIAutomation {
    @Test
    public void getResponse() {
        String endpoint = "https://jsonmock.hackerrank.com/api/inventory";

        ArrayList<Datum> arrayList = new ArrayList<>();
       arrayList.add(new Datum("74001755","Ball Gown","Full Body Outfits",785,7,1));


        Product expectedProduct = new Product(1,500,1,1);
        Product actualProduct =
                given().
                        queryParam("barcode", 74001755).
                        when().
                        get(endpoint).as(Product.class);



      assertThat(expectedProduct.getPer_page(), samePropertyValuesAs(expectedProduct.getPer_page()));
    }


}
