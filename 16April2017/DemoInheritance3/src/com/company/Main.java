package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Human h = new Human();
        Human s = new Student();
        Human t = new Teacher();
        //Student ss = new Student()
        h.setName("Usman");
        // can not call
        //s.setSubject("hello");
        System.out.println(h.getName());
        System.out.println(s.getName());
        System.out.println(t.getName());

    }
}
