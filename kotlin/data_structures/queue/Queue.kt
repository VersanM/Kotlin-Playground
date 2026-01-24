interface Queue<T: Any> {
    fun enqueue(element: T)

    fun dequeue(): T?

    fun peek(): T?

    fun printQueue()

    val count: Int

    val isEmpty: Boolean
        get() = count == 0
}