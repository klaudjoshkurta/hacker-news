package com.klaudjoshkurta.hackernews.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://hacker-news.firebaseio.com/v0/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface HackerNewsApiService {

    @GET("newstories")
    fun getHackerNews()
}