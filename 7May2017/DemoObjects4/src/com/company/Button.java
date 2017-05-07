package com.company;

/**
 * Created by zeeshanhanif-pc on 5/7/2017.
 */
public class Button {
    private String value;
    private ClickListener listener;

    public Button(String value){
        this.value = value;
    }

    public void setClickListener(ClickListener c){
        this.listener = c;
    }

    public void executeClick(){
        this.listener.onClick();
    }
}
