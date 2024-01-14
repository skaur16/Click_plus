package com.example.clickplus

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class PracticeViewModel : ViewModel(){
    //val count = mutableStateOf(0)
    val val_count = mutableStateOf(Value())

    val fireBase = FireBase()

    fun add(stateView:PracticeViewModel): Int {
        stateView.val_count.value = stateView.val_count.value.copy(
            count = stateView.val_count.value.count + 1
        )
        return stateView.val_count.value.count
    }

    fun count(count:Int){
        Log.d("myTag", "ViewModel")
        var c = add(stateView = PracticeViewModel())
        fireBase.counter(c)
    }



}


