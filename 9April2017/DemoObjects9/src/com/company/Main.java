package com.company;

import com.company.demo.University;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student st = new Student("Usman",46,"abc@gmail.com");
        System.out.println(st.getName());
        University u = new University("SSUET");
        System.out.println(u.name);


    }
}
