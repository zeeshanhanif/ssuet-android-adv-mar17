package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Student st = new Student("Usman",46,"abc@gmail.com");
        st.addCourse("Android");
        st.addCourse("Java");
        st.addCourse("AI");
        st.addCourse("Web");

        for(int i=0;i<st.course.length;i++){
            System.out.println(st.course[i]);
            //System.out.println(st.course[i].name);
        }

    }
}
