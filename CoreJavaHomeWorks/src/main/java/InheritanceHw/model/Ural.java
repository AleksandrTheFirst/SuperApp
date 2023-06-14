package InheritanceHw.model;

public class Ural extends Motorbike {

    private boolean firstAidKit;
    String name = this.getClass().getSimpleName();

    public Ural() {
    }

    public Ural(int volume, boolean firstAidKit, String name) {
        super(volume);
        this.firstAidKit = firstAidKit;
        this.name = name;
    }

    public Ural(int volume, boolean firstAidKit) {
        super(volume);
        this.firstAidKit = firstAidKit;
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

    public void setName(String name) {
        this.name = name;
    }
}
