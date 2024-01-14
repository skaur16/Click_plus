package com.example.clickplus

import androidx.compose.runtime.Composable

@Composable
fun Add(stateView:PracticeViewModel): Int {
        stateView.val_count.value = stateView.val_count.value.copy(
            count = stateView.val_count.value.count + 1
        )
    return stateView.val_count.value.count
}