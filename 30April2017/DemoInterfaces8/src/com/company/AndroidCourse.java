package com.company;

/**
 * Created by zeeshanhanif-pc on 4/30/2017.
 */
public class AndroidCourse implements Android {

    private String name;
    public AndroidCourse(String name){
        this.name = name;
    }
    @Override
    public void runEmulator() {
        System.out.println("Android Emulator is running");
    }

    @Override
    public void courseName() {
        System.out.println("Course name is : "+this.name);
    }
}
