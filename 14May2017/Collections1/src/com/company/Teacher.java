package com.company;

/**
 * Created by Ishaq Hassan on 5/14/2017.
 */
public class Teacher {
    private String name;
    private int age;
    private int id;
    private String qualification;

    public Teacher(String name, int age, int id, String qualification) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.qualification = qualification;
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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
