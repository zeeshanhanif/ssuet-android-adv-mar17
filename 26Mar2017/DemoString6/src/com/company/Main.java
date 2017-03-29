package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Hello Worldlllll";

        String c = "l";
        int count = 0;
        int index = -1;
        for(int i=0;i<s.length();i++){
            index = s.indexOf(c,index+1);
            if(index==-1){
                break;
            }
            count++;
            System.out.println("index: "+index);
        }
        System.out.println("Count = "+count);

    }
}
