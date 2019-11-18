package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val myName: MyName = MyName("See")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this, R.layout.activity_main)

        binding.buttonSetName.setOnClickListener{
            addNickName(it)
        }

        binding.myName = myName

    }

    private fun addNickName(it: View?) {

        binding.apply {

            myName?.name = editTextName.text.toString()
            this.invalidateAll()
        }
    }
}
