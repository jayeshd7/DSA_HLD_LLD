package Java8Feature.StreamFeature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFeatures {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Java", "In", "Action");
        List<Boolean> a = lst.stream().filter(p -> p.length() > 2).map(p -> p.startsWith("A")).collect(Collectors.toList());
        System.out.println(a);
    }
}
