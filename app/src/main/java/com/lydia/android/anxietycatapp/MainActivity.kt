package com.lydia.android.anxietycatapp

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart = findViewById<Button>(R.id.btnStart)
        val nombre= findViewById<EditText>(R.id.nombre)
        val gatoMain=findViewById<ImageView>(R.id.gatoMain)
        btnStart.setOnClickListener{
            if (nombre.text.isNotEmpty()){
                startSound()
                val menuIntent= Intent(this, Menu:: class.java)
                Toast.makeText(this, "Me alegra verte por aquí, ${nombre.text.toString()}", Toast.LENGTH_SHORT).show()
                startActivity(menuIntent)
                overridePendingTransition(R.anim.slide_bottomenter, R.anim.slide_bottomexit)
            }else{
                Toast.makeText(this, "¿Cómo te llamas?", Toast.LENGTH_SHORT).show()
                errorSound()
            }
        }

        gatoMain.setOnClickListener{
            gatoSound()
        }
    }
    private fun startSound (){
        var mp = MediaPlayer()
        mp.setDataSource(
            this,
            Uri.parse("android.resource://" + this.packageName + "/" + R.raw.pulsar)
        )
        mp.prepare()
        mp.start()
    }
    private fun gatoSound(){
        var mp = MediaPlayer()
        mp.setDataSource(
            this,
            Uri.parse("android.resource://" + this.packageName + "/" + R.raw.miau)
        )
        mp.prepare()
        mp.start()
    }
    private fun errorSound(){
        var mp = MediaPlayer()
        mp.setDataSource(
            this,
            Uri.parse("android.resource://" + this.packageName + "/" + R.raw.eoh)
        )
        mp.prepare()
        mp.start()
    }
}