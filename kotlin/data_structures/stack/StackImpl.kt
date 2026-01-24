class StackImpl<T: Any> : Stack<T> {

    private var storage = arrayListOf<T>()

    override val count: Int
        get() = storage.size

    override fun pop(): T? {
        return storage.removeLastOrNull()
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun peek(): T? {
        return storage.lastOrNull()
    }

    override fun printStack() {
        println("Stack elements:")
        for (element in storage) {
            println(element)
        }
    }
}