package Revision.String;

/*

 A file having words
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class TesselInterview {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.FileReader("/Users/jayeshdalal/Desktop/assignment.txt"));
        String s = br.readLine();
        Stream<String> lines = br.lines();
        lines.distinct().forEach(System.out::println);
        String[] words = s.split(" ");
        List<String> list = List.of("," , ".");
        HashMap<String, Integer>hm = new HashMap<>();
        for(int i =0; i<words.length;i++){

            if(hm.containsKey(words[i])){
                int value = hm.get(words[i]);
                hm.put(words[i], value+1);
        }
            else{
                hm.put(words[i], 1);
            }
            if(words[i].equals(list.get(0)) || words[i].equals(list.get(1))){
                hm.remove(words[i]);
            }
        }

        System.out.println(hm);
    }
}
