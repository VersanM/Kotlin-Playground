/**
 * Kotlin Loops
 *
 * Kotlin supports for, while, and do-while loops.
 *
 * For Loop: Iterates over a range or collection.
 * While Loop: Repeats as long as a condition is true.
 * Do-while Loop: Executes at least once and then checks the condition
 *
 */

fun main() {
    // For loop over a range
    println("For loop:")
    for (i in 1..5) {
        println(i)
    }

    // While loop example
    println("While loop:")
    var counter = 3
    while (counter > 0) {
        println(counter)
        counter--
    }

    // Do-while loop example
    println("Do-while loop:")
    var counter2 = 3
    do {
        println(counter2)
        counter2--
    } while (counter2 > 0)
}