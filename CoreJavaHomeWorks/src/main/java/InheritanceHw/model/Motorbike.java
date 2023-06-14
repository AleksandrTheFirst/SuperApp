package InheritanceHw.model;

public class Motorbike extends Transport {

    private double volume;

    public Motorbike() {
    }

    public Motorbike(int volume) {
        this.volume = volume;
    }

    public Motorbike(int weight, int length, int volume) {
        super(weight, length);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
