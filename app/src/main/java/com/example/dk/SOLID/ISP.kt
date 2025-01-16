package com.example.dk.SOLID

// Violates ISP: Clients must implement unnecessary methods.
interface MultiFunctionDevice {
    fun print()
    fun scan()
    fun fax()
}

class SimplePrinters : MultiFunctionDevice {
    override fun print() { /* Printing logic */ }
    override fun scan() { /* Empty */ }
    override fun fax() { /* Empty */ }
}

// Correct: Create smaller, specific interfaces.
interface Printer {
    fun print()
}

interface Scanner {
    fun scan()
}

interface Fax {
    fun fax()
}

class SimplePrinter : Printer {
    override fun print() { /* Printing logic */ }
}
