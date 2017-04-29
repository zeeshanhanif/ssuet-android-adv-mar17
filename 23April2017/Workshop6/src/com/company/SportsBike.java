package com.company;

/**
 * Created by zeeshanhanif-pc on 4/23/2017.
 */
// Not allowed to inherit from final class
//public class SportsBike extends Bike {
public class SportsBike extends Vehicle {

    public SportsBike(int model, String name, String color, String brand) {
        super(model, name, color, brand);
    }

    public void service(){
        System.out.println("SportsBike's Service");
    }
}
