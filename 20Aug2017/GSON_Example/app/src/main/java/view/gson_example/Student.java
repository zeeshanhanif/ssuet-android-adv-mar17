package view.gson_example;

/**
 * Created by Ishaq Hassan on 8/20/2017.
 */

public class Student {
    private String name;
    private int age;
    private float gpa;

    Student(){

    }

    Student(String name,int age,float gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
