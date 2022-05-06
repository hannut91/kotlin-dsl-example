package com.example.kotlindsl

class Pen {
    fun up(): Pen {
        println("펜을 들었어요.")
        return this
    }

    fun down(): Pen {
        println("펜을 내려놨어요")
        return this
    }
}

infix fun Pen.N(value: Int): Pen {
    println("북쪽으로 ${value}만큼 그렸어요")
    return this
}

infix fun Pen.S(value: Int): Pen {
    println("남쪽으로 ${value}만큼 그렸어요")
    return this
}

infix fun Pen.E(value: Int): Pen {
    println("동쪽으로 ${value}만큼 그렸어요")
    return this
}

infix fun Pen.W(value: Int): Pen {
    println("서쪽으로 ${value}만큼 그렸어요")
    return this
}
