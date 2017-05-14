package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashSet<Student> students = new HashSet<>();
        System.out.println(students.add(new Student("Usman",30,1)));
        System.out.println(students.add(new Student("Usman",50,1)));
        System.out.println(students.add(new Student("Arbaz",35,2)));

        for(Student student : students){
            System.out.println(student);
        }
    }
}
