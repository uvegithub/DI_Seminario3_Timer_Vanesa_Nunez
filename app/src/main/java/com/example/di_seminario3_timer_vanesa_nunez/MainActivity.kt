package com.example.di_seminario3_timer_vanesa_nunez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun iniciarActividadEjercicio1 (view : View){
        val intent = Intent(this, Ejercicio_1::class.java)
        startActivity(intent)
    }

    fun iniciarActividadEjercicio2 (view : View){
        val intent = Intent(this, Ejercicio_2::class.java)
        startActivity(intent)
    }
}