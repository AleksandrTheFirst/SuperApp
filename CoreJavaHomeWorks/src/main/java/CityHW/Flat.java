package CityHW;

import java.util.ArrayList;
import java.util.List;

public class Flat extends House {

    private String address;
    List<Flat> flatList = new ArrayList<>();

    public Flat() {}

    public Flat(String address) {
        this.address = address;
    }

    public Flat(String address, List<Flat> flatList) {
        this.address = address;
        this.flatList = flatList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Flat> getFlatList() {
        return flatList;
    }

    public void setFlatList(List<Flat> flatList) {
        this.flatList = flatList;
    }

    public void addFlat(Flat flat) {
        flatList.add(flat);
    }
}
