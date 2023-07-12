package InheritanceHw;

public class Ural extends Motorbike {

    private boolean firstAidKit;
    String name = this.getClass().getSimpleName();

    public Ural() {
    }

    public Ural(boolean firstAidKit) {
        this.firstAidKit = firstAidKit;
    }

    public Ural(int volume, boolean firstAidKit) {
        super(volume);
        this.firstAidKit = firstAidKit;
    }

    public Ural(int volume, boolean firstAidKit, String name) {
        super(volume);
        this.firstAidKit = firstAidKit;
        this.name = name;
    }



    public String showInfo() {
        return "Ural:\n" +
                "firstAidKit = " + firstAidKit + '\n' +
                "name = " + name;
    }

    public boolean isFirstAidKit() {
        return firstAidKit;
    }

    public void setFirstAidKit(boolean firstAidKit) {
        this.firstAidKit = firstAidKit;
    }

    public String getName() {
        return name;
    }
}
