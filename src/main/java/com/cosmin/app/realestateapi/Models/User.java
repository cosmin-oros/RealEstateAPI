package com.cosmin.app.realestateapi.Models;

public class User {
    private long id;
    private String typeOfProperty;
    private String address;
    private int squareFootage;
    private int nrOfBedrooms;
    private int nrOfBathrooms;
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
