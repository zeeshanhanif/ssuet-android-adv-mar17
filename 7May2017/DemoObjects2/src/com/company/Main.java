package com.company;

public class Main {

    public static void main(String[] args) {
        Student st = new Student();
        st.jugar();
        Pakistani p = new Student();
        p.jugar();
        Pakistani p1 = new Pakistani() {

            int age;
            String name;

            @Override
            public void jugar() {
                System.out.println("In Pakistani1 Jugar");
            }
        };

        p1.jugar();



    }
}
