@file:OptIn(ExperimentalMaterial3Api::class)

package com.klaudjoshkurta.hackernews.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.klaudjoshkurta.hackernews.R
import com.klaudjoshkurta.hackernews.ui.theme.HackerNewsTheme

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.hn_logo),
                            contentDescription = null,
                            tint = Color.Unspecified
                        )
                    }
                }
            )
        }
    ) { innerPadding ->

        val homeViewModel: HomeViewModel = viewModel()

        HomeBody(
            homeUiState = homeViewModel.homeUiState,
            contentPadding = innerPadding,
        )
    }
}

@Composable
fun HomeBody(
    homeUiState: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    Column(
        modifier = modifier.padding(top = contentPadding.calculateTopPadding())
    ) {
        Text(text = homeUiState)
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HackerNewsTheme {
        HomeScreen()
    }
}