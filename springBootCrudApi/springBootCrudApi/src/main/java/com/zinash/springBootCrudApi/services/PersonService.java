package com.zinash.springBootCrudApi.services;

import com.zinash.springBootCrudApi.daos.PersonDao;
import com.zinash.springBootCrudApi.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService implements PersonServiceInterface{

    @Autowired
    private PersonDao pDao;



    @Transactional
    @Override
    public List<Person> getAllPerson(){

        return pDao.getAllPerson();
    }

    @Override
    @Transactional
    public void savePerson(Person person) {
        pDao.savePerson(person);
    }

    @Override
    @Transactional
    public Person getPersonById(int id) {
        return pDao.getPersonById(id);

    }

    @Override
    @Transactional
    public void deletePerson(int id) {
        pDao.deletePerson(id);
    }
}
