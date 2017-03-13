package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a = 5;

        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println("Num = "+num);
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        int userInputCount = 0;

        do {
            System.out.print("Please enter number ");
            userInput = scanner.nextInt();
            System.out.println("user input = "+userInput);
            ++userInputCount;
            if(num == userInput){
                System.out.println("Matched - you Won");
                num = r.nextInt(10);
                break;
            }
            else if(userInputCount==3){
                System.out.println("You Lost");
                num = r.nextInt(10);
            }
            else {
                System.out.println("Incorrect input please try again");
            }


        }while(userInputCount<3);




    }
}
