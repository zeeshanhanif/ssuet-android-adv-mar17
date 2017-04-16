package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Human h = new Human();
        Human s = new Student();
        Human t = new Teacher();
        //Student ss = new Student()
        h.setName("Usman");
        // This is cause Runtime exception
        Student st1 = (Student)t;
        s.setName("Arbaz");
        // can not call
        //s.setSubject("hello");

        st1.setSubject("Android");

        ((Student)s).setSubject("JAVA");

        System.out.println(h.getName());
        System.out.println(st1.getName());
        System.out.println(st1.getSubject());



    }
}
