package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Student st1 = new Student("Usman",10);
        Student st2 = new Student("Usman",10);
        System.out.println(st1.equals(st2));

        ArrayList<Student> al2 = new ArrayList<Student>();
        al2.add(new Student("Usman",34));
        al2.add(new Student("Arbaz",34));
        al2.add(new Student("Parkash",34));


        System.out.println(
                al2.contains(
                        new Student("Usman",34)));

        //Object b = new Object();
        //Object []a = new Object [4];
        ///a[0].equals(b);
        //a[1].equals(b);
        //a[2].equals(b);
    }
}
