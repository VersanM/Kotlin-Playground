import tree.TreeNode

fun makeBeverageTree(): TreeNode<String> {
    val tree = TreeNode("Beverages")
    val hot = TreeNode("hot")
    val cold = TreeNode("cold")

    val tea = TreeNode("tea")
    val coffee = TreeNode("coffee")
    val cocoa = TreeNode("cocoa")

    val blackTea = TreeNode("black")
    val greenTea = TreeNode("green")
    val chaiTea = TreeNode("chai")

    val soda = TreeNode("soda")
    val milk = TreeNode("milk")

    val gingerAle = TreeNode("ginger ale")
    val bitterLemon = TreeNode("bitter lemon")

    tree.add(hot)
    tree.add(cold)

    hot.add(tea)
    hot.add(coffee)
    hot.add(cocoa)

    tea.add(blackTea)
    tea.add(greenTea)
    tea.add(chaiTea)

    cold.add(soda)
    cold.add(milk)

    soda.add(gingerAle)
    soda.add(bitterLemon)

    return tree
}

fun main() {
    val beverageTree = makeBeverageTree()

    println("Depth-first traversal:")
    beverageTree.forEachDepthFirst { node ->
        println(node.value)
    }

    println("\nBreadth-first traversal:")
    beverageTree.forEachBreadthFirst { node ->
        println(node.value)
    }
}