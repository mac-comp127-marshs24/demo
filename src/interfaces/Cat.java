package interfaces;

public class Cat implements Noisy {

    private String color;

    public Cat(String color) { 
        this.color = color;
    }

    @Override
    public String makeNoise() {
        return "Meow";
    }

    public String getColor() {
        return this.color;
    }
    
}
