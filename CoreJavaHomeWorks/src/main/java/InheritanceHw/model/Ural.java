package InheritanceHw.model;

public class Ural extends Motorbike {

    String color = "Black";

    public Ural(int wheel) {
        super(wheel);
    }

    public Ural(int weight, int length, int wheel) {
        super(weight, length, wheel);
    }
}
