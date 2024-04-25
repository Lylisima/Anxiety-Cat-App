package com.lydia.android.anxietycatapp

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class Foto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asmr)
        val tv_text=findViewById<TextView>(R.id.tv_text)
        val et_text=findViewById<EditText>(R.id.et_text)

        //CARGAMOS DATOS
            val sharedPreferences= getSharedPreferences("MY_KEY", Context.MODE_PRIVATE)
            val savedString: String? = sharedPreferences.getString("MY_KEY", "")
            tv_text.text= savedString

        //GUARDAMOS DATOS
        val btn_guardar = findViewById<Button>(R.id.btn_guadar)
        btn_guardar.setOnClickListener{
            val textoInsertado= et_text.text.toString()
            tv_text.text= textoInsertado
            val sharedPreferences= getSharedPreferences("MY_KEY", Context.MODE_PRIVATE)
            val editor= sharedPreferences.edit()
            editor.apply{
                putString("MY_KEY", textoInsertado)
            }.apply()
            Toast.makeText(this, "Se han guardado tus datos insertados", Toast.LENGTH_SHORT).show()

        }
    }
 }
