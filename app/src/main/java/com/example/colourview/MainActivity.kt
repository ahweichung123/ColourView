package com.example.colourview

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.view.ViewCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.rgb(0,0,255))
            R.id.box_two_text -> view.setBackgroundColor(Color.rgb(47,86,233))
            R.id.box_three_text -> view.setBackgroundColor(Color.rgb(45,100,245))
            R.id.box_four_text -> view.setBackgroundColor(Color.rgb(47,141,255))
            R.id.box_five_text -> view.setBackgroundColor(Color.rgb(51,171,249))
            R.id.box_six_text -> view.setBackgroundColor(Color.rgb(52,204,255))
            R.id.box_seven_text -> view.setBackgroundColor(Color.rgb(82,219,255))
            R.id.box_eight_text -> view.setBackgroundColor(Color.rgb(110,255,255))
            R.id.box_nine_text -> view.setBackgroundColor(Color.rgb(23,236,236))
            R.id.box_ten_text -> view.setBackgroundColor(Color.rgb(168,255,255))

            // Boxes using custom colors for background
            //R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            //R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            //R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        //val redButton = findViewById<TextView>(R.id.red_button)
        //val greenButton = findViewById<TextView>(R.id.green_button)
        //val yellowButton = findViewById<TextView>(R.id.yellow_button)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                boxSixText, boxSevenText, boxEightText, boxNineText, boxTenText)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}
