package com.example.mycaculator.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class CalculatorViewModelFactory(private val application: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(CalculatorViewModel::class.java)){
            return CalculatorViewModel(application) as T
        }
        else{
            throw IllegalArgumentException("Unknown class")
        }
    }
}