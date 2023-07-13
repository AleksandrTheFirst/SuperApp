package CityHW.Interfaces;

import CityHW.Settler;

import java.util.List;

public interface IFlat {

    int getNumber();

    void addSettler(Settler settler);

    List<Settler> getSettlersList();
}
