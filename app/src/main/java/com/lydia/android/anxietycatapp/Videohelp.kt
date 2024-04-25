package com.lydia.android.anxietycatapp

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView

class Videohelp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videohelp)
        val askingforhelp=findViewById<VideoView>(R.id.askingforhelp)
        val play= findViewById<Button>(R.id.playvideo)
        val stop= findViewById<Button>(R.id.stopvideo)
        val pause= findViewById<Button>(R.id.pausevideo)
        val uri: Uri=Uri.parse("android.resource://" + this.packageName + "/" + R.raw.askingforhelp)
        play.setOnClickListener{
            askingforhelp.setVideoURI(uri)
            askingforhelp.requestFocus()
            askingforhelp.start()
            sonidoControl()
        }
        pause.setOnClickListener{
            askingforhelp.pause()
           var length=askingforhelp.currentPosition
            sonidoControl()
            play.setOnClickListener{
                askingforhelp.seekTo(length)
                askingforhelp.start()
                sonidoControl()
            }
            stop.setOnClickListener{
                var length=0
                askingforhelp.seekTo(length)
                askingforhelp.start()
                sonidoControl()
            }
        }
        stop.setOnClickListener{
            askingforhelp.resume()
            sonidoControl()
        }


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