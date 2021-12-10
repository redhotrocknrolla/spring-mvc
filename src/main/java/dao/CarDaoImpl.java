package dao;

import model.Car;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{


         private static final List<Car> listCar = new ArrayList<>();

         static {
            listCar.add(new Car("ZAZ", "FOO", 1969));
            listCar.add(new Car("UAZ", "Patriot", 1999));
            listCar.add(new Car("VAZ", "Shaha", 1988));
            listCar.add(new Car("ZIL", "Torpedo", 1957));
            listCar.add(new Car("Gagarin", "FirstInSpace", 1961));

        }

    @Override
    public List<Car> addCar(int car) {
        return listCar.stream().limit(car).collect(Collectors.toList());
    }
}
