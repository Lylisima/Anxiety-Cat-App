package com.lydia.android.anxietycatapp

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val maincat2=findViewById<ImageView>(R.id.maincat2)
        maincat2.setOnClickListener(){
            gatoSound()
        }
        val meditacionbtn = findViewById<ImageView>(R.id.meditacionbtn)
        meditacionbtn.setOnClickListener {
            startSound()
            val intent = Intent(this, Meditacion::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_topenter, R.anim.slide_topexit)
        }
        val musicabtn = findViewById<ImageView>(R.id.musicabtn)
        musicabtn.setOnClickListener {
            startSound()
            val intent = Intent(this, Musica::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_topenter, R.anim.slide_topexit)
        }
        val tlfnbtn = findViewById<ImageView>(R.id.tlfnbtn)
        tlfnbtn.setOnClickListener {
            startSound()
            val intent = Intent(this, Tlfn::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_topenter, R.anim.slide_topexit)
        }
        val asmrbtn = findViewById<ImageView>(R.id.asmrbtn)
        asmrbtn.setOnClickListener {
            startSound()
            val intent = Intent(this, Foto::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_topenter, R.anim.slide_topexit)
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
    private fun gatoSound(){
        var mp = MediaPlayer()
        mp.setDataSource(
            this,
            Uri.parse("android.resource://" + this.packageName + "/" + R.raw.miau2)
        )
        mp.prepare()
        mp.start()
    }
}