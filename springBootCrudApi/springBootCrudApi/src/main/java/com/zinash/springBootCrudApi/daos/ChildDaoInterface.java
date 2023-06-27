package com.zinash.springBootCrudApi.daos;

import com.zinash.springBootCrudApi.models.Child;

import java.util.List;

public interface ChildDaoInterface {

    List<Child> getAllChild();

    void saveChild(Child child);

    Child getChildById(int id);

    void deleteChild(int id);

    Child getChildByName(String name);
}
