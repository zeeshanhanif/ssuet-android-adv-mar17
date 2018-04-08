package com.example.ishaqhassan.chat;

public class SampleModelClass {
    private String msg;
    private String uid;

    SampleModelClass(){

    }

    public SampleModelClass(String msg, String uid) {
        this.msg = msg;
        this.uid = uid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
