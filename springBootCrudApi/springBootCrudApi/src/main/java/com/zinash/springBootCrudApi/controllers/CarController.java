package com.zinash.springBootCrudApi.controllers;

import com.zinash.springBootCrudApi.models.Car;
import com.zinash.springBootCrudApi.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials ="true")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/allCar")
    public List<Car> getAllCar(){

        return carService.getAllCar();
    }

    @PostMapping("/saveCar")
    public void saveCar(@RequestBody Car car){

        carService.saveCar(car);
    }

    @GetMapping("/car/{plate_number}")
    public Car getCarByplate_number(@PathVariable int plate_number){

        return carService.getCarByplate_number(plate_number);
    }

    @DeleteMapping("/car/delete/{plate_number}")
    public String deleteCar(@PathVariable int plate_number){

        carService.deleteCar(plate_number);
        return "Car with plate_number: " + plate_number + " is deleted";
    }

    @PutMapping("/updateCar")
    public Car update(@RequestBody Car car) {

        carService.saveCar(car);
        return car;
    }

}
