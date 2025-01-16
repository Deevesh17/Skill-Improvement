package com.example.dk.MvvMvsMVI.mvvm

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
fun ItemListScreen(itemViewModel: ItemViewModel) {
    val items by itemViewModel.items.collectAsState()

    // Load items when the screen is first composed
    LaunchedEffect(Unit) {
        itemViewModel.loadItems()
    }

    // Display the list of items
    LazyColumn {
        items(items) { item ->
            Text(text = item.name)
        }
    }
}
