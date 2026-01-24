package com.example.data_structures.queue

import QueueImpl

fun main() {
    val queue = QueueImpl<Char>()

    queue.enqueue('1')
    queue.enqueue('2')
    queue.enqueue('3')
    queue.enqueue('4')

    queue.printQueue()

    var firstElement = queue.dequeue()
    println("Dequeued element: $firstElement")
    firstElement = queue.peek()
    println("Peeked element: $firstElement")

    queue.printQueue()
}
