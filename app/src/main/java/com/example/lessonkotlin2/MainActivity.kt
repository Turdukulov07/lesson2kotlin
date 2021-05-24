package com.example.lessonkotlin2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lessonkotlin2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var ui: ActivityMainBinding
    private var list = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)
        init()
    }

    private fun init() {

        initialUlrs()

        ui.btnAdd.setOnClickListener {
            if (!ui.editText.text.isNullOrBlank())
                list.add(ui.editText.text.toString())
        }

        ui.btnRandom.setOnClickListener {
            if (!list.isNullOrEmpty()) {
                val url = list.random()
                ui.imageView.loadImage(this, url)
            }
        }
    }

    private fun initialUlrs() {
        list.add("https://i.pinimg.com/originals/94/1a/16/941a1638848c06d3d83139f2ba267c9d.jpg")
    }
}
