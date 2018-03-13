package com.mineproject.calculatorinkotlin

import android.content.Context
import android.content.SharedPreferences
import kotlinx.android.synthetic.main.activity_calculator.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import java.util.logging.Logger


class CalculatorActivity : AppCompatActivity(), View.OnClickListener  {

    val TAG : String = "CalculatorActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        // getting ids
        //hello.setText("Hello World!")


        // setting onClicklistener
        clearText.setOnClickListener(this)
        equalButton.setOnClickListener(this)

        // buttons
        button9.setOnClickListener(this)
        button8.setOnClickListener(this)
        button7.setOnClickListener(this)
        button6.setOnClickListener(this)
        button5.setOnClickListener(this)
        button4.setOnClickListener(this)
        button3.setOnClickListener(this)
        button2.setOnClickListener(this)
        button1.setOnClickListener(this)
        button0.setOnClickListener(this)

        // math operators
        buttonDot.setOnClickListener(this)
        plusButton.setOnClickListener(this)
        subtractButton.setOnClickListener(this)
        multiplyButton.setOnClickListener(this)
        divideButton.setOnClickListener(this)


        Logger.getLogger(TAG, "Inside onCreate() logger")
        print("Inside onCreate() print")

    }


    override fun onClick(view: View) {

        var answer : Int = 0
        var counter : Int = 0
        var num1 : Int = 0

        var prefs : SharedPreferences = getSharedPreferences("Calculator", Context.MODE_PRIVATE)

        when(view.id){

            R.id.button9 -> {
                numText.setText("9")
                counter++

                if(counter == 1){
                    num1
                }
            }

            R.id.button8 -> {
                numText.setText("8")
                counter++
            }

            R.id.button7 -> {
                numText.setText("7")
                counter++
            }

            R.id.button6 -> {
                numText.setText("6")
                counter++
            }

            R.id.button5 -> {
                numText.setText("5")
                counter++
            }

            R.id.button4 -> {
                numText.setText("4")
                counter++
            }

            R.id.button3 -> {
                numText.setText("3")
                counter++
            }

            R.id.button2 -> {
                numText.setText("2")
                counter++
            }

            R.id.button1 -> {
                numText.setText("1")
                counter++
            }

            R.id.button0 -> {
                numText.setText("0")
                counter++
            }

            // operators
            R.id.plusButton -> {
                numText.setText("+")
                prefs.edit().putInt("operator", 11).apply()         // 11 for plus
            }

            R.id.subtractButton -> {
                numText.setText("-")
                prefs.edit().putInt("operator", 22).apply()         // 22 for subtract
            }

            R.id.multiplyButton -> {
                numText.setText("*")
                prefs.edit().putInt("operator", 33).apply()         // 33 for multiply

            }

            R.id.divideButton -> {
                numText.setText("/")
                prefs.edit().putInt("operator", 44).apply()         // 44 for divide
            }


            R.id.clearText -> {
                numText.setText(" ")
            }

            R.id.equalButton -> {
                numText.setText("$answer")
            }



            else -> {
                Logger.getLogger(TAG, "Inside onClick() logger else")
                print("Inside onClick() print else")

            }

        }



        Logger.getLogger(TAG, "Inside onClick() logger")
        print("Inside onClick() print")


    }


    fun calculate(number: Int): Int {

        var prefs : SharedPreferences = getSharedPreferences("Calculator", Context.MODE_PRIVATE)
        var operator : Int = prefs.getInt("operator",0)

        if(operator == 11){
            // add
        }

        if(operator == 22){
            // subtract
        }

        if(operator == 33){
            // multiply
        }

        if(operator == 44){
            //divide
        }

        return number
    }

    fun isNumeric(input: String): Boolean =
            try {
                input.toDouble()
                true
            } catch(e: NumberFormatException) {
                false
            }
}
