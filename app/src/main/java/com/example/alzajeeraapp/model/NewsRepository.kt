package com.example.alzajeeraapp.model



import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NewsRepository {

    private val apiKey = "60d95613a4d04b6ca070fc1946190862"  // Replace with your NewsAPI key

    private val api: NewsApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://newsapi.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsApiService::class.java)
    }

    suspend fun fetchNews(): List<NewsArticle> {
        return api.getTopHeadlines(apiKey = apiKey).articles
    }
}
