package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sindhi si = new Student("Arbaz",36);
        Pakistani p = si;
        SindhiFoods sf = si;

        //Sindhi si2 = p;
        //SindhiFoods sf2 = p;
        //Sindhi si3 = sf;

        Sindhi si2 = (Sindhi)p;
        si2.sindhiJughar();



    }
}
