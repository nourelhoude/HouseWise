package com.example.formulaire.healthy.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class page2 : AppCompatActivity() {
    lateinit var num1:EditText
    lateinit var num2:EditText
    lateinit var bntAdd:Button
    lateinit var bntdelete:Button
    lateinit var bntdivide:Button
    lateinit var bntMultiply:Button
    lateinit var bntResult:Button
    var result=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        num1 =findViewById(R.id.number1)
        num2 =findViewById(R.id.number2)

        bntAdd=findViewById(R.id.add)
        bntAdd.setOnClickListener{
            var number1 =num1.text.toString().toInt()
            var number2 =num2.text.toString().toInt()
            result=number1 + number2
        }
       findViewById<Button>(R.Id.resultText) .setOnClickListener{
           findViewById<TextView>(R.id.resultText).text=result.toString()
       }

    }
}