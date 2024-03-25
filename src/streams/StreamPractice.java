package streams;

import java.util.*;
import java.util.stream.*;

public class StreamPractice {

    public static void main(String[] args) {
        /* List of Dish objects for stream practice */
        List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH));

        // Map dishes to dish name
        System.out.println(menu
                            .stream()
                            .map((Dish d) -> {return d.getName();})
                            .filter(d -> d.length() < 5)
                            .collect(Collectors.toList())
                            );

        // Filter dishes by vegetarian
        menu.stream()
            .filter(Dish::isVegetarian)
            .forEach(d -> {System.out.println(d);});
    

        // IntStream in range
        System.out.println(
            IntStream.range(0, 20)
                    .map(x -> x*x)
                    .boxed()
                    .collect(Collectors.toList()));

        System.out.println();
    }
    
}
