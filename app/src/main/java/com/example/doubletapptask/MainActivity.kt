package com.example.doubletapptask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.doubletapptask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MyLog", "MainActivity onCreate")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(EXTRA_NUMBER, binding.numTextView.text.toString().toInt())
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(NUMBER, binding.numTextView.text.toString().toInt())
        super.onSaveInstanceState(outState)
        Log.d("MyLog","MainActivity onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        binding.numTextView.text = (savedInstanceState.getInt(NUMBER, 8)+1).toString()
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("MyLog","MainActivity onRestoreInstanceState")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLog","MainActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLog","MainActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLog","MainActivity onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLog","MainActivity onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLog","MainActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLog","MainActivity onDestroy")
    }

    companion object{
        const val EXTRA_NUMBER = "number"
        const val NUMBER = "num"
    }
}