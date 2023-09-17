package com.vijaynatarajan.geeksforgeeks

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LogIn : AppCompatActivity() {
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnSignup: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        edtEmail = findViewById(R.id.edt_Email)
        edtPassword = findViewById(R.id.edt_Password)
        btnLogin = findViewById(R.id.Btn_LogIn)
        btnSignup = findViewById(R.id.Btn_Signup)
        btnSignup.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }
}