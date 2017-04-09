package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Hello World";
        Student st = new Student("Usman",46,"abc@gmail.com");
        System.out.println(st.course);
        Course c = new Course("Android");
        st.course = c;
        System.out.println(st.course.name);

    }
}
