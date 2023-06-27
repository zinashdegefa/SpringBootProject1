package com.zinash.springBootCrudApi.controllers;

import com.zinash.springBootCrudApi.models.Child;
import com.zinash.springBootCrudApi.services.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChildController {


    @Autowired
    private ChildService childService;

    @GetMapping("/allChild")
    public List<Child> getAllChild() {

        return childService.getAllChild();
    }

    @PostMapping("/saveChild")
    public Child saveChild(@RequestBody Child child) {

        childService.saveChild(child);

        return child;
    }

    @GetMapping("/child/{id}")
    public Child getChildById(@PathVariable int id) {
        Child child = childService.getChildById(id);

        if (child == null) {
            throw new RuntimeException("Child with id: " + id + " was not found!");
        }
        return child;
    }

    @DeleteMapping("/child/delete/{id}")
    public String deleteChild(@PathVariable int id) {

        childService.deleteChild(id);
        return "Child with id: " + id + " is deleted";
    }

    @PutMapping("/updateChild")
    public Child updateChild(@RequestBody Child child) {

        childService.saveChild(child);

        return child;
    }

    @GetMapping("/child/name")
    public Child getChildByName(@PathVariable String name) {
        Child child = childService.getChildByName(name);

        if (child == null) {
            throw new RuntimeException("Child with name: " + name + " was not found!");
        }
        return child;
    }
}
