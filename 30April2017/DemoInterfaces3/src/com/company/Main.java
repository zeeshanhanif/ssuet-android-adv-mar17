package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human h = new Human("Usman",34);
        Student s = new Student("Arbaz",35);
        Human st1 = new Student("Wahaj",36);
        st1.study();
        Pakistani p = new Student("Nimroz",37);
        p.jughar();
        Sindhi si = new Student("Adnan",38);
        si.sindhiJughar();


    }
}
