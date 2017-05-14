package com.company;

/**
 * Created by Ishaq Hassan on 5/14/2017.
 */
public class StudentInvalidAgeException extends RuntimeException{

    public StudentInvalidAgeException(String message){
        super(message);
    }
}
