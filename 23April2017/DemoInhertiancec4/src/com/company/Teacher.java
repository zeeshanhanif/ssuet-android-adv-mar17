package com.company;

/**
 * Created by zeeshanhanif-pc on 4/23/2017.
 */
public class Teacher extends Human {
    public Teacher(String name, int age){
        super(name,age);
    }

    public void study(){
        System.out.println(this.getName()+" is studying while watching TV");
    }

}
