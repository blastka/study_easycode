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

    private companion object{
        const val URL = "https://zavistnik.com/wp-content/uploads/2020/03/Android-kursy-zastavka.jpg"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textInput = findViewById<TextInputLayout>(R.id.textInputLayout)
        val textEdit = textInput.editText as TextInputEditText

        textEdit.addTextChangedListener(object : SimpleTextWatcher() {
            override fun afterTextChanged(p0: Editable?) {
                val input = p0.toString()
                if(input.endsWith("@g")){
                    val fullMail = "${input}mail.com"
                    textEdit.setText(fullMail)
                }
            }
        })
    }
}