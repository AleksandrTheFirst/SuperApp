package CityHW;

import CityHW.Interfaces.IFlat;

import java.util.ArrayList;
import java.util.List;

public class Flat implements IFlat {

    private int number;
    List<Settler> settlerList = new ArrayList<>();

    private final int CAPACITY = 2;

    public Flat() {}

    public Flat(int number) {
        this.number = number;
    }

    public Flat(int number, List<Settler> settlerList) {
        this.number = number;
        this.settlerList = settlerList;
    }


    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void addSettler(Settler settler) {
        if (settlerList.size() < CAPACITY) {
            settlerList.add(settler);
        }
        else {
            System.out.println("Нельзя заселить более 2-х жильцов в одну квартиру " + number);
        }
    }

    @Override
    public List<Settler> getSettlersList() {
        return settlerList;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Settler> getSettlerList() {
        return settlerList;
    }

}
