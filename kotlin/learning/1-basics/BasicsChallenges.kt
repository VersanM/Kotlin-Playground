/**
 * Challenges
 */

/**
 * Challenge 1
 *
 * Simple Calculator:
 *
 * Write a program that takes two numbers (e.g., a and b) and prints their sum, difference, product, and division.
 * Use both val and var for practice.
 */
fun simpleCalculator(a: Int, b: Int) {
    var sum = a + b
    var difference = a - b
    val product = a * b
    val division = a / b

    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")
    println("Division: $division")
}

/**
 * Challenge 2
 *
 * Even or Odd:
 *
 * Write a program that takes an integer input and prints whether it is even or odd using an if-else block.
 */
fun evenOrOdd(number: Int) {
    if (number % 2 == 0) {
        println("Even")
    } else {
        println("Odd")
    }
}

/**
 * Challenge 3
 *
 * FizzBuzz:
 *
 * Write a program that prints the numbers from 1 to 100. But for multiples of three, print "Fizz" instead of the number, and for multiples of five, print "Buzz". For numbers which are multiples of both three and five, print "FizzBuzz".
 * Use a for loop and when or if-else statements.
 *
 */
fun fizzBuzz() {
    for (num in 1..100) {
        if (num % 3 == 0) {
            if (num % 5 == 0) {
                print("FizzBuzz ")
            } else {
                print("Fizz ")
            }
        } else if (num % 5 == 0) {
            print("Buzz ")
        } else {
            print("$num ")
        }
//        when {
//            num % 15 == 0 -> print("FizzBuzz ")
//            num % 3 == 0 -> print("Fizz ")
//            num % 5 == 0 -> print("Buzz ")
//            else -> print("$num ")
//        }
    }
    println()
}

/**
 * Challenge 4
 *
 * Factorial Calculation:
 *
 * Write a program that calculates the factorial of a given number using a while loop. Factorial of 5, for instance, is 5 * 4 * 3 * 2 * 1 = 120.
 */
fun factorial(num: Int): Int {
    var factorial = 1
    var index = 2
    while (index <= num) {
        factorial *= index
        index++
    }
    return factorial
}

/**
 * Challenge 5
 *
 * Prime Number Check:
 *
 * Write a program that checks whether a given number is a prime number.
 * Prime numbers are numbers greater than 1 that are only divisible by 1 and themselves. Use a for loop and if-else blocks to check divisibility.
 */
fun primeCheck(num: Int): Boolean {
    if (num <= 1) return false

    for (i in 2..num / 2) {
        if (num % i == 0) return false
    }
    return true
}

/**
 * Challenge 6
 *
 * Guessing Game:
 *
 * Write a program that generates a random number between 1 and 100, then asks the user to guess the number.
 * The program should give feedback ("Too high", "Too low") until the user guesses the correct number.
 * Use a while loop and conditionals.
 */
fun guessTheNumber() {
    val numberToGuess = (1..100).random()
    var guess = 0
    var guessCounter = 0
    while (numberToGuess != guess) {
        guess = try {
            readln().toInt()
        } catch (e: Exception) {
            continue
        }
        guessCounter++
        if (guess != numberToGuess) {
            if (guess > numberToGuess) {
                println("Too high")
            } else {
                println("Too low")
            }
        }
    }
    println("You won! It took you $guessCounter ${if (guessCounter == 1) "guess" else "guesses"}")
}

fun main() {
    simpleCalculator(10, 5)
    evenOrOdd(8)
    evenOrOdd(11)

    fizzBuzz()
    val factorial = factorial(5)
    println("Factorial of 5 = $factorial")

    println("10 is prime? ${primeCheck(10)}")
    println("11 is prime? ${primeCheck(11)}")
    println("17 is prime? ${primeCheck(17)}")
    println("21 is prime? ${primeCheck(21)}")
    println("29 is prime? ${primeCheck(29)}")
    println("33 is prime? ${primeCheck(33)}")
    println()

    guessTheNumber()
}