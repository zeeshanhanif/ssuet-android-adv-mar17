package com.company;

/**
 * Created by Ishaq Hassan on 5/14/2017.
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        if(age > 80){
            throw new ArithmeticException("Invalid Age");
        }
        this.name = name;
        this.age = age;
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
}
