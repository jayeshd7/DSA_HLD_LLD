package Java8Feature.StreamFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));


        Function<Integer, String> f1 = (num) -> num + "_Number";

        Stream<String> stringStream = list.stream().map(f1);
       // stringStream.forEach(System.out::println);
        stringStream.map(String::toUpperCase).forEach(System.out::println);

    }
}
