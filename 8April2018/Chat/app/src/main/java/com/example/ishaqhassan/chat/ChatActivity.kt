package com.example.ishaqhassan.chat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_chat.*

class ChatActivity : AppCompatActivity() {

    lateinit var msgsRef:DatabaseReference
    lateinit var msgsAdapter:MessagesAdapter
    lateinit var msgsList:ArrayList<MessageItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        msgsRef = FirebaseDatabase.getInstance().getReference("messages")
        msgsList = arrayListOf()
        msgsAdapter = MessagesAdapter(msgsList)
        chatMessagesList.adapter = msgsAdapter
        chatMessagesList.layoutManager = LinearLayoutManager(this)

        msgsRef.addChildEventListener(object : ChildEventListener{
            override fun onCancelled(p0: DatabaseError?) {}

            override fun onChildMoved(p0: DataSnapshot?, p1: String?) {}

            override fun onChildChanged(p0: DataSnapshot?, p1: String?) {}

            override fun onChildAdded(snapshot: DataSnapshot?, p1: String?) {
                if(snapshot !=  null){
                    val msg:MessageItem = snapshot.getValue(MessageItem::class.java)!!
                    msgsList.add(msg)
                    msgsAdapter.notifyDataSetChanged()
                }
            }

            override fun onChildRemoved(snapshot: DataSnapshot?) {
                if(snapshot !=  null){
                    val msg:MessageItem = snapshot.getValue(MessageItem::class.java)!!
                    if(msgsList.contains(msg)){
                        msgsList.remove(msg)
                        msgsAdapter.notifyDataSetChanged()
                    }
                }
            }

        })

        btnSend.setOnClickListener{
            sendMsg(MessageItem(msgEt.text.toString(),FirebaseAuth.getInstance().currentUser?.uid!!))
        }
    }

    fun sendMsg(msg:MessageItem){
        msgsRef.push().setValue(msg)
        msgEt.setText("")
    }
}
