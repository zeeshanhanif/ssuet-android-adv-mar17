package com.example.ishaqhassan.chat

data class MessageItem(val messageText:String,val uid:String){
    constructor() : this("","")
}