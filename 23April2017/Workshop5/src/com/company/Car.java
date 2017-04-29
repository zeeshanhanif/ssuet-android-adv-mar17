package com.company;

/**
 * Created by zeeshanhanif-pc on 4/23/2017.
 */
public class Car extends Vehicle {
    public Car(int model, String name, String color, String brand) {
        super(model, name, color, brand);
    }

    public void service(){
        System.out.println("Car's Service");
    }
}
