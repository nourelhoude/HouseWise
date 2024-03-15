package com.example.ekrili

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var spinner: Spinner
    lateinit var spinner2: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinner1)
        spinner2 = findViewById(R.id.spinner3)
        val states = arrayOf("Tunis","Ben arous","Ariana","Manouba","Beja","Nabeul","Bizert","Zaghouan","Sidi Bouzid","Sfax","Gabès","Jendouba","Tozeur","Tataouine","Mahdia","Siliana","Monastir","Médenine","Kairouan","Kef","Jerba","Kasserine","Sousse","Gafsa","Gbeli")
        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,states)
        spinner.adapter = adapter

        var iset = Utils.liste.map { university -> university.name }.toTypedArray()
        val adapter2 = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,iset)
        spinner2.adapter = adapter2


        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = states[position]
                Toast.makeText(this@MainActivity, "selectedItem : $selectedItem", Toast.LENGTH_LONG).show()
                iset=Utils.liste.filter { university -> university.state == selectedItem }.map { university -> university.name }.toTypedArray()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle case where nothing is selected
            }
        }

        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = iset[position]
                Toast.makeText(this@MainActivity, "selectedItem : $selectedItem", Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle case where nothing is selected
            }
        }

    }
}