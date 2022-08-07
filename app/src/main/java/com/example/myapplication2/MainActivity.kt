package com.example.myapplication2

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var textInputEditText: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textInput = findViewById<TextInputLayout>(R.id.textInputLayout)
        textInputEditText = textInput.editText as TextInputEditText
        textInputEditText.listenChanges { text -> Log.e("MY", text) }
    }

    private fun TextInputEditText.listenChanges(block:(text: String) -> Unit){
        addTextChangedListener(object : SimpleTextWatcher(){
            override fun afterTextChanged(p0: Editable?) {
                block.invoke(p0.toString())
            }
        })
    }

}