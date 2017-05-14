package com.company;

/**
 * Created by Ishaq Hassan on 5/14/2017.
 */
public class Student {
    private String name;
    private int age;
    private int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+", Age : "+this.age+", ID : "+this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Student nme = ((Student) obj);
        return this.name.equals(nme.getName());
    }
}
