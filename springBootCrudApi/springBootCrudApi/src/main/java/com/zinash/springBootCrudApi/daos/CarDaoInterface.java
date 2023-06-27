package com.zinash.springBootCrudApi.daos;

import com.zinash.springBootCrudApi.models.Car;
import com.zinash.springBootCrudApi.models.Person;

import java.util.List;

public interface CarDaoInterface {

    List<Car> getAllCar();

    void saveCar(Car car);

    Car getCarByplate_number(int plate_number);

    void deleteCar(int plate_number);
}
