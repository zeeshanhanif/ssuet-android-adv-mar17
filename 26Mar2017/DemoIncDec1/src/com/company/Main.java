package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 5;
        int b = 7;
        int c = a++ - --b + ++b - --a;
        //1 2 3 4 5
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("=====");

        int e = 5; // 5
        int f = 7; // 7 //5//6
        int g = f-- + ++e - --f + e--;
        //14 //2 13 19 10 11 3 12
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
