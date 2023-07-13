package CityHW;

public class Main {
    public static void main(String[] args) {
        City city = new City("Shatura");

        House house1 = new House("Проспект Ильича, 10-10");
        House house2 = new House("Проспект Борзова, 4-32");
        House house3 = new House("Спортивная, 3-100");
        House house4 = new House("Войкова, 1-17");
        House house5 = new House("Радченко, 3-43");

        Flat flat1 = new Flat(1);
        Flat flat2 = new Flat(2);
        Flat flat3 = new Flat(3);
        Flat flat4 = new Flat(4);
        Flat flat5 = new Flat(5);
        Flat flat6 = new Flat(6);
        Flat flat7 = new Flat(7);
        Flat flat8 = new Flat(8);
        Flat flat9 = new Flat(9);
        Flat flat10 = new Flat(10);

        Settler settler1 = new Settler("K");
        Settler settler2 = new Settler("N");
        Settler settler3 = new Settler("P");
        Settler settler4 = new Settler("Y");
        Settler settler5 = new Settler("U");
        Settler settler6 = new Settler("M");
        Settler settler7 = new Settler("Q");
        Settler settler8 = new Settler("E");
        Settler settler9 = new Settler("W");
        Settler settler10 = new Settler("Q");
        Settler settler11 = new Settler("T");
        Settler settler12 = new Settler("V");
        Settler settler13 = new Settler("B");
        Settler settler14 = new Settler("C");
        Settler settler15 = new Settler("Z");

        city.addHouse(house1);
        city.addHouse(house2);
        city.addHouse(house3);
        city.addHouse(house4);
        city.addHouse(house5);

        house1.addFlat(flat10);
        house1.addFlat(flat9);
        house2.addFlat(flat8);
        house2.addFlat(flat7);
        house3.addFlat(flat6);
        house3.addFlat(flat5);
        house4.addFlat(flat4);
        house4.addFlat(flat3);
        house5.addFlat(flat2);
        house5.addFlat(flat1);

        flat1.addSettler(settler15);
        flat1.addSettler(settler14);

        flat2.addSettler(settler13);

        flat3.addSettler(settler12);
        flat3.addSettler(settler11);

        flat4.addSettler(settler10);
        flat4.addSettler(settler9);

        flat5.addSettler(settler8);
        flat5.addSettler(settler7);

        flat6.addSettler(settler6);
        flat6.addSettler(settler5);

        flat7.addSettler(settler5);
        flat7.addSettler(settler4);
        flat7.addSettler(settler5);

        flat8.addSettler(settler3);
        flat9.addSettler(settler2);


        city.showSettledList();
    }
}
