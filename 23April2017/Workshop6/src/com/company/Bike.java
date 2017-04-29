package com.company;

/**
 * Created by zeeshanhanif-pc on 4/23/2017.
 */
public final class Bike extends Vehicle {
    public Bike(int model, String name, String color, String brand) {
        super(model, name, color, brand);
    }

    public void service(){
        System.out.println("Bike's Service");
    }
}
