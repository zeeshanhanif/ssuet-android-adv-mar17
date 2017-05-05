package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student st = new Student("Usman",35);
        //Android a = new AndroidCourse("Advance");
        st.setCourse(new Course() {
            @Override
            public void courseName() {
                System.out.println("Course in set course");
            }
        });
        st.printCourseDetails();
    }
}
