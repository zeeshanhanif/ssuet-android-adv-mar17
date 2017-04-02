package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student st1 = new Student();
        Student st2 = new Student();
        st1.name ="Usman";
        st2.name = "Arbaz";
        st1.eat();
        st1.setName();
        System.out.println(st1.name);
        System.out.println(st2.name);
        st1.eat();

    }
}
