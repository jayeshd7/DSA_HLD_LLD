package Java8Feature.StreamFeature.Dish;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final DishType type;


    public Dish(String name, boolean vegetarian, int calories, DishType type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }

}
