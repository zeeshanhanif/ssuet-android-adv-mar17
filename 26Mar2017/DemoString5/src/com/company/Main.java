package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Hello Worldlllll ";
        //System.out.println(s.indexOf("o",5));
        int length = s.length();
        char c = 'l';
        String sArray[] = s.split("l");
        System.out.println(sArray.length);

        int count = 0;
        for(int i=0;i<sArray.length;i++){
            System.out.println(sArray[i]);
        }
        //System.out.println("Count of "+c+ " in String is "+count);
    }
}
