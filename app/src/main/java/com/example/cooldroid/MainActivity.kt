package com.example.cooldroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    var counter = 0
    private val COUNTER = "counter"
    private val LOG_TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt(COUNTER)
            setText()
        }
        imageView.setOnClickListener {
            counter++
            setText()
        }
    }

    private fun setText() {
        Log.d(null, "onCreate(), counter: ${counter}")
        cooldroidText.text = getText()

    }

    private fun getText(): String {
        print(counter)
        return when (counter) {
            1 -> getString(R.string.once)
            2 -> getString(R.string.twice)
            else -> getString(R.string.text_view_numbers, counter)
        }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(COUNTER, counter)
        Log.d(LOG_TAG, "onSaveInstance(), counter: ${counter}")
        super.onSaveInstanceState(outState)
    }
}