package com.company;

/**
 * Created by zeeshanhanif-pc on 4/9/2017.
 */
public class Student {
    String name;
    int age;
    String email;
    Course course[];
    int counter;


    public Student(String name, int age, String email){
        System.out.println("Hello Student 3 args");
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = new Course[3];
    }

    public void addCourse(String name){
        Course c = new Course(name);
        course[counter] = c;
        counter++;
    }




}
