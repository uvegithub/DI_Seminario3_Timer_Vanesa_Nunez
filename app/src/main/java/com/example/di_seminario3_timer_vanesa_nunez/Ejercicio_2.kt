package com.example.di_seminario3_timer_vanesa_nunez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.widget.ImageView

class Ejercicio_2 : AppCompatActivity() {

    private lateinit var imagen01: ImageView
    private lateinit var imagen02: ImageView
    private lateinit var imagen03: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

        imagen01 = findViewById<ImageView>(R.id.imageView01)
        imagen02 = findViewById<ImageView>(R.id.imageView02)
        imagen03 = findViewById<ImageView>(R.id.imageView03)

//        imagen01.setOnClickListener {
//            Handler(Looper.getMainLooper()).postDelayed({
//                imagen01.setImageResource(R.drawable.carta1)
//                imagen01.setImageResource(R.drawable.carta0)
//            },1000)
//        }
//
//        imagen02.setOnClickListener {
//            Handler(Looper.getMainLooper()).postDelayed({
//                imagen02.setImageResource(R.drawable.carta2)
//                imagen02.setImageResource(R.drawable.carta0)
//            },1000)
//        }
//
//        imagen03.setOnClickListener {
//            Handler(Looper.getMainLooper()).postDelayed({
//                imagen03.setImageResource(R.drawable.carta3)
//                imagen03.setImageResource(R.drawable.carta0)
//            },1000)
//        }

        imagen01.setOnClickListener {

            val timer = object: CountDownTimer(1000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    imagen01.setImageResource(R.drawable.carta1)
                }

                override fun onFinish() {
                    imagen01.setImageResource(R.drawable.carta0)
                }
            }
            timer.start()
        }

        imagen02.setOnClickListener {

            val timer = object: CountDownTimer(1000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    imagen02.setImageResource(R.drawable.carta2)
                }

                override fun onFinish() {
                    imagen02.setImageResource(R.drawable.carta0)
                }
            }
            timer.start()
        }

        imagen03.setOnClickListener {

            val timer = object: CountDownTimer(1000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    imagen03.setImageResource(R.drawable.carta3)
                }

                override fun onFinish() {
                    imagen03.setImageResource(R.drawable.carta0)
                }
            }
            timer.start()
        }
    }
}