package com.cosmin.app.realestateapi.Models;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String typeOfProperty;

    @Column
    private String address;

    @Column
    private int squareFootage;

    @Column
    private int nrOfBedrooms;

    @Column
    private int nrOfBathrooms;

    @Column
    private double price;

    public long getId() {
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getTypeOfProperty() {
        return typeOfProperty;
    }

    public void setTypeOfProperty(String typeOfProperty) {
        this.typeOfProperty = typeOfProperty;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getNrOfBedrooms() {
        return nrOfBedrooms;
    }

    public void setNrOfBedrooms(int nrOfBedrooms) {
        this.nrOfBedrooms = nrOfBedrooms;
    }

    public int getNrOfBathrooms() {
        return nrOfBathrooms;
    }

    public void setNrOfBathrooms(int nrOfBathrooms) {
        this.nrOfBathrooms = nrOfBathrooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
