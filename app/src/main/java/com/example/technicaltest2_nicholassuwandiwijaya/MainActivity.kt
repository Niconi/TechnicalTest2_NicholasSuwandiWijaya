package com.example.technicaltest2_nicholassuwandiwijaya

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signUpText = findViewById<TextView>(R.id.sign_up_text)
        val spannable = SpannableString("Don't Have Account? Sign up")
        val blueColor = ForegroundColorSpan(Color.BLUE)


        spannable.setSpan(blueColor, 20, spannable.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        signUpText.text = spannable

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)

        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Username and Password cannot be empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (username == "alfagift-admin" && password == "asdf") {
                val intent = Intent(this, StudentFeature::class.java)
                startActivity(intent)

                Toast.makeText(this, "Successful login", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Login failed. Please check your username and password again.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}