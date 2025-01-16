package com.example.dk.SOLID


// Violates SRP: This class has multiple responsibilities (data and report generation).
class Employees(val id: Int, val name: String) {
    fun calculateSalary() { /* Salary calculation */ }
    fun generateReport() { /* Report generation */ }
}

// Correct: Split into two classes with single responsibilities.
class Employee(val id: Int, val name: String) {
    fun calculateSalary() {
    /* Salary calculation */
    }
}

class EmployeeReport {
    fun generateReport(employee: Employee) {
        /* Report generation logic */
    }
}
