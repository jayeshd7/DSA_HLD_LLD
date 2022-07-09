package AugustBatchProblem.Advanced.javaDP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple("green", 80),
                                                new Apple( "green", 160));

        List<Apple> heavyApple = filterApple(inventory, new AppleHeavyWeightPredicate());

        heavyApple.stream().forEach(s-> System.out.println(s.getWeight()));
        List<Apple> colorApple = filterApple(inventory, new AppleGreenColorPredicate());
        colorApple.stream().forEach(s-> System.out.println(s.getColor()));

    }

    private static List<Apple> filterApple(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }


        return result;
    }
}
