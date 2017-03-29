package com.company;

public class Main {

    public static void main(String[] args) {
	    // Prime in arrays
        int nums[] = new int[10];
        int lastPrimeNoFound = 1;
        boolean isPrime = true;

        for(int i = 0;i<nums.length;){
            int primeNum = ++lastPrimeNoFound;
            isPrime = true;

            for(int j = 2;j<primeNum;j++){
                if(primeNum%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                nums[i] = primeNum;
                i++;
                lastPrimeNoFound = primeNum;
            }
        }

        for(int a = 0;a<nums.length;a++){
            System.out.println(nums[a]);
        }
    }
}
