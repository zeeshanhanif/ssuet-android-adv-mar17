package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Workshop ws = new Workshop("Nimroz and Sons");
        System.out.println("Welcome to "+ws.getName());
        Vehicle []v = new Vehicle[4];
        v[0] = new Vehicle(2017,"Civic x" ,"White","Honda");
        v[1] = new Car(1998,"SL65","Black","Benz");
        v[2] = new Bus(1980,"W11","Multicolor","Mazda");
        v[3] = new Truck(2001,"Shezore","White","Hyundai");

        Random r = new Random();
        int num = r.nextInt(4);
        System.out.println("Num is "+num);
        ws.doService(v[num]);
    }
}
