package com.company;

/**
 * Created by zeeshanhanif-pc on 4/23/2017.
 */
public class Bus extends Vehicle {
    public Bus(int model, String name, String color, String brand) {
        super(model, name, color, brand);
    }

    public void service(){
        System.out.println("Bus' Service");
    }
}
