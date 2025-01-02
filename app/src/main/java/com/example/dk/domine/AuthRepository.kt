package com.example.dk.domine

interface AuthRepository {
    suspend fun login(email: String, password: String)
}