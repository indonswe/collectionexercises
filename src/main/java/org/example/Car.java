package org.example;

public class Car {
    int id;
    String carManufacturer;
    String model;

    public Car(int id, String carManufacturer, String model) {
        this.id = id;
        this.carManufacturer = carManufacturer;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
