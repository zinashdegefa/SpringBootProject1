package com.zinash.springBootCrudApi.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "plate_number")
    private int plate_number;

    @Column(name = "car_name")
    private String car_name;

    @Column(name = "f_year")
    private String f_year;

    @Column(name = "country")
    private String country;

    @Column(name = "model")
    private String model;

    @Column(name = "price")
    private int price;

//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "person")
//    private Person person;

    //No args constructor

    public Car() {
    }


    //All args

    public Car(int plate_number, String car_name, String f_year, String country, String model, int price) {
        this.plate_number = plate_number;
        this.car_name = car_name;
        this.f_year = f_year;
        this.country = country;
        this.model = model;
        this.price = price;
    }


    //some args (except personId)

    public Car(String car_name, String f_year, String country, String model, int price) {
        this.car_name = car_name;
        this.f_year = f_year;
        this.country = country;
        this.model = model;
        this.price = price;
    }


    //To string

    @Override
    public String toString() {
        return "Car{" +
                "plate_number=" + plate_number +
                ", car_name='" + car_name + '\'' +
                ", f_year='" + f_year + '\'' +
                ", country='" + country + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    //Getter and setter

    public int getPlate_number() {
        return plate_number;
    }

    public void setPlate_number(int plate_number) {
        this.plate_number = plate_number;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getF_year() {
        return f_year;
    }

    public void setF_year(String f_year) {
        this.f_year = f_year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //Equal and hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getPlate_number() == car.getPlate_number() && getPrice() == car.getPrice() && Objects.equals(getCar_name(), car.getCar_name()) && Objects.equals(getF_year(), car.getF_year()) && Objects.equals(getCountry(), car.getCountry()) && Objects.equals(getModel(), car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlate_number(), getCar_name(), getF_year(), getCountry(), getModel(), getPrice());
    }
}

