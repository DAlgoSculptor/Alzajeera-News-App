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

    private val _isLoading = mutableStateOf(true)
    val isLoading: State<Boolean> = _isLoading

    private val _errorMessage = mutableStateOf<String?>(null)
    val errorMessage: State<String?> = _errorMessage

    init {
        fetchNews()
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
}
