package interfaces;

public class Dog implements Noisy {

    @Override
    public String makeNoise() {
        return "Woof!";
    }
    
}
