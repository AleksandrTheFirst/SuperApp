package InterfaceHw;

public class Car implements ICar{
    private String name;


    @Override
    public void drive() {
        System.out.println("Tesla drive");
    }

    @Override
        public void stop() {
        System.out.println("Tesla stop");
    }

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
