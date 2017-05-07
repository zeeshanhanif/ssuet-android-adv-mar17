package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList al = new ArrayList();
        al.add("hello");
        al.add("world");
        al.add("do some work");
        al.add(45);
        al.add(true);
        al.add(4.4);

        System.out.println(al.contains(45));
        System.out.println(al.contains("world"));

    }
}
