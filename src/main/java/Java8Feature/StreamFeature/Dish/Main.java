package Java8Feature.StreamFeature.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(new Dish("pork",false,800, DishType.MEAT),
                                        new Dish("beef",false,1000, DishType.MEAT),
                                        new Dish("panner",true,1100, DishType.OTHERS)

                );


        List<String> words = Arrays.asList("java", "in", "action");
        List<Integer> collect = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println(collect);

        List<String[]> collect1 = words.stream().map(word -> word.split("")).distinct().collect(Collectors.toList());
        System.out.println(collect1);
        //high calroies dish
        Stream<Dish> dishStream = menu.stream().filter(d -> d.getCalories() > 800);
        System.out.println(Arrays.stream(dishStream.toArray()).findFirst());

        List<Dish> isVeg = menu.stream().filter(d -> d.isVegetarian()).collect(Collectors.toList());
        System.out.println(isVeg);
        }
}
