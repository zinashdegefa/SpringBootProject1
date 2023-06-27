package com.zinash.springBootCrudApi.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "child")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "child_id")
    private int child_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "person")
    private Person person;

    public Child() {
    }


    public Child(int child_id, String first_name, String last_name, String address, String city, Person person) {
        this.child_id = child_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.person = person;
    }


    public Child(String first_name, String last_name, String address, String city, Person person) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.person = person;
    }


    @Override
    public String toString() {
        return "Child{" +
                "child_id=" + child_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", person=" + person +
                '}';
    }

    public int getChild_id() {
        return child_id;
    }

    public void setChild_id(int child_id) {
        this.child_id = child_id;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Child child)) return false;
        return getChild_id() == child.getChild_id() && Objects.equals(getFirst_name(), child.getFirst_name()) && Objects.equals(getLast_name(), child.getLast_name()) && Objects.equals(getAddress(), child.getAddress()) && Objects.equals(getCity(), child.getCity()) && Objects.equals(getPerson(), child.getPerson());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChild_id(), getFirst_name(), getLast_name(), getAddress(), getCity(), getPerson());
    }
}
