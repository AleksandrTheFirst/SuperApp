package CityHW;

import CityHW.Interfaces.IFlat;
import CityHW.Interfaces.IHouse;

import java.util.ArrayList;
import java.util.List;

public class House implements IHouse {

    private String address;
    private List<IFlat> flatList = new ArrayList<>();

    public House() {}

    public House(String address) {
        this.address = address;
    }

    public House(String address, List<IFlat> flatList) {
        this.address = address;
        this.flatList = flatList;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void addFlat(IFlat flat) {
        flatList.add(flat);
    }

    public List<IFlat> getFlatList() {
        return flatList;
    }
}
