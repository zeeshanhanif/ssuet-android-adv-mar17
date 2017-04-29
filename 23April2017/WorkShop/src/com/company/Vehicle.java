package com.company;

/**
 * Created by zeeshanhanif-pc on 4/23/2017.
 */
public class Vehicle {
    private int model;
    private String name;
    private String color;
    private String brand;

    public Vehicle(int model, String name, String color, String brand) {
        this.model = model;
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void service(){
        System.out.println("Vehicle's Service");
    }
}
