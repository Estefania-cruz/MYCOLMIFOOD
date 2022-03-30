package com.example.mycolmifood.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.mycolmifood.MainActivity
import com.example.mycolmifood.R
import com.google.android.material.button.MaterialButton

class inicioSesionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_sesion)

        val username = findViewById<View>(R.id.username) as TextView
        val password = findViewById<View>(R.id.password) as TextView
        val loginbtn = findViewById<View>(R.id.loginbtn) as Button

        //prueba de admin


        //prueba de admin
        loginbtn.setOnClickListener {
            if (username.text.toString() == "admin" && password.text.toString() == "123") {
                //correcto
                Toast.makeText(this@inicioSesionActivity, "Acceso Correcto", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@inicioSesionActivity, MainActivity::class.java)
            } else  //error
                Toast.makeText(this@inicioSesionActivity, "Acceso Incorrecto", Toast.LENGTH_SHORT).show()
        }
    }
}