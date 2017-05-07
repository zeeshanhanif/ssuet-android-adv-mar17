package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Button b = new Button("Submit");
        b.setClickListener(new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("do some work in main");
            }
        });
        b.executeClick();
    }
}
