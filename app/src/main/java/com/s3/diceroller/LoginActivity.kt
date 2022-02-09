package com.s3.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    private lateinit var userName: EditText
    private lateinit var pass: EditText
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        userName=findViewById(R.id.username)
        pass=findViewById(R.id.pass)
        btnLogin=findViewById(R.id.login)
        btnLogin.setOnClickListener {
            if (userName.text != null && pass.text != null){
                val intent = Intent(this,HomeActivity::class.java)
                startActivity(intent)
                Toast.makeText(this,"Login successfully",Toast.LENGTH_SHORT).show()
                finish()
            }
            else
                Toast.makeText(this,"Enter valid cardinalities",Toast.LENGTH_SHORT).show()
        }
    }
}