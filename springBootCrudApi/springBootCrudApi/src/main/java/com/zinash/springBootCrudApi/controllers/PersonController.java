package com.zinash.springBootCrudApi.controllers;


import com.zinash.springBootCrudApi.models.Person;
import com.zinash.springBootCrudApi.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials ="true")
public class PersonController {


    @Autowired
    private PersonService personService;

    @GetMapping("/allPerson")
    public List<Person> getAllPerson(){

        return personService.getAllPerson();
    }

    @PostMapping("/savePerson")
    public Person savePerson(@RequestBody Person person){

        personService.savePerson(person);

        return  person;
    }

    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable int id){
        Person person = personService.getPersonById(id);

        if(person == null){
            throw new RuntimeException("Person with id: "+ id + " was not found!");
        }
        return person;
    }

    @DeleteMapping("/person/delete/{id}")
    public String deletePerson(@PathVariable int id){

        personService.deletePerson(id);
        return "Person with id: " + id + " is deleted";
    }

    @PutMapping("/updatePerson")
    public Person updatePerson(@RequestBody Person person){

        personService.savePerson(person);

        return  person;
    }
}
