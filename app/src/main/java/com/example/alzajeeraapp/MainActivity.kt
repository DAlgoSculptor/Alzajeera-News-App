package com.example.alzajeeraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.alzajeeraapp.ui.theme.AlzajeeraAppTheme
import com.example.alzajeeraapp.view.NewsScreen
import com.example.alzajeeraapp.viewmodel.NewsViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val newsViewModel: NewsViewModel = viewModel()
            val isDarkTheme = remember { mutableStateOf(false) }
            
            AlzajeeraAppTheme(darkTheme = isDarkTheme.value) {
                NewsScreen(viewModel = newsViewModel, isDarkTheme = isDarkTheme)
            }
        }
    }
}