package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s = new Student();
        Teacher t = new Teacher();
        Human h = new Human();
        h.setName("Usman");
        System.out.println(h.getName());
        System.out.println(s.getName());
        System.out.println(t.getName());

    }
}
