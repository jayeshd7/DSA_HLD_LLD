package FOX;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;

public class FoxInterview {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        // 1. JSON file to Java object


        try (Reader reader = new FileReader("src/main/java/FOX/fox.json")) {

            // Convert JSON File to Java Object
            FoxResponse foxResponse = gson.fromJson(reader, FoxResponse.class);

            System.out.println(foxResponse.getPluralized_key().getOne());

            // print staff
            //System.out.println(foxResponse.toString());


        }




    }
}


