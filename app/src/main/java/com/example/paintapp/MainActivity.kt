package com.example.paintapp


import android.content.Intent
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.example.paintapp.PaintView.Companion.colorList
import com.example.paintapp.PaintView.Companion.currntbrush
import com.example.paintapp.PaintView.Companion.pathList


class MainActivity : AppCompatActivity() {

    companion object {
        var path = Path()
        var paintbrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val textbtn = findViewById<TextView>(R.id.textbtn)
        val  redBtn = findViewById<ImageButton>(R.id.redColor)
        val  blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val  blackBtn = findViewById<ImageButton>(R.id.blackColor)
        val  eraser = findViewById<ImageButton>(R.id.whiteColor)




        redBtn.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            paintbrush.color = Color.RED
            currentcolor(paintbrush.color)
        }

        blueBtn.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            paintbrush.color = Color.BLUE
            currentcolor(paintbrush.color)
        }

        blackBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintbrush.color =Color.BLACK
            currentcolor(paintbrush.color)
        }
        eraser.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
                pathList.clear()
                 colorList.clear()
                 path.reset()
        }

    }
    private fun currentcolor(color :Int){
       currntbrush = color
        path = Path()
    }
}