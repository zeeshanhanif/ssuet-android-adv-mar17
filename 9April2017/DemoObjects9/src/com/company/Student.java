package com.company;

/**
 * Created by zeeshanhanif-pc on 4/9/2017.
 */
public class Student {
    private String name;
    private int age;
    protected String email;
    String course = "Hello";

    public Student(String name, int age, String email){
        System.out.println("Hello Student 3 args");
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){
        return this.name;
    }





}
