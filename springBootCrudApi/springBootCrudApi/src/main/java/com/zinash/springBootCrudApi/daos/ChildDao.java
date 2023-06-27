package com.zinash.springBootCrudApi.daos;

import com.zinash.springBootCrudApi.models.Child;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ChildDao implements ChildDaoInterface {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Child> getAllChild() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Child> query = currentSession.createQuery("From Child", Child.class);
        return query.getResultList();
    }

    @Override
    public void saveChild(Child child) {

        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(child);
    }

    @Override
    public Child getChildById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        return currentSession.get(Child.class, id);

    }

    @Override
    public void deleteChild(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Child child = currentSession.get(Child.class, id);
        currentSession.delete(child);
    }

    @Override
    public Child getChildByName(String name) {
        Session currentSession = entityManager.unwrap(Session.class);

        return currentSession.get(Child.class, name);


    }

}
