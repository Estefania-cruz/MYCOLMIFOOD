package com.example.mycolmifood.ui.registrarProveedor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.mycolmifood.MainActivity
import com.example.mycolmifood.R

class registrarProveedorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_proveedor)

        val Menubtn= findViewById<View>(R.id.Menubtn) as Button
        Menubtn.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}