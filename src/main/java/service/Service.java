package service;

import dao.CarDao;
import dao.CarDaoImpl;
import model.Car;


import java.util.List;
import java.util.stream.Collectors;

public class Service implements CarService {

    private final CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> addCar() {
        return carDao.addCar();
    }

    public List<Car> getAllCar(int car) {
        return addCar().stream().limit(car).collect(Collectors.toList());
    }
}
