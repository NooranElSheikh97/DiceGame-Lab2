package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_game_play.*
import java.util.*

class GamePlay : AppCompatActivity() {


    var de1: Int = 0
    var de2: Int = 0
    var de3: Int = 0
    var de4: Int = 0
    var de5: Int = 0
    var de6: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_play)
        textView2.text = "1 : " + de1
        textView3.text = "2 : " + de2
        textView4.text = "3 : " + de3
        textView5.text = "4 : " + de4
        textView6.text = "5 : " + de5
        textView7.text = "6 : " + de6
        var rollIt: ImageView = findViewById(R.id.imageView2)
        rollIt.setOnClickListener {
            var randomInt = Random().nextInt(6)
            when(randomInt){
              1 ->{
                imageView2.setImageResource(R.drawable.dieimage1)
            }  2 ->{
                imageView2.setImageResource(R.drawable.dieimage2)
            }  3 ->{
                imageView2.setImageResource(R.drawable.dieimage3)
            }  4 ->{
                imageView2.setImageResource(R.drawable.dieimage4)
            }  5 ->{
                imageView2.setImageResource(R.drawable.dieimage5)
            }  else ->{
                imageView2.setImageResource(R.drawable.dieimage6)
            }
}

        when (randomInt) {
            1 -> {
                de1++
                textView2.text = " 1 : " + de1
            }
            2 -> {
                de2++
                textView3.text = " 2 : " + de2
            }
            3 -> {
                de3++
                textView4.text = " 3 : " + de3
            }
            4 -> {
                de4++
                textView5.text = " 4 : " + de4
            }
            5 -> {
                de5++
                textView6.text = " 5 : " + de5
            }
            else -> {
                de6++
                textView7.text = " 6 : " + de6
            }
        }
    }
}


    fun resetClick(View : View){
        de1 = 0
        de2 = 0
        de3 = 0
        de4 = 0
        de5 = 0
        de6 = 0
        textView2.text= "1 : " + de1
        textView3.text= "2 : " + de2
        textView4.text= "3 : " + de3
        textView5.text= "4 : " + de4
        textView6.text= "5 : " + de5
        textView7.text= "6 : " + de6
    }
}



