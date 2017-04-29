package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Workshop ws = new Workshop("Nimroz and Sons");
        System.out.println("Welcome to "+ws.getName());
        Vehicle[]v = new Vehicle[4];
        //v[0] = new Vehicle(2017,"Civic x" ,"White","Honda");
        v[0] = new Car(1998,"SL65","Black","Benz");
        v[1] = new Bus(1980,"W11","Multicolor","Mazda");
        v[2] = new Truck(2001,"Shezore","White","Hyundai");
        v[3] = new SportsCar(1998,"SL65 2","Black","Benz 2");

        Random r = new Random();
        int num = r.nextInt(4);
        System.out.println("Num is "+num);
        ws.doService(v[num]);
    }
}
