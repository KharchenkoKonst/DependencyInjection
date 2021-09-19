package com.example.dagger.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dagger.domain.interactors.Interactor

class MainViewModel(private val interactor: Interactor) : ViewModel() {
}