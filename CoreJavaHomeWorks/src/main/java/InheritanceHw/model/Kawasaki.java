package InheritanceHw.model;

public class Kawasaki extends Motorbike {

    int year;

    public Kawasaki() {
    }

    public Kawasaki(int volume) {
        super(volume);
    }

    public Kawasaki(int volume, int year) {
        super(volume);
        this.year = year;
    }

    public Kawasaki(int weight, int length, int volume, int year) {
        super(weight, length, volume);
        this.year = year;
    }
}
