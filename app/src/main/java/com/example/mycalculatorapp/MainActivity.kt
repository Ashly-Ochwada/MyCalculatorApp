package com.example.mycalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var etNum1: EditText
    lateinit var etNum2: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tvResult = findViewById(R.id.tvResult)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)

        btnAdd.setOnClickListener {
            var number1 = etNum1.text.toString().toDouble()
            var number2 = etNum2.text.toString().toDouble()

            add(number1,number2)
        }
        btnSubtract.setOnClickListener {
            var number1 = etNum1.text.toString().toDouble()
            var number2 = etNum2.text.toString().toDouble()

            subtract(number1,number2)
        }
        btnMultiply.setOnClickListener {
            var number1 = etNum1.text.toString().toDouble()
            var number2 = etNum2.text.toString().toDouble()

            multiply(number1,number2)
        }
        btnModulus.setOnClickListener {
            var number1 = etNum1.text.toString().toDouble()
            var number2 = etNum2.text.toString().toDouble()

            modulus(number1, number2)
        }
    }

    fun add(number1:Double, number2:Double){
        var num = number1+number2
        tvResult.text = num.toString()
    }


    fun subtract(number1:Double, number2:Double){
        var num = number1-number2
        tvResult.text = num.toString()
    }

    fun multiply(number1:Double, number2:Double){
        var num = number1*number2
        tvResult.text = num.toString()
    }

    fun modulus(number1:Double, number2:Double){
        var num = number1%number2
        tvResult.text = num.toString()
    }
}