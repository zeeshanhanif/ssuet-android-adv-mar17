package com.example.demo;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "")
public class SampleController {

    @RequestMapping(path = "")
    public String index(){
        return "Welcome to our Spring Boot App";
    }


    @RequestMapping(path = "getUser")
    public String getUser(){
        User u = new User("username1","abc@helloworld.com",20);
        Gson gson = new Gson();
        return gson.toJson(u);
    }


    @RequestMapping(path = "user")
    public String getSpecificUser(@RequestParam(name = "id") int id){
        User u = new User("username1","abc@hello.com",id);
        Gson gson = new Gson();
        return gson.toJson(u);
    }

    @RequestMapping(path = "add",method = RequestMethod.POST)
    public String addUser(@RequestParam(name = "username") String username,@RequestParam(name = "email") String email,@RequestParam(name = "id") int id){
        User u = new User(username,email,id);
        Gson gson = new Gson();
        return gson.toJson(u);
    }

}
