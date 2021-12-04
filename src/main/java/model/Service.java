package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Service {
    private List<Car> listCar = new ArrayList<>();

    {
        listCar.add(new Car("ZAZ", "FOO", 1969));
        listCar.add(new Car("UAZ", "Patriot", 1999));
        listCar.add(new Car("VAZ", "Shaha", 1988));
        listCar.add(new Car("ZIL", "Torpedo", 1957));
        listCar.add(new Car("Gagarin", "FirstInSpace", 1961));

    }
    public List<Car> getAllCar(int count){

        return listCar.stream().limit(count).collect(Collectors.toList());
    }

}
