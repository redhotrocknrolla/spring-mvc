package model;

import dao.CarDao;
import java.util.List;
import java.util.stream.Collectors;

public class Service implements CarServiceInt{

    @Override
    public List<Car> addCar() {
        CarDao carDao = new CarDao();
        return carDao.addCar();
    }
    public List<Car> getAllCar(int car) {
        return addCar().stream().limit(car).collect(Collectors.toList());
    }
}
