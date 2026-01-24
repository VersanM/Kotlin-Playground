/**
 * Classes can contain:
 *
 * Constructors and initializer blocks
 *
 * Functions
 *
 * Properties
 *
 * Nested and inner classes
 *
 * Object declarations
 */

class Empty

class MyClass() {

    constructor(id: String) : this() {
        this.id = id
    }

    constructor(id: String, name: String): this() {
        this.id = id
        this.name = name
    }

    private var id: String? = null
    private var name: String? = null

    private val emptyObj = Empty()

    fun printId() {
        println("ID = $id")
    }

    fun printName() {
        println("Name = $name")
    }


}