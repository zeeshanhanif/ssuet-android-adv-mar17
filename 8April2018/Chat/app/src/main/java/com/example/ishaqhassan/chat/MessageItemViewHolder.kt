package com.example.ishaqhassan.chat

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class MessageItemViewHolder(myView:View) : RecyclerView.ViewHolder(myView)
{
    val msgTextTv:TextView = itemView.findViewById(R.id.msgTextTv)

    fun bindMsg(msg:MessageItem){
        msgTextTv.text = msg.messageText
    }
}