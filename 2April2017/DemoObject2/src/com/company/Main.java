package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student st = new Student();
        Student st1 = new Student();
        System.out.println(st.name);
        System.out.println(st1.name);
        st1.name = "Arbaz";
        System.out.println(st.name);
        System.out.println(st1.name);

    }
}
