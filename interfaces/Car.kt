package interfaces

abstract class Car : Vechile {
    var name:String? = null
    val numberOfWheels=4
    constructor(name:String) {
        this.name = name
    }
    override fun start() {
        println("$name starts")
    }

    override fun appliesBreaks() {
        println("$name appliesBreaks")
    }
    fun numberOfWheels() {
        println("$numberOfWheels wheels does $name have")
    }
}

class Car1(name: String): Car(name) {
    override fun stop() {
        println("$name stops")
    }
}