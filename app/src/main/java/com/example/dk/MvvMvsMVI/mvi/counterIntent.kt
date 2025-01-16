package com.example.dk.MvvMvsMVI.mvi

// Represents the state of the UI
data class CounterState(val count: Int = 0)

// Represents user actions (intents)
sealed class CounterIntent {
    data object Increment : CounterIntent()
}
