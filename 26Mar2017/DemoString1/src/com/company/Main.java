package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Hello World";
        String s2 = "Hello World";
        String s1 = new String("Hello World");
        String s3 = new String("Hello World");
        String s4 = s3;
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s == s2);
        System.out.println(s == s1);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

    }
}
