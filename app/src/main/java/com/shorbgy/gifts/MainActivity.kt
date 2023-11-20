package com.shorbgy.gifts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shorbgy.gifts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val adapter by lazy { GiftsAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter(){
        binding.giftsRv.adapter = adapter
        val gifts = listOf(Gift(), Gift(), Gift(), Gift(),
            Gift(), Gift(), Gift(), Gift(),
            Gift(), Gift(), Gift(), Gift(),
            Gift(), Gift(), Gift(), Gift()
        )
        adapter.gifts = gifts
    }
}