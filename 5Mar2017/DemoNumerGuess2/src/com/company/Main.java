package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a = 5;

        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        int userInputCount = 0;


        do {
            userInputCount = 0;
            int num = r.nextInt(10);
            System.out.println("Num = "+num);

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

            System.out.print("Do you want play again? Press Y for yes or any to No");
            scanner.nextLine();
            String wantToContinue = scanner.nextLine();
            if(!wantToContinue.equalsIgnoreCase("y") && !wantToContinue.equalsIgnoreCase("yes")) {
                System.out.println("Thank You for having fun with us today.");
                System.out.println("Good Bye");
                break;
            }

        }while(true);


    }
}
