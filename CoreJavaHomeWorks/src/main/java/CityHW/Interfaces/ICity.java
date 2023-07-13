package CityHW.Interfaces;

import java.util.List;

public interface ICity {

    String getName();

    List<IHouse> getHouseList();

    void addHouse(IHouse house);

    void showSettledList();
}
