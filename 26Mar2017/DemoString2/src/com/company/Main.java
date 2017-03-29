package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Hello World";
        String s2 = "Hello World";
        //s = "New";
        System.out.println(s==s2);
        s = s + " Word";
        System.out.println(s==s2);
        System.out.println("====");
        System.out.println(s);
        System.out.println(s2);
    }
}
