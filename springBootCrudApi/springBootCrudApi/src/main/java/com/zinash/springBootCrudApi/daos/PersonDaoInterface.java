package com.zinash.springBootCrudApi.daos;

import com.zinash.springBootCrudApi.models.Person;

import java.util.List;

public interface PersonDaoInterface {

    List<Person> getAllPerson();

    void savePerson(Person person);

    Person getPersonById(int id);

    void deletePerson(int id);
}
