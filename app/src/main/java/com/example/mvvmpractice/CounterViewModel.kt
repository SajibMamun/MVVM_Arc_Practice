package com.example.mvvmpractice

import androidx.lifecycle.ViewModel

class CounterViewModel:ViewModel() {

    var value:Int=0

    fun incremeantvalue(){
        value++
    }
}