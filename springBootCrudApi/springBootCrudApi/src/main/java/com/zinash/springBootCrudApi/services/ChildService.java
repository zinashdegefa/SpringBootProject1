package com.zinash.springBootCrudApi.services;

import com.zinash.springBootCrudApi.daos.ChildDao;
import com.zinash.springBootCrudApi.models.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ChildService implements ChildServiceInterface{

    @Autowired
    private ChildDao childDao;



    @Transactional
    @Override
    public List<Child> getAllChild(){

        return childDao.getAllChild();
    }

    @Override
    @Transactional
    public void saveChild(Child child) {

        childDao.saveChild(child);
    }

    @Override
    @Transactional
    public Child getChildById(int id) {
        return childDao.getChildById(id);
    }

    @Override
    @Transactional
    public void deleteChild(int id) {

        childDao.deleteChild(id);
    }

    @Override
    @Transactional
    public Child getChildByName(String name) {
        return childDao.getChildByName(name);
    }
}
