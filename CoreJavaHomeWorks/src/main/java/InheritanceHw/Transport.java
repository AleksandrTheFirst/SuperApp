package InheritanceHw;

public class Transport {

    private int weight;
    private int length;
    public Transport() {
    }

    public Transport(int weight, int length) {
        this.weight = weight;
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
