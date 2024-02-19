package interfaces;

import java.util.*;

public class NoisyMain {

    public static void main(String[] args) {
        Dog spot = new Dog();
        Cat stripe = new Cat("Orange Tabby");

        List<Noisy> animals = new ArrayList<>();
        animals.add(spot);
        animals.add(stripe);

        System.out.println("The cat's color is: " + stripe.getColor());

        for (Noisy noisy : animals) {
            System.out.println(noisy.makeNoise());
        }
    }
    
}
