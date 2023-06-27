package com.zinash.springBootCrudApi.daos;

import com.zinash.springBootCrudApi.models.Person;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PersonDao implements PersonDaoInterface {

    @Autowired
    EntityManager entityManager;
    @Override
    public List<Person> getAllPerson() {
       Session currentSession =  entityManager.unwrap(Session.class);
       Query<Person> query = currentSession.createQuery("From Person", Person.class);
        return query.getResultList();
    }

    @Override
    public void savePerson(Person person) {

        Session currentSession =  entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(person);
    }

    @Override
    public Person getPersonById(int id) {
        Session currentSession =  entityManager.unwrap(Session.class);

      return currentSession.get(Person.class, id);

    }

    @Override
    public void deletePerson(int id) {
        Session currentSession =  entityManager.unwrap(Session.class);
        Person person = currentSession.get(Person.class, id);
        currentSession.delete(person);
    }


}
