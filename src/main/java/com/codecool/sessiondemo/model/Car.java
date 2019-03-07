package com.codecool.sessiondemo.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Car {

    public enum Brand {
        OPEL, SUZUKI, AUDI, BMW;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String licensePlate;

    @Enumerated(EnumType.STRING)
    private Brand brand;

    public Car() {

    }

    public Car(String licensePlate, Brand brand) {
        this.licensePlate = licensePlate;
        this.brand = brand;
    }
}
