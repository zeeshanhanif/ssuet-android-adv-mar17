package com.company;

/**
 * Created by zeeshanhanif-pc on 4/9/2017.
 */
public class Student {
    String name;
    int age;
    String email;

    public Student(String name, int age){
        System.out.println("Hello Student 2 args");
        this.name=name;
        this.age=age;
    }

    public Student(String name, int age, String email){
        System.out.println("Hello Student 3 args");
        this.name = name;
        this.age = age;
        this.email = email;
    }




}
