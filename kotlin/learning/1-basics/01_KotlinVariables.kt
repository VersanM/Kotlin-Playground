/**
 *
 * Variables in Kotlin
 *
 * Variables in Kotlin can be declared using two keywords:
 *
 * val (immutable, similar to final in Java)
 * var (mutable, allows reassignment)
 *
 */

fun main() {
    var increment = 0
    val immutable = 10
    val immutable2 = "Hello!"

    increment++
    // immutable++ // Error: Val cannot be reassigned

    println(increment)
    println(immutable)
    println(immutable2)
}