package AugustBatchProblem.RandomProblems;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

/*
 * Java Program to convert a List to Map in Java 8.
 * We'll convert an ArrayList of String to an HashMap
 * where key is String and value is their length
 */
public class listToMap {

    public static void main(String[] args) throws Exception {

        // an ArrayList of String object
        List<String> listOfString = new ArrayList<>();
        listOfString.add("Java");
        listOfString.add("JavaScript");
        listOfString.add("Python");
        listOfString.add("C++");
        listOfString.add("Ruby");

        System.out.println("list of string: " + listOfString);

        // converting ArrayList to HashMap before Java 8
        Map<String, Integer> map = new HashMap<>();
        for (String str : listOfString) {
            map.put(str, str.length());
        }

        System.out.println("generated map: " + map);

        // converting List to Map in Java 8 using lambda expression
        Map<String, Integer> map8 = listOfString.stream().collect(
                toMap(s -> s, s -> s.length()));

        System.out.println("generated map: " + map);

        // using method reference
        map8 = listOfString.stream().collect(
                toMap(Function.identity(), String::length));

        // convert list with duplicate keys to HashMap
        listOfString.add("Java");
        System.out.println("list of string with duplicates: " + listOfString);
        HashMap<String, Integer> hash = listOfString.stream()
                .collect(
                        toMap(Function.identity(), String::length, (e1, e2) -> e2,
                                HashMap::new));
        System.out.println("generated hashmap:" + hash);

        // keep the order same as original list while conversion
        LinkedHashMap<String, Integer> linked = listOfString.stream().collect(
                toMap(Function.identity(), String::length, (e1, e2) -> e2,
                        LinkedHashMap::new));
        System.out.println("generated linkedhashmap:" + linked);
    }

}

