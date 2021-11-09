package com.example.cooldroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView.setOnClickListener{
            counter++
            Log.d(null, "onCreate(), counter: ${counter}")
            cooldroidText.text =
                when (counter) {
                    0 -> getString(R.string.txt_dont_touch)
                    1 -> getString(R.string.once)
                    2 -> getString(R.string.twice)
                    else -> getString(R.string.text_view_numbers, counter)
                }
        }
    }
}