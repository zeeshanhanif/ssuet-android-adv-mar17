package com.example.demo;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Ishaq Hassan on 12/31/2017.
 */
@RestController
@RequestMapping(path = "hello")
public class MyAuthConroller {

    @RequestMapping(path = "abc",method = RequestMethod.GET)
    public @ResponseBody String myMethod(){
        return "Hello World";
    }
    @RequestMapping(path = "xyz",method = RequestMethod.GET)
    public @ResponseBody String myXyzMethod(){
        return "Hello World Xyz";
    }

    @RequestMapping(path = "pabc",method = RequestMethod.GET)
    public @ResponseBody
    String
    myParamMethod(@RequestParam(name = "first") String fname){
        return "{name:"+fname+"}";
    }
}
