package com.company;

/**
 * Created by zeeshanhanif-pc on 4/23/2017.
 */
public class Workshop {
    private String name;
    public Workshop(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }


    public void doService(Vehicle v){
        System.out.println("Cleaning "+v.getName());
        v.service();
    }
    /*
    public void doService(Car c){
        System.out.println("Cleaning "+c.getName());
        c.service();
    }
    */
}
