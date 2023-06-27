package com.zinash.springBootCrudApi.services;

import com.zinash.springBootCrudApi.models.Child;
import com.zinash.springBootCrudApi.models.Person;

import java.util.List;

public interface ChildServiceInterface {

    List<Child> getAllChild();

    void saveChild(Child child);

    Child getChildById(int child);

    void deleteChild(int id);

     Child getChildByName(String name);
}
