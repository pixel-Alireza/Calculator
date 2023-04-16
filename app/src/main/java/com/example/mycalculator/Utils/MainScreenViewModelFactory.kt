package com.example.mycalculator.Utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mycalculator.MainScreen.MainScreenViewModel


/*
+++++++++ if you wanna add input constructor for viewModel add it here++++++++++++++
 */
@Suppress("UNCHECKED_CAST")
class MainScreenViewModelFactory() : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainScreenViewModel() as T
    }
}