package com.zinash.springBootCrudApi.services;

import com.zinash.springBootCrudApi.models.Car;

import java.util.List;

public interface CarServiceInterface {

    List<Car> getAllCar();

    void saveCar(Car car);

    Car getCarByplate_number(int car);

    void deleteCar(int plate_number);
}
