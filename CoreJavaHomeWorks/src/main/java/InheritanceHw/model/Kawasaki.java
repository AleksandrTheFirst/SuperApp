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

    public void jump() {
        System.out.println("Kawasaki jump");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
