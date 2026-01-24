class QueueImpl<T: Any> : Queue<T> {

    private var storage = arrayListOf<T>()

    override val count: Int
        get() = storage.size

    override fun enqueue(element: T) {
        storage.add(element)
    }

    override fun dequeue(): T? {
        return storage.removeFirstOrNull()
    }

    override fun peek(): T? {
        return storage.firstOrNull()
    }

    override fun printQueue() {
        println("Queue elements:")
        for (element in storage) {
            println(element)
        }
    }
}