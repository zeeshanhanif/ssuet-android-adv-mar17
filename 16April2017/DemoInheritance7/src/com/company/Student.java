package com.company;

/**
 * Created by zeeshanhanif-pc on 4/16/2017.
 */
public class Student extends Human {


    public Student(){
        super("Student name",45);
    }

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}






