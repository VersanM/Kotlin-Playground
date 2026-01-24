package com.example.data_structures.stack

import StackImpl

fun main() {
    val stack = StackImpl<Char>()

    stack.push('1')
    stack.push('2')
    stack.push('3')
    stack.push('4')

    stack.printStack()

    var lastElement = stack.pop()
    println("Popped element: $lastElement")
    lastElement = stack.peek()
    println("Peeked element: $lastElement")

    stack.printStack()

}