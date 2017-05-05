package com.company;

/**
 * Created by zeeshanhanif-pc on 4/30/2017.
 */
public class Student extends Human implements Pakistani{

    public Student(String name, int age) {
        super(name, age);
    }
    public void study(){
        System.out.println("Study in Student");
    }

    public void jughar(){
        System.out.println("Pakistani Jughar in Student");
    }

}
