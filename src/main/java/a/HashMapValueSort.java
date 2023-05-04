package a;

import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.Map;

public class HashMapValueSort {
    public static void main(String[] args) {
        sortinValueBasedOnValue();
    }

    private static void sortinValueBasedOnValue() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 30);
        map.put(3, 50);

        map.entrySet().stream().sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue())).forEach(System.out::println);


        RestAssured.baseURI = "www.google.com";

        RestAssured.given().sessionId("123").when().get().then().log().all();

        // CI variable -

    }
}
