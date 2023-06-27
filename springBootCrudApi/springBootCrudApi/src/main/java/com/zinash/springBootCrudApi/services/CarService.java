package com.zinash.springBootCrudApi.services;

import com.zinash.springBootCrudApi.daos.CarDao;
import com.zinash.springBootCrudApi.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarService implements CarServiceInterface {

    @Autowired
    private CarDao cDao;



    @Override
    @Transactional
    public List<Car> getAllCar(){

        return cDao.getAllCar();
    }

    @Override
    @Transactional
    public void saveCar(Car car) {
        cDao.saveCar(car);
    }

    @Override
    @Transactional
    public Car getCarByplate_number(int plate_number) {
        return cDao.getCarByplate_number(plate_number);

    }

    @Override
    @Transactional
    public void deleteCar(int plate_number) {
        cDao.deleteCar(plate_number);
    }
}



