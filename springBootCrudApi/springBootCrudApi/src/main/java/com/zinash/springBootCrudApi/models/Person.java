package com.zinash.springBootCrudApi.models;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int person_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;


    //No args constructor
    public Person() {
    }

    //All args

    public Person(int person_id, String first_name, String last_name, String address, String city) {
        this.person_id = person_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
    }


    //some args (except personId)

    public Person(String first_name, String last_name, String address, String city) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
    }


    //To string

    @Override
    public String toString() {
        return "Person{" +
                "person_id=" + person_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


    //Getter and setter

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    //Equal and hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getPerson_id() == person.getPerson_id() && Objects.equals(getFirst_name(), person.getFirst_name()) && Objects.equals(getLast_name(), person.getLast_name()) && Objects.equals(getAddress(), person.getAddress()) && Objects.equals(getCity(), person.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPerson_id(), getFirst_name(), getLast_name(), getAddress(), getCity());
    }
}
