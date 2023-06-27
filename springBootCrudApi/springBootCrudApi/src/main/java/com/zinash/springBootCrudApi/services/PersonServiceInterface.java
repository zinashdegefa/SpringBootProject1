package com.zinash.springBootCrudApi.services;

import com.zinash.springBootCrudApi.models.Person;

import java.util.List;

public interface PersonServiceInterface {
    List<Person> getAllPerson();

    void savePerson(Person person);

    Person getPersonById(int person);

    void deletePerson(int id);
}
