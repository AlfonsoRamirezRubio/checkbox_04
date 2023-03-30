package com.example.checkbox_04

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txt:EditText
    lateinit var chkCursiva:CheckBox
    lateinit var chkNegrita:CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt = findViewById(R.id.edNombre)
    }
    fun clickChek(view: View){
        txt.typeface = typeface.DEFAULT
        val checkPresionado: ChekBox = view as CheckBox

        if (checkPresionado.id== R.id.chkNegrita && checkPresionado.isCheked
            && checkPresionado.id==R.id.chkCursiva && checkPresionado.isCheked)
            txt.typeface = typeface.defaulFromStyle(Typeface.BOLD_ITALIC)

        else if (checkPresionado.id ==R.id.chkNegrita && checkPresionado.isCheked)
        txt. typeface = typeface.defaulFromStyle(Typeface.BOLD)

        else if (checkPresionado.id ==R.id.chkCursiva && checkPresionado.isCheked){
            txt.typeface = typeface.defaultFromStyle(typeface.Italic)
        }
    }
}