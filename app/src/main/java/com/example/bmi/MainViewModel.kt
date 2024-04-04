package com.example.bmi

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.pow
import kotlin.math.roundToInt

class MainViewModel : ViewModel() {
    var height by mutableStateOf("")
    var weight by mutableStateOf("")
    var bmi by mutableStateOf(0f)

    fun calculatateBMI() {
        var heightNUmber = height.toFloatOrNull()?.div(100) ?: 0f
        var weightNUmber = weight.toFloatOrNull() ?: 0f

        bmi = if(heightNUmber > 0 && weightNUmber > 0){
            (weightNUmber / heightNUmber.pow(2) * 10).roundToInt() / 10f
        }else 0f
    }
}