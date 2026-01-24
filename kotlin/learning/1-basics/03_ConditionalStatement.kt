/**
 * Conditional Statement
 *
 * Kotlin uses if-else and when for conditional checks.
 *
 * if-else: Standard if-else block. The else block is optional. If it is a function, the return value is the last expression in the function.
 * when: Kotlin’s more expressive alternative to switch.
 *
 * Note: Kotlin does not have a ternary operator.
 *
 */

fun main() {
    val number = 10

    if (number > 0) {
        println("Number is positive")
    } else {
        println("Number is negative")
    }

    val result = if (number > 0) {
        "Number is positive"
    } else {
        "Number is negative"
    }

    println(result)

    when (number) {
        0 -> println("Number is zero")
        1 -> println("Number is one")
        else -> println("Number is neither zero nor one")
    }

    val result2 = when (number) {
        0 -> "Number is zero"
        1 -> "Number is one"
        else -> "Number is neither zero nor one"
    }

    println(result2)
}