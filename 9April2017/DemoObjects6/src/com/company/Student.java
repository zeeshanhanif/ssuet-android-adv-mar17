package com.company;

/**
 * Created by zeeshanhanif-pc on 4/9/2017.
 */
public class Student {
    String name;
    int age;
    String email;
    Course course;

    public Student(String name, int age, String email,String courseName){
        System.out.println("Hello Student 3 args");
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = new Course(courseName);
    }


    public Student(String name, int age, String email,Course course){
        System.out.println("Hello Student 3 args");
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }




}
