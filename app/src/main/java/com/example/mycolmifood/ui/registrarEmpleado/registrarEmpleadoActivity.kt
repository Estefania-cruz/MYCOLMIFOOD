package com.example.mycolmifood.ui.registrarEmpleado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.mycolmifood.MainActivity
import com.example.mycolmifood.R

class registrarEmpleadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_empleado)

        val menubtn= findViewById<View>(R.id.menubtn) as Button
        menubtn.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}