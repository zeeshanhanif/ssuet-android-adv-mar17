package com.company;

/**
 * Created by zeeshanhanif-pc on 5/7/2017.
 */
public class Student extends Human implements Pakistani {

    public void study(){
        System.out.println("Study");
    }

    @Override
    public void jugar() {
        System.out.println("Jugar");
    }
}
