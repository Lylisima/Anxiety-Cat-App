package com.lydia.android.anxietycatapp

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class Tlfn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tlfn)
        val telefono1 = findViewById<ImageView>(R.id.telefono1)
        telefono1.setOnClickListener {
            sonidoControl()
            val llamada1 = Intent(Intent.ACTION_DIAL, Uri.parse("tel: 900124365"))
            startActivity(llamada1)
        }
        val telefono2 = findViewById<ImageView>(R.id.telefono2)
        telefono2.setOnClickListener {
            sonidoControl()
            val llamada2 = Intent(Intent.ACTION_DIAL, Uri.parse("tel: 717033717"))
            startActivity(llamada2)
        }
        val telefono3 = findViewById<ImageView>(R.id.telefono3)
        telefono3.setOnClickListener {
            sonidoControl()
            val llamada3 = Intent(Intent.ACTION_DIAL, Uri.parse("tel: 024"))
            startActivity(llamada3)
        }
        val videohelp = findViewById<Button>(R.id.videohelp)
        videohelp.setOnClickListener {
            val askhelp = Intent(this, Videohelp::class.java)
            startActivity(askhelp)
            startSound()
            Toast.makeText(this, "Creo que tengo algo que podría ayudarte", Toast.LENGTH_SHORT).show()
            overridePendingTransition(R.anim.slide_bottomenter, R.anim.slide_bottomexit)
        }

    }
    private fun startSound (){
        val mp = MediaPlayer()
        mp.setDataSource(
            this,
            Uri.parse("android.resource://" + this.packageName + "/" + R.raw.pulsar)
        )
        mp.prepare()
        mp.start()
    }
    private fun sonidoControl(){
        val mp = MediaPlayer()
        mp.setDataSource(
            this,
            Uri.parse("android.resource://" + this.packageName + "/" + R.raw.pulsa2)
        )
        mp.prepare()
        mp.start()
    }
}