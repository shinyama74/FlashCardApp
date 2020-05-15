package com.example.flashcardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //インスタンス作成＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾＾
        val greenMonst = Word(R.drawable.monster01,"ひとつめトトロ","   Green")

        val yellowMonst = Word(R.drawable.monster02,"ひとつめコウモリ","   Yellow")

        val blueMonst = Word(R.drawable.monster03,"５つ目スライム","   Blue")

        val redMonst = Word(R.drawable.monster04,"おばけのおにいさん","   Pink")

        val monsterList= arrayOfNulls<Word>()
        addWord(blueMonst)
        addWord(redMonst)
        addWord(greenMonst)
        addWord(yellowMonst)


    }

    private fun addWord(word: Word){
        val nameTextView = TextView(this)
        nameTextView.text=word.name

        val colorTextView = TextView(this)
        colorTextView.text=word.color

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)

        val imageWidth :Int=300
        val imageHeight :Int=300
        val layoutParams=LinearLayout.LayoutParams(imageWidth,imageHeight)
        imageView.setLayoutParams(layoutParams)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL


        layout.addView(imageView)
        layout.addView(nameTextView)
        layout.addView(colorTextView)

        container.addView(layout)

    }

}
