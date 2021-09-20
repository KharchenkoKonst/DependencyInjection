package com.example.dagger.data.service

import android.util.Log
import com.example.dagger.domain.repositories.Repository
import javax.inject.Inject

class ServiceImpl @Inject constructor(repository: Repository) : Service {
    init {
        Log.i("daggerDI", "service")
    }
}