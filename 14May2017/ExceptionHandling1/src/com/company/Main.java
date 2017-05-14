package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Before Try");
        try{
            int c = a/b;
            System.out.println("C: "+c);
        }catch (Exception e){
            System.out.println("Exception");
            System.out.println(e.getMessage());
        }
        System.out.println("After Try");

    }
}
