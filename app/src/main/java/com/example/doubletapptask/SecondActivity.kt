package com.example.doubletapptask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.doubletapptask.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MyLog","SecondActivity onCreate")
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.numTextView3.text =
            (intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0).pow(2)).toString()
        binding.button3.setOnClickListener {
            finish()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(MainActivity.NUMBER, binding.numTextView3.text.toString().toInt())
        super.onSaveInstanceState(outState)
        Log.d("MyLog","SecondActivity onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        binding.numTextView3.text = savedInstanceState.getInt(MainActivity.NUMBER, 8).toString()
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("MyLog","SecondActivity onRestoreInstanceState")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLog","SecondActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLog","SecondActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLog","SecondActivity onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLog","SecondActivity onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLog","SecondActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLog","SecondActivity onDestroy")
    }
}