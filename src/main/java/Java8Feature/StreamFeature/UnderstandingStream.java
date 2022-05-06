package Java8Feature.StreamFeature;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnderstandingStream {

    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("Apple", "Orange", "Banana");

        //1. method reference

        list.forEach(System.out::println);

        //2. finding count of even number of list
        List<Integer> list1 =
                Arrays.asList(3, 2, 12, 5, 6, 11, 13);
        long count = 0;
        count = list1.stream().filter(i->i % 2 ==0).count();
        System.out.println(count);

        //3.finding even number of list

        System.out.println(list1.stream().filter(i->i % 2 ==0).collect(Collectors.toList()));

        //4.sum of all even number of list
        System.out.println(list1.stream().filter(i->i%2 == 0).mapToInt(Integer::intValue).sum());

        System.out.println(list1.stream().filter(i->i%2 == 0).reduce(0,(i,c) -> i+c));

        //5. find wheather number is less than 10
        System.out.println(list1.stream().allMatch(i-> i>1));

        //6. finding subDirectory inside a folder
        List<String> allDirName = Arrays.stream(new File("").listFiles()).filter(File :: isDirectory).map(File::getName).collect(Collectors.toList());
        System.out.println(allDirName);



    }
}
