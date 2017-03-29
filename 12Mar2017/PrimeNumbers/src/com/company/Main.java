package com.company;

public class Main {

    public static void main(String[] args) {
	    // Prime Numbers

        int num = 27;
        boolean isPrime = true;

        for(int i = 2;i<num;i++){
            if(num%i == 0){
                //isPrime = true;
                //System.out.println("Is not prime at a" + i);
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not prime");
        }
    }






}
