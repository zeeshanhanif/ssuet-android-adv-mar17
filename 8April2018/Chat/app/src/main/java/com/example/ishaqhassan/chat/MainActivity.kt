package com.example.ishaqhassan.chat

import android.app.ProgressDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var auth:FirebaseAuth
    lateinit var progress:ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()

        if(auth.currentUser != null){
            gotoChat()
            return
        }

        progress = ProgressDialog(this)
        progress.setCancelable(false)
        progress.setMessage("Please wait...")

        btnSignIn.setOnClickListener{
            val emailStr = emailEt.text.toString()
            val passStr = passwordEt.text.toString()
            signIn(emailStr,passStr)
        }

        btnSignUp.setOnClickListener{
            val emailStr = emailEt.text.toString()
            val passStr = passwordEt.text.toString()
            signUp(emailStr,passStr)
        }
    }

    fun signIn(email:String,password:String){
        progress.show()
        auth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener{task ->
                    progress.dismiss()
                    if (task.isSuccessful){
                        Toast.makeText(this, "Signed In!", Toast.LENGTH_SHORT).show()
                        gotoChat()
                    }else{
                        Toast.makeText(this, "Error while signing In : ${task.exception?.message}!", Toast.LENGTH_SHORT).show()
                    }
                }
    }

    fun signUp(email:String,password:String){
        progress.show()
        auth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener{task ->
                    progress.dismiss()
                    if (task.isSuccessful){
                        Toast.makeText(this, "Signed Up!", Toast.LENGTH_SHORT).show()
                        gotoChat()
                    }else{
                        Toast.makeText(this, "Error while signing Up : ${task.exception?.message}!", Toast.LENGTH_SHORT).show()
                    }
                }
    }

    fun gotoChat(){
        startActivity(Intent(this,ChatActivity::class.java))
        finish()
    }

}
