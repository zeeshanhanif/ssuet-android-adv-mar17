package com.company;

/**
 * Created by zeeshanhanif-pc on 4/9/2017.
 */
public class Student {
    String name;
    int age;
    String email;

    public Student(String name){
        System.out.println("Hello Student 1 args");
        this.name=name;
    }

    public Student(String name, int age){
        this(name);
        System.out.println("Hello Student 2 args");
        this.age=age;

    }

    public Student(String name, int age, String email){
        this(name,age);
        System.out.println("Hello Student 3 args");
        //this.name = name;
        //this.age = age;
        this.email = email;
    }




}
