package com.example.smart2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.smart2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.recItem.layoutManager = GridLayoutManager(this, 2)
        binding.recItem.adapter = ItemAdaptr(
            listOf(
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
                ItemModel(R.drawable.baseline_person_24, "Android"),
            )
        )

    }
}