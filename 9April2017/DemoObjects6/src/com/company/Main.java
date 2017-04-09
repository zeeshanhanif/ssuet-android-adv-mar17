package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Hello World";
        //Student st = new Student("Usman",46,"abc@gmail.com","Android");
        //System.out.println(st.course);
        //System.out.println(st.course.name);

        Course c = new Course("Android");
        Student st = new Student("Usman",46,"abc@gmail.com",c);
        System.out.println(st.course);
        System.out.println(st.course.name);

    }
}
