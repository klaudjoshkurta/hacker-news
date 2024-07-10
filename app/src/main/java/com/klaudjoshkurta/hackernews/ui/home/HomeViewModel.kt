package com.klaudjoshkurta.hackernews.ui.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class HomeViewModel : ViewModel() {
    /** The mutable State that stores the status of the most recent request */
    var homeUiState: String by mutableStateOf("")
        private set

    /**
     * Call getHackerNews() on init so we can display status immediately.
     */
    init {
        getHackerNews()
    }

    /**
     * Gets news information from the Hacker News API Retrofit service and updates the
     * [NewsItem] [List] [MutableList].
     */
    fun getHackerNews() {
        homeUiState = "Set the Hacker News API status response here!"
    }
}