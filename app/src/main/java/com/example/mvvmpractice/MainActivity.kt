package com.example.mvvmpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import com.example.mvvmpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    //create object of ViewModel
    val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //observer will observe viewmodel
        viewModel.counterMutableLiveData.observe(this) {
            binding.resulttvid.text = "$it"
        }



        binding.incrementbtnid.setOnClickListener {

            viewModel.incremeantvalue()


        }


    }
}