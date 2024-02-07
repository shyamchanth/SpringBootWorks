package com.bestChoice.bestCars.Entity;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;

    private String yearOfManufacture;
    private int  kms;
    private double price;
    private String fuel;




    public Car(String brand, String model, String yearOfManufacture, int kms, double price, String fuel) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.kms = kms;
        this.price = price;
        this.fuel = fuel;
    }


}
