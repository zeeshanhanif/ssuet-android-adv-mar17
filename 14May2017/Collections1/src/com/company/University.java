package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Ishaq Hassan on 5/14/2017.
 */
public class University {
    private String name;
    private HashMap<Integer,Student> students;

    public University(String name) {
        this.name = name;
        this.students = new HashMap<Integer,Student>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        students.put(student.getId(),student);
    }

    public void printStudentsList(){
        for(Student student : students.values()){
            //System.out.println("Name : "+student.getName()+", Age : "+student.getAge()+", Id : "+student.getId());
            System.out.println(student);
        }
    }

    public Student getStudentById(int id){
        return students.get(id);
    }

    /*public Student getStudentByName(String name){
        for(Student student : students.values()){
            if(name.equals(student.getName())){
                return student;
            }
        }
        return null;
    }*/

    public Student getStudentByName(String name){
        Student student = new Student(name,0,0);
        System.out.println(students.containsValue(student));
        HashSet<Student> stuList = (HashSet<Student>) students.values();
        return null;
    }
}
