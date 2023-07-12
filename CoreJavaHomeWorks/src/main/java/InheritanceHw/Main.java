package InheritanceHw;

public class Main {

    public static void main(String[] args) {
        Kawasaki kawasaki = new Kawasaki(50, 150, 1000, 1983);
        Ural ural = new Ural(30, true);
        ural.getName();

        kawasaki.jump();
        System.out.println(ural.showInfo());

    }
}
