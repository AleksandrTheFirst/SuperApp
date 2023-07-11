package InterfaceHw;

public class Car implements ICar{
    @Override
    public void drive() {
        System.out.println("Tesla drive");
    }

    @Override
        public void stop() {
        System.out.println("Tesla stop");
    }
}
