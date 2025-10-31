package com.example.alzajeeraapp.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.alzajeeraapp.model.NewsArticle
import com.example.alzajeeraapp.model.NewsRepository
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {

    private val repository = NewsRepository()

    private val _articles = mutableStateOf<List<NewsArticle>>(emptyList())
    val articles: State<List<NewsArticle>> = _articles

    private val _videos = mutableStateOf<List<NewsArticle>>(emptyList())
    val videos: State<List<NewsArticle>> = _videos

    private val _isLoading = mutableStateOf(true)
    val isLoading: State<Boolean> = _isLoading

    private val _isVideoLoading = mutableStateOf(true)
    val isVideoLoading: State<Boolean> = _isVideoLoading

    private val _errorMessage = mutableStateOf<String?>(null)
    val errorMessage: State<String?> = _errorMessage

    private val _videoErrorMessage = mutableStateOf<String?>(null)
    val videoErrorMessage: State<String?> = _videoErrorMessage

    init {
        fetchNews()
        fetchVideos()
    }

    fun fetchNews() {
        viewModelScope.launch {
            _isLoading.value = true
            _errorMessage.value = null
            try {
                val result = repository.fetchNews()
                _articles.value = result
            } catch (e: Exception) {
                _errorMessage.value = "Failed to fetch news: ${e.message}"
            } finally {
                _isLoading.value = false
            }
        }
    }
    
    fun fetchVideos() {
        viewModelScope.launch {
            _isVideoLoading.value = true
            _videoErrorMessage.value = null
            try {
                val result = repository.fetchVideos()
                _videos.value = result
            } catch (e: Exception) {
                _videoErrorMessage.value = "Failed to fetch videos: ${e.message}"
            } finally {
                _isVideoLoading.value = false
            }
        }
    }
}