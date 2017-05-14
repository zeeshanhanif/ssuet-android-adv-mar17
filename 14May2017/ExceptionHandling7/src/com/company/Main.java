package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = null;
        try {
            student = new Student("Usman", 81);
        } catch (StudentInvalidAgeException e) {
            e.printStackTrace();
        }
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
