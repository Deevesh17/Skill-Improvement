package com.example.dk.MvvMvsMVI.mvi

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CounterViewModel : ViewModel() {
    // Mutable state for the current UI state
    private val _state = MutableStateFlow(CounterState())
    val state: StateFlow<CounterState> = _state

    // Processes intents and updates state
    fun processIntent(intent: CounterIntent) {
        when (intent) {
            is CounterIntent.Increment -> {
                val currentCount = _state.value.count
                _state.value = CounterState(count = currentCount + 1)
            }
        }
    }
}
