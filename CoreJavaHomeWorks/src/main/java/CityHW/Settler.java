package CityHW;

public class Settler extends Flat {
    private String name;

    public Settler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
