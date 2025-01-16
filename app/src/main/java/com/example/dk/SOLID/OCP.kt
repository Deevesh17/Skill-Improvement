package com.example.dk.SOLID

// Violates OCP: Adding a new payment method requires modifying this class.
class PaymentProcessors {
    fun processPayment(paymentType: String) {
        if (paymentType == "CreditCard") { /* Process credit card */ }
        else if (paymentType == "PayPal") { /* Process PayPal */ }
    }
}

// Correct: Use abstraction to make it extensible.
interface Payment {
    fun pay(amount: Double)
}

class CreditCardPayment : Payment {
    override fun pay(amount: Double) { /* Process credit card */ }
}

class PayPalPayment : Payment {
    override fun pay(amount: Double) { /* Process PayPal */ }
}

class PaymentProcessor {
    fun processPayment(payment: Payment, amount: Double) {
        payment.pay(amount)
    }
}
