package com.example.alzajeeraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.alzajeeraapp.view.NewsScreen
import com.example.alzajeeraapp.viewmodel.NewsViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val newsViewModel: NewsViewModel = viewModel()
            NewsScreen(viewModel = newsViewModel)
        }
    }
}
