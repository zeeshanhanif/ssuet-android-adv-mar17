package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s = new Student("Usman",35);
        SindhiFoods sf = s;
        Sindhi si = s;
        Pakistani p = s;
        p.jughar();
        sf.sindhiBiryani();

        si.sindhiJughar();
        si.sindhiBiryani();
        si.jughar();



    }
}
