package com.example.ladm_u2_ejercicio6_canvas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val lienzo = Lienzo(this)
        setContentView(Lienzo(this))
    }
}