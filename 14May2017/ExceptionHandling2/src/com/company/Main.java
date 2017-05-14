package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println("Before Try");
        try{
            int c = a/b;
            System.out.println("C: "+c);
        }catch (NullPointerException e){
            System.out.println("NullPointerException Exception");
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException Exception");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Exception Exception");
            System.out.println(e.getMessage());
        }
        System.out.println("After Try");

    }
}
