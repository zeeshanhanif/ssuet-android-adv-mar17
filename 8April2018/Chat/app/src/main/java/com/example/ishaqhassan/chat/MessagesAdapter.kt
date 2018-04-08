package com.example.ishaqhassan.chat

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.auth.FirebaseAuth

class MessagesAdapter(val messages:ArrayList<MessageItem>) : RecyclerView.Adapter<MessageItemViewHolder>() {
    private val IN_MSG = 1;
    private val OUT_MSG = 0;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageItemViewHolder {
        if(viewType == IN_MSG){
            val msgInItemView:View = LayoutInflater.from(parent.context).inflate(R.layout.in_msg_layout,parent,false)
            return MessageItemViewHolder(msgInItemView)
        }else{
            val msgOutItemView:View = LayoutInflater.from(parent.context).inflate(R.layout.out_msg_layout,parent,false)
            return MessageItemViewHolder(msgOutItemView)
        }
   }

    override fun getItemCount(): Int = messages.size

    override fun onBindViewHolder(holder: MessageItemViewHolder, position: Int) {
        holder.bindMsg(messages[position])
    }

    override fun getItemViewType(position: Int): Int {
        val msg = messages[position]
        if(msg.uid == FirebaseAuth.getInstance().currentUser?.uid){
            return OUT_MSG
        }else{
            return IN_MSG
        }
    }

}