package com.example.myapplication2.Android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication2.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = (application as MyApplication).viewModel

        val textView = findViewById<TextView>(R.id.textView)
        val observable = TextObservable()
        observable.observe(object : TextCallback {
            override fun updateText(str: String) {
                textView.text = str
            }
        })
        viewModel.init(observable)
    }

    override fun onDestroy() {
        viewModel.clear()
        super.onDestroy()
    }




}