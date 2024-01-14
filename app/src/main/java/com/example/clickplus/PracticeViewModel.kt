package com.example.clickplus

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class PracticeViewModel : ViewModel(){
    //val count = mutableStateOf(0)
    val val_count = mutableStateOf(Value())

    val fireBase = FireBase()

    fun add(stateView:PracticeViewModel) {
        stateView.val_count.value = stateView.val_count.value.copy(
            count = stateView.val_count.value.count + 1
        )
    }

    fun count(value:Value){
        //var count = value.count
        Log.d("ViewModel, value of count=", value.count.toString())
        fireBase.counter(value.count)
    }



}


