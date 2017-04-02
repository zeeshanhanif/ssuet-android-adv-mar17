package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student st1 = new Student();
        Student st2 = new Student();
        st1.name = "Usman";
        st2.name = "Arbaz";
        System.out.println(st1.name);
        System.out.println(st2.name);
        System.out.println(Student.course);
        System.out.println(st1.course);
        System.out.println(st2.course);
        st1.course = "Android";
        //Student.course = "Android";
        System.out.println(st1.course);
        System.out.println(st2.course);


    }
}
