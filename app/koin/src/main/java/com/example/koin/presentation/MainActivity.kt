package com.example.koin.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koin.R.layout
import com.example.koin.data.Model
import com.example.koin.presentation.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.core.component.KoinScopeComponent
import org.koin.core.component.createScope
import org.koin.core.scope.Scope

class MainActivity : AppCompatActivity(), KoinScopeComponent {

    override val scope: Scope by lazy { createScope(this) }

    //    private val viewModelFactory = ViewModelFactory(scope.get())
//    private val viewModel by viewModels<MainViewModel>()
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        viewModel = getViewModel()

        Model().service1.getVoice()
        Model().service2.getVoice()
    }
}