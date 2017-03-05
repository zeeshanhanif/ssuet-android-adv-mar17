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
        String wantToContinue = "y";


        do {
            boolean shouldRetry = false;
            wantToContinue = "y";
            System.out.print("Please enter number ");
            userInput = scanner.nextInt();
            System.out.println("user input = "+userInput);
            ++userInputCount;
            if(num == userInput){
                System.out.println("Matched - you Won");
                shouldRetry = true;
                //break;
            }
            else if(userInputCount==3){
                System.out.println("You Lost");
                //num = r.nextInt(10);
                shouldRetry = true;
            }
            else {
                System.out.println("Incorrect input please try again");

            }
            if(shouldRetry){
                System.out.print("Do you want play again? Press Y for yes or any to No");
                scanner.nextLine();
                wantToContinue = scanner.nextLine();
                if(wantToContinue.charAt(0)!='y') {
                    System.out.println("Thank You for having fun with us today.");
                    System.out.println("Good Bye");
                    break;
                }
                else {
                    num = r.nextInt(10);
                    System.out.println("New Num = "+num);
                    userInputCount = 0;
                }
            }

        }while(userInputCount<3);
    }
}
