package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Student student = new Student("Usman", 81);
            System.out.println(student.getName());
            System.out.println(student.getAge());
        }catch (StudentInvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
    }
}
