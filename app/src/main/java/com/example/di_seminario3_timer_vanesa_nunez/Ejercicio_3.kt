package com.example.di_seminario3_timer_vanesa_nunez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView

class Ejercicio_3 : AppCompatActivity() {

    private lateinit var imagen01: ImageView
    private lateinit var boton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        imagen01 = findViewById<ImageView>(R.id.imageView01)
        boton =  findViewById(R.id.boton)

        var parar:Boolean=false

        boton.setOnClickListener {
            parar = true
        }

//        while(!parar){
//            val timer = object: CountDownTimer(2000, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                    imagen01.setImageResource(R.drawable.semaforo_verde)
//                }
//
//                override fun onFinish() {
//
//                }
//            }
//            timer.start()
//
//            val tiempo = object: CountDownTimer(1000, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                    imagen01.setImageResource(R.drawable.semaforo_ambar)
//                }
//
//                override fun onFinish() {
//
//                }
//            }
//            tiempo.start()
//
//            val time = object: CountDownTimer(2000, 1000) {
//                override fun onTick(millisUntilFinished: Long) {
//                    imagen01.setImageResource(R.drawable.semaforo_rojo)
//                }
//
//                override fun onFinish() {
//
//                }
//            }
//            time.start()
//        }

        val timer = object: CountDownTimer(5000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    if(millisUntilFinished>4000){
                        imagen01.setImageResource(R.drawable.semaforo_verde)
                    }else if(millisUntilFinished>2000){
                        imagen01.setImageResource(R.drawable.semaforo_ambar)
                    }else if(millisUntilFinished>1000){
                        imagen01.setImageResource(R.drawable.semaforo_rojo)
                    }
                }

                override fun onFinish() {
                    if(!parar){
                        this.start()
                    }

                }
            }
            timer.start()
    }
}