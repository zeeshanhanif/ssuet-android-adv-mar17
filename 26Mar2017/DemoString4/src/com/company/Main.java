package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Hello World";
        //System.out.println(s.indexOf("o",5));
        int length = s.length();
        char c = 'l';

        int count = 0;
        for(int i=0;i<length;i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        System.out.println("Count of "+c+ " in String is "+count);
    }
}
