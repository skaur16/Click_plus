package com.example.clickplus

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class PracticeViewModel : ViewModel(){
    val count = mutableStateOf(0)

    val fireBase = FireBase()




    fun count(count:Int){

        fireBase.counter(count)
    }



}


