package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 11;
        //Forty Five
        String[] ones = new String[]{"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String[] tens = new String[]{"Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

        int reminder = a%10;
        int divider = a/10;

        System.out.println(tens[divider-1]+" "+ones[reminder-1]);
    }
}
