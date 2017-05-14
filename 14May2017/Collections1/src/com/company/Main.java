package com.company;

public class Main {

    public static void main(String[] args) {
        University university = new University("SSUET");
        university.addStudent(new Student("Usman",30,1));
        university.addStudent(new Student("Arbaz",35,2));
        university.addStudent(new Student("Wahaj",40,3));
        university.addStudent(new Student("Abc",20,4));

        university.printStudentsList();
        System.out.println("=====================");
        System.out.println(university.getStudentById(30));
        System.out.println("=====================");
        System.out.println(university.getStudentByName("Wahaj"));
    }
}
