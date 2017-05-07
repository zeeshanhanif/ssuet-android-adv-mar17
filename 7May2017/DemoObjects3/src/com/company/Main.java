package com.company;

public class Main {

    public static void main(String[] args) {
        Student st = new Student();
        st.study();
        st.jugar();

        Student st2 = new AndroidStudent();



        Student st1 = new Student(){

            @Override
            public void study(){
                System.out.println("Study in st1");
                this.sleep();
            }

            public void sleep(){
                System.out.println("Student st1 sleeping");
            }
        };

        /*
        (new Student(){

            @Override
            public void study(){
                System.out.println("Study in st1");
                this.sleep();
            }

            public void sleep(){
                System.out.println("Student st1 sleeping");
            }
        }).sleep();
        */

        st1.study();
        //st1.sleep();


    }
}
