interface Stack<T: Any> {
    fun pop(): T?

    fun push(element: T)

    fun peek(): T?

    fun printStack()

    val count: Int

    val isEmpty: Boolean
        get() = count == 0
}