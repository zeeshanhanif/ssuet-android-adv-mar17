package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 10;
        int b = 5;
        System.out.println("Before Try!");
        try{
            System.out.println((a/b));
        }catch (Exception e){
            System.out.println("Exception!");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally!");
        }
        System.out.println("After Try!");
    }
}
