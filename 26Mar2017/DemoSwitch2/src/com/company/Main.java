package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char a = 'E';
        switch (a){
            case 'A':
                System.out.println("A is vowel");
                break;
            case 'E':
                System.out.println("E is vowel");
            case 'I':
                System.out.println("I is vowel");

            case 'O':
                System.out.println("O is vowel");
                break;
            case 'U':
                System.out.println("U is vowel");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
