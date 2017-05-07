package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList al = new ArrayList();
        al.add("hello");
        al.add("world");
        al.add("do some work");

        //System.out.println(al.get(0));
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println("-----");
        for(Object s : al){
            System.out.println(s);
        }


    }
}
