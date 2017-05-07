package com.company;

public class Main {

    public static void main(String[] args) {
        Student st = new Student();
        st.jugar();
        Pakistani p = new Student();
        p.jugar();
        Pakistani p1 = new Pakistani() {
            @Override
            public void jugar() {
                System.out.println("In Pakistani1 Jugar");
            }
        };

        Pakistani p2 = new Pakistani() {
            @Override
            public void jugar() {
                System.out.println("New implementation of Jugar in Pakistnai");
            }
        };



    }
}
