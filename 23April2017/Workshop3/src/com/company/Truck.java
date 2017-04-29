package com.company;

/**
 * Created by zeeshanhanif-pc on 4/23/2017.
 */
public class Truck extends Vehicle {
    public Truck(int model, String name, String color, String brand) {
        super(model, name, color, brand);
    }

    public void service(){
        System.out.println("Truck's Service");
    }
}
