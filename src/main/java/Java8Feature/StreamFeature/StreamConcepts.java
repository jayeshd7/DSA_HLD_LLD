package Java8Feature.StreamFeature;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamConcepts {

    public static void main(String[] args) {
        // We can also create a stream of any type of Collection (Collection, List, Set):
        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();


        //Stream of Array
        Stream<String> array = Stream.of("a","b","c");
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

        //Stream.builder()
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").build();
       // System.out.println(streamBuilder.findFirst().get());

        //Stream.generate()
        Stream<Integer> streamGenerated = Stream.generate(() -> count()).limit(10);
        //streamGenerated.forEach(s -> System.out.println(s));


        //Stream.iterate()
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
        //streamIterated.forEach(s-> System.out.println(s));

        //Stream of String
        IntStream streamOfChars = "abc".chars();
        Stream<String> stremOfString = Pattern.compile(", ").splitAsStream("a , b, c");
        // stremOfString.forEach(s-> System.out.println(s));

        List<String> elements =
                Stream.of("a", "b", "c").filter(element -> element.contains("b"))
                        .collect(Collectors.toList());
        Optional<String> anyElement = elements.stream().findAny();
        Optional<String> firstElement = elements.stream().findFirst();

        //System.out.println(anyElement);
        //System.out.println(firstElement);

        List<String> list = Arrays.asList("abc1", "abc2", "abc3");

        counter = 0;
        Stream<String> stream = list.stream().filter(element -> {
            wasCalled();
            return element.contains("2");
        });

        stream.forEach(System.out::println);

        long size = list.stream().map(element -> {
            wasCalled();
            return element.substring(0, 3);
        }).skip(2).count();
        System.out.println(size);


        // reduce

        OptionalInt reduced =  IntStream.range(1,4).reduce((a,b) -> a+b);

        int reduced2 = IntStream.range(1,4).reduce(10,(a, b)-> a+b);

        int reduceParams = Stream.of(1,2,3).reduce(10, (a,b)-> a+b, (a,b)->{
                    return a+b;
        });
        System.out.println(reduceParams);

        int reducedParallel = Arrays.asList(1, 2, 3).parallelStream()
                .reduce(10, (a, b) -> a + b, (a, b) -> {
                    return a + b;
                });
        System.out.println(reducedParallel);
    }
    private static long counter;
    private static void wasCalled() {
        counter++;
    }

    private static <T> int count() {
        int i =0;
        for (i = 0; i<10;i++) {
            i++;
            return i;
        }
        return -1;
    }




    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}
