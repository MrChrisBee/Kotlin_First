package com.example.christian.kotlin_first

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //eine Funktion definieren
    fun sum2numbers(a:Int, b:Int):Int {
        return a+b
    }

    fun diff2numbers(a:Int, b:Int): Int{
        return a-b
    }

    fun multiply2numbers(a:Int, b:Int):Int {
        return a*b
    }

    fun devide2Numbers(a:Float, b:Float):Float {
        if(b != 0f)
            return a/b
        else
            throw IllegalArgumentException("Teile nie durch Null denn das macht mich Dull!")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Action (onClick) festlegen
        buttonPlus.setOnClickListener { Toast.makeText(this, ""+sum2numbers(num1.text.toString().toInt(),num2.text.toString().toInt()) ,Toast.LENGTH_SHORT).show() }
        buttonMinus.setOnClickListener { Toast.makeText(this, ""+diff2numbers(num1.text.toString().toInt(),num2.text.toString().toInt()) ,Toast.LENGTH_SHORT).show() }
        buttonMal.setOnClickListener { Toast.makeText(this, ""+multiply2numbers(num1.text.toString().toInt(),num2.text.toString().toInt()) ,Toast.LENGTH_SHORT).show() }
        buttonGeteilt.setOnClickListener { Toast.makeText(this, ""+devide2Numbers(num1.text.toString().toFloat(),num2.text.toString().toFloat()) ,Toast.LENGTH_SHORT).show() }
    }
}
