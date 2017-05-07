package com.company;

/**
 * Created by zeeshanhanif-pc on 5/7/2017.
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
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

    @Override
    public boolean equals(Object o){
        Student st = (Student)o;
        boolean nameEquals = st.getName().equals(this.name);
        boolean ageEquals = st.age == this.age;
        return nameEquals && ageEquals;
    }
}
