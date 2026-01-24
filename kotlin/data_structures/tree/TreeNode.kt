package tree

class TreeNode<T>(val value: T) {

    private val children: MutableList<TreeNode<T>> = mutableListOf()

    fun add(child: TreeNode<T>) {
        children.add(child)
    }

    fun forEachDepthFirst(action: (TreeNode<T>) -> Unit) {
        action(this)
        for (child in children) {
            child.forEachDepthFirst(action)
        }
    }

    fun forEachBreadthFirst(action: (TreeNode<T>) -> Unit) {
        val queue = mutableListOf<TreeNode<T>>()
        queue.add(this)

        while (queue.isNotEmpty()) {
            val current = queue.removeAt(0)
            action(current)
            queue.addAll(current.children)
        }
    }

    fun search(value: T): TreeNode<T>? {
        var result: TreeNode<T>? = null
        forEachDepthFirst { node ->
            if (node.value == value) {
                result = node
                return@forEachDepthFirst
            }
        }
        return result
    }
}