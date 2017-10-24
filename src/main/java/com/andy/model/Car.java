package com.andy.model;

public class Car {
    private int id;
    private String brand;
    private String color;
    private String model;

    public Car(int id, String brand, String color, String model) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.model = model;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
