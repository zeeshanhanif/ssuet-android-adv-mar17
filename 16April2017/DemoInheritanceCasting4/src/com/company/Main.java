package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Human h = new Human();
        Human s = new Student();
        Human t = new Teacher();
        //Student ss = new Student()
        h.setName("Usman");
        Student st1 = (Student)s;
        s.setName("Arbaz");
        // can not call
        //s.setSubject("hello");

        st1.setSubject("Android");
        System.out.println(h.getName());
        System.out.println(st1.getName());
        System.out.println(st1.getSubject());


    }
}
