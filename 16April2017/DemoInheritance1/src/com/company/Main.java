package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s = new Student();
        Teacher t = new Teacher();
        s.setName("Usman");
        s.setAge(34);
        s.setSubject("Android");
        System.out.println(s.getName());
        System.out.println(t.getName());
        System.out.println(s.getSubject());

    }
}
