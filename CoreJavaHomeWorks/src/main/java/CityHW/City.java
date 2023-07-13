package CityHW;

import java.util.ArrayList;
import java.util.List;

public class City {

    private String name;
    private List<House> houseList = new ArrayList<>();

    public City() {}

    public City(String name) {
        this.name = name;
    }

    public City(String name, List<House> houseList) {
        this.name = name;
        this.houseList = houseList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }

    //TODO
    public void showSettledList(){

    }

    public void addHouse(House house) {
        houseList.add(house);
    }
}
