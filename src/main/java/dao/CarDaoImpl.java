package dao;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao{


    @Override
    public List <Car> addCar() {
         List<Car> listCar = new ArrayList<>();

        {
            listCar.add(new Car("ZAZ", "FOO", 1969));
            listCar.add(new Car("UAZ", "Patriot", 1999));
            listCar.add(new Car("VAZ", "Shaha", 1988));
            listCar.add(new Car("ZIL", "Torpedo", 1957));
            listCar.add(new Car("Gagarin", "FirstInSpace", 1961));

        }
        return listCar;
    }

}
