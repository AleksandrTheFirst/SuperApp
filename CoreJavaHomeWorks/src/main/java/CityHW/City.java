package CityHW;

import CityHW.Interfaces.ICity;
import CityHW.Interfaces.IFlat;
import CityHW.Interfaces.IHouse;

import java.util.ArrayList;
import java.util.List;

public class City implements ICity {

    private String name;
    private List<IHouse> houses = new ArrayList<>();


    public City(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<IHouse> getHouseList() {
        return houses;
    }

    @Override
    public void addHouse(IHouse house) {
        houses.add(house);
    }

    @Override
    public void showSettledList() {
        System.out.println("Город " + name);
        for (IHouse house : houses) {
            System.out.println("Дом: " + house.getAddress());
            for (IFlat flat :  house.getFlatList()) {
                System.out.println("- Квартара: " + flat.getNumber());
                if (flat.getSettlersList().size() == 0) {
                    System.out.println("-- Никто не живет");
                    continue;
                }
                for (Settler settler : flat.getSettlersList()){
                    String result = String.format("-- Житель: %s", settler.getName());
                    System.out.println(result);
                }
            }
            System.out.println();
        }
    }
}
