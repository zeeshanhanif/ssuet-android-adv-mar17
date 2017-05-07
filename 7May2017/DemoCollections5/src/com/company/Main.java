package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> al = new ArrayList<String>();
        al.add("hello");
        al.add("world");
        al.add("do some work");


        ArrayList<Student> al2 = new ArrayList<Student>();
        al2.add(new Student("Usman",34));
        al2.add(new Student("Arbaz",34));
        al2.add(new Student("Parkash",34));


        System.out.println(al.contains(45));
        System.out.println(al.contains("world"));
        System.out.println(
                al2.contains(
                        new Student("Usman",34)));
    }
}
