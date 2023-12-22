package com.example.cursoandroid.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.cursoandroid.R

class FirstAppActivity : AppCompatActivity() {

    //Funcion que se ejecuta al arrancar la pantalla
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)

        val btnStart = findViewById<Button>(R.id.btnStart)
        val etName = findViewById<EditText>(R.id.etName)


        btnStart.setOnClickListener {
            val name = etName.text.toString()

            if (name.isNotEmpty()){
                //Al intento de pasamos el contexto de esta actividad (this) y la actividad a la que
                //queremos ir (ResultActivity)
                val intent = Intent(this, ResultActivity::class.java)
                //Le pasamos un nombre y la variable que queremos pasarle
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }
    }
}