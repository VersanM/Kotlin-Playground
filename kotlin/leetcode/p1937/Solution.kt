package leetcode.p1937

class TreeNode<T: Any>(val value: T) {
    private val children: MutableList<TreeNode<T>> = mutableListOf()

    fun add(child: TreeNode<T>) {
        children.add(child)
    }

    fun getChildren(): List<TreeNode<T>> {
        return children
    }

    fun getChild(index: Int): TreeNode<T>? {
        return if (index in children.indices) {
            children[index]
        } else {
            null
        }
    }


}
class Solution {
//    fun maxPoints(points: Array<IntArray>): Long {
//        val map = arrayOf<IntArray>()
//        for (j in 0 until points[0].size) {
//            map[0][j] = points[0][j]
//        }
//
//
//        for (i in 1 until points.size) {
//            for (j in 0 until points[i].size) {
//                if (i == 0) {
//                    map[i][j] = points[i][j]
//                } else {
//                    map[i][j] = points[i][j]
//                }
//            }
//        }
////        var maxPoints = 0L
////        val tree = TreeNode(0)
////        for (j in points[0].indices) {
////            tree.add(TreeNode(points[0][j]))
////        }
////
////        for (i in 1 until points.size) {
////            for (j in points[i].indices) {
////                val parent = tree.getChild(j) ?: continue
////                val newNode = TreeNode(points[i][j])
////                parent.add(newNode)
////            }
////        }
//    }
}