package com.example.myapplication2

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ImageView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var textInputEditText: TextInputEditText

    private val textWatcher: TextWatcher = object : SimpleTextWatcher(){
        override fun afterTextChanged(p0: Editable?) {
            val input = p0.toString()
            if(input.endsWith("@g")){
                val fullMail = "${input}mail.com"
                setText(fullMail)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textInput = findViewById<TextInputLayout>(R.id.textInputLayout)
        textInputEditText = textInput.editText as TextInputEditText
        textInputEditText.addTextChangedListener(textWatcher)
    }

    private fun setText(text: String){
        textInputEditText.removeTextChangedListener(textWatcher)
        textInputEditText.setTextCorrectly(text)
        textInputEditText.addTextChangedListener(textWatcher)
    }

    fun TextInputEditText.setTextCorrectly(text: CharSequence){
        setText(text)
        setSelection(text.length)
    }
}