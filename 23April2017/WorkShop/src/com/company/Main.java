package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Workshop ws = new Workshop("Nimroz and Sons");
        System.out.println("Welcome to "+ws.getName());
        Car c1 = new Car(1998,"SL65","Black","Benz");
        Vehicle t1 = new Truck(2001,"Shezore","White","Hyundai");
        //ws.doService(c1);
        ws.doService(t1);
    }
}
