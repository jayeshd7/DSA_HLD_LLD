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


        List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");

        List<String> namesWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(namesWithA);


        Map<String, Integer> someMap = new HashMap<>();
        someMap.put("jayesh",786);
        someMap.put("pooja",123);
        Set<Map.Entry<String, Integer>> entries = someMap.entrySet();
        Set<String> keys = someMap.keySet();
        Collection<Integer> values = someMap.values();
        Stream<Map.Entry<String, Integer>> entryStream = entries.stream();
        Stream<Integer> valueStream = values.stream();
        List<String> ans = keys.stream().filter(a -> a.startsWith("j")).collect(Collectors.toList());

        System.out.println(ans);

        Map<String, String> books = new HashMap<>();
        books.put(
                "978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put(
                "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");

        Optional<String> optionalIsbn = books.entrySet().stream()
                .filter(e -> "Effective Java".equals(e.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(optionalIsbn.get());

        List<String> titles = books.entrySet().stream()
                .filter(e -> e.getKey().startsWith("978-0"))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
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
