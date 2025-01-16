package com.example.dk.SOLID

// Violates DIP: High-level class depends on low-level implementations.
class EmailServices {
    fun sendEmail(message: String) { /* Email sending logic */ }
}

class NotificationManagers {
    private val emailService = EmailServices()

    fun notify(message: String) {
        emailService.sendEmail(message)
    }
}

// Correct: Depend on abstraction, not concretions.
interface NotificationService {
    fun sendNotification(message: String)
}

class EmailService : NotificationService {
    override fun sendNotification(message: String) { /* Email sending logic */ }
}

class SmsService : NotificationService {
    override fun sendNotification(message: String) { /* SMS sending logic */ }
}

class NotificationManager(private val service: NotificationService) {
    fun notify(message: String) {
        service.sendNotification(message)
    }
}
