package com.lydia.android.anxietycatapp

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Musica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_musica)
        val pausamusicabtn = findViewById<Button>(R.id.pausamusicabtn)

    val musica1 = findViewById<ImageView>(R.id.musica1)
    musica1.setOnClickListener {
        var mediaPlayer = MediaPlayer()
        mediaPlayer.setDataSource(
            this,
            Uri.parse("android.resource://" + this.packageName + "/" + R.raw.musica1)
        )
        mediaPlayer.prepare()
        mediaPlayer.start()
        pausamusicabtn.setOnClickListener {
            sonidoControl()
            mediaPlayer.stop()
            mediaPlayer.release()
            mediaPlayer = MediaPlayer()
        }
    }
    val musica2 = findViewById<ImageView>(R.id.musica2)
    musica2.setOnClickListener {
        var mediaPlayer = MediaPlayer()
        mediaPlayer.setDataSource(
            this,
            Uri.parse("android.resource://" + this.packageName + "/" + R.raw.musica2)
        )
        mediaPlayer.prepare()
        mediaPlayer.start()
        pausamusicabtn.setOnClickListener {
            sonidoControl()
            mediaPlayer.stop()
            mediaPlayer.release()
            mediaPlayer = MediaPlayer()
            }
        }
        val musica3 = findViewById<ImageView>(R.id.musica3)
        musica3.setOnClickListener {
            var mediaPlayer = MediaPlayer()
            mediaPlayer.setDataSource(
                this,
                Uri.parse("android.resource://" + this.packageName + "/" + R.raw.musica3)
            )
            mediaPlayer.prepare()
            mediaPlayer.start()
            pausamusicabtn.setOnClickListener {
                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer = MediaPlayer()
            }
        }
        val musica4 = findViewById<ImageView>(R.id.musica4)
        musica4.setOnClickListener {
            var mediaPlayer = MediaPlayer()
            mediaPlayer.setDataSource(
                this,
                Uri.parse("android.resource://" + this.packageName + "/" + R.raw.musica4)
            )
            mediaPlayer.prepare()
            mediaPlayer.start()
            pausamusicabtn.setOnClickListener {
                sonidoControl()
                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer = MediaPlayer()
            }
        }
        val musica5 = findViewById<ImageView>(R.id.musica5)
        musica5.setOnClickListener {
            var mediaPlayer = MediaPlayer()
            mediaPlayer.setDataSource(
                this,
                Uri.parse("android.resource://" + this.packageName + "/" + R.raw.musica5)
            )
            mediaPlayer.prepare()
            mediaPlayer.start()
            pausamusicabtn.setOnClickListener {
                sonidoControl()
                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer = MediaPlayer()
            }
        }
        val musica6 = findViewById<ImageView>(R.id.musica6)
        musica6.setOnClickListener {
            var mediaPlayer = MediaPlayer()
            mediaPlayer.setDataSource(
                this,
                Uri.parse("android.resource://" + this.packageName + "/" + R.raw.musica6)
            )
            mediaPlayer.prepare()
            mediaPlayer.start()
            pausamusicabtn.setOnClickListener {
                sonidoControl()
                mediaPlayer.stop()
                mediaPlayer.release()
                mediaPlayer = MediaPlayer()
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
