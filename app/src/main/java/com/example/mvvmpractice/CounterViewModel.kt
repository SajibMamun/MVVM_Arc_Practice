package com.example.mvvmpractice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private var value: Int = 0


    //create mutable live data object
    var counterMutableLiveData = MutableLiveData<Int>()


    fun incremeantvalue() {
        value++

        //updatelivedata value
        counterMutableLiveData.postValue(value)
    }
}