package com.example.demo;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "")
public class StudentsController {
    @RequestMapping(path = "")
    public String home(){
        StudentModel[] students = new StudentModel[]{
          new StudentModel(1,"student1@gmail.com","Student One"),
          new StudentModel(2,"student2@gmail.com","Student Two"),
          new StudentModel(3,"student3@gmail.com","Student Three"),
        };
        Gson gson = new Gson();
        ResponseModel responseModel = new ResponseModel(students.length+" Records found!",false,students);
        return gson.toJson(responseModel);
    }

    @RequestMapping(path = "add",method = RequestMethod.POST)
    public String addStudent(@RequestParam(name = "stname") String name,@RequestParam String email){
        StudentModel studentModel = new StudentModel(10,name,email);
        ResponseModel responseModel = new ResponseModel("Student Saved!",false,studentModel);
        Gson gson = new Gson();
        return gson.toJson(responseModel);
    }
}
