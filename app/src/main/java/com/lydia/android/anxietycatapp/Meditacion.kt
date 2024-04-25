package com.lydia.android.anxietycatapp


import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Meditacion : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditacion)
        val botonpausaMeditacion=findViewById<Button>(R.id.botonpausaMeditacion)
        val botonmeditacionA = findViewById<Button>(R.id.botonmeditacionA)
        botonmeditacionA.setOnClickListener {
            var mediaPlayer=MediaPlayer()
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.meditaciona))
            mediaPlayer.prepare()
            mediaPlayer.start()
            botonpausaMeditacion.setOnClickListener{
                sonidoControl()
                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer=MediaPlayer()
            }
        }
        val botonmeditacionB = findViewById<Button>(R.id.botonmeditacionB)
        botonmeditacionB.setOnClickListener {
            var mediaPlayer=MediaPlayer()
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.meditacionb))
            mediaPlayer.prepare()
            mediaPlayer.start()
            botonpausaMeditacion.setOnClickListener{
                sonidoControl()
                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer=MediaPlayer()
            }
        }
        val botonmeditacionC = findViewById<Button>(R.id.botonmeditacionC)
        botonmeditacionC.setOnClickListener {
            var mediaPlayer=MediaPlayer()
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.meditacionc))
            mediaPlayer.prepare()
            mediaPlayer.start()
            botonpausaMeditacion.setOnClickListener{
                sonidoControl()
                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer=MediaPlayer()
            }
        }
        val botonmeditacionD = findViewById<Button>(R.id.botonmeditacionD)
        botonmeditacionD.setOnClickListener {
            var mediaPlayer=MediaPlayer()
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.meditaciond))
            mediaPlayer.prepare()
            mediaPlayer.start()
            botonpausaMeditacion.setOnClickListener{
                sonidoControl()
                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer=MediaPlayer()
            }
        }
        val botonmeditacionE = findViewById<Button>(R.id.botonmeditacionE)
        botonmeditacionE.setOnClickListener {
            var mediaPlayer=MediaPlayer()
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.meditacione))
            mediaPlayer.prepare()
            mediaPlayer.start()
            botonpausaMeditacion.setOnClickListener{
                sonidoControl()
                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer=MediaPlayer()
            }
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


