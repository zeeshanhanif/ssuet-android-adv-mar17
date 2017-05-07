package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Button b = new Button("Submit");
        MyClickListener cl = new MyClickListener();
        b.setClickListener(cl);
        b.executeClick();
    }
}
