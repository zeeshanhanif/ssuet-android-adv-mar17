package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student []a = new Student[5];
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("==");
        a[0] = new Student("Usman",47,"abc1@gmail.com");
        a[1] = new Student("Arbaz",46,"abc2@gmail.com");
        a[2] = new Student("Rashid",21,"abc3@gmail.com");
        System.out.println("==");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //Student st = new Student("Usman",46,"abc@gmail.com","Android");
        //System.out.println(st.course);
        //System.out.println(st.course.name);



    }
}
