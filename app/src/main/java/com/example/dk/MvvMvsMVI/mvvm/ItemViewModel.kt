package com.example.dk.MvvMvsMVI.mvvm

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ItemViewModel : ViewModel() {
    private val itemRepository = ItemRepository()

    // LiveData or StateFlow to manage the UI state
    private val _items = MutableStateFlow<List<Item>>(emptyList())
    val items: StateFlow<List<Item>> = _items

    // Fetch items from repository
    fun loadItems() {
        _items.value = itemRepository.getItems()
    }
}
