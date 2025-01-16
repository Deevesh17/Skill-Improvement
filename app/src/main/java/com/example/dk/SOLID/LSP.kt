package com.example.dk.SOLID

// Violates LSP: The `Square` breaks the behavior of `Rectangle`.
 open class Rectangles() {
    open var width: Int = 0
    open var height: Int = 0
    open fun area(): Int = width * height
}

class Squares(side: Int) : Rectangles() {
    override var width: Int
        get() = super.width
        set(value) { super.width = value; super.height = value }

    override var height: Int
        get() = super.height
        set(value) { super.width = value; super.height = value }
    override fun area(): Int = width * height
}

// Correct: Separate classes for Rectangle and Square.
interface Shape {
    fun area(): Int
}

class Rectangle(private val width: Int, private val height: Int) : Shape {
    override fun area() = width * height
}

class Square(private val side: Int) : Shape {
    override fun area() = side * side
}
