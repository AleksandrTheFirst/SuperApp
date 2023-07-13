package CityHW.Interfaces;

import java.util.List;

public interface IHouse {

    String getAddress();
    List<IFlat> getFlatList();
    void addFlat(IFlat flat);
}
