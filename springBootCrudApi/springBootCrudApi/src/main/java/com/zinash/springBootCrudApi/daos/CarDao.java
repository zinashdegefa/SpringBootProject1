package com.zinash.springBootCrudApi.daos;

import com.zinash.springBootCrudApi.models.Car;
import com.zinash.springBootCrudApi.models.Person;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CarDao implements CarDaoInterface {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Car> getAllCar() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Car> query = currentSession.createQuery("From Car", Car.class);
        return query.getResultList();
    }

    @Override
    public void saveCar(Car car) {

        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(car);


    }

    @Override
    public Car getCarByplate_number(int plate_number) {
        Session currentSession = entityManager.unwrap(Session.class);

        return currentSession.get(Car.class, plate_number);
    }

    @Override
    public void deleteCar(int plate_number) {
        Session currentSession =  entityManager.unwrap(Session.class);
        Car car = currentSession.get(Car.class, plate_number);
        currentSession.delete(car);
    }

}

