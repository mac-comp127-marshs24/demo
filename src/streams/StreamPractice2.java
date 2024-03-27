package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamPractice2 {

    public static void main(String[] args) {
        Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 1);
    
        Map<Boolean, List<Integer>> intItems = 
            infiniteStream
                .limit(10)
                .collect(Collectors.groupingBy(d -> d % 5 == 1)); 
        
        System.out.println(intItems);

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

        Map<Boolean, List<Dish>> menuByVeg = 
            menu.stream()
                .collect(Collectors.groupingBy(Dish::isVegetarian));

        System.out.println(menuByVeg.get(true).get(0).getCalories());
    }
    
}
