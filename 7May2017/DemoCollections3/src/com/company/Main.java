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
        al.add(new Student("Usman",34));

        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

        System.out.println("-----");
        for(Object s : al){
            System.out.println(s);
        }
    }
}
