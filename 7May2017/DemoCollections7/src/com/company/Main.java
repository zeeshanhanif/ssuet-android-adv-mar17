package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("A","Hello");
        hm.put("B","World");
        hm.put("C","New text");

        System.out.println(hm.get("B"));
        System.out.println(hm.containsValue("World"));
        

    }
}
