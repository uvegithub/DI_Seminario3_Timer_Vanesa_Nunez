package com.example.di_seminario3_timer_vanesa_nunez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import android.widget.TextView

class Ejercicio_1 : AppCompatActivity() {

    private lateinit var numero:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1)

        numero=findViewById(R.id.cuenta)


        var  cuenta = 20

        val timer = object: CountDownTimer(2000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                cuenta--
                numero.text=cuenta.toString()
            }

            override fun onFinish() {
//                explosion.setImageResource(R.drawable.explosion)
                val intento = Intent(this@Ejercicio_1, Boom::class.java)
                startActivity(intento)
            }
        }
        timer.start()
    }
}