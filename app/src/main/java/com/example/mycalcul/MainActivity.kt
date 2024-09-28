package com.example.mycalcul

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val Button_0: Button = findViewById(R.id.button0)
        val Button_1: Button = findViewById(R.id.button1)
        val Button_2: Button = findViewById(R.id.button2)
        val Button_3: Button = findViewById(R.id.button3)
        val Button_4: Button = findViewById(R.id.button4)
        val Button_5: Button = findViewById(R.id.button5)
        val Button_6: Button = findViewById(R.id.button6)
        val Button_7: Button = findViewById(R.id.button7)
        val Button_8: Button = findViewById(R.id.button8)
        val Button_9: Button = findViewById(R.id.button9)
        val buttonZapitaya: Button = findViewById(R.id.buttonZapitaya)
        val buttonProchent: Button = findViewById(R.id.buttonProchent)
        val buttonPlus: Button = findViewById(R.id.buttonPlus)
        val buttonMinus: Button = findViewById(R.id.buttonMinus)
        val button1Deliti: Button = findViewById(R.id.button1Deliti)
        val buttonX: Button = findViewById(R.id.buttonX)
        val buttonBack: Button = findViewById(R.id.buttonBack)
        val buttonRovno: Button = findViewById(R.id.buttonRovno)
        val Button_Clear: Button = findViewById(R.id.button12)
        val Textys = findViewById<TextView>(R.id.textView)
        Button_0.setOnClickListener {
            var text = Textys.text.toString() + "0"
            Textys.setText(text)
            if (Textys.text == "00") {
                Textys.text = "0"
            }
        }
        Button_1.setOnClickListener {
            var text = Textys.text.toString() + "1"
            Textys.setText(text)
            if (Textys.text == "01") {
                Textys.text = "1"
            }
        }
        Button_2.setOnClickListener {
            var text = Textys.text.toString() + "2"
            Textys.setText(text)
            if (Textys.text == "02") {
                Textys.text = "2"
            }
        }
        Button_3.setOnClickListener {
            var text = Textys.text.toString() + "3"
            Textys.setText(text)
            if (Textys.text == "03") {
                Textys.text = "3"
            }
        }
        Button_4.setOnClickListener {
            var text = Textys.text.toString() + "4"
            Textys.setText(text)
            if (Textys.text == "04") {
                Textys.text = "4"
            }
        }
        Button_5.setOnClickListener {
            var text = Textys.text.toString() + "5"
            Textys.setText(text)
            if (Textys.text == "05") {
                Textys.text = "5"
            }
        }
        Button_6.setOnClickListener {
            var text = Textys.text.toString() + "6"
            Textys.setText(text)
            if (Textys.text == "06") {
                Textys.text = "6"
            }
        }
        Button_7.setOnClickListener {
            var text = Textys.text.toString() + "7"
            Textys.setText(text)
            if (Textys.text == "07") {
                Textys.text = "7"
            }
        }
        Button_8.setOnClickListener {
            var text = Textys.text.toString() + "8"
            Textys.setText(text)
            if (Textys.text == "08") {
                Textys.text = "8"
            }
        }
        Button_9.setOnClickListener {
            var text = Textys.text.toString() + "9"
            Textys.setText(text)
            if (Textys.text == "09") {
                Textys.text = "9"
            }
        }
        buttonPlus.setOnClickListener {
            var text = Textys.text.toString()
            if (text.last() != '+' && text.last() != '-' && text.last() != '.' && text.last() != '/' && text.last() != '%'&& text.last() != '*')
            {
                text = Textys.text.toString() + "+"
                Textys.setText(text)
            }
            else if(text.last() == '-')
            {
                text = Textys.text.toString().dropLast(1) + "-"
                Textys.setText(text)
            }

        }
        buttonMinus.setOnClickListener {
            var text = Textys.text.toString()
            if (Textys.text == "0") {
                Textys.text = "-"
            }
            else if (text.last() != '-' && text.last() != '+' && text.last() != '.')
            {
                text = Textys.text.toString() + "-"
                Textys.setText(text)
            }
            else if(text.last() == '+')
            {
                text = Textys.text.toString().dropLast(1) + "-"
                Textys.setText(text)
            }
            else if(text.last() == '-')
            {
                text = Textys.text.toString().dropLast(1) + "+"
                Textys.setText(text)
            }
        }
        buttonZapitaya.setOnClickListener {
            var text = Textys.text.toString()
            if (text.last() != '.' && text.last() != '+' && text.last() != '-' && text.last() != '/' && text.last() != '%'&& text.last() != '*')
            {
                text = Textys.text.toString() + "."
                Textys.setText(text)
            }
        }
        buttonProchent.setOnClickListener {
            var text = Textys.text.toString()
            if (text.last() != '%' && text.last() != '.' && text.last() != '+' && text.last() != '-' && text.last() != '/' && text.last() != '*')
            {
                text = Textys.text.toString() + "%"
                Textys.setText(text)
            }
        }
        button1Deliti.setOnClickListener {
            var text = Textys.text.toString()
            if (text.last() != '/' && text.last() != '.' && text.last() != '+' && text.last() != '-'  && text.last() != '%'&& text.last() != '*')
            {
                text = Textys.text.toString() + "/"
                Textys.setText(text)
            }
        }
        buttonX.setOnClickListener {
            var text = Textys.text.toString()
            if (text.last() != '*' && text.last() != '.' && text.last() != '+' && text.last() != '-' && text.last() != '/' && text.last() != '%')
            {
                text = Textys.text.toString() + "*"
                Textys.setText(text)
            }
        }
        buttonBack.setOnClickListener {
            var text = Textys.text.toString().dropLast(1)
            Textys.setText(text)
            if (Textys.text == "") {
                Textys.text = "0"
            }
        }
        buttonRovno.setOnClickListener {
            if(Textys.text.first()=='-')
            {
                Textys.text = "0" + Textys.text
            }
            var chet = Textys.text
            if(Textys.text.last()=='-' || Textys.text.last()=='+' || Textys.text.last()=='*' || Textys.text.last()=='/')
            {
                chet= Textys.text.toString().dropLast(1)
            }
            val expression = chet.replace("\\s".toRegex(), "")
            val operators = mutableListOf<Char>()
            for (char in expression) {
                if (char in "+-*/%") {
                    operators.add(char)
                }
            }
            val numbers = expression.split("(?=[-+*/%])".toRegex()).flatMap {
                it.split("[+\\-*/%]".toRegex()).filter { num -> num.isNotEmpty() }
            }
            var result = numbers[0].toFloat()
            for (i in 1 until numbers.size) {
                val currentNumber = numbers[i].toFloatOrNull() ?: 1f
                when (operators[i - 1]) {
                    '+' -> result += currentNumber
                    '-' -> result -= currentNumber
                    '*' -> result *= currentNumber
                    '/' -> {
                        if (currentNumber != 0f) {
                            result /= currentNumber
                        } else {
                            println("Ошибка: Деление на ноль.")
                            return@setOnClickListener
                        }
                    }
                    '%' -> result = (result * currentNumber) / 100
                }
            }
            if(result%1 == 0.0f)
            {
                Textys.text = result.toInt().toString()
            }
            else
            {
                Textys.text = result.toString()
            }

        }
        Button_Clear.setOnClickListener {
            Textys.text = "0"
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }
}