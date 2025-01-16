package com.example.dk.MvvMvsMVI.mvvm

data class Item(val name: String)

class ItemRepository {
    fun getItems(): List<Item> {
        return listOf(
            Item("Apple"),
            Item("Banana"),
            Item("Orange")
        )
    }
}
